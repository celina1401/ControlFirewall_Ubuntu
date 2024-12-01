/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Frame;

import Model.Logging_UFW;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

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
        logLevelEdit = new javax.swing.JButton();
        on_off_log = new javax.swing.JButton();
        reloadLog = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(248, 249, 250));

        jPanel2.setBackground(new java.awt.Color(248, 249, 250));

        logTable.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
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
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        logTable.setFillsViewportHeight(true);
        logTable.setRowHeight(25);
        logTable.setShowGrid(true);
        logTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(logTable);
        if (logTable.getColumnModel().getColumnCount() > 0) {
            logTable.getColumnModel().getColumn(0).setResizable(false);
            logTable.getColumnModel().getColumn(1).setResizable(false);
            logTable.getColumnModel().getColumn(2).setResizable(false);
            logTable.getColumnModel().getColumn(3).setResizable(false);
        }

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

        logLevelEdit.setBackground(new java.awt.Color(248, 249, 250));
        logLevelEdit.setIcon(new javax.swing.ImageIcon("D:\\.Mon_hoc\\NLCS\\FireWalltuxa\\src\\main\\java\\image\\log_edit.png")); // NOI18N
        logLevelEdit.setBorder(null);
        logLevelEdit.setContentAreaFilled(false);
        logLevelEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logLevelEditActionPerformed(evt);
            }
        });

        on_off_log.setBackground(new java.awt.Color(248, 249, 250));
        on_off_log.setIcon(new javax.swing.ImageIcon("D:\\.Mon_hoc\\NLCS\\FireWalltuxa\\src\\main\\java\\image\\log_power.png")); // NOI18N
        on_off_log.setBorder(null);
        on_off_log.setContentAreaFilled(false);
        on_off_log.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                on_off_logActionPerformed(evt);
            }
        });

        reloadLog.setBackground(new java.awt.Color(255, 204, 204));
        reloadLog.setIcon(new javax.swing.ImageIcon("D:\\.Mon_hoc\\NLCS\\FireWalltuxa\\src\\main\\java\\image\\reload.png")); // NOI18N
        reloadLog.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        reloadLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reloadLogActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(reloadLog)
                        .addGap(18, 18, 18)
                        .addComponent(logTablePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39))
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
                            .addComponent(logLevelEdit)
                            .addComponent(on_off_log))
                        .addGap(211, 211, 211))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(LogTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(on_off_log, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(logStatusLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(logStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(logLevelLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(logLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(logLevelEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logTablePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reloadLog))
                .addGap(29, 29, 29)
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
        this.dispose();
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
            DefaultTableModel setLogTable = (DefaultTableModel) logTable.getModel();
            
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
            reloadLog.doClick();
        }
        logStatus.setText(statusLogUpdate);
        logLevel.setText(levelLogUpdate);
        

        
    }//GEN-LAST:event_on_off_logActionPerformed

    private void logLevelEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logLevelEditActionPerformed
        String[] choices = {"low","medium","high"};
        String level = (String) JOptionPane.showInputDialog(null, "Choose level", "Change log level",
                JOptionPane.INFORMATION_MESSAGE,null,choices, choices[0]);
        logLevel.setText(logging_UFW.logLevel(host, port, username, password, level));    
        
    }//GEN-LAST:event_logLevelEditActionPerformed

    private void logTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logTableMouseClicked
        boolean edit = logTable.isEditing();
        if(edit == false && evt.getClickCount() == 2 && !evt.isConsumed()){
            JOptionPane.showMessageDialog(null, "You can not edit this table");
        }
    }//GEN-LAST:event_logTableMouseClicked

    private void reloadLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reloadLogActionPerformed
        // TODO add your handling code here:
        Logging_UFW logModel = new Logging_UFW();
        DefaultTableModel result = logging_UFW.logUFWTable(host, port, username, password);
        logTable.setModel(result);
        logModel.setLogTable(logTable);
    }//GEN-LAST:event_reloadLogActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Label LogTitle;
    private javax.swing.JButton btnOk;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel logLevel;
    private javax.swing.JButton logLevelEdit;
    private javax.swing.JLabel logLevelLabel;
    private javax.swing.JLabel logStatus;
    private javax.swing.JLabel logStatusLabel;
    private javax.swing.JTable logTable;
    private javax.swing.JPanel logTablePanel;
    private javax.swing.JButton on_off_log;
    private javax.swing.JButton reloadLog;
    // End of variables declaration//GEN-END:variables
}
