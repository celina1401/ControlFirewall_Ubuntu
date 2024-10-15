/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Frame;

//import Model.Config_UFW;
import Model.Config_UFW;
import com.jcraft.jsch.Session;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 *
 * @author User
 */
public class Menu extends javax.swing.JFrame {

    //khai báo dữ liệu menu
//    String IP;
//    public Menu(String IP){
//        this.IP = IP;
//        initComponents();
//        menuIp.setText(this.IP);
//    }
    
    private String host;
    private int port;
    private String username;
    private String password;
    public static JFrame menu = new Menu();
    public LogIn login;
    Session session = LogIn.session;
    int status = 0; //off
//    Config_UFW configUFW = new Config_UFW(LogIn.login);
    
    public Menu() {
        initComponents();
    }

    
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
        statusUFW = new javax.swing.JLabel();
        btnAddRule = new javax.swing.JButton();
        btnTurnOff = new javax.swing.JButton();
        tableReset = new javax.swing.JButton();
        optionDelete = new javax.swing.JButton();

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
                .addContainerGap(114, Short.MAX_VALUE))
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

        statusUFW.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        statusUFW.setForeground(new java.awt.Color(51, 153, 0));
        statusUFW.setText("Active");

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
        btnTurnOff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTurnOffActionPerformed(evt);
            }
        });

        tableReset.setBackground(new java.awt.Color(0, 102, 102));
        tableReset.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        tableReset.setForeground(new java.awt.Color(255, 255, 255));
        tableReset.setText("Reset");
        tableReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tableResetActionPerformed(evt);
            }
        });

        optionDelete.setBackground(new java.awt.Color(102, 0, 102));
        optionDelete.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        optionDelete.setForeground(new java.awt.Color(255, 255, 255));
        optionDelete.setText("Delete");
        optionDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optionDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(in4Status, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(statusUFW)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(btnAddRule, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnTurnOff, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(81, 81, 81))
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panel1Layout.createSequentialGroup()
                                        .addGap(219, 219, 219)
                                        .addComponent(menuControlTitle))
                                    .addComponent(menuInfoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(238, 238, 238)))
                        .addGap(0, 5, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 128, Short.MAX_VALUE)
                        .addComponent(tableReset, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(122, 122, 122)
                        .addComponent(optionDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(119, 119, 119))))
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
                    .addComponent(statusUFW))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 320, Short.MAX_VALUE)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tableReset, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(optionDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43))
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
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void optionDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optionDeleteActionPerformed
    
    }//GEN-LAST:event_optionDeleteActionPerformed

    private void tableResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tableResetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tableResetActionPerformed

    private void btnTurnOffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTurnOffActionPerformed
        Config_UFW config_UFW = new Config_UFW();
        int result = JOptionPane.showConfirmDialog(this, "Are you sure to turn off the firewall?",
            "Confirm",JOptionPane.OK_CANCEL_OPTION);
        menu.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        
        if(status == 1){
            //lenh off
            String disable = config_UFW.disableUFW(host, port, username, password);
            if (result == JOptionPane.OK_OPTION){
                JOptionPane.showMessageDialog(this, disable, "Notification", JOptionPane.OK_OPTION);
            }
            status = 0;
        }else{
            String enable = config_UFW.enableUFW(host, port, username, password);
            if (result == JOptionPane.OK_OPTION){
                JOptionPane.showMessageDialog(this, enable, "Notification", JOptionPane.OK_OPTION);
            }
            status = 1;
        }
        
        
    }//GEN-LAST:event_btnTurnOffActionPerformed

    private void btnAddRuleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddRuleActionPerformed
        // TODO add your handling code here:
        AddRule rule = new AddRule();
        rule.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        rule.setVisible(true);
        rule.setLocation(null);

        rule.setLocation(500, 400);
        System.out.println(this.getHost());
    }//GEN-LAST:event_btnAddRuleActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed

        int result = JOptionPane.showConfirmDialog(this, "Sign out", "Message",
            JOptionPane.OK_CANCEL_OPTION);
        if (result == JOptionPane.OK_OPTION){
            session.disconnect();
            LogIn.login.setVisible(true);
            this.dispose();
        }
        //Đóng cửa sổ đang làm việc
    }//GEN-LAST:event_btnExitActionPerformed


    
//    public void table(){
//        String[] columnNames = {"Name", "Occupation", "Age"};
//        Object[][] data = {
//            {"John Doe", "Developer", 30},
//            {"Jane Smith", "Designer", 28},
//            {"Mike Johnson", "Manager", 35}
//        };
//        JTable table = new JTable(data, columnNames);
//        
//        table.addMouseListener(new MouseAdapter(){
//            public void mouseClicked(MouseEvent e){
//                int row = table.rowAtPoint(e.getPoint());
//                int col = table.columnAtPoint(e.getPoint());
//                
//                if (row >= 0 && col >= 0){
//                    JOptionPane.showMessageDialog(null, 
//                            "Value in clicked cell" + table.getValueAt(row, col).toString());
//                }
//            }
//        });
//        
//        JScrollPane jScrollPane = new JScrollPane(table);
//        menu.add(jScrollPane);
//        menu.setVisible(true);
//        
//    }
            
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddRule;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnTurnOff;
    private javax.swing.JLabel in4Status;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
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
    private javax.swing.JButton optionDelete;
    private java.awt.Panel panel1;
    private javax.swing.JLabel statusUFW;
    private javax.swing.JButton tableReset;
    // End of variables declaration//GEN-END:variables
}
