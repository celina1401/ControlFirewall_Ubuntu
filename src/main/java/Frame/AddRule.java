/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Frame;

import Model.Config_UFW;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

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
    private String add_action = "";
    private String add_to;
    
    public AddRule() {
        initComponents();
    }
    //them rule, xoa rule, sua rule

    public AddRule(String host, int port, String username, String password, 
            int add_port, String add_from, String add_protocol, String add_action, String add_to) {
        
        this.host = host;
        this.port = port;
        this.username = username;
        this.password = password;
        
        this.add_port = add_port;
        this.add_from = add_from;
        this.add_protocol = add_protocol;
        this.add_action = add_action;
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

    public String getAdd_action() {
        return add_action;
    }

    public void setAdd_action(String add_action) {
        this.add_action = add_action;
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
        cbPort = new javax.swing.JCheckBox();
        cbAnywhere = new javax.swing.JCheckBox();
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
        fromIP = new javax.swing.JLabel();
        addActionLabel = new javax.swing.JLabel();
        addAction = new javax.swing.JComboBox<>();
        btnView = new javax.swing.JButton();
        cbInOut = new javax.swing.JCheckBox();

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
        addPortText.setEnabled(false);

        addFromText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        addFromText.setForeground(new java.awt.Color(102, 102, 102));
        addFromText.setToolTipText("");
        addFromText.setEnabled(false);

        addDone.setBackground(new java.awt.Color(76, 176, 44));
        addDone.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        addDone.setForeground(new java.awt.Color(255, 255, 255));
        addDone.setText("Done");
        addDone.setBorder(null);
        addDone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addDoneActionPerformed(evt);
            }
        });

        addCancel.setBackground(new java.awt.Color(220, 0, 0));
        addCancel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        addCancel.setForeground(new java.awt.Color(255, 255, 255));
        addCancel.setText("Cancel");
        addCancel.setBorder(null);
        addCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCancelActionPerformed(evt);
            }
        });

        addToLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        addToLabel.setForeground(new java.awt.Color(0, 64, 133));
        addToLabel.setText("To:");

        cbPort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPortActionPerformed(evt);
            }
        });

        cbAnywhere.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cbAnywhere.setSelected(true);
        cbAnywhere.setText("    Anywhere");
        cbAnywhere.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAnywhereActionPerformed(evt);
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
        addProtocol.setEnabled(false);

        cbApp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAppActionPerformed(evt);
            }
        });

        addAppLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        addAppLabel.setForeground(new java.awt.Color(0, 64, 133));
        addAppLabel.setText("Name App:");

        addApp.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        addApp.setEnabled(false);

        cbRange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbRangeActionPerformed(evt);
            }
        });

        addRangeLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        addRangeLabel.setForeground(new java.awt.Color(0, 64, 133));
        addRangeLabel.setText("Range:");

        rangePanel.setBackground(new java.awt.Color(248, 249, 250));

        range1.setEnabled(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setText("  :");

        range2.setEnabled(false);

        javax.swing.GroupLayout rangePanelLayout = new javax.swing.GroupLayout(rangePanel);
        rangePanel.setLayout(rangePanelLayout);
        rangePanelLayout.setHorizontalGroup(
            rangePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rangePanelLayout.createSequentialGroup()
                .addComponent(range1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(range2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
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

        ufwTableSample.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ufwTableSample.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "TO", "ACTION", "FROM"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ufwTableSample.setEnabled(false);
        ufwTableSample.setRequestFocusEnabled(false);
        ufwTableSample.setRowHeight(25);
        ufwTableSample.setShowGrid(true);
        jScrollPane2.setViewportView(ufwTableSample);
        if (ufwTableSample.getColumnModel().getColumnCount() > 0) {
            ufwTableSample.getColumnModel().getColumn(0).setResizable(false);
            ufwTableSample.getColumnModel().getColumn(0).setPreferredWidth(50);
            ufwTableSample.getColumnModel().getColumn(1).setResizable(false);
            ufwTableSample.getColumnModel().getColumn(1).setPreferredWidth(175);
            ufwTableSample.getColumnModel().getColumn(2).setResizable(false);
            ufwTableSample.getColumnModel().getColumn(2).setPreferredWidth(100);
            ufwTableSample.getColumnModel().getColumn(3).setResizable(false);
            ufwTableSample.getColumnModel().getColumn(3).setPreferredWidth(175);
        }

        fromIP.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        fromIP.setForeground(new java.awt.Color(0, 64, 133));
        fromIP.setText("IP:");

        addActionLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        addActionLabel.setForeground(new java.awt.Color(0, 64, 133));
        addActionLabel.setText("Action:");

        addAction.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        addAction.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Allow", "Deny" }));

        btnView.setBackground(new java.awt.Color(0, 115, 179));
        btnView.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnView.setForeground(new java.awt.Color(255, 255, 255));
        btnView.setText("View");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        cbInOut.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cbInOut.setText("out");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(addActionLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(378, 378, 378))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addToLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(cbPort, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cbProtocol, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(addProtocolLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(addPortLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(addPortText, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                                            .addComponent(addProtocol)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(cbApp, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cbRange, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(addAppLabel)
                                            .addComponent(addRangeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(rangePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(cbInOut, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(addApp, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(fromIP, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(addFromText, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(11, 11, 11)))))
                        .addContainerGap(46, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(addFromLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cbAnywhere, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(182, 182, 182)
                                .addComponent(addAction, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(addTitle))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(btnView, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78)
                        .addComponent(addDone, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71)
                        .addComponent(addCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(addTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addToLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(addPortText, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(addPortLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cbPort, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(addProtocolLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(addProtocol, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cbProtocol, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(rangePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addRangeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cbRange, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(addAppLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(addApp, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cbApp, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(addAction)
                        .addComponent(cbInOut, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(addActionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbAnywhere, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addFromLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(fromIP, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addFromText, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addDone, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnView, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(151, 151, 151))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 572, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCancelActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_addCancelActionPerformed

    private void addDoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addDoneActionPerformed
     
        String add_port = addPortText.isEnabled() ? addPortText.getText() : "";
        String add_from = addFromText.isEnabled() ? addFromText.getText() : "";
        String add_protocol = addProtocol.isEnabled() ? addProtocol.getText() : "";
        String add_action = (String) addAction.getSelectedItem();
        String add_app = cbApp.isSelected() ? (String) addApp.getSelectedItem() : "";
        String result = "";        
        String range1Text = range1.getText();
        String range2Text = range2.getText();
        int intRange1 = 0;
        int intRange2 = 0;
        System.out.println("add_port: " + add_port);
        System.out.println("add_from: " + add_from);
        System.out.println("add_protocol: " + add_protocol);
        System.out.println("add_action: " + add_action);
        System.out.println("add_app: " + add_app);
        System.out.println("range1: " + range1Text);
        System.out.println("range2: " + range2Text);
        if (add_port.isEmpty() && add_from.isEmpty() && add_protocol.isEmpty() && add_app.isEmpty() && range1Text.isEmpty() && range2Text.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill at least 1 rule!", "Warning Notification", JOptionPane.WARNING_MESSAGE);
            return;
        }
        try {
        if (!range1Text.isEmpty()) {
            intRange1 = Integer.parseInt(range1Text);
        }
        if (!range2Text.isEmpty()) {
            intRange2 = Integer.parseInt(range2Text);
        }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        if(cbApp.isSelected()){
            add_app = (String) addApp.getSelectedItem();   
        }
//        String[] choices = {"Allow", "Deny"};
//        String action = (String) JOptionPane.showInputDialog(null,"Choose action","Notification", 
//                                           JOptionPane.INFORMATION_MESSAGE, null,choices, choices[0]);
        
        Config_UFW add = new Config_UFW();
//        add.addRule(host, port, username, password, add_port, add_from, add_protocol, add_action, add_app, intRange1, intRange2);
        if(cbInOut.isSelected()){
            result = add.addRule_out(host, port, username, password, add_port, add_from, add_protocol, add_action, add_app, intRange1, intRange2);
        }else{
            result = add.addRule(host, port, username, password, add_port, add_from, add_protocol, add_action, add_app, intRange1, intRange2);
            
        }
        
        System.out.println("Result from addrule: " + result);
        if (result.contains("successfull")) {
            JOptionPane.showMessageDialog(this, "Add rule successfully!");
            this.dispose();
        } else if (result.contains("fault")) {
            JOptionPane.showMessageDialog(this, "Fail: " + result, "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "This rule is invalid! Please check your information again.", "Warning Notification", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_addDoneActionPerformed

    private void cbPortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPortActionPerformed
        addPortText.setEnabled(cbPort.isSelected()); // Bật hoặc tắt theo trạng thái checkbox
        if (!cbPort.isSelected()) {
//            addPortText.setText(""); // Xóa giá trị nếu checkbox bị bỏ chọn
        }
    }//GEN-LAST:event_cbPortActionPerformed

    private void cbAnywhereActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAnywhereActionPerformed
        if (cbAnywhere.isSelected()) {
            addFromText.setEnabled(false); // Vô hiệu hóa nếu checkbox được chọn
//            addFromText.setText("");      // Xóa nội dung nếu cần
        } else {
            addFromText.setEnabled(true); // Bật trường văn bản nếu checkbox không được chọn
        }
    }//GEN-LAST:event_cbAnywhereActionPerformed

    private void cbProtocolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbProtocolActionPerformed
        if (cbProtocol.isSelected()) {
            addProtocol.setEnabled(true); // Vô hiệu hóa nếu checkbox được chọn
        } else {
            addProtocol.setEnabled(false); // Bật trường văn bản nếu checkbox không được chọn
        }
    }//GEN-LAST:event_cbProtocolActionPerformed

    private void cbAppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAppActionPerformed
        // TODO add your handling code here:
        if (cbApp.isSelected()) {
            addApp.setEnabled(true); // Vô hiệu hóa nếu checkbox được chọn
            Config_UFW config_UFW = new Config_UFW();
            String[] get_list_app = config_UFW.getListApp(host, port, username, password);
            addApp.removeAllItems();
//        addApp.addItem("");
            for (String app : get_list_app) {
                addApp.addItem(app);
            }
        } else {
            addApp.setEnabled(false); // Bật trường văn bản nếu checkbox không được chọn
        }      
    }//GEN-LAST:event_cbAppActionPerformed

    private void cbRangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbRangeActionPerformed
        // TODO add your handling code here:
        boolean isSelected = cbRange.isSelected();
        range1.setEnabled(isSelected);
        range2.setEnabled(isSelected);
    }//GEN-LAST:event_cbRangeActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        DefaultTableModel tableSample = (DefaultTableModel) ufwTableSample.getModel();
        if(tableSample.getRowCount() != -1){
            tableSample.setRowCount(0);
        }if(cbInOut.isSelected()){
            if(addPortText.isEnabled() && addProtocol.isEnabled() 
                    && !addFromText.isEnabled() && !addApp.isEnabled() && !range1.isEnabled()&& !range2.isEnabled()){
                //port,proto
                tableSample.addRow(new Object[]{
                    1,
                    addPortText.getText() + "/"+ addProtocol.getText(),
                    addAction.getSelectedItem() + " " + "out",
                    "Anywhere"
                });            
            }else if(range1.isEnabled() && range2.isEnabled() && addProtocol.isEnabled()
                    && !addPortText.isEnabled() && !addFromText.isEnabled() && !addApp.isEnabled()){
                //range, proto
                tableSample.addRow(new Object[]{
                    1,
                    range1.getText()+ ":" + range2.getText() + "/"+ addProtocol.getText(),
                    addAction.getSelectedItem() + " " + "out",
                    "Anywhere"
                }); 
            }else if(addPortText.isEnabled()
                    && !addProtocol.isEnabled() && !addFromText.isEnabled() && !addApp.isEnabled() && !range1.isEnabled()&& !range2.isEnabled()){
                //port
                tableSample.addRow(new Object[]{
                    1,
                    addPortText.getText(),
                    addAction.getSelectedItem() + " " + "out",
                    "Anywhere"
                }); 
            }else if(addApp.isEnabled()
                    && !addProtocol.isEnabled() && !addFromText.isEnabled() && !addPortText.isEnabled() && !range1.isEnabled()&& !range2.isEnabled()){
                //app
                tableSample.addRow(new Object[]{
                    1,
                    addApp.getSelectedItem(),
                    addAction.getSelectedItem() + " " + "out",
                    "Anywhere"
                }); 
            }else if(addPortText.isEnabled() && addProtocol.isEnabled()  && addFromText.isEnabled()
                    && !addApp.isEnabled() && !range1.isEnabled()&& !range2.isEnabled()){
                //port,proto,from
                tableSample.addRow(new Object[]{
                    1,
                    addPortText.getText() + "/"+ addProtocol.getText(),
                    addAction.getSelectedItem() + " " + "out",
                    addFromText.getText()
                });            
            }else if(range1.isEnabled() && range2.isEnabled() && addProtocol.isEnabled()  && addFromText.isEnabled()
                    && !addPortText.isEnabled() && !addApp.isEnabled()){
                //range, proto,from
                tableSample.addRow(new Object[]{
                    1,
                    range1.getText()+ ":" + range2.getText() + "/"+ addProtocol.getText(),
                    addAction.getSelectedItem() + " " + "out",
                    addFromText.getText()
                }); 
            }else if(addPortText.isEnabled()  && addFromText.isEnabled()
                    && !addProtocol.isEnabled() && !addApp.isEnabled() && !range1.isEnabled()&& !range2.isEnabled()){
                //port,from
                tableSample.addRow(new Object[]{
                    1,
                    addPortText.getText(),
                    addAction.getSelectedItem() + " " + "out",
                    addFromText.getText()
                }); 
            }else if(addFromText.isEnabled()
                    && !addApp.isEnabled()  && !addProtocol.isEnabled() && !addPortText.isEnabled() && !range1.isEnabled()&& !range2.isEnabled()){
                //from
                tableSample.addRow(new Object[]{
                    1,
                    "Anywhere",
                    addAction.getSelectedItem() + " " + "out",
                    addFromText.getText()
                }); 
            }else{
                JOptionPane.showMessageDialog(this, "This rule is invalid!");
            }
        }else if(addPortText.isEnabled() && addProtocol.isEnabled() 
                && !addFromText.isEnabled() && !addApp.isEnabled() && !range1.isEnabled()&& !range2.isEnabled()){
            //port,proto
            tableSample.addRow(new Object[]{
                1,
                addPortText.getText() + "/"+ addProtocol.getText(),
                addAction.getSelectedItem() + " " + "in",
                "Anywhere"
            });            
        }else if(range1.isEnabled() && range2.isEnabled() && addProtocol.isEnabled()
                && !addPortText.isEnabled() && !addFromText.isEnabled() && !addApp.isEnabled()){
            //range, proto
            tableSample.addRow(new Object[]{
                1,
                range1.getText()+ ":" + range2.getText() + "/"+ addProtocol.getText(),
                addAction.getSelectedItem() + " " + "in",
                "Anywhere"
            }); 
        }else if(addPortText.isEnabled()
                && !addProtocol.isEnabled() && !addFromText.isEnabled() && !addApp.isEnabled() && !range1.isEnabled()&& !range2.isEnabled()){
            //port
            tableSample.addRow(new Object[]{
                1,
                addPortText.getText(),
                addAction.getSelectedItem() + " " + "in",
                "Anywhere"
            }); 
        }else if(addApp.isEnabled()
                && !addProtocol.isEnabled() && !addFromText.isEnabled() && !addPortText.isEnabled() && !range1.isEnabled()&& !range2.isEnabled()){
            //app
            tableSample.addRow(new Object[]{
                1,
                addApp.getSelectedItem(),
                addAction.getSelectedItem() + " " + "in",
                "Anywhere"
            }); 
        }else if(addPortText.isEnabled() && addProtocol.isEnabled()  && addFromText.isEnabled()
                && !addApp.isEnabled() && !range1.isEnabled()&& !range2.isEnabled()){
            //port,proto,from
            tableSample.addRow(new Object[]{
                1,
                addPortText.getText() + "/"+ addProtocol.getText(),
                addAction.getSelectedItem() + " " + "in",
                addFromText.getText()
            });            
        }else if(range1.isEnabled() && range2.isEnabled() && addProtocol.isEnabled()  && addFromText.isEnabled()
                && !addPortText.isEnabled() && !addApp.isEnabled()){
            //range, proto,from
            tableSample.addRow(new Object[]{
                1,
                range1.getText()+ ":" + range2.getText() + "/"+ addProtocol.getText(),
                addAction.getSelectedItem() + " " + "in",
                addFromText.getText()
            }); 
        }else if(addPortText.isEnabled()  && addFromText.isEnabled()
                && !addProtocol.isEnabled() && !addApp.isEnabled() && !range1.isEnabled()&& !range2.isEnabled()){
            //port,from
            tableSample.addRow(new Object[]{
                1,
                addPortText.getText(),
                addAction.getSelectedItem() + " " + "in",
                addFromText.getText()
            }); 
        }else if(addFromText.isEnabled()
                && !addApp.isEnabled()  && !addProtocol.isEnabled() && !addPortText.isEnabled() && !range1.isEnabled()&& !range2.isEnabled()){
            //from
            tableSample.addRow(new Object[]{
                1,
                "Anywhere",
                addAction.getSelectedItem() + " " + "in",
                addFromText.getText()
            }); 
        }else{
            JOptionPane.showMessageDialog(this, "This rule is invalid!");
        }

    }//GEN-LAST:event_btnViewActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> addAction;
    private javax.swing.JLabel addActionLabel;
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
    private javax.swing.JButton btnView;
    private javax.swing.JCheckBox cbAnywhere;
    private javax.swing.JCheckBox cbApp;
    private javax.swing.JCheckBox cbInOut;
    private javax.swing.JCheckBox cbPort;
    private javax.swing.JCheckBox cbProtocol;
    private javax.swing.JCheckBox cbRange;
    private javax.swing.JLabel fromIP;
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
