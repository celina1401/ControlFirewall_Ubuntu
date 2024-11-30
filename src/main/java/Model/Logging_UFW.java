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
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.DefaultCellEditor;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.Timer;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

/**
 *
 * @author User
 */
public class Logging_UFW {

    public Logging_UFW() {
    }
    
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
    
    public String logLevel (String host, int port, String username, String password, String level){
        //Thuc hien thay doi level
        String command = "echo '" + password + "' | sudo -S ufw logging " + level;
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
        //cat chuoi nhan level
        String logLevel = logging_level(host, port, username, password);
//        System.out.println(logLevel);
        return logLevel;
    }
    
    public DefaultTableModel logUFWTable (String host, int port, String username, String password){
        DefaultTableModel logModel = new DefaultTableModel();
        logModel.addColumn("TIME");
        logModel.addColumn("ACTION");
        logModel.addColumn("SOURCE");
        logModel.addColumn("DESTINATION");
                
        String command = "echo '" + password + "' | sudo -S tac /var/log/ufw.log | head -n 10";
            try {
                Session session = LogIn.establishSSH(host, port, username, password);

                ChannelExec channel = (ChannelExec)session.openChannel("exec");
                channel.setCommand(command);
                InputStream in = channel.getInputStream();
                channel.connect();

                BufferedReader buff = new BufferedReader(new InputStreamReader(in));
                String line;
                while((line = buff.readLine())!= null){                  
                    String[] parts = line.split("\\s+");
                    if (parts.length >= 20){
                        String time = parts[0].replace("T", "    ").split("\\.")[0];
                        String action = parts[4].split("\\]")[0];
                        String src = parts[8].split("=")[1];
                        String dst = parts[9].split("=")[1];
                        logModel.addRow(new Object[]{time,action,src,dst});

                    }else{
                        String time = parts[0].replace("T", "    ").split("\\.")[0];
                        String action = parts[4].split("\\]")[0];
                        String src = parts[7].split("=")[1];
                        String dst = parts[8].split("=")[1];
                        logModel.addRow(new Object[]{time,action,src,dst});
                    }
                channel.disconnect();
                session.disconnect();
            }
        } catch (IOException | JSchException | ArrayIndexOutOfBoundsException ioEx) {
            ioEx.printStackTrace();
        }
        return logModel;
    }
    
    public void setLogTable(JTable logTable){
        JTableHeader header = logTable.getTableHeader();
        header.setFont(new Font("Tahoma",Font.BOLD,14));
        //header ra giua
        DefaultTableCellRenderer centerHeader = (DefaultTableCellRenderer) header.getDefaultRenderer();
        centerHeader.setHorizontalAlignment(JLabel.CENTER);
        logTable.setRowHeight(30);
        
        logTable.getColumnModel().getColumn(0).setPreferredWidth(200);
        logTable.getColumnModel().getColumn(1).setPreferredWidth(65);
        logTable.getColumnModel().getColumn(2).setPreferredWidth(150);
        logTable.getColumnModel().getColumn(3).setPreferredWidth(150);
        
        DefaultCellEditor cellEditor = (DefaultCellEditor) logTable.getDefaultEditor(Object.class);
        cellEditor.setClickCountToStart(3);     //xu ly so lan nhan
        
    }
              
}
