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
        rangePanel.setVisible(false);

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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
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
        addApp = new javax.swing.JComboBox<>();
        cbRange = new javax.swing.JCheckBox();
        addRangeLabel = new javax.swing.JLabel();
        rangePanel = new javax.swing.JPanel();
        range1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        range2 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        ufwTableSample = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(248, 249, 250));
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 440));

        addTitle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        addTitle.setForeground(new java.awt.Color(242, 92, 5));
        addTitle.setText("ADD RULE FOR FIREWALL");

        addPortLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        addPortLabel.setForeground(new java.awt.Color(0, 64, 133));
        addPortLabel.setText("Port:");

        addFromLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        addFromLabel.setForeground(new java.awt.Color(0, 64, 133));
        addFromLabel.setText("From:");

        addProtocolLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        addProtocolLabel.setForeground(new java.awt.Color(0, 64, 133));
        addProtocolLabel.setText("Protocol:");

        addPortText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        addPortText.setForeground(new java.awt.Color(102, 102, 102));
        addPortText.setToolTipText("");

        addFromText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        addFromText.setForeground(new java.awt.Color(102, 102, 102));
        addFromText.setToolTipText("");

        addDone.setBackground(new java.awt.Color(76, 176, 44));
        addDone.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        addDone.setForeground(new java.awt.Color(255, 255, 255));
        addDone.setText("Done");
        addDone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addDoneActionPerformed(evt);
            }
        });

        addCancel.setBackground(new java.awt.Color(220, 0, 0));
        addCancel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        addCancel.setForeground(new java.awt.Color(255, 255, 255));
        addCancel.setText("Cancel");
        addCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCancelActionPerformed(evt);
            }
        });

        addToLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        addToLabel.setForeground(new java.awt.Color(0, 64, 133));
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
        addAppLabel.setForeground(new java.awt.Color(0, 64, 133));
        addAppLabel.setText("App:");

        cbRange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbRangeActionPerformed(evt);
            }
        });

        addRangeLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        addRangeLabel.setForeground(new java.awt.Color(0, 64, 133));
        addRangeLabel.setText("Range:");

        rangePanel.setBackground(new java.awt.Color(248, 249, 250));

        range1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                range1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setText("   :");

        javax.swing.GroupLayout rangePanelLayout = new javax.swing.GroupLayout(rangePanel);
        rangePanel.setLayout(rangePanelLayout);
        rangePanelLayout.setHorizontalGroup(
            rangePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rangePanelLayout.createSequentialGroup()
                .addComponent(range1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(range2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );
        rangePanelLayout.setVerticalGroup(
            rangePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rangePanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(rangePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(range1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(range2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        ufwTableSample.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "ID", "TO", "ACTION", "FROM"
            }
        ));
        ufwTableSample.setRequestFocusEnabled(false);
        ufwTableSample.setRowHeight(25);
        ufwTableSample.setShowGrid(true);
        ufwTableSample.setShowHorizontalLines(true);
        ufwTableSample.setShowVerticalLines(true);
        jScrollPane2.setViewportView(ufwTableSample);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(addTitle))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cbPort, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cbFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cbApp, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cbRange, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(addPortLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(addFromLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(addAppLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(addRangeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(cbTo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(addToLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(rangePanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(addFromText, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(addApp, javax.swing.GroupLayout.Alignment.LEADING, 0, 298, Short.MAX_VALUE)
                                        .addComponent(addPortText, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(addToText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(cbProtocol, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(addProtocolLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(addProtocol, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(45, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addComponent(addDone, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(addCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(118, 118, 118))
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
                        .addComponent(addPortText, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbApp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(addAppLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(addApp, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbFrom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addFromLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(addFromText, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbRange, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(rangePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(addRangeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbTo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addToLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(addToText, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cbProtocol, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(44, 44, 44))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(addProtocolLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(addProtocol, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addDone, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 572, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 553, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCancelActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_addCancelActionPerformed

    private void addDoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addDoneActionPerformed
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        String add_port = addPortText.getText();
        String add_from = addFromText.getText();
        String add_protocol = this.addProtocol.getText();
        String add_to = addToText.getText();
        String add_app = "";
        int intRange1 = Integer.parseInt(range1.getText());
        int intRange2 = Integer.parseInt(range2.getText());
        if(cbApp.isSelected()){
            add_app = (String) addApp.getSelectedItem();   
        }
        String[] choices = {"Allow", "Deny"};
        String action = (String) JOptionPane.showInputDialog(null,"Choose action","Notification", 
                                           JOptionPane.INFORMATION_MESSAGE, null,choices, choices[0]);
        Config_UFW add = new Config_UFW();
        add.addRule(host, port, username, password, add_port, add_from, add_protocol, action, add_to, add_app, intRange1, intRange2);
        if(!action.isEmpty()){
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
        Config_UFW config_UFW = new Config_UFW();
        String[] get_list_app = config_UFW.getListApp(host, port, username, password);
        addApp.removeAllItems();
//        addApp.addItem("");
        for (String app : get_list_app) {
            addApp.addItem(app);
        }
        addApp.setVisible(cbApp.isSelected());
        invalidate();
        validate();
    }//GEN-LAST:event_cbAppActionPerformed

    private void cbRangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbRangeActionPerformed
        // TODO add your handling code here:
        rangePanel.setVisible(cbRange.isSelected());
        invalidate();
        validate();
    }//GEN-LAST:event_cbRangeActionPerformed

    private void range1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_range1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_range1ActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> addApp;
    private javax.swing.JLabel addAppLabel;
    private javax.swing.JButton addCancel;
    private javax.swing.JButton addDone;
    private javax.swing.JLabel addFromLabel;
    private javax.swing.JTextField addFromText;
    private javax.swing.JLabel addPortLabel;
    private javax.swing.JTextField addPortText;
    private javax.swing.JTextField addProtocol;
    private javax.swing.JLabel addProtocolLabel;
    private javax.swing.JLabel addRangeLabel;
    private javax.swing.JLabel addTitle;
    private javax.swing.JLabel addToLabel;
    private javax.swing.JTextField addToText;
    private javax.swing.JCheckBox cbApp;
    private javax.swing.JCheckBox cbFrom;
    private javax.swing.JCheckBox cbPort;
    private javax.swing.JCheckBox cbProtocol;
    private javax.swing.JCheckBox cbRange;
    private javax.swing.JCheckBox cbTo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField range1;
    private javax.swing.JTextField range2;
    private javax.swing.JPanel rangePanel;
    private javax.swing.JTable ufwTableSample;
    // End of variables declaration//GEN-END:variables
}
