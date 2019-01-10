package login;

import dbconnect.DatabaseHelper;
import event.EventManager;
import finance.*;
import java.awt.Color;
import static java.lang.Thread.sleep;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import restaurant.Restaurant_Manager;
import room.RoomManager;


public class System_Admin extends javax.swing.JFrame {
    //variable for connect database
    Connection conn=DatabaseHelper.getDBConnection();
    PreparedStatement pstatement=null;
    ResultSet Results =null;
    //DBAccess data=new DBAccess();
    
    static String USER;
   SimpleDateFormat sdf;
    public System_Admin(String username) {
        
        USER=username;
        initComponents();
        this.setLocationRelativeTo(null); //Setting to display in the center of screen
        clock();
        //data.adduserlogs(USER, "System Login", "Login",00000);
        
        welcomeuser.setText(USER);
        togglePanels.setVisible(true);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jDesktopPaneFinance = new javax.swing.JDesktopPane();
        financeManagerPanel = new javax.swing.JPanel();
        headerPanel = new javax.swing.JPanel();
        welcomeuser = new javax.swing.JLabel();
        welcomeuser1 = new javax.swing.JLabel();
        Time = new javax.swing.JLabel();
        lbldt = new javax.swing.JLabel();
        lbldayname = new javax.swing.JLabel();
        togglePanels = new javax.swing.JPanel();
        btnstockmanager = new javax.swing.JButton();
        btneventmanager = new javax.swing.JButton();
        btnresmanager = new javax.swing.JButton();
        btnhrmanager = new javax.swing.JButton();
        btnroommanager = new javax.swing.JButton();
        btntranmanager = new javax.swing.JButton();
        btnfinancemanager = new javax.swing.JButton();
        btnsystem = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

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
        setTitle("Hotel Management System");
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        setSize(new java.awt.Dimension(1020, 700));

        jDesktopPaneFinance.setBackground(new java.awt.Color(255, 255, 255));
        jDesktopPaneFinance.setForeground(new java.awt.Color(255, 255, 255));
        jDesktopPaneFinance.setPreferredSize(new java.awt.Dimension(1024, 690));
        jDesktopPaneFinance.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        financeManagerPanel.setBackground(new java.awt.Color(255, 255, 255));
        financeManagerPanel.setPreferredSize(new java.awt.Dimension(1024, 690));
        financeManagerPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        headerPanel.setBackground(new java.awt.Color(0, 51, 51));
        headerPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 153, 255), 2));
        headerPanel.setLayout(null);

        welcomeuser.setFont(new java.awt.Font("Monotype Corsiva", 3, 18)); // NOI18N
        welcomeuser.setForeground(new java.awt.Color(240, 240, 240));
        welcomeuser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        headerPanel.add(welcomeuser);
        welcomeuser.setBounds(440, 40, 170, 30);

        welcomeuser1.setFont(new java.awt.Font("Monotype Corsiva", 3, 36)); // NOI18N
        welcomeuser1.setForeground(new java.awt.Color(240, 240, 240));
        welcomeuser1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        welcomeuser1.setText("WELCOME ");
        headerPanel.add(welcomeuser1);
        welcomeuser1.setBounds(420, 10, 220, 30);

        Time.setFont(new java.awt.Font("Monotype Corsiva", 3, 36)); // NOI18N
        Time.setForeground(new java.awt.Color(240, 240, 240));
        Time.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        headerPanel.add(Time);
        Time.setBounds(420, 80, 210, 40);

        lbldt.setFont(new java.awt.Font("Monotype Corsiva", 3, 24)); // NOI18N
        lbldt.setForeground(new java.awt.Color(240, 240, 240));
        headerPanel.add(lbldt);
        lbldt.setBounds(660, 80, 150, 40);

        lbldayname.setFont(new java.awt.Font("Monotype Corsiva", 3, 24)); // NOI18N
        lbldayname.setForeground(new java.awt.Color(240, 240, 240));
        headerPanel.add(lbldayname);
        lbldayname.setBounds(270, 80, 120, 40);

        financeManagerPanel.add(headerPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1024, 130));

        togglePanels.setBackground(new java.awt.Color(255, 255, 255));
        togglePanels.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(42, 135, 235), 2));
        togglePanels.setPreferredSize(new java.awt.Dimension(832, 552));

        btnstockmanager.setBackground(new java.awt.Color(0, 51, 51));
        btnstockmanager.setFont(new java.awt.Font("Monotype Corsiva", 3, 18)); // NOI18N
        btnstockmanager.setForeground(new java.awt.Color(240, 240, 240));
        btnstockmanager.setText("       STOCK MANAGEMENT");
        btnstockmanager.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnstockmanager.setMargin(new java.awt.Insets(2, 4, 2, 0));
        btnstockmanager.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnstockmanagerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnstockmanagerMouseExited(evt);
            }
        });
        btnstockmanager.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnstockmanagerActionPerformed(evt);
            }
        });

        btneventmanager.setBackground(new java.awt.Color(0, 51, 51));
        btneventmanager.setFont(new java.awt.Font("Monotype Corsiva", 3, 18)); // NOI18N
        btneventmanager.setForeground(new java.awt.Color(240, 240, 240));
        btneventmanager.setText("       EVENT MANAGEMENT");
        btneventmanager.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btneventmanager.setMargin(new java.awt.Insets(2, 4, 2, 0));
        btneventmanager.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btneventmanagerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btneventmanagerMouseExited(evt);
            }
        });
        btneventmanager.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneventmanagerActionPerformed(evt);
            }
        });

        btnresmanager.setBackground(new java.awt.Color(0, 51, 51));
        btnresmanager.setFont(new java.awt.Font("Monotype Corsiva", 3, 18)); // NOI18N
        btnresmanager.setForeground(new java.awt.Color(240, 240, 240));
        btnresmanager.setText("  RESTAURANT MANAGEMENT");
        btnresmanager.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnresmanager.setMargin(new java.awt.Insets(2, 4, 2, 0));
        btnresmanager.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnresmanagerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnresmanagerMouseExited(evt);
            }
        });
        btnresmanager.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnresmanagerActionPerformed(evt);
            }
        });

        btnhrmanager.setBackground(new java.awt.Color(0, 51, 51));
        btnhrmanager.setFont(new java.awt.Font("Monotype Corsiva", 3, 18)); // NOI18N
        btnhrmanager.setForeground(new java.awt.Color(240, 240, 240));
        btnhrmanager.setText("          HR MANAGEMENT");
        btnhrmanager.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnhrmanager.setMargin(new java.awt.Insets(2, 4, 2, 0));
        btnhrmanager.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnhrmanagerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnhrmanagerMouseExited(evt);
            }
        });
        btnhrmanager.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhrmanagerActionPerformed(evt);
            }
        });

        btnroommanager.setBackground(new java.awt.Color(0, 51, 51));
        btnroommanager.setFont(new java.awt.Font("Monotype Corsiva", 3, 18)); // NOI18N
        btnroommanager.setForeground(new java.awt.Color(240, 240, 240));
        btnroommanager.setText("        ROOM MANAGEMENT");
        btnroommanager.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnroommanager.setMargin(new java.awt.Insets(2, 4, 2, 0));
        btnroommanager.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnroommanagerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnroommanagerMouseExited(evt);
            }
        });
        btnroommanager.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnroommanagerActionPerformed(evt);
            }
        });

        btntranmanager.setBackground(new java.awt.Color(0, 51, 51));
        btntranmanager.setFont(new java.awt.Font("Monotype Corsiva", 3, 18)); // NOI18N
        btntranmanager.setForeground(new java.awt.Color(240, 240, 240));
        btntranmanager.setText("    TRANSPORT MANAGEMENT");
        btntranmanager.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btntranmanager.setMargin(new java.awt.Insets(2, 4, 2, 0));
        btntranmanager.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btntranmanagerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btntranmanagerMouseExited(evt);
            }
        });
        btntranmanager.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntranmanagerActionPerformed(evt);
            }
        });

        btnfinancemanager.setBackground(new java.awt.Color(0, 51, 51));
        btnfinancemanager.setFont(new java.awt.Font("Monotype Corsiva", 3, 18)); // NOI18N
        btnfinancemanager.setForeground(new java.awt.Color(240, 240, 240));
        btnfinancemanager.setText("       FINANCE MANAGEMENT");
        btnfinancemanager.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnfinancemanager.setMargin(new java.awt.Insets(2, 4, 2, 0));
        btnfinancemanager.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnfinancemanagerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnfinancemanagerMouseExited(evt);
            }
        });
        btnfinancemanager.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfinancemanagerActionPerformed(evt);
            }
        });

        btnsystem.setBackground(new java.awt.Color(0, 51, 51));
        btnsystem.setFont(new java.awt.Font("Monotype Corsiva", 3, 18)); // NOI18N
        btnsystem.setForeground(new java.awt.Color(240, 240, 240));
        btnsystem.setText("            SYSTEM SETTINGS");
        btnsystem.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnsystem.setMargin(new java.awt.Insets(2, 4, 2, 0));
        btnsystem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnsystemMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnsystemMouseExited(evt);
            }
        });
        btnsystem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsystemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout togglePanelsLayout = new javax.swing.GroupLayout(togglePanels);
        togglePanels.setLayout(togglePanelsLayout);
        togglePanelsLayout.setHorizontalGroup(
            togglePanelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, togglePanelsLayout.createSequentialGroup()
                .addContainerGap(62, Short.MAX_VALUE)
                .addGroup(togglePanelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnhrmanager, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btneventmanager, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnresmanager, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnstockmanager, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(85, 85, 85)
                .addGroup(togglePanelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnsystem, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btntranmanager, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnfinancemanager, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnroommanager, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49))
        );
        togglePanelsLayout.setVerticalGroup(
            togglePanelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(togglePanelsLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(togglePanelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(togglePanelsLayout.createSequentialGroup()
                        .addGroup(togglePanelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btneventmanager, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnroommanager, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(48, 48, 48)
                        .addComponent(btnresmanager, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(btnstockmanager, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(btnhrmanager, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(togglePanelsLayout.createSequentialGroup()
                        .addComponent(btntranmanager, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(btnfinancemanager, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(btnsystem, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        financeManagerPanel.add(togglePanels, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 147, 780, 540));

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 530, Short.MAX_VALUE)
        );

        financeManagerPanel.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 200, 530));

        jDesktopPaneFinance.add(financeManagerPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDesktopPaneFinance, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDesktopPaneFinance, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnstockmanagerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnstockmanagerMouseEntered
        btnstockmanager.setBackground(new Color(35,171,69));
    }//GEN-LAST:event_btnstockmanagerMouseEntered

    private void btnstockmanagerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnstockmanagerMouseExited
        btnstockmanager.setBackground(new Color(0,51,51));
    }//GEN-LAST:event_btnstockmanagerMouseExited

    private void btnstockmanagerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnstockmanagerActionPerformed
 
    }//GEN-LAST:event_btnstockmanagerActionPerformed

    private void btneventmanagerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btneventmanagerMouseEntered
        btneventmanager.setBackground(new Color(35,171,69));
    }//GEN-LAST:event_btneventmanagerMouseEntered

    private void btneventmanagerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btneventmanagerMouseExited
         btneventmanager.setBackground(new Color(0,51,51));
    }//GEN-LAST:event_btneventmanagerMouseExited

    private void btneventmanagerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneventmanagerActionPerformed
        EventManager em = new EventManager();
        em.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btneventmanagerActionPerformed

    private void btnresmanagerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnresmanagerMouseEntered
        btnresmanager.setBackground(new Color(35,171,69));
    }//GEN-LAST:event_btnresmanagerMouseEntered

    private void btnresmanagerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnresmanagerMouseExited
        btnresmanager.setBackground(new Color(0,51,51));
    }//GEN-LAST:event_btnresmanagerMouseExited

    private void btnresmanagerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnresmanagerActionPerformed
        Restaurant_Manager rm = new Restaurant_Manager();
        rm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnresmanagerActionPerformed

    private void btnhrmanagerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnhrmanagerMouseEntered
        btnhrmanager.setBackground(new Color(35,171,69));
    }//GEN-LAST:event_btnhrmanagerMouseEntered

    private void btnhrmanagerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnhrmanagerMouseExited
        btnhrmanager.setBackground(new Color(0,51,51));
    }//GEN-LAST:event_btnhrmanagerMouseExited

    private void btnhrmanagerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhrmanagerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnhrmanagerActionPerformed

    private void btnroommanagerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnroommanagerMouseEntered
        btnroommanager.setBackground(new Color(35,171,69));
    }//GEN-LAST:event_btnroommanagerMouseEntered

    private void btnroommanagerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnroommanagerMouseExited
        btnroommanager.setBackground(new Color(0,51,51));
    }//GEN-LAST:event_btnroommanagerMouseExited

    private void btnroommanagerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnroommanagerActionPerformed
        RoomManager rm=new RoomManager();
        rm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnroommanagerActionPerformed

    private void btntranmanagerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btntranmanagerMouseEntered
         btnroommanager.setBackground(new Color(35,171,69));
    }//GEN-LAST:event_btntranmanagerMouseEntered

    private void btntranmanagerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btntranmanagerMouseExited
        btntranmanager.setBackground(new Color(0,51,51));
    }//GEN-LAST:event_btntranmanagerMouseExited

    private void btntranmanagerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntranmanagerActionPerformed
        
    }//GEN-LAST:event_btntranmanagerActionPerformed

    private void btnfinancemanagerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnfinancemanagerMouseEntered
        btnfinancemanager.setBackground(new Color(35,171,69));
    }//GEN-LAST:event_btnfinancemanagerMouseEntered

    private void btnfinancemanagerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnfinancemanagerMouseExited
        btnfinancemanager.setBackground(new Color(0,51,51));
    }//GEN-LAST:event_btnfinancemanagerMouseExited

    private void btnfinancemanagerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfinancemanagerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnfinancemanagerActionPerformed

    private void btnsystemMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsystemMouseEntered
        btnsystem.setBackground(new Color(35,171,69));

    }//GEN-LAST:event_btnsystemMouseEntered

    private void btnsystemMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsystemMouseExited
        btnsystem.setBackground(new Color(0,51,51));
    }//GEN-LAST:event_btnsystemMouseExited

    private void btnsystemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsystemActionPerformed
        SystemPanel sp = new SystemPanel();
        sp.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_btnsystemActionPerformed
    public void clock(){
        new Thread() {
            public void run() {
                for (;;) {
                    sdf = new SimpleDateFormat("hh:mm:ss a");
                    Date d = new Date();
                    //System.out.println(sdf.format(d));
                    Time.setText(sdf.format(d));
                    sdf = new SimpleDateFormat("dd-MMM-yyyy");

                    lbldt.setText(sdf.format(d));

                    sdf = new SimpleDateFormat("EEEE");
                    // Date d3 = new Date();
                    lbldayname.setText(sdf.format(d));

                    try {
                        sleep(1000);
                    } catch (Exception e) {
                    }

                }

            }
        }.start();
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Finance_Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Finance_Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Finance_Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Finance_Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Finance_Main(USER).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JLabel Time;
    javax.swing.JButton btneventmanager;
    javax.swing.JButton btnfinancemanager;
    javax.swing.JButton btnhrmanager;
    javax.swing.JButton btnresmanager;
    javax.swing.JButton btnroommanager;
    javax.swing.JButton btnstockmanager;
    javax.swing.JButton btnsystem;
    javax.swing.JButton btntranmanager;
    javax.swing.JPanel financeManagerPanel;
    javax.swing.JPanel headerPanel;
    javax.swing.JDesktopPane jDesktopPaneFinance;
    javax.swing.JPanel jPanel1;
    javax.swing.JScrollPane jScrollPane1;
    javax.swing.JTable jTable1;
    javax.swing.JLabel lbldayname;
    javax.swing.JLabel lbldt;
    javax.swing.JPanel togglePanels;
    javax.swing.JLabel welcomeuser;
    javax.swing.JLabel welcomeuser1;
    // End of variables declaration//GEN-END:variables
}