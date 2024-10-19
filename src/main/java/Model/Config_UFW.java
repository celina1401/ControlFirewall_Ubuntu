/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Frame.LogIn;
import static Frame.LogIn.login;
import com.jcraft.jsch.*;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class Config_UFW {
    public String disableUFW (String host, int port, String username, String password){
        
        StringBuilder outputBuffer = new StringBuilder();
        String command = "echo '" + password + "' | sudo -S ufw disable";

        try {
            
        //Step 1: Create Authentication
            Session session =  LogIn.establishSSH (host, port, username, password);
        //Step 2: Create channel
            ChannelExec channel = (ChannelExec) session.openChannel("exec");
            
        //Step 3: Execute command
            channel.setCommand(command);
            
            
            //Nhận kết quả đầu ra
            InputStream in = channel.getInputStream();
            InputStream err_in = channel.getErrStream();
            
            //Thực thi
            channel.connect();
            
            BufferedReader reader = new BufferedReader(new InputStreamReader(in));
            
            String line;
//            System.out.println("aaaaaaaaaa");
            while ((line = reader.readLine()) != null) {
                outputBuffer.append(line).append("\n");
                
            }
            channel.disconnect();
            session.disconnect();
                  
        } catch (Exception e) {
        }
        return outputBuffer.toString();
    }

    public String enableUFW (String host, int port, String username, String password){
        
        StringBuilder outputBuffer = new StringBuilder();
        //Command may disrupt existing SSH connections. Proceed with operation (y/n)? Aborted
        //Thêm "y" khi enable lại ufw
        String command = "echo '" + password + "' | sudo -S sh -c \"echo 'y' | ufw enable\"";

        try {
            
        //Step 1: Create Authentication
            Session session =  LogIn.establishSSH (host, port, username, password);
        //Step 2: Create channel
            ChannelExec channel = (ChannelExec) session.openChannel("exec");
            
        //Step 3: Execute command
            channel.setCommand(command);
            
            
            //Nhận kết quả đầu ra
            InputStream in = channel.getInputStream();
            
            //Thực thi
            channel.connect();
            
            BufferedReader reader = new BufferedReader(new InputStreamReader(in));
            
            String line;
//            System.out.println("aaaaaaaaaa");
            while ((line = reader.readLine()) != null) {
                outputBuffer.append(line).append("\n");
                //append: them du lieu vao doi tuong ma k tao doi tuong moi
                
            }
            channel.disconnect();
            session.disconnect();
            
        } catch (Exception e) {
        }
        return outputBuffer.toString();
    }
    
    public String startUFW (String host, int port, String username, String password){
        
//        StringBuilder outputBuffer = new StringBuilder();
        String status = "";
        //Command may disrupt existing SSH connections. Proceed with operation (y/n)? Aborted
        //Thêm "y" khi enable lại ufw
        String command = "echo '" + password + "' | sudo -S ufw status";

        try {
            
        //Step 1: Create Authentication
            Session session =  LogIn.establishSSH (host, port, username, password);
        //Step 2: Create channel
            ChannelExec channel = (ChannelExec) session.openChannel("exec");
            
        //Step 3: Execute command
            channel.setCommand(command);
            
            
            //Nhận kết quả đầu ra
            InputStream in = channel.getInputStream();
            
            //Thực thi
            channel.connect();
            
            BufferedReader reader = new BufferedReader(new InputStreamReader(in));
            
            String line = reader.readLine();
            if (line != null){
                String[] words = line.split("\\s+");
                if (words.length >= 2){
                    status = words[1];
                }
            }
                
            channel.disconnect();
            session.disconnect();
            
        } catch (Exception e) {
        }
        return status;
    }
}
