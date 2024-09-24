/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Frame;

import com.jcraft.jsch.ChannelExec;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.Session;
import java.io.InputStream;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    //khai báo dữ liệu menu
//    String IP;
//    public Menu(String IP){
//        this.IP = IP;
//        initComponents();
//        menuIp.setText(this.IP);
//    }
//    
    private String host;
    private int port;
    private String username;
    private String password;
    
    public void showInfor(String host, int port, String username){
        this.host = host;
        this.port = port;
        this.username = username;
        initComponents();
        menuIp.setText(host);
        menuPort.setText(String.valueOf(port));
        menuUserName.setText(username);
    }   
    public Menu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new java.awt.Panel();
        jPanel1 = new javax.swing.JPanel();
        menuAccountTitle = new java.awt.Label();
        menuIpLabel = new java.awt.Label();
        menuIp = new javax.swing.JLabel();
        menuUserNameLabel = new javax.swing.JLabel();
        menuUserName = new java.awt.Label();
        menuPortLabel = new java.awt.Label();
        menuPort = new java.awt.Label();
        menuStatusLabel = new java.awt.Label();
        menuStatus = new java.awt.Label();
        jLabel2 = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();
        menuControlTitle = new javax.swing.JLabel();
        menuInfoLabel = new java.awt.Label();
        in4Status = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnAddRule = new javax.swing.JButton();
        btnTurnOff = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        in4Table = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel1.setBackground(new java.awt.Color(255, 204, 204));
        panel1.setPreferredSize(new java.awt.Dimension(900, 700));

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setPreferredSize(new java.awt.Dimension(343, 768));

        menuAccountTitle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        menuAccountTitle.setForeground(new java.awt.Color(0, 0, 102));
        menuAccountTitle.setText("Account");

        menuIpLabel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        menuIpLabel.setForeground(new java.awt.Color(0, 0, 102));
        menuIpLabel.setText("IP: ");

        menuIp.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        menuIp.setForeground(new java.awt.Color(102, 102, 102));
        menuIp.setText("10.0.0.1");

        menuUserNameLabel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        menuUserNameLabel.setForeground(new java.awt.Color(0, 0, 102));
        menuUserNameLabel.setText("User name:");

        menuUserName.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        menuUserName.setForeground(new java.awt.Color(102, 102, 102));
        menuUserName.setText("Celina");

        menuPortLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        menuPortLabel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        menuPortLabel.setForeground(new java.awt.Color(0, 0, 102));
        menuPortLabel.setText("Port:");

        menuPort.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        menuPort.setForeground(new java.awt.Color(102, 102, 102));
        menuPort.setText("22");

        menuStatusLabel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        menuStatusLabel.setForeground(new java.awt.Color(0, 0, 102));
        menuStatusLabel.setText("Status:");

        menuStatus.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        menuStatus.setForeground(new java.awt.Color(51, 153, 0));
        menuStatus.setName(""); // NOI18N
        menuStatus.setText("Active");

        jLabel2.setIcon(new javax.swing.ImageIcon("D:\\.Mon_hoc\\NLCS\\FireWalltuxa\\src\\main\\java\\image\\user.png")); // NOI18N

        btnExit.setBackground(new java.awt.Color(204, 255, 204));
        btnExit.setIcon(new javax.swing.ImageIcon("D:\\.Mon_hoc\\NLCS\\FireWalltuxa\\src\\main\\java\\image\\shutdown.png")); // NOI18N
        btnExit.setBorder(null);
        btnExit.setContentAreaFilled(false);
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(58, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(menuPortLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(menuUserNameLabel)
                                .addComponent(menuIpLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(menuStatusLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(menuPort, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(menuUserName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(menuIp, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(menuStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(46, 46, 46))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(menuAccountTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(99, 99, 99))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnExit)
                        .addGap(143, 143, 143))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(menuAccountTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jLabel2)
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(menuIpLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(menuIp, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(menuUserName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(menuUserNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(menuPortLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(menuPort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(menuStatusLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(menuStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addComponent(btnExit)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        menuUserNameLabel.getAccessibleContext().setAccessibleName("");

        menuControlTitle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        menuControlTitle.setForeground(new java.awt.Color(0, 0, 102));
        menuControlTitle.setText("Control");

        menuInfoLabel.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        menuInfoLabel.setForeground(new java.awt.Color(51, 0, 102));
        menuInfoLabel.setText("Information:");

        in4Status.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        in4Status.setForeground(new java.awt.Color(0, 0, 102));
        in4Status.setText("Status:");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 153, 0));
        jLabel1.setText("Active");

        btnAddRule.setBackground(new java.awt.Color(204, 0, 51));
        btnAddRule.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnAddRule.setForeground(new java.awt.Color(255, 255, 255));
        btnAddRule.setText("Add rule");
        btnAddRule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddRuleActionPerformed(evt);
            }
        });

        btnTurnOff.setBackground(new java.awt.Color(204, 0, 51));
        btnTurnOff.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnTurnOff.setForeground(new java.awt.Color(255, 255, 255));
        btnTurnOff.setText("Turn On/Off");

        in4Table.setBackground(new java.awt.Color(255, 204, 204));
        in4Table.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        in4Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "To", "Action", "From"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        in4Table.setCellSelectionEnabled(true);
        in4Table.setFocusTraversalPolicyProvider(true);
        in4Table.setGridColor(new java.awt.Color(204, 255, 204));
        jScrollPane4.setViewportView(in4Table);
        in4Table.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        if (in4Table.getColumnModel().getColumnCount() > 0) {
            in4Table.getColumnModel().getColumn(0).setMaxWidth(150);
            in4Table.getColumnModel().getColumn(0).setHeaderValue("To");
            in4Table.getColumnModel().getColumn(1).setMaxWidth(150);
            in4Table.getColumnModel().getColumn(1).setHeaderValue("Action");
            in4Table.getColumnModel().getColumn(2).setMaxWidth(250);
            in4Table.getColumnModel().getColumn(2).setHeaderValue("From");
        }

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(in4Status, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel1)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(menuInfoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(panel1Layout.createSequentialGroup()
                                    .addGap(60, 60, 60)
                                    .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                                            .addComponent(btnAddRule, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(113, 113, 113)
                                            .addComponent(btnTurnOff)
                                            .addGap(81, 81, 81))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                                            .addComponent(menuControlTitle)
                                            .addGap(238, 238, 238)))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33))))))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(menuControlTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddRule, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTurnOff, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67)
                .addComponent(menuInfoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(in4Status)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 369, Short.MAX_VALUE)
                .addGap(25, 25, 25))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddRuleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddRuleActionPerformed
        // TODO add your handling code here:
        AddRule rule = new AddRule();
        rule.setVisible(true);
        rule.setLocation(500, 400);
    }//GEN-LAST:event_btnAddRuleActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        
        try {
            JSch jsch = new JSch();
            ChannelExec exec = new ChannelExec();
            Session session = jsch.getSession(username, host, port);
            session.setPassword(password);
            if (session != null && session.isConnected()){
                System.out.println("Frame.Menu.btnExitActionPerformed()");
                exec = (ChannelExec) session.openChannel("exec");
                exec.setCommand("exit");
//                InputStream inputStream = exec.getInputStream();
                exec.connect();
                System.out.println("Frame.Menu.btnExitActionPerformed()");
                exec.disconnect();
                session.disconnect();
                
    //note: chưa có ngắt kết nối đc ssh; if chưa chạy
                }
            JOptionPane.showMessageDialog(this, "Signed out");
            LogIn login = new LogIn();
            this.dispose();             //Đóng cửa sổ đang làm việc
            login.setVisible(true);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnExitActionPerformed

//    private String host;
//    private int port;
//    private String username;
//    private String password;
    
    //lay gia tri
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
    
    //Thay doi gia tri cac thuoc tinh
    public void setHost(String host){
        this.host = host;
    }
    
    public void setPort(int port){
        this.port = port;
    }
    
    public void setUsername(String username){
        this.username = username;
    }
    
    public void setPassword(String password){
        this.password = password;
    }
    
    public void updateInfor(String host, int port, String username){
        menuIp.setText(host);
        menuPort.setText("" + port);
        menuUserName.setText(username);
    }
    
    public void checkActive(String connect){
        menuStatus.setText(connect.equals("Connect") ? "Active" : "Inactive");
    }
    
    public void getInfor(String host, int port, String username, String password){
        this.host = host;
        this.port = port;
        this.username = username;
        this.password = password;
    }
    
    
    
    public static JFrame menu = new Menu();
    
//    public void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Menu().setVisible(true);
//                
//            }
//        });
//        
//
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddRule;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnTurnOff;
    private javax.swing.JLabel in4Status;
    private javax.swing.JTable in4Table;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane4;
    private java.awt.Label menuAccountTitle;
    private javax.swing.JLabel menuControlTitle;
    private java.awt.Label menuInfoLabel;
    private javax.swing.JLabel menuIp;
    private java.awt.Label menuIpLabel;
    private java.awt.Label menuPort;
    private java.awt.Label menuPortLabel;
    private java.awt.Label menuStatus;
    private java.awt.Label menuStatusLabel;
    private java.awt.Label menuUserName;
    private javax.swing.JLabel menuUserNameLabel;
    private java.awt.Panel panel1;
    // End of variables declaration//GEN-END:variables
}