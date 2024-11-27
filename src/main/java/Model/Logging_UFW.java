/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Frame.LogIn;
import com.jcraft.jsch.ChannelExec;
import com.jcraft.jsch.Session;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;

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
                if (line.contains("Logging:")) { // Tìm dòng chứa "Logging:"
                    String[] words = line.split(":")[1].trim().split("\\s+"); // Tách phần sau ":" và chia từ
                    log_status = words[0]; // Lấy từ đầu tiên (ví dụ: "on")
                    break; // Kết thúc vòng lặp khi đã tìm thấy
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
                if (line.contains("Logging:")) { // Tìm dòng chứa "Logging:"
                    String[] words = line.split(":")[1].trim().split("\\s+"); // Tách phần sau ":" và chia từ
                    log_status = words[1]; // Lấy từ đầu tiên (ví dụ: "on")
                    break; // Kết thúc vòng lặp khi đã tìm thấy
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
}
