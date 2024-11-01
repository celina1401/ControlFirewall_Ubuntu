/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Frame.LogIn;
import com.jcraft.jsch.ChannelExec;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class TableUFW {
    public DefaultTableModel ufwTableModel (String host, int port, String username, String password){
        DefaultTableModel ufwTable = new DefaultTableModel();
        ufwTable.addColumn("ID");
        ufwTable.addColumn("To");
        ufwTable.addColumn("Action");
        ufwTable.addColumn("From");
        ufwTable.addColumn("Edit");
        ufwTable.addColumn("Delete");
        
        String command = "echo '" + password + "' | sudo -S ufw verbose numbered";
        try {
            Session session = LogIn.establishSSH(host, port, username, password);
            
            ChannelExec channel = (ChannelExec)session.openChannel("exec");
            channel.setCommand(command);
            InputStream in = channel.getInputStream();
            channel.connect();
            
            BufferedReader buff = new BufferedReader(new InputStreamReader(in));
            String[] lines = buff.toString().split("\n");
            Pattern pattern = Pattern.compile("^(To|Action|From|\\\\[\\\\s*\\\\d+\\\\])");
            for (String line : lines){
                //kiem tra neu giong pattern
                Matcher matcher = pattern.matcher(line);
                if (!matcher.find()){
                    String[] parts = line.trim().split("\\s+", 5);
                    if (parts.length >= 5){
                        String id = parts[0];
                        String to = parts[1];
                        String action = parts[3];
                        String from = parts[4];
                        System.out.println(parts[1]);
                        ufwTable.addRow(new Object[]{id,to,action,from});
                    }
                    
                }
            }
            channel.disconnect();
            session.disconnect();
        } catch (IOException | JSchException ioEx) {
            ioEx.printStackTrace();
        }
        return ufwTable;
    }
    
}
