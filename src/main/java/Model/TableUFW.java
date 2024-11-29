/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Frame.LogIn;
import com.jcraft.jsch.ChannelExec;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;
import java.awt.Font;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.DefaultCellEditor;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

/**
 *
 * @author User
 */
public class TableUFW {
    public DefaultTableModel ufwTableModel (String host, int port, String username, String password){
        DefaultTableModel ufwTable = new DefaultTableModel();
        ufwTable.addColumn("    ID");
        ufwTable.addColumn("                      To");
        ufwTable.addColumn("     Action");
        ufwTable.addColumn("            From");
        
        String command = "echo '" + password + "' | sudo -S ufw verbose numbered";
        try {
            Session session = LogIn.establishSSH(host, port, username, password);
            
            ChannelExec channel = (ChannelExec)session.openChannel("exec");
            channel.setCommand(command);
            InputStream in = channel.getInputStream();
            channel.connect();
            
            BufferedReader buff = new BufferedReader(new InputStreamReader(in));
//            String[] lines = buff.toString().split("\n");
            Pattern pattern = Pattern.compile("^\\[\\s*(\\d+)\\]");
            String line;
            while((line = buff.readLine())!= null){
                Matcher matcher = pattern.matcher(line);
                if (matcher.find()){
                    //trích xuất id
                    String id = matcher.group(1);
                    //remove những khoảng trống không cần thiết
                    String id_cleanspace = line.replaceFirst("^\\[\\s*\\d+\\]", "").trim();
                    
                    String[] parts = id_cleanspace.split("\\s+");
                    if (parts.length >= 5){
                        String to = parts[0];
                        String v6 = parts[1];
                        String action = parts[2]+" "+parts[3];
                        String from = parts[4].replace("IN  ","");
                        if(v6.contains("(v6)")){
                            ufwTable.addRow(new Object[]{id,to,action,from});
                        }
                        if(parts.length > 5){
                            to = parts[0] + " " + parts[1];
                            v6 = parts[2];
                            action = parts[3]+" "+parts[4];
                            from = parts[5].replace("IN  ","");
                        }
                        if(v6.contains("(v6)")){
                            ufwTable.addRow(new Object[]{id,to,action,from});
                        }
                        
                }
            }
            channel.disconnect();
            session.disconnect();
            }
        } catch (IOException | JSchException | ArrayIndexOutOfBoundsException ioEx) {
            ioEx.printStackTrace();
        }
        return ufwTable;
    }
    
    public DefaultTableModel ufwTableModelv4 (String host, int port, String username, String password){
        DefaultTableModel ufwTable = new DefaultTableModel();
        ufwTable.addColumn("    ID");
        ufwTable.addColumn("                      To");
        ufwTable.addColumn("     Action");
        ufwTable.addColumn("            From");
//        ufwTable.addColumn("  Edit");
//        ufwTable.addColumn(" Delete");
        
        String command = "echo '" + password + "' | sudo -S ufw verbose numbered";
        try {
            Session session = LogIn.establishSSH(host, port, username, password);
            
            ChannelExec channel = (ChannelExec)session.openChannel("exec");
            channel.setCommand(command);
            InputStream in = channel.getInputStream();
            channel.connect();
            
            BufferedReader buff = new BufferedReader(new InputStreamReader(in));
//            String[] lines = buff.toString().split("\n");
            Pattern pattern = Pattern.compile("^\\[\\s*(\\d+)\\]");
            String line;
            while((line = buff.readLine())!= null){
                Matcher matcher = pattern.matcher(line);
                if (matcher.find()){
                    //trích xuất id
                    String id = matcher.group(1);
                    //remove những khoảng trống không cần thiết
                    String id_cleanspace = line.replaceFirst("^\\[\\s*\\d+\\]", "").trim();
//                    int id_index = Integer.parseInt(id_cleanspace);
                    
                    String[] parts = id_cleanspace.split("\\s+");
                    if (parts.length >= 4){
                        String to = parts[0];
                        String action = parts[1]+" "+ parts[2];
                        String from = parts[3].replace("IN  ","");
                        if(parts.length > 4){
                            from = parts[parts.length-1];
                            to = parts[0]+" "+ parts [1];
                            action = parts[2] + " " + parts[3];
                            if(parts[4] == "(v6)"){
                                continue;
                            }
                        }
                        
                        if(action.contains("(v6)") | from.contains("(v6)")){
                            continue;
                        }
                        ufwTable.addRow(new Object[]{id,to,action,from});
//                        System.out.println(parts[1]);
                    }
                }
            channel.disconnect();
            session.disconnect();
            }
        } catch (IOException | JSchException | ArrayIndexOutOfBoundsException ioEx) {
            ioEx.printStackTrace();
        }
        return ufwTable;
    }
        
    public void setupTable(JTable ufwTable){
        
        JTableHeader header = ufwTable.getTableHeader();
        header.setFont(new Font("Tahoma",Font.BOLD,14));
        ufwTable.getColumnModel().getColumn(0).setPreferredWidth(10);
        ufwTable.getColumnModel().getColumn(1).setPreferredWidth(150);
        ufwTable.getColumnModel().getColumn(2).setPreferredWidth(50);
        ufwTable.getColumnModel().getColumn(3).setPreferredWidth(100);
        ufwTable.setRowHeight(30);
        DefaultCellEditor cellEditor = (DefaultCellEditor) ufwTable.getDefaultEditor(Object.class);
        cellEditor.setClickCountToStart(3);     //xu ly so lan nhan
        
    }
  
}
