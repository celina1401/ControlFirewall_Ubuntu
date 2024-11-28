/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Frame;

import Model.Logging_UFW;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class Logging extends javax.swing.JFrame {

    private String host;
    private int port;
    private String username;
    private String password;
    
    private String log_status;
    private String log_level;
    private String status;
    
    Logging_UFW logging_UFW = new Logging_UFW();

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLog_status() {
        return log_status;
    }

    public void setLog_status(String log_status) {
        this.log_status = log_status;
    }

    public String getLog_level() {
        return log_level;
    }

    public void setLog_level(String log_level) {
        this.log_level = log_level;
    }
    
    public void getInfor(String host, int port, String username, String password) {
        this.host = host;
        this.port = port;
        this.username = username;
        this.password = password;
    }
    
    public Logging() {
        initComponents();
    }
    
    public void checkLogging(String host, int port, String username, String password){
        log_status = logging_UFW.logging_status(host, port, username, password);
        log_level = logging_UFW.logging_level(host, port, username, password);
        logStatus.setText(log_status);
        logLevel.setText(log_level);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        logTablePanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        logTable = new javax.swing.JTable();
        LogTitle = new java.awt.Label();
        logStatusLabel = new javax.swing.JLabel();
        logLevelLabel = new javax.swing.JLabel();
        btnOk = new javax.swing.JButton();
        logStatus = new javax.swing.JLabel();
        logLevel = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        on_off_log = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(248, 249, 250));

        jPanel2.setBackground(new java.awt.Color(248, 249, 250));

        logTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "TIME", "ACTION", "SOURCE", "DESTINATION"
            }
        ));
        logTable.setFillsViewportHeight(true);
        logTable.setRowHeight(25);
        logTable.setShowGrid(true);
        jScrollPane1.setViewportView(logTable);

        javax.swing.GroupLayout logTablePanelLayout = new javax.swing.GroupLayout(logTablePanel);
        logTablePanel.setLayout(logTablePanelLayout);
        logTablePanelLayout.setHorizontalGroup(
            logTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 615, Short.MAX_VALUE)
        );
        logTablePanelLayout.setVerticalGroup(
            logTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
        );

        LogTitle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        LogTitle.setForeground(new java.awt.Color(242, 92, 5));
        LogTitle.setText(" FIREWALL LOGS");

        logStatusLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        logStatusLabel.setForeground(new java.awt.Color(0, 64, 133));
        logStatusLabel.setText("Status Log:");

        logLevelLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        logLevelLabel.setForeground(new java.awt.Color(0, 64, 133));
        logLevelLabel.setText("Level:");

        btnOk.setBackground(new java.awt.Color(76, 176, 44));
        btnOk.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnOk.setForeground(new java.awt.Color(255, 255, 255));
        btnOk.setText("OK");
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });

        logStatus.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        logStatus.setForeground(new java.awt.Color(51, 153, 0));
        logStatus.setText("status");

        logLevel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        logLevel.setForeground(new java.awt.Color(255, 102, 0));
        logLevel.setText("level");

        jButton1.setBackground(new java.awt.Color(248, 249, 250));
        jButton1.setIcon(new javax.swing.ImageIcon("D:\\.Mon_hoc\\NLCS\\FireWalltuxa\\src\\main\\java\\image\\log_edit.png")); // NOI18N
        jButton1.setBorder(null);
        jButton1.setContentAreaFilled(false);

        on_off_log.setBackground(new java.awt.Color(248, 249, 250));
        on_off_log.setIcon(new javax.swing.ImageIcon("D:\\.Mon_hoc\\NLCS\\FireWalltuxa\\src\\main\\java\\image\\log_power.png")); // NOI18N
        on_off_log.setBorder(null);
        on_off_log.setContentAreaFilled(false);
        on_off_log.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                on_off_logActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(logTablePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btnOk, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(305, 305, 305))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(LogTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(244, 244, 244))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(logLevelLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(logStatusLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(logLevel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(logStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(on_off_log))
                        .addGap(184, 184, 184))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(LogTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(logStatusLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(on_off_log, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(logLevelLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(logLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addComponent(logTablePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(btnOk, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_btnOkActionPerformed

    private void on_off_logActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_on_off_logActionPerformed
        // TODO add your handling code here:
        String statusLogUpdate = "";
        String levelLogUpdate = "";
        status = logging_UFW.logging_status(host, port, username, password);
        
        if(status.equals("on")){
            int confirm =  JOptionPane.showConfirmDialog(null, "Are you sure you want to turn off logging?","Confirm Notification", JOptionPane.YES_NO_OPTION);          
            if(confirm == JOptionPane.YES_OPTION){
                String disable = logging_UFW.logUFW_disable(host, port, username, password);
                JOptionPane.showMessageDialog(this, disable,"Notification", JOptionPane.INFORMATION_MESSAGE);                
                statusLogUpdate = logging_UFW.logging_status(host, port, username, password);
                levelLogUpdate = logging_UFW.logging_level(host, port, username, password);
            }else{
                statusLogUpdate = logging_UFW.logging_status(host, port, username, password);  
                levelLogUpdate = logging_UFW.logging_level(host, port, username, password);
            }
            
        }else{
            String enable = logging_UFW.logUFW_enable(host, port, username, password);
            int confirm = JOptionPane.showConfirmDialog(this, "You want to turn on logging?","Notification", JOptionPane.YES_NO_OPTION);
            if(confirm == JOptionPane.YES_OPTION){
                JOptionPane.showMessageDialog(this, enable,"Notification", JOptionPane.INFORMATION_MESSAGE);
                statusLogUpdate = logging_UFW.logging_status(host, port, username, password);
                levelLogUpdate = logging_UFW.logging_level(host, port, username, password);
            }else{
                logging_UFW.logUFW_disable(host, port, username, password);
                statusLogUpdate = logging_UFW.logging_status(host, port, username, password);
                levelLogUpdate = logging_UFW.logging_level(host, port, username, password);
            }
        }
        logStatus.setText(statusLogUpdate);
        logLevel.setText(levelLogUpdate);
    }//GEN-LAST:event_on_off_logActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Label LogTitle;
    private javax.swing.JButton btnOk;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel logLevel;
    private javax.swing.JLabel logLevelLabel;
    private javax.swing.JLabel logStatus;
    private javax.swing.JLabel logStatusLabel;
    private javax.swing.JTable logTable;
    private javax.swing.JPanel logTablePanel;
    private javax.swing.JButton on_off_log;
    // End of variables declaration//GEN-END:variables
}
