/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Frame;

import Model.Config_UFW;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class AddRule extends javax.swing.JFrame {
   
    private String host;
    private int port;
    private String username;
    private String password;
    
    private int add_port;
    private String add_from;
    private String add_protocol;
    private String action = "";
    private String add_to;
    
    public AddRule() {
        initComponents();
        addPortText.setVisible(false);
        addFromText.setVisible(false);
        addToText.setVisible(false);
        addProtocol.setVisible(false);
        addApp.setVisible(false);

    }
    //them rule, xoa rule, sua rule

    public AddRule(String host, int port, String username, String password, 
            int add_port, String add_from, String add_protocol, String action, String add_to) {
        
        this.host = host;
        this.port = port;
        this.username = username;
        this.password = password;
        
        this.add_port = add_port;
        this.add_from = add_from;
        this.add_protocol = add_protocol;
        this.action = action;
        this.add_to = add_to;
    }

    public void getInfor(String host, int port, String username, String password) {
        this.host = host;
        this.port = port;
        this.username = username;
        this.password = password;
    }
 
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

    public int getAdd_port() {
        return add_port;
    }

    public void setAdd_port(int add_port) {
        this.add_port = add_port;
    }

    public String getAdd_from() {
        return add_from;
    }

    public void setAdd_from(String add_from) {
        this.add_from = add_from;
    }

    public String getAdd_protocol() {
        return add_protocol;
    }

    public void setAdd_protocol(String add_protocol) {
        this.add_protocol = add_protocol;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getAdd_to() {
        return add_to;
    }

    public void setAdd_to(String add_to) {
        this.add_to = add_to;
    }
    
    
    
    public static AddRule rule = new AddRule();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        addTitle = new javax.swing.JLabel();
        addPortLabel = new javax.swing.JLabel();
        addFromLabel = new javax.swing.JLabel();
        addProtocolLabel = new javax.swing.JLabel();
        addPortText = new javax.swing.JTextField();
        addFromText = new javax.swing.JTextField();
        addDone = new javax.swing.JButton();
        addCancel = new javax.swing.JButton();
        addToLabel = new javax.swing.JLabel();
        addToText = new javax.swing.JTextField();
        cbPort = new javax.swing.JCheckBox();
        cbFrom = new javax.swing.JCheckBox();
        cbTo = new javax.swing.JCheckBox();
        cbProtocol = new javax.swing.JCheckBox();
        addProtocol = new javax.swing.JTextField();
        cbApp = new javax.swing.JCheckBox();
        addAppLabel = new javax.swing.JLabel();
        addApp = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 440));

        addTitle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        addTitle.setForeground(new java.awt.Color(0, 0, 102));
        addTitle.setText("ADD RULE FOR FIREWALL");

        addPortLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        addPortLabel.setForeground(new java.awt.Color(51, 51, 51));
        addPortLabel.setText("Port:");

        addFromLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        addFromLabel.setForeground(new java.awt.Color(51, 51, 51));
        addFromLabel.setText("From:");

        addProtocolLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        addProtocolLabel.setForeground(new java.awt.Color(51, 51, 51));
        addProtocolLabel.setText("Protocol:");

        addPortText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        addPortText.setForeground(new java.awt.Color(102, 102, 102));
        addPortText.setToolTipText("");

        addFromText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        addFromText.setForeground(new java.awt.Color(102, 102, 102));
        addFromText.setToolTipText("");

        addDone.setBackground(new java.awt.Color(51, 153, 0));
        addDone.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        addDone.setForeground(new java.awt.Color(255, 255, 255));
        addDone.setText("Done");
        addDone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addDoneActionPerformed(evt);
            }
        });

        addCancel.setBackground(new java.awt.Color(204, 0, 0));
        addCancel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        addCancel.setForeground(new java.awt.Color(255, 255, 255));
        addCancel.setText("Cancel");
        addCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCancelActionPerformed(evt);
            }
        });

        addToLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        addToLabel.setForeground(new java.awt.Color(51, 51, 51));
        addToLabel.setText("To:");

        addToText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        addToText.setForeground(new java.awt.Color(102, 102, 102));
        addToText.setToolTipText("");

        cbPort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPortActionPerformed(evt);
            }
        });

        cbFrom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbFromActionPerformed(evt);
            }
        });

        cbTo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbToActionPerformed(evt);
            }
        });

        cbProtocol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbProtocolActionPerformed(evt);
            }
        });

        addProtocol.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        addProtocol.setForeground(new java.awt.Color(102, 102, 102));
        addProtocol.setToolTipText("");

        cbApp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAppActionPerformed(evt);
            }
        });

        addAppLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        addAppLabel.setForeground(new java.awt.Color(51, 51, 51));
        addAppLabel.setText("App:");

        addApp.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        addApp.setForeground(new java.awt.Color(102, 102, 102));
        addApp.setToolTipText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 105, Short.MAX_VALUE)
                        .addComponent(addDone, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(93, 93, 93)
                        .addComponent(addCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(addTitle)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cbPort, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cbFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cbApp, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(addPortLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(addFromLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                                            .addComponent(addAppLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(cbTo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(addToLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(addFromText, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                                    .addComponent(addPortText, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(addToText)
                                    .addComponent(addApp, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cbProtocol, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(addProtocolLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(addProtocol)))))
                .addGap(51, 51, 51))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(addTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addPortLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbPort, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(addPortText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 1, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addAppLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbApp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(addApp, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 2, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbFrom, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(addFromLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addFromText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbTo, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(addToLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addToText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addProtocolLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbProtocol, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(addProtocol, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addDone, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 501, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCancelActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_addCancelActionPerformed

    private void addDoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addDoneActionPerformed

        String add_port = addPortText.getText();
        String add_from = addFromText.getText();
        String add_protocol = this.addProtocol.getText();
        String add_to = addToText.getText();
        String add_app = addApp.getText();
        String[] choices = {"Allow", "Deny"};
        String action = (String) JOptionPane.showInputDialog(null,"Choose action","Notification", 
                                           JOptionPane.INFORMATION_MESSAGE, null,choices, choices[0]);
        Config_UFW add = new Config_UFW();
        add.addRule(host, port, username, password, add_port, add_from, add_protocol, action, add_to, add_app);
        if(!action.isEmpty()){
//            rule.setVisible(false);
            JOptionPane.showMessageDialog(this, "Add rule successfully!");
            this.dispose();
        }
    }//GEN-LAST:event_addDoneActionPerformed

    private void cbPortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPortActionPerformed
        // TODO add your handling code here:
        addPortText.setVisible(cbPort.isSelected());
        invalidate();
        validate();
    }//GEN-LAST:event_cbPortActionPerformed

    private void cbFromActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbFromActionPerformed
        // TODO add your handling code here:
        addFromText.setVisible(cbFrom.isSelected());
        invalidate();
        validate();
    }//GEN-LAST:event_cbFromActionPerformed

    private void cbToActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbToActionPerformed
        // TODO add your handling code here:
        addToText.setVisible(cbTo.isSelected());
        //sap xep lai bo cuc
        invalidate();
        validate();
    }//GEN-LAST:event_cbToActionPerformed

    private void cbProtocolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbProtocolActionPerformed
        addProtocol.setVisible(cbProtocol.isSelected());
        invalidate();
        validate();
    }//GEN-LAST:event_cbProtocolActionPerformed

    private void cbAppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAppActionPerformed
        // TODO add your handling code here:
        addApp.setVisible(cbApp.isSelected());
        invalidate();
        validate();
    }//GEN-LAST:event_cbAppActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addApp;
    private javax.swing.JLabel addAppLabel;
    private javax.swing.JButton addCancel;
    private javax.swing.JButton addDone;
    private javax.swing.JLabel addFromLabel;
    private javax.swing.JTextField addFromText;
    private javax.swing.JLabel addPortLabel;
    private javax.swing.JTextField addPortText;
    private javax.swing.JTextField addProtocol;
    private javax.swing.JLabel addProtocolLabel;
    private javax.swing.JLabel addTitle;
    private javax.swing.JLabel addToLabel;
    private javax.swing.JTextField addToText;
    private javax.swing.JCheckBox cbApp;
    private javax.swing.JCheckBox cbFrom;
    private javax.swing.JCheckBox cbPort;
    private javax.swing.JCheckBox cbProtocol;
    private javax.swing.JCheckBox cbTo;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
