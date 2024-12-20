/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Frame;

import Model.Config_UFW;
import Model.TableUFW;
import Model.Logging_UFW;
import com.jcraft.jsch.Session;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author User
 */
public class Menu extends javax.swing.JFrame {

    private String host;
    private int port;
    private String username;
    private String password;
    public static JFrame menu = new Menu();
    public LogIn login;
    private boolean isV4;
    Session session = LogIn.session;
    Config_UFW config_UFW = new Config_UFW();
    Logging_UFW logging_UFW = new Logging_UFW();
    TableUFW ufwmodel = new TableUFW();
    String status; 
    String log_status;
    String log_level;
    private JTable logTable;
       
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
    
    public void getInfor(String host, int port, String username, String password){
        this.host = host;
        this.port = port;
        this.username = username;
        this.password = password;        
    }
    
    public void updateInfor(String host, int port, String username){
        menuIp.setText(host);
        menuPort.setText("" + port);
        menuUserName.setText(username);
    }
    
    public void updateLog(String logstt, String loglvl){
        menuLogging.setText(logstt);
        loggingLevel.setText(loglvl);
    }
    
    public void checkActive(String connect){
        menuStatus.setText(connect.equals("Connect") ? "Connected" : "Disconnected");
    }
    
    public void checkStatus(String host, int port, String username, String password){
        status = config_UFW.status_UFW(host, port, username, password); 
        statusUFW.setText(status);
    }
    
    public void checkLogging(String host, int port, String username, String password){
        log_status = logging_UFW.logging_status(host, port, username, password);
        log_level = logging_UFW.logging_level(host, port, username, password);
        menuLogging.setText(log_status);
        loggingLevel.setText(log_level);
    }
                                                                                                                  
    public Menu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        note = new java.awt.Panel();
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
        avt = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();
        menuLoggingLabel = new java.awt.Label();
        menuLogging = new java.awt.Label();
        loggingLevel = new java.awt.Label();
        logDetails = new javax.swing.JButton();
        updateAvt = new javax.swing.JButton();
        menuControlTitle = new javax.swing.JLabel();
        menuInfoLabel = new java.awt.Label();
        statusUFW = new javax.swing.JLabel();
        btnAddRule = new javax.swing.JButton();
        btnTurnOff = new javax.swing.JButton();
        UFWin4v6 = new javax.swing.JButton();
        optionDelete = new javax.swing.JButton();
        deleteText = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        ufwTable = new javax.swing.JTable();
        btnReload = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        UFWin4v4 = new javax.swing.JButton();
        btnListApp = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        note.setBackground(new java.awt.Color(242, 242, 242));
        note.setPreferredSize(new java.awt.Dimension(900, 800));

        jPanel1.setBackground(new java.awt.Color(243, 165, 86));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setPreferredSize(new java.awt.Dimension(345, 768));

        menuAccountTitle.setBackground(new java.awt.Color(243, 165, 86));
        menuAccountTitle.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        menuAccountTitle.setForeground(new java.awt.Color(242, 242, 242));
        menuAccountTitle.setText("Account");

        menuIpLabel.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        menuIpLabel.setForeground(new java.awt.Color(242, 242, 242));
        menuIpLabel.setText("IP: ");

        menuIp.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        menuIp.setForeground(new java.awt.Color(255, 255, 228));
        menuIp.setText("10.0.0.1");

        menuUserNameLabel.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        menuUserNameLabel.setForeground(new java.awt.Color(242, 242, 242));
        menuUserNameLabel.setText("User name:");

        menuUserName.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        menuUserName.setForeground(new java.awt.Color(255, 255, 228));
        menuUserName.setText("Celina");

        menuPortLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        menuPortLabel.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        menuPortLabel.setForeground(new java.awt.Color(242, 242, 242));
        menuPortLabel.setText("Port:");

        menuPort.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        menuPort.setForeground(new java.awt.Color(255, 255, 228));
        menuPort.setText("22");

        menuStatusLabel.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        menuStatusLabel.setForeground(new java.awt.Color(242, 242, 242));
        menuStatusLabel.setText("Status:");

        menuStatus.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        menuStatus.setForeground(new java.awt.Color(255, 255, 228));
        menuStatus.setName(""); // NOI18N
        menuStatus.setText("Active");

        avt.setIcon(new javax.swing.ImageIcon("D:\\.Mon_hoc\\NLCS\\FireWalltuxa\\src\\main\\java\\image\\user.png")); // NOI18N

        btnExit.setBackground(new java.awt.Color(204, 255, 204));
        btnExit.setIcon(new javax.swing.ImageIcon("D:\\.Mon_hoc\\NLCS\\FireWalltuxa\\src\\main\\java\\image\\shutdown.png")); // NOI18N
        btnExit.setBorder(null);
        btnExit.setContentAreaFilled(false);
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        menuLoggingLabel.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        menuLoggingLabel.setForeground(new java.awt.Color(242, 242, 242));
        menuLoggingLabel.setText("Logging:");

        menuLogging.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        menuLogging.setForeground(new java.awt.Color(255, 255, 228));
        menuLogging.setName(""); // NOI18N

        loggingLevel.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        loggingLevel.setForeground(new java.awt.Color(255, 255, 228));
        loggingLevel.setName(""); // NOI18N

        logDetails.setBackground(new java.awt.Color(243, 165, 86));
        logDetails.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        logDetails.setForeground(new java.awt.Color(255, 255, 255));
        logDetails.setIcon(new javax.swing.ImageIcon("D:\\.Mon_hoc\\NLCS\\FireWalltuxa\\src\\main\\java\\image\\details.png")); // NOI18N
        logDetails.setToolTipText("");
        logDetails.setBorder(null);
        logDetails.setContentAreaFilled(false);
        logDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logDetailsActionPerformed(evt);
            }
        });

        updateAvt.setBackground(new java.awt.Color(255, 255, 204));
        updateAvt.setIcon(new javax.swing.ImageIcon("D:\\.Mon_hoc\\NLCS\\FireWalltuxa\\src\\main\\java\\image\\update.png")); // NOI18N
        updateAvt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateAvtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(menuUserNameLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(menuIpLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(menuPortLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(menuStatusLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(menuLoggingLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(menuUserName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(menuPort, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(menuIp, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                            .addComponent(menuStatus, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(menuLogging, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(loggingLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(logDetails)
                        .addGap(15, 15, 15))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(97, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(menuAccountTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(avt))
                        .addGap(24, 24, 24)
                        .addComponent(updateAvt, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnExit)
                        .addGap(147, 147, 147))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(menuAccountTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(avt)
                    .addComponent(updateAvt))
                .addGap(79, 79, 79)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(menuIpLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(menuIp, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(menuUserName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(menuUserNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(menuPortLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(menuPort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(menuStatusLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addComponent(menuLoggingLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(menuStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(logDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(menuLogging, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(loggingLevel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(69, 69, 69)
                        .addComponent(btnExit)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        menuUserNameLabel.getAccessibleContext().setAccessibleName("");

        menuControlTitle.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        menuControlTitle.setForeground(new java.awt.Color(242, 92, 5));
        menuControlTitle.setText("Control UFW");

        menuInfoLabel.setFont(new java.awt.Font("Tahoma", 3, 20)); // NOI18N
        menuInfoLabel.setForeground(new java.awt.Color(0, 64, 133));
        menuInfoLabel.setText("Information UFW:");

        statusUFW.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        statusUFW.setForeground(new java.awt.Color(51, 153, 0));
        statusUFW.setText("active");

        btnAddRule.setBackground(new java.awt.Color(255, 255, 204));
        btnAddRule.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnAddRule.setForeground(new java.awt.Color(255, 255, 255));
        btnAddRule.setIcon(new javax.swing.ImageIcon("D:\\.Mon_hoc\\NLCS\\FireWalltuxa\\src\\main\\java\\image\\add.png")); // NOI18N
        btnAddRule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddRuleActionPerformed(evt);
            }
        });

        btnTurnOff.setBackground(new java.awt.Color(255, 204, 153));
        btnTurnOff.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnTurnOff.setForeground(new java.awt.Color(242, 92, 5));
        btnTurnOff.setIcon(new javax.swing.ImageIcon("D:\\.Mon_hoc\\NLCS\\FireWalltuxa\\src\\main\\java\\image\\on-off.png")); // NOI18N
        btnTurnOff.setText("ON-OFF UFW");
        btnTurnOff.setBorder(null);
        btnTurnOff.setContentAreaFilled(false);
        btnTurnOff.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnTurnOff.setMaximumSize(new java.awt.Dimension(66, 66));
        btnTurnOff.setMinimumSize(new java.awt.Dimension(66, 66));
        btnTurnOff.setPreferredSize(new java.awt.Dimension(66, 66));
        btnTurnOff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTurnOffActionPerformed(evt);
            }
        });

        UFWin4v6.setBackground(new java.awt.Color(242, 92, 5));
        UFWin4v6.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        UFWin4v6.setForeground(new java.awt.Color(255, 255, 255));
        UFWin4v6.setText("Infor UFW (v6)");
        UFWin4v6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UFWin4v6ActionPerformed(evt);
            }
        });

        optionDelete.setBackground(new java.awt.Color(242, 92, 5));
        optionDelete.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        optionDelete.setForeground(new java.awt.Color(255, 255, 255));
        optionDelete.setText("Delete both");
        optionDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optionDeleteActionPerformed(evt);
            }
        });

        deleteText.setBackground(new java.awt.Color(242, 242, 242));
        deleteText.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        deleteText.setForeground(new java.awt.Color(153, 153, 153));
        deleteText.setText("VD: allow 80");
        deleteText.setToolTipText("");
        deleteText.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        deleteText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                deleteTextFocusGained(evt);
            }
        });

        ufwTable.setBackground(new java.awt.Color(242, 242, 242));
        ufwTable.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ufwTable.setModel(new javax.swing.table.DefaultTableModel(
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
                "ID", "TO", "ACTION", "FROM"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ufwTable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ufwTable.setFillsViewportHeight(true);
        ufwTable.setMinimumSize(new java.awt.Dimension(90, 175));
        ufwTable.setRowHeight(25);
        ufwTable.setShowGrid(true);
        ufwTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ufwTableMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ufwTableMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(ufwTable);
        if (ufwTable.getColumnModel().getColumnCount() > 0) {
            ufwTable.getColumnModel().getColumn(0).setPreferredWidth(20);
            ufwTable.getColumnModel().getColumn(1).setResizable(false);
            ufwTable.getColumnModel().getColumn(1).setPreferredWidth(50);
            ufwTable.getColumnModel().getColumn(2).setResizable(false);
            ufwTable.getColumnModel().getColumn(2).setPreferredWidth(90);
            ufwTable.getColumnModel().getColumn(3).setPreferredWidth(150);
        }

        btnReload.setBackground(new java.awt.Color(255, 255, 204));
        btnReload.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnReload.setForeground(new java.awt.Color(255, 255, 255));
        btnReload.setIcon(new javax.swing.ImageIcon("D:\\.Mon_hoc\\NLCS\\FireWalltuxa\\src\\main\\java\\image\\reload.png")); // NOI18N
        btnReload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReloadActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(255, 255, 204));
        btnDelete.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setIcon(new javax.swing.ImageIcon("D:\\.Mon_hoc\\NLCS\\FireWalltuxa\\src\\main\\java\\image\\delete.png")); // NOI18N
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnEdit.setBackground(new java.awt.Color(255, 255, 204));
        btnEdit.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnEdit.setForeground(new java.awt.Color(255, 255, 255));
        btnEdit.setIcon(new javax.swing.ImageIcon("D:\\.Mon_hoc\\NLCS\\FireWalltuxa\\src\\main\\java\\image\\edit.png")); // NOI18N
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        UFWin4v4.setBackground(new java.awt.Color(242, 92, 5));
        UFWin4v4.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        UFWin4v4.setForeground(new java.awt.Color(255, 255, 255));
        UFWin4v4.setText("Infor UFW (v4)");
        UFWin4v4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UFWin4v4ActionPerformed(evt);
            }
        });

        btnListApp.setBackground(new java.awt.Color(242, 92, 5));
        btnListApp.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnListApp.setForeground(new java.awt.Color(255, 255, 255));
        btnListApp.setText("List app");
        btnListApp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListAppActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 2, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 51, 0));
        jLabel1.setText("Note: Don't forget to press the reload button after your update");

        javax.swing.GroupLayout noteLayout = new javax.swing.GroupLayout(note);
        note.setLayout(noteLayout);
        noteLayout.setHorizontalGroup(
            noteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(noteLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(noteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(noteLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(noteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(noteLayout.createSequentialGroup()
                                .addComponent(menuInfoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, noteLayout.createSequentialGroup()
                                .addGroup(noteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(noteLayout.createSequentialGroup()
                                        .addGroup(noteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(UFWin4v4, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnTurnOff, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(noteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(statusUFW, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(UFWin4v6, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, noteLayout.createSequentialGroup()
                                        .addGroup(noteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(noteLayout.createSequentialGroup()
                                                .addGap(25, 25, 25)
                                                .addComponent(btnAddRule, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(62, 62, 62)
                                                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(62, 62, 62)
                                                .addComponent(btnReload, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(noteLayout.createSequentialGroup()
                                                .addComponent(optionDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(deleteText, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                                        .addGroup(noteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnListApp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, noteLayout.createSequentialGroup()
                                                .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(22, 22, 22)))))
                                .addGap(28, 28, 28))))
                    .addGroup(noteLayout.createSequentialGroup()
                        .addGap(188, 188, 188)
                        .addComponent(menuControlTitle)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, noteLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        noteLayout.setVerticalGroup(
            noteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(noteLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(menuControlTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(menuInfoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(noteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(statusUFW, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTurnOff, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(noteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(UFWin4v6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(noteLayout.createSequentialGroup()
                        .addComponent(UFWin4v4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(noteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnReload, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddRule, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(noteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(optionDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteText, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnListApp, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(44, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(note, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(note, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        int selectRow = ufwTable.getSelectedRow();
        if (selectRow > -1){
            String index = ufwTable.getValueAt(selectRow, 0).toString();
            int confirm = JOptionPane.showConfirmDialog(this, "You want to update this rule, don't you?",
                    "Confirmation",JOptionPane.YES_NO_OPTION);
            if (confirm == JOptionPane.YES_OPTION){
                btnAddRule.doClick();               
                config_UFW.delete_UFW(host, port, username, password, index);
            }else{
                JOptionPane.showMessageDialog(this, "No rule has changed");
            }
        }else{
            JOptionPane.showMessageDialog(this, "Please select row which you want to edit!");
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) ufwTable.getModel();
        int row = ufwTable.getSelectedRow();
        if (row > -1){
            String index = ufwTable.getValueAt(row, 0).toString();
            config_UFW.delete_UFW(host, port, username, password, index);
            
            model.removeRow(ufwTable.getSelectedRow());
            btnReload.doClick();
        }else{
            JOptionPane.showMessageDialog(this, "Please select row which you want to delete!");
        }

    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnReloadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReloadActionPerformed
        ufwTable.setVisible(true);
        if(isV4 == true){
            DefaultTableModel result1 = ufwmodel.ufwTableModelv4(host, port, username, password);
            ufwTable.setModel(result1);    
        }else if(isV4 == false){
            DefaultTableModel result = ufwmodel.ufwTableModel(host, port, username, password);
            ufwTable.setModel(result);
        }
        ufwmodel.setupTable(ufwTable);
        menuLogging.setText(logging_UFW.logging_status(host, port, username, password));
        loggingLevel.setText(logging_UFW.logging_level(host, port, username, password));
    }//GEN-LAST:event_btnReloadActionPerformed

    private void optionDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optionDeleteActionPerformed
        String text = deleteText.getText();
        if(text.isEmpty()){
            JOptionPane.showMessageDialog(this, "Please select row which you want to delete both IPv4 and IPv6!");
        }
        int selected = ufwTable.getSelectedRow();
        String action = ufwTable.getValueAt(selected, 2).toString().split("IN")[0].toLowerCase();
        String app = ufwTable.getValueAt(selected, 1).toString();
        String delText = config_UFW.delete_UFW(host, port, username, password, text);
        if(delText.isEmpty()){
            delText = config_UFW.delete_App_UFW(host, port, username, password, action, app);
        }
        JOptionPane.showMessageDialog(this, delText);
        btnReload.doClick();
    }//GEN-LAST:event_optionDeleteActionPerformed

    private void UFWin4v6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UFWin4v6ActionPerformed
        ufwTable.setVisible(true);
        DefaultTableModel result = ufwmodel.ufwTableModel(host, port, username, password);
        ufwTable.setModel(result);
        ufwmodel.setupTable(ufwTable);
        isV4 = false;
    }//GEN-LAST:event_UFWin4v6ActionPerformed

    private void btnTurnOffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTurnOffActionPerformed
        
        String statusUpdate = "";
        status = config_UFW.status_UFW(host, port, username, password);

        if(status.equals("active")){
            //lenh off
            String disable = config_UFW.disableUFW(host, port, username, password);
            JOptionPane.showMessageDialog(this, disable);
            statusUpdate = config_UFW.status_UFW(host, port, username, password); //off 
        }else{

            String enable = config_UFW.enableUFW(host, port, username, password);
            JOptionPane.showMessageDialog(this, enable);
            statusUpdate = config_UFW.status_UFW(host, port, username, password);
        }
        statusUFW.setText(statusUpdate);
        btnReload.doClick();
    }//GEN-LAST:event_btnTurnOffActionPerformed

    private void btnAddRuleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddRuleActionPerformed
        // TODO add your handling code here:
        AddRule rule = new AddRule();
        rule.getInfor(host, port, username, password);
        rule.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        rule.setVisible(true);
        rule.setLocationRelativeTo(null);
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

    private void UFWin4v4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UFWin4v4ActionPerformed
        ufwTable.setVisible(true);
        DefaultTableModel result = ufwmodel.ufwTableModelv4(host, port, username, password);
        ufwTable.setModel(result);
        ufwmodel.setupTable(ufwTable);
        isV4 = true;
    }//GEN-LAST:event_UFWin4v4ActionPerformed

    private void btnListAppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListAppActionPerformed
        // TODO add your handling code here:
        String result = config_UFW.listApp_UFW(host, port, username, password);
        JOptionPane.showMessageDialog(this, result);
        
    }//GEN-LAST:event_btnListAppActionPerformed

    private void ufwTableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ufwTableMousePressed
        //khong cho sua
        boolean edit = ufwTable.isEditing();
        if(edit == false && evt.getClickCount() == 2 && !evt.isConsumed()){
            JOptionPane.showMessageDialog(null, "You can not edit this table");
        }
    }//GEN-LAST:event_ufwTableMousePressed

    private void logDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logDetailsActionPerformed
//        this.setVisible(false);
        Logging logging = new Logging();
        logging.getInfor(host, port, username, password);
        logging.checkLogging(host, port, username, password);
        logging.setVisible(true);
        logging.setLocationRelativeTo(null);
        logging.setDefaultCloseOperation(DISPOSE_ON_CLOSE);      
        
    }//GEN-LAST:event_logDetailsActionPerformed

    private void deleteTextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_deleteTextFocusGained
        // TODO add your handling code here:
        deleteText.setText("");  
    }//GEN-LAST:event_deleteTextFocusGained

    private void ufwTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ufwTableMouseClicked
        int selected = ufwTable.getSelectedRow();
        if(selected != -1){
            deleteText.setText(ufwTable.getValueAt(selected, 2).toString().split("IN")[0].toLowerCase() + " " 
                   + ufwTable.getValueAt(selected, 1).toString());
       }
    }//GEN-LAST:event_ufwTableMouseClicked

    private void updateAvtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateAvtActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY); //chi hien thị file
        int returnValue = fileChooser.showOpenDialog(this);
        if (returnValue == JFileChooser.APPROVE_OPTION){
            File file = fileChooser.getSelectedFile();
            //lay duong dan file
            String pathFile = file.getAbsolutePath();
            BufferedImage b;
            try {
                b = ImageIO.read(file);
                avt.setIcon(new ImageIcon(b));
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println(pathFile);
            
        }
    }//GEN-LAST:event_updateAvtActionPerformed
       
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton UFWin4v4;
    private javax.swing.JButton UFWin4v6;
    private javax.swing.JLabel avt;
    private javax.swing.JButton btnAddRule;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnListApp;
    private javax.swing.JButton btnReload;
    private javax.swing.JButton btnTurnOff;
    private javax.swing.JTextField deleteText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton logDetails;
    private java.awt.Label loggingLevel;
    private java.awt.Label menuAccountTitle;
    private javax.swing.JLabel menuControlTitle;
    private java.awt.Label menuInfoLabel;
    private javax.swing.JLabel menuIp;
    private java.awt.Label menuIpLabel;
    private java.awt.Label menuLogging;
    private java.awt.Label menuLoggingLabel;
    private java.awt.Label menuPort;
    private java.awt.Label menuPortLabel;
    private java.awt.Label menuStatus;
    private java.awt.Label menuStatusLabel;
    private java.awt.Label menuUserName;
    private javax.swing.JLabel menuUserNameLabel;
    private java.awt.Panel note;
    private javax.swing.JButton optionDelete;
    private javax.swing.JLabel statusUFW;
    private javax.swing.JTable ufwTable;
    private javax.swing.JButton updateAvt;
    // End of variables declaration//GEN-END:variables
}
