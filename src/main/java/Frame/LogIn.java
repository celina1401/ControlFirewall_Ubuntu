/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Frame;

import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class LogIn extends javax.swing.JFrame {

    public LogIn() {
        initComponents();
    }
    private String host;
    private int port;
    private String username ;
    private String password ;
    
    //phuong thuc xay dung class
    public LogIn(String host, int port, String username, String password){
        this.host = host;
        this.port = port;
        this.username = username;
        this.password = password;
    }
       
    public String getHost(){
        return host;
    }
    
    public int getPort(){
        return port;
    }
    
    public String getUsername(){
        return username;
    }
    
    public String getPassword(){
        return password;
    }
    
    public LogIn ssh_login(){
        try{
            String host = ipText.getText();
            int port = Integer.parseInt(portText.getText());
            String username = usernameText.getText();
            //xử lý password field
            String password = String.valueOf(passwdText.getPassword());
            return new LogIn(host, port, username, password);
        }
        
        catch(NumberFormatException e){     //xử lý ngoại lệ
            e.printStackTrace();            //phat hien ngoai le?
            return null;
        }
    }   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        Title = new java.awt.Label();
        ipLabel = new java.awt.Label();
        ipText = new javax.swing.JTextField();
        portLabel = new java.awt.Label();
        portText = new javax.swing.JTextField();
        usernameLabel = new java.awt.Label();
        usernameText = new javax.swing.JTextField();
        passwdLabel = new java.awt.Label();
        BtnConnect = new javax.swing.JButton();
        BtnCancel = new javax.swing.JButton();
        passwdText = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 204, 204));

        Title.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Title.setForeground(new java.awt.Color(0, 0, 102));
        Title.setText("REMOTE FIREWALL CONNECTION");

        ipLabel.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        ipLabel.setText("IP Address:");

        ipText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ipText.setForeground(new java.awt.Color(102, 102, 102));
        ipText.setText("192.168.1.13");
        ipText.setToolTipText("");

        portLabel.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        portLabel.setText("Port:");

        portText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        portText.setForeground(new java.awt.Color(102, 102, 102));
        portText.setText("22");

        usernameLabel.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        usernameLabel.setText("User Name:");

        usernameText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        usernameText.setForeground(new java.awt.Color(102, 102, 102));
        usernameText.setText("b2110941");
        usernameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameTextActionPerformed(evt);
            }
        });

        passwdLabel.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        passwdLabel.setText("Pass Word:");

        BtnConnect.setBackground(new java.awt.Color(0, 204, 102));
        BtnConnect.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BtnConnect.setForeground(new java.awt.Color(255, 255, 255));
        BtnConnect.setText("Connect");
        BtnConnect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnConnectActionPerformed(evt);
            }
        });

        BtnCancel.setBackground(new java.awt.Color(204, 51, 0));
        BtnCancel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BtnCancel.setForeground(new java.awt.Color(255, 255, 255));
        BtnCancel.setText("Cancel");
        BtnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCancelActionPerformed(evt);
            }
        });

        passwdText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        passwdText.setForeground(new java.awt.Color(102, 102, 102));
        passwdText.setText("1234");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(BtnConnect)
                .addGap(87, 87, 87)
                .addComponent(BtnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(161, 161, 161))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(passwdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(portLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(ipLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addComponent(usernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(usernameText)
                            .addComponent(ipText, javax.swing.GroupLayout.DEFAULT_SIZE, 483, Short.MAX_VALUE)
                            .addComponent(portText)
                            .addComponent(passwdText)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ipLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ipText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(portLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(portText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(usernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usernameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(passwdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwdText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BtnConnect, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );

        Title.getAccessibleContext().setAccessibleName(""); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnConnectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnConnectActionPerformed
        // TODO add your handling code here:
        LogIn connect = ssh_login();
        if (connect == null){
            JOptionPane.showMessageDialog(this, "Please fill out this completely!");
        }
        else{
            try {
                JSch jsch = new JSch();
                //Tao 1 session luu tam thong tin vua nhap
                Session session = jsch.getSession(connect.getUsername(),connect.getHost(), connect.getPort());
                session.setPassword(connect.getPassword()); //Set mat khau
                //Kiem tra host key khi kết nối SSH
                session.setConfig("StrictHostKeyChecking", "no"); 
                session.connect();
                int result = JOptionPane.showConfirmDialog(this, "Connected","Connect SSH", JOptionPane.OK_CANCEL_OPTION);
                if (result == JOptionPane.OK_OPTION){
                   this.dispose();
                   Menu menu = new Menu();
//                 menu.getInfor(host, port, username, password);
                   menu.setVisible(true);
                   menu.setLocationRelativeTo(null); //Vi tri ra giua
//                   login.setVisible(false);
                
                
//                Menu menu = new Menu();
                menu.updateInfor(connect.getHost(), connect.getPort(), connect.getUsername());
                menu.checkActive("Active");
                menu.setHost(connect.getHost());
                menu.setPort(connect.getPort());
                menu.setUsername(connect.getUsername());
                menu.setVisible(true);           //Phuong thuc xuat hien man hinh ?
                menu.setLocationRelativeTo(null);//Phuong thuc dat vi tri ra giua man hinh
                }

            } 
            catch (JSchException e) {
                JOptionPane.showMessageDialog(this, "Connect fail! Please check your information again");
                e.printStackTrace();
                }
            }
    }//GEN-LAST:event_BtnConnectActionPerformed
    
//    public void getInfor(String host, String username, int port){
//        this.host = ipText.getText();
//        this.username = usernameText.getText();
//        this.port = Integer.parseInt(portText.getText());
//    }
//    
    //thiet lap SSH
    public static Session establishSSH(String host, int port, String username, String password) throws JSchException{
        JSch jsch = new JSch();
        Session session = jsch.getSession(username, host, port);
        session.setPassword(password);
        session.setConfig("StrictHostKeyChecking","no");
        session.connect();
        return session;
    }
    
    public void restartSSH(String host, int port, String username, String password)throws JSchException{
        JSch jsch = new JSch();
        Session session = jsch.getSession(username, host, port);
        session.setPassword(password);
        if (session != null && session.isConnected()){
            session.disconnect();
        }
        session = LogIn.establishSSH(host, port, username, password); //Thiet lap lai
    }
    
    public void disconnectSSH(String host, int port, String username, String password) throws JSchException{
        JSch jsch = new JSch();
        Session session = jsch.getSession(username, host, port);
        session.setPassword(password);
        if(session != null && session.isConnected()){
            session.disconnect();
        }
    }
    
    public boolean checkConnectSSH(String host, int port, String username, String password){
        try {
            JSch jsch = new JSch();
            Session session = jsch.getSession(username, host, port);
            session.setPassword(password);
            session.setConfig("StrictHostKeyChecking", "no");
            session.connect();
            session.disconnect(); //Ngat ket noi khi kiem tra ket noi thanh cong
            return true;
            
        } catch (JSchException e) {
            e.printStackTrace();
            return false;
        }
    }
       
    private void BtnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCancelActionPerformed
        // TODO add your handling code here:
        System.exit(0); 
    }//GEN-LAST:event_BtnCancelActionPerformed

    private void usernameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameTextActionPerformed

    /**
     * @param args the command line arguments
     */
    public static JFrame login = new LogIn();
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                login.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCancel;
    private javax.swing.JButton BtnConnect;
    private java.awt.Label Title;
    private java.awt.Label ipLabel;
    private javax.swing.JTextField ipText;
    private javax.swing.JPanel jPanel2;
    private java.awt.Label passwdLabel;
    private javax.swing.JPasswordField passwdText;
    private java.awt.Label portLabel;
    private javax.swing.JTextField portText;
    private java.awt.Label usernameLabel;
    private javax.swing.JTextField usernameText;
    // End of variables declaration//GEN-END:variables
}