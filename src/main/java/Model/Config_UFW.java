/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Frame.LogIn;
import com.jcraft.jsch.*;
import java.io.IOException;
import java.io.InputStream;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class Config_UFW {
    
    public LogIn  login;
    public Session session = LogIn.session;

    public Config_UFW(LogIn login) {
        this.login = login;
    }

    public Config_UFW() {
        
    }
    
    
    private boolean executeUFWCommand(String command, String passwd) {
        ChannelExec channel = new ChannelExec();
        try {
            if(channel == null | !session.isConnected()){
                throw new IllegalAccessException ("SSH session is not connect!");
            }
            
            //Mở channel exec
            channel = (ChannelExec)session.openChannel("exec");
            String fullCommand = "echo \'" + passwd + "\' | sudo -S" + command;
            channel.setCommand(fullCommand);
            
            //Nhận kết quả đầu ra 
            InputStream in = channel.getInputStream();
            InputStream err_In = channel.getErrStream();
            
            //Thực thi
            channel.connect();
            
            //Đọc kết quả đầu ra
            String out = readStream(in);
            String err_Out = readStream(err_In);
            System.out.print(out);
            System.out.print(err_Out);
            if (err_Out.isEmpty()){
                System.out.println("Execute command successfull"+command);
                System.out.println("Output: " + out);
                return true;
            }else {
                //check lai
                JOptionPane.showMessageDialog(null,"Execution Error","Notification",JOptionPane.OK_OPTION);
                return false;                
            }
        } catch (JSchException e) {
            e.printStackTrace();
            return false;
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }
        finally{
            if (channel != null && channel.isConnected()){
                channel.disconnect();
            }
        }
    }

    //Hàm đọc kết quả luồng - Nghiên cứu luồng I/O trong Java
    private String readStream(InputStream in) throws IOException {
        //Đọc theo từng mảng byte
        byte[] buffer = new byte[1024];
        StringBuilder output = new StringBuilder();
        int bytesRead;
        
        while ((bytesRead = in.read(buffer)) != -1) {
            output.append(new String(buffer, 0, bytesRead));
        }
        return output.toString();
    }
    
    public boolean enableUFW() throws Exception{
        String command = "ufw enable";
        String passwd = login.getPassword();
        return executeUFWCommand(command,passwd);
    }
    
    public boolean disableUFW() {
        String command = "ufw disable";
        String passwd = login.getPassword();
        System.out.print("A");
        System.out.print(passwd);
        System.out.print("A");
        return executeUFWCommand(command,passwd);
    }
        
}
