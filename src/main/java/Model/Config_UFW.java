/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Frame.LogIn;
import com.jcraft.jsch.*;
import java.util.List;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;


/**
 *
 * @author User
 */
public class Config_UFW {

    public String disableUFW(String host, int port, String username, String password) {

        StringBuilder outputBuffer = new StringBuilder();
        String command = "echo '" + password + "' | sudo -S ufw disable";

        try {

            //Step 1: Create Authentication
            Session session = LogIn.establishSSH(host, port, username, password);
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

    public String enableUFW(String host, int port, String username, String password) {

        StringBuilder outputBuffer = new StringBuilder();
        //Command may disrupt existing SSH connections. Proceed with operation (y/n)? Aborted
        //Thêm "y" khi enable lại ufw
        String command = "echo '" + password + "' | sudo -S sh -c \"echo 'y' | ufw enable\"";

        try {

            //Step 1: Create Authentication
            Session session = LogIn.establishSSH(host, port, username, password);
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

    public String status_UFW(String host, int port, String username, String password) {

//        StringBuilder outputBuffer = new StringBuilder();
        String status = "";
        String command = "echo '" + password + "' | sudo -S ufw status";

        try {

            //Step 1: Create Authentication
            Session session = LogIn.establishSSH(host, port, username, password);
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
            if (line != null) {
                String[] words = line.split("\\s+"); //bỏ mấy cái k phải từ
                if (words.length >= 2) {
                    status = words[1];
                }
            }

            channel.disconnect();
            session.disconnect();

        } catch (Exception e) {
        }
        return status;
    }

    public String addRule(String host, int port, String username, String password, 
        String addPort, String addFrom, String addProtocol, String action, String addTo, String addApp,
        int range1, int range2) {
        String result = "";
        StringBuilder outBuilder = new StringBuilder();
        String command = "";
        String strRange1 = String.valueOf(range1);
        String strRange2 = String.valueOf(range2);

        try {
            Session session = LogIn.establishSSH(host, port, username, password);
            ChannelExec channel = (ChannelExec) session.openChannel("exec");

            if (action.equals("Allow")) {

                if (!addProtocol.isEmpty() && !addTo.isEmpty() && !addFrom.isEmpty() && !addPort.isEmpty() && addApp.isEmpty()
                        && strRange1.isEmpty() && strRange2.isEmpty()){
                    //proto,to,from,port
                    command = "echo '" + password + "' | sudo -S ufw allow proto " + addProtocol + " from " + addFrom
                            + " to " + addTo + " port " + addPort;
                }else if(!addProtocol.isEmpty() && addTo.isEmpty() && !addFrom.isEmpty() && !addPort.isEmpty() && addApp.isEmpty()
                        && strRange1.isEmpty() && strRange1.isEmpty()){
                    //proto,from,port
                    command = "echo '" + password + "' | sudo -S ufw allow proto " + addProtocol + " from " + addFrom
                            + " to any port " + addPort;                    
                }else if(!addProtocol.isEmpty() && !addTo.isEmpty() && addFrom.isEmpty() && !addPort.isEmpty() && addApp.isEmpty()
                        && strRange1.isEmpty() && strRange1.isEmpty()){
                    //proto,to,port
                    command = "echo '" + password + "' | sudo -S ufw allow proto " + addProtocol + " from any " 
                            + " to " + addTo + " port " + addPort;                    
                }else if(!addProtocol.isEmpty() && addTo.isEmpty() && addFrom.isEmpty() && !addPort.isEmpty() && addApp.isEmpty()
                        && strRange1.isEmpty() && strRange2.isEmpty()){
                    //proto,port
                    command = "echo '" + password + "' | sudo -S ufw allow proto " + addProtocol + " from any to any port " + addPort;                    
                }
                else if(addProtocol.isEmpty() && addTo.isEmpty() && !addFrom.isEmpty() && !addPort.isEmpty() && addApp.isEmpty()
                        && strRange1.isEmpty() && strRange2.isEmpty()){
                    //from,port
                    command = "echo '" + password + "' | sudo -S ufw allow from " + addFrom + " to any port " + addPort;                    
                }else if(addProtocol.isEmpty() && !addTo.isEmpty() && addFrom.isEmpty() && !addPort.isEmpty() && addApp.isEmpty()
                        && strRange1.isEmpty() && strRange2.isEmpty()){
                    //to,port
                    command = "echo '" + password + "' | sudo -S ufw allow from any" + " to " + addTo + " port " + addPort;                    
                }
                else if(addProtocol.isEmpty() && addTo.isEmpty() && addFrom.isEmpty() && !addPort.isEmpty() && addApp.isEmpty()
                        && strRange1.isEmpty() && strRange2.isEmpty()){
                    //port
                    command = "echo '" + password + "' | sudo -S ufw allow " + addPort;                    
                }else if(addProtocol.isEmpty() && addTo.isEmpty() && !addFrom.isEmpty() && addPort.isEmpty() && addApp.isEmpty()
                        && strRange1.isEmpty() && strRange2.isEmpty()){
                    //from
                    command = "echo '" + password + "' | sudo -S ufw allow from " + addFrom;                    
                }else if(addProtocol.isEmpty() && addTo.isEmpty() && addFrom.isEmpty() && addPort.isEmpty() && !addApp.isEmpty()
                        && strRange1.isEmpty() && strRange2.isEmpty()){
                    //app
                    command = "echo '" + password + "' | sudo -S ufw allow \"" + addApp + "\"";                    
                }else if(!addProtocol.isEmpty() && addTo.isEmpty() && addFrom.isEmpty() && addPort.isEmpty() && addApp.isEmpty()
                        && !strRange1.isEmpty() && !strRange2.isEmpty()){
                    //range,proto
                    command = "echo '" + password + "' | sudo -S ufw allow " + strRange1 + ":" + strRange2 + "/" + addProtocol;                    
                }
                
            } else {

                if (!addProtocol.isEmpty() && !addTo.isEmpty() && !addFrom.isEmpty() && !addPort.isEmpty()){
                    //proto,to,from,port
                    command = "echo '" + password + "' | sudo -S ufw deny proto " + addProtocol + " from " + addFrom
                            + " to " + addTo + " port " + addPort;
                }else if(!addProtocol.isEmpty() && addTo.isEmpty() && !addFrom.isEmpty() && !addPort.isEmpty()){
                    //proto,from,port
                    command = "echo '" + password + "' | sudo -S ufw deny proto " + addProtocol + " from " + addFrom
                            + " to any port " + addPort;                    
                }else if(!addProtocol.isEmpty() && !addTo.isEmpty() && addFrom.isEmpty() && !addPort.isEmpty()){
                    //proto,to,port
                    command = "echo '" + password + "' | sudo -S ufw deny proto " + addProtocol + " from any " 
                            + " to " + addTo + " port " + addPort;                    
                }else if(!addProtocol.isEmpty() && addTo.isEmpty() && addFrom.isEmpty() && !addPort.isEmpty()
                        && strRange1.isEmpty() && strRange2.isEmpty()){
                    //proto,port
                    command = "echo '" + password + "' | sudo -S ufw deny proto " + addProtocol + " from any to any port " + addPort;                    
                }
                else if(addProtocol.isEmpty() && addTo.isEmpty() && !addFrom.isEmpty() && !addPort.isEmpty()
                        && strRange1.isEmpty() && strRange2.isEmpty()){
                    //from,port
                    command = "echo '" + password + "' | sudo -S ufw deny from " + addFrom + " to any port " + addPort;                    
                }else if(addProtocol.isEmpty() && !addTo.isEmpty() && addFrom.isEmpty() && !addPort.isEmpty()
                        && strRange1.isEmpty() && strRange2.isEmpty()){
                    //to,port
                    command = "echo '" + password + "' | sudo -S ufw deny from any" + " to " + addTo + " port " + addPort;                    
                }
                else if(addProtocol.isEmpty() && addTo.isEmpty() && addFrom.isEmpty() && !addPort.isEmpty()
                        && strRange1.isEmpty() && strRange2.isEmpty()){
                    //port
                    command = "echo '" + password + "' | sudo -S ufw deny " + addPort;                    
                }else if(addProtocol.isEmpty() && addTo.isEmpty() && !addFrom.isEmpty() && addPort.isEmpty()
                        && strRange1.isEmpty() && strRange2.isEmpty()){
                    //from
                    command = "echo '" + password + "' | sudo -S ufw deny from " + addFrom;                    
                }else if(addProtocol.isEmpty() && addTo.isEmpty() && addFrom.isEmpty() && addPort.isEmpty() && !addApp.isEmpty()
                        && strRange1.isEmpty() && strRange2.isEmpty()){
                    //from
                    command = "echo '" + password + "' | sudo -S ufw deny \"" + addApp + "\"";                    
                }else if(!addProtocol.isEmpty() && addTo.isEmpty() && addFrom.isEmpty() && addPort.isEmpty() && addApp.isEmpty()
                        && !strRange1.isEmpty() && !strRange2.isEmpty()){
                    //range,proto
                    command = "echo '" + password + "' | sudo -S ufw deny " + strRange1 + ":" + strRange2 + "/" + addProtocol;                    
                }
                
            }
            channel.setCommand(command);
            InputStream in = channel.getInputStream();
            channel.connect();

            byte[] tmp = new byte[1024];
            while (true) {
                while (in.available() > 0) {
                    int i = in.read(tmp, 0, 1024);
                    if (i < 0) {
                        break;
                    }
                    outBuilder.append(new String(tmp, 0, i));
                }
                if (channel.isClosed()) {
                    break;
                }
            }
            try {
                Thread.sleep(1000);
            } catch (Exception ie) {
                ie.printStackTrace();
            }
            result = "Đã thêm thành công";

            channel.disconnect();
            session.disconnect();
        } catch (IOException | JSchException e) {
            e.printStackTrace();
            result = "Lỗi gòi: " + e.getMessage();
        }
        return result;
    }

    public String status_UFW_display(String host, int port, String username, String password) {

        StringBuilder outputBuffer = new StringBuilder();
//        String status = "";
        String command = "echo '" + password + "' | sudo -S ufw status numbered";

        try {
            //Step 1: Create Authentication
            Session session = LogIn.establishSSH(host, port, username, password);
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
            while ((line = reader.readLine()) != null) {
                outputBuffer.append(line).append("\n");
            }

            channel.disconnect();
            session.disconnect();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return outputBuffer.toString();
    }
    
    public String ufw_reload(String host, int port, String username, String password){
        StringBuilder outpBuilder = new StringBuilder();
        String command = "echo '" + password + "' | sudo -S ufw reload";
        
        try {
            Session session = LogIn.establishSSH(host, port, username, password);
            ChannelExec channel = (ChannelExec) session.openChannel("exec");
            channel.setCommand(command);
            
            InputStream in = channel.getInputStream();
            channel.connect();
            
            BufferedReader reader =  new BufferedReader(new InputStreamReader(in));
            String line;
            while((line = reader.readLine()) != null){
                outpBuilder.append(line);
            }
            
            channel.disconnect();
            session.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return outpBuilder.toString();
    }
    
    public String delete_UFW(String host, int port, String username, String password, String text) {

        StringBuilder outputBuffer = new StringBuilder();
//        String status = "";
        String command = "echo '" + password + "' | sudo -S bash -c 'echo \"y\" | ufw delete " + text + "'";

        try {
            //Step 1: Create Authentication
            Session session = LogIn.establishSSH(host, port, username, password);
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
            while ((line = reader.readLine()) != null) {
                outputBuffer.append(line).append("\n");
            }

            channel.disconnect();
            session.disconnect();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return outputBuffer.toString();
    }
    
    public String listApp_UFW(String host, int port, String username, String password) {

        StringBuilder outputBuffer = new StringBuilder();
//        String status = "";
        String command = "echo '" + password + "' | sudo -S ufw app list";

        try {
            //Step 1: Create Authentication
            Session session = LogIn.establishSSH(host, port, username, password);
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
            while ((line = reader.readLine()) != null) {
                outputBuffer.append(line).append("\n");
            }

            channel.disconnect();
            session.disconnect();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return outputBuffer.toString();
    }
    
    public String[] getListApp(String host, int port, String username, String password){
        List<String> appList = new ArrayList<>();

        try {
            // Thiết lập kết nối SSH
            JSch jsch = new JSch();
            Session session = jsch.getSession(username, host, port);
            session.setPassword(password);
            session.setConfig("StrictHostKeyChecking", "no");
            session.connect();

            // Thực thi lệnh "sudo ufw app list"
            String command = "echo '" + password + "' | sudo -S ufw app list";
            Channel channel = session.openChannel("exec");
            ((ChannelExec) channel).setCommand(command);

            // Đọc đầu ra của lệnh
            InputStream in = channel.getInputStream();
            channel.connect();

            BufferedReader reader = new BufferedReader(new InputStreamReader(in));
            String line;
            boolean startAdding = false;

            while ((line = reader.readLine()) != null) {
                // Bỏ qua các dòng không cần thiết, chỉ thêm tên ứng dụng sau khi gặp "Available applications:"
                if (startAdding) {
                    appList.add(line.trim());
                }
                if (line.contains("Available applications:")) {
                    startAdding = true;
                }
            }

            // Đóng kết nối
            reader.close();
            channel.disconnect();
            session.disconnect();

        } catch (Exception e) {
            e.printStackTrace();
        }

        // Chuyển đổi List<String> sang String[] để trả về
        return appList.toArray(new String[0]);
    }
         
        
}
