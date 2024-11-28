/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Frame.LogIn;
import com.jcraft.jsch.ChannelExec;
import com.jcraft.jsch.Session;
import java.awt.Font;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import javax.swing.DefaultCellEditor;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

/**
 *
 * @author User
 */
public class Logging_UFW {
    public String logging_status (String host, int port, String username, String password){

        String command = "echo '" + password + "' | sudo -S ufw status verbose";
        String log_status = "";
        
        try {
            Session session = LogIn.establishSSH(host, port, username, password);
            ChannelExec channelExec = (ChannelExec) session.openChannel("exec");
            channelExec.setCommand(command);
            
            InputStream in = channelExec.getInputStream();
            InputStream in_err = channelExec.getErrStream();
            
            channelExec.connect();
            
            BufferedReader reader = new BufferedReader(new InputStreamReader(in));
            List<String> lines = reader.lines().toList();
            // Đọc toàn bộ output thành danh sách dòng
            
            for (String line : lines) { // Duyệt qua từng dòng
                if (line.contains("Logging:")) {
                    // Tách phần sau ":" và chia từ
                    String[] words = line.split(":")[1].trim().split("\\s+"); 
                    log_status = words[0];
                    break;
                }
                System.out.println(log_status);
            }
            
            channelExec.disconnect();
            session.disconnect();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return log_status;
    }
    
        public String logging_level (String host, int port, String username, String password){

        String command = "echo '" + password + "' | sudo -S ufw status verbose";
        String log_level = "";
        
        try {
            Session session = LogIn.establishSSH(host, port, username, password);
            ChannelExec channelExec = (ChannelExec) session.openChannel("exec");
            channelExec.setCommand(command);
            
            InputStream in = channelExec.getInputStream();
            InputStream in_err = channelExec.getErrStream();
            
            channelExec.connect();
            
            BufferedReader reader = new BufferedReader(new InputStreamReader(in));
            List<String> lines = reader.lines().toList();
            // Đọc toàn bộ output thành danh sách dòng
            
            for (String line : lines) { // Duyệt qua từng dòng
                if (line.contains("Logging:")) { // Tìm dòng chứa "Logging:"
                    String[] words = line.split(":")[1].trim().split("\\s+"); // Tách phần sau ":" và chia từ
                    if(words[0].equals("off")){
                        log_level = "";
                        break;
                    }
                    log_level = words[1]; // Lấy từ đầu tiên (ví dụ: "on")
                    break; // Kết thúc vòng lặp khi đã tìm thấy
                }
                System.out.println(log_level);
            }
            
            channelExec.disconnect();
            session.disconnect();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return log_level;
    }
    
    public void logTable_setup (JTable logTable){
        JTableHeader header = logTable.getTableHeader();
        header.setFont(new Font("Tahoma",Font.BOLD,14));
        logTable.setRowHeight(30);
        DefaultCellEditor cellEditor = (DefaultCellEditor) logTable.getDefaultEditor(Object.class);
        cellEditor.setClickCountToStart(3);     //xu ly so lan nhan
    }
    
    public String logUFW_enable(String host, int port, String username, String password){
        String command = "echo '" + password + "' | sudo -S ufw logging on";
        StringBuilder outBuilder = new StringBuilder();
        try {
            Session session = LogIn.establishSSH(host, port, username, password);
            ChannelExec channelExec = (ChannelExec) session.openChannel("exec");
            channelExec.setCommand(command);
            
            InputStream in = channelExec.getInputStream();
            channelExec.connect();
            
            BufferedReader reader = new BufferedReader(new InputStreamReader(in));
            
            String line;
            while((line = reader.readLine()) != null){
                outBuilder.append(line);
            }
            
            channelExec.disconnect();
            session.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return outBuilder.toString();
    }
    
        public String logUFW_disable(String host, int port, String username, String password){
        String command = "echo '" + password + "' | sudo -S ufw logging off";
        StringBuilder outBuilder = new StringBuilder();
        try {
            Session session = LogIn.establishSSH(host, port, username, password);
            ChannelExec channelExec = (ChannelExec) session.openChannel("exec");
            channelExec.setCommand(command);
            
            InputStream in = channelExec.getInputStream();
            channelExec.connect();
            
            BufferedReader reader = new BufferedReader(new InputStreamReader(in));
            
            String line;
            while((line = reader.readLine()) != null){
                outBuilder.append(line);
            }
            
            channelExec.disconnect();
            session.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return outBuilder.toString();
    }
}
