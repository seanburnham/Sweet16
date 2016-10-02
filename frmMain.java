
/*
Sean Burnham Section 2
Description: This program creates a gui and simulates a double elimination
             tournamnet game through round one, and then single elimination after that.
*/



import static java.awt.EventQueue.invokeLater;
import java.util.ArrayList;
import java.util.*;
import static java.util.logging.Level.SEVERE;
import static java.util.logging.Logger.getLogger;
import static javax.swing.UIManager.getInstalledLookAndFeels;
import static javax.swing.UIManager.setLookAndFeel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author profgreg
 */
public class frmMain extends javax.swing.JFrame {

    /**
     * Creates new form frmMain
     */
    public frmMain() {
        initComponents();
        //This blanks out the entire gui
        lblNorthTeam1.setText("");
        lblNorthTeam2.setText("");
        lblNorthTeam3.setText("");
        lblNorthTeam4.setText("");
        lblNorthTeam5.setText("");
        lblNorthTeam6.setText("");
        
        lblNorthTeam1Wins.setText("");
        lblNorthTeam2Wins.setText("");
        lblNorthTeam3Wins.setText("");
        lblNorthTeam4Wins.setText("");
        lblNorthTeam5Wins.setText("");
        lblNorthTeam6Wins.setText("");
        lblNorthTeam1Losses.setText("");
        lblNorthTeam2Losses.setText("");
        lblNorthTeam3Losses.setText("");
        lblNorthTeam4Losses.setText("");
        lblNorthTeam5Losses.setText("");
        lblNorthTeam6Losses.setText("");
        lblNorthTeam1GB.setText("");
        lblNorthTeam2GB.setText("");
        lblNorthTeam3GB.setText("");
        lblNorthTeam4GB.setText("");
        lblNorthTeam5GB.setText("");
        lblNorthTeam6GB.setText("");
        
        lblSouthTeam1.setText("");
        lblSouthTeam2.setText("");
        lblSouthTeam3.setText("");
        lblSouthTeam4.setText("");
        lblSouthTeam5.setText("");
        lblSouthTeam6.setText("");
        lblSouthTeam1Wins.setText("");
        lblSouthTeam2Wins.setText("");
        lblSouthTeam3Wins.setText("");
        lblSouthTeam4Wins.setText("");
        lblSouthTeam5Wins.setText("");
        lblSouthTeam6Wins.setText("");
        lblSouthTeam1Losses.setText("");
        lblSouthTeam2Losses.setText("");
        lblSouthTeam3Losses.setText("");
        lblSouthTeam4Losses.setText("");
        lblSouthTeam5Losses.setText("");
        lblSouthTeam6Losses.setText("");
        lblSouthTeam1GB.setText("");
        lblSouthTeam2GB.setText("");
        lblSouthTeam3GB.setText("");
        lblSouthTeam4GB.setText("");
        lblSouthTeam5GB.setText("");
        lblSouthTeam6GB.setText("");
        
        lblWestTeam1.setText("");
        lblWestTeam2.setText("");
        lblWestTeam3.setText("");
        lblWestTeam4.setText("");
        lblWestTeam5.setText("");
        lblWestTeam6.setText("");
        lblWestTeam1Wins.setText("");
        lblWestTeam2Wins.setText("");
        lblWestTeam3Wins.setText("");
        lblWestTeam4Wins.setText("");
        lblWestTeam5Wins.setText("");
        lblWestTeam6Wins.setText("");
        lblWestTeam1Losses.setText("");
        lblWestTeam2Losses.setText("");
        lblWestTeam3Losses.setText("");
        lblWestTeam4Losses.setText("");
        lblWestTeam5Losses.setText("");
        lblWestTeam6Losses.setText("");
        lblWestTeam1GB.setText("");
        lblWestTeam2GB.setText("");
        lblWestTeam3GB.setText("");
        lblWestTeam4GB.setText("");
        lblWestTeam5GB.setText("");
        lblWestTeam6GB.setText("");
        
        lblEastTeam1.setText("");
        lblEastTeam2.setText("");
        lblEastTeam3.setText("");
        lblEastTeam4.setText("");
        lblEastTeam5.setText("");
        lblEastTeam6.setText("");
        lblEastTeam1Wins.setText("");
        lblEastTeam2Wins.setText("");
        lblEastTeam3Wins.setText("");
        lblEastTeam4Wins.setText("");
        lblEastTeam5Wins.setText("");
        lblEastTeam6Wins.setText("");
        lblEastTeam1Losses.setText("");
        lblEastTeam2Losses.setText("");
        lblEastTeam3Losses.setText("");
        lblEastTeam4Losses.setText("");
        lblEastTeam5Losses.setText("");
        lblEastTeam6Losses.setText("");
        lblEastTeam1GB.setText("");
        lblEastTeam2GB.setText("");
        lblEastTeam3GB.setText("");
        lblEastTeam4GB.setText("");
        lblEastTeam5GB.setText("");
        lblEastTeam6GB.setText("");
        
        lblNorthWinner.setText("");
        lblSouthWinner.setText("");
        lblWestWinner.setText("");
        lblEastWinner.setText("");
        lblNorthEastWinner.setText("");
        lblSouthWestWinner.setText("");
        lblChampion.setText("");
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        pnlSouth = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lboxSouth = new javax.swing.JList();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        pnlSouthStandings = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblSouthTeam1 = new javax.swing.JLabel();
        lblSouthTeam2 = new javax.swing.JLabel();
        lblSouthTeam3 = new javax.swing.JLabel();
        lblSouthTeam4 = new javax.swing.JLabel();
        lblSouthTeam5 = new javax.swing.JLabel();
        lblSouthTeam6 = new javax.swing.JLabel();
        lblSouthTeam1Wins = new javax.swing.JLabel();
        lblSouthTeam1Losses = new javax.swing.JLabel();
        lblSouthTeam2Wins = new javax.swing.JLabel();
        lblSouthTeam2Losses = new javax.swing.JLabel();
        lblSouthTeam3Wins = new javax.swing.JLabel();
        lblSouthTeam3Losses = new javax.swing.JLabel();
        lblSouthTeam4Wins = new javax.swing.JLabel();
        lblSouthTeam4Losses = new javax.swing.JLabel();
        lblSouthTeam5Wins = new javax.swing.JLabel();
        lblSouthTeam5Losses = new javax.swing.JLabel();
        lblSouthTeam6Wins = new javax.swing.JLabel();
        lblSouthTeam6Losses = new javax.swing.JLabel();
        lblSouthTeam4GB = new javax.swing.JLabel();
        lblSouthTeam5GB = new javax.swing.JLabel();
        lblSouthTeam3GB = new javax.swing.JLabel();
        lblSouthTeam2GB = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblSouthTeam6GB = new javax.swing.JLabel();
        lblSouthTeam1GB = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lblSouthWinner = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        pnlWest = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lboxWest = new javax.swing.JList();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        pnlWestStandings = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        lblWestTeam1 = new javax.swing.JLabel();
        lblWestTeam2 = new javax.swing.JLabel();
        lblWestTeam3 = new javax.swing.JLabel();
        lblWestTeam4 = new javax.swing.JLabel();
        lblWestTeam5 = new javax.swing.JLabel();
        lblWestTeam6 = new javax.swing.JLabel();
        lblWestTeam1Wins = new javax.swing.JLabel();
        lblWestTeam1Losses = new javax.swing.JLabel();
        lblWestTeam2Wins = new javax.swing.JLabel();
        lblWestTeam2Losses = new javax.swing.JLabel();
        lblWestTeam3Wins = new javax.swing.JLabel();
        lblWestTeam3Losses = new javax.swing.JLabel();
        lblWestTeam4Wins = new javax.swing.JLabel();
        lblWestTeam4Losses = new javax.swing.JLabel();
        lblWestTeam5Wins = new javax.swing.JLabel();
        lblWestTeam5Losses = new javax.swing.JLabel();
        lblWestTeam6Wins = new javax.swing.JLabel();
        lblWestTeam6Losses = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lblWestTeam1GB = new javax.swing.JLabel();
        lblWestTeam2GB = new javax.swing.JLabel();
        lblWestTeam3GB = new javax.swing.JLabel();
        lblWestTeam4GB = new javax.swing.JLabel();
        lblWestTeam5GB = new javax.swing.JLabel();
        lblWestTeam6GB = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        lblWestWinner = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        pnlNorth = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        lboxNorth = new javax.swing.JList();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        pnlNorthStandings = new javax.swing.JPanel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        lblNorthTeam1 = new javax.swing.JLabel();
        lblNorthTeam2 = new javax.swing.JLabel();
        lblNorthTeam3 = new javax.swing.JLabel();
        lblNorthTeam4 = new javax.swing.JLabel();
        lblNorthTeam5 = new javax.swing.JLabel();
        lblNorthTeam6 = new javax.swing.JLabel();
        lblNorthTeam1Wins = new javax.swing.JLabel();
        lblNorthTeam1Losses = new javax.swing.JLabel();
        lblNorthTeam2Wins = new javax.swing.JLabel();
        lblNorthTeam2Losses = new javax.swing.JLabel();
        lblNorthTeam3Wins = new javax.swing.JLabel();
        lblNorthTeam3Losses = new javax.swing.JLabel();
        lblNorthTeam4Wins = new javax.swing.JLabel();
        lblNorthTeam4Losses = new javax.swing.JLabel();
        lblNorthTeam5Wins = new javax.swing.JLabel();
        lblNorthTeam5Losses = new javax.swing.JLabel();
        lblNorthTeam6Wins = new javax.swing.JLabel();
        lblNorthTeam6Losses = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblNorthTeam1GB = new javax.swing.JLabel();
        lblNorthTeam2GB = new javax.swing.JLabel();
        lblNorthTeam3GB = new javax.swing.JLabel();
        lblNorthTeam4GB = new javax.swing.JLabel();
        lblNorthTeam5GB = new javax.swing.JLabel();
        lblNorthTeam6GB = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        lblNorthWinner = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        pnlEast = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        lboxEast = new javax.swing.JList();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        pnlEastStandings = new javax.swing.JPanel();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        lblEastTeam1 = new javax.swing.JLabel();
        lblEastTeam2 = new javax.swing.JLabel();
        lblEastTeam3 = new javax.swing.JLabel();
        lblEastTeam4 = new javax.swing.JLabel();
        lblEastTeam5 = new javax.swing.JLabel();
        lblEastTeam6 = new javax.swing.JLabel();
        lblEastTeam1Wins = new javax.swing.JLabel();
        lblEastTeam1Losses = new javax.swing.JLabel();
        lblEastTeam2Wins = new javax.swing.JLabel();
        lblEastTeam2Losses = new javax.swing.JLabel();
        lblEastTeam3Wins = new javax.swing.JLabel();
        lblEastTeam3Losses = new javax.swing.JLabel();
        lblEastTeam4Wins = new javax.swing.JLabel();
        lblEastTeam4Losses = new javax.swing.JLabel();
        lblEastTeam5Wins = new javax.swing.JLabel();
        lblEastTeam5Losses = new javax.swing.JLabel();
        lblEastTeam6Wins = new javax.swing.JLabel();
        lblEastTeam6Losses = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblEastTeam1GB = new javax.swing.JLabel();
        lblEastTeam2GB = new javax.swing.JLabel();
        lblEastTeam3GB = new javax.swing.JLabel();
        lblEastTeam4GB = new javax.swing.JLabel();
        lblEastTeam5GB = new javax.swing.JLabel();
        lblEastTeam6GB = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        lblEastWinner = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel93 = new javax.swing.JLabel();
        lblSouthWestWinner = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jLabel95 = new javax.swing.JLabel();
        lblNorthEastWinner = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jLabel97 = new javax.swing.JLabel();
        lblChampion = new javax.swing.JLabel();
        btnPlay = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnQuit = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lboxSouth.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Alabama", "Texas A&M", "Texas", "LSU", "Florida", "Florida St" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(lboxSouth);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("SOUTH");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("WINNER");

        pnlSouthStandings.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("TEAM NAME");
        pnlSouthStandings.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("WINS");
        pnlSouthStandings.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 0, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("LOSSES");
        pnlSouthStandings.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, -1, -1));

        lblSouthTeam1.setText("Alabama");
        pnlSouthStandings.add(lblSouthTeam1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, -1, -1));

        lblSouthTeam2.setText("Texas A&M");
        pnlSouthStandings.add(lblSouthTeam2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, -1, -1));

        lblSouthTeam3.setText("Texas");
        pnlSouthStandings.add(lblSouthTeam3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, -1, -1));

        lblSouthTeam4.setText("LSU");
        pnlSouthStandings.add(lblSouthTeam4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, -1, -1));

        lblSouthTeam5.setText("Florida");
        pnlSouthStandings.add(lblSouthTeam5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, -1, -1));

        lblSouthTeam6.setText("Florida St");
        pnlSouthStandings.add(lblSouthTeam6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, -1, -1));

        lblSouthTeam1Wins.setText("15");
        pnlSouthStandings.add(lblSouthTeam1Wins, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, -1, -1));

        lblSouthTeam1Losses.setText("13");
        pnlSouthStandings.add(lblSouthTeam1Losses, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, -1, -1));

        lblSouthTeam2Wins.setText("15");
        pnlSouthStandings.add(lblSouthTeam2Wins, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, -1, -1));

        lblSouthTeam2Losses.setText("13");
        pnlSouthStandings.add(lblSouthTeam2Losses, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, -1, -1));

        lblSouthTeam3Wins.setText("14");
        pnlSouthStandings.add(lblSouthTeam3Wins, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, -1, -1));

        lblSouthTeam3Losses.setText("14");
        pnlSouthStandings.add(lblSouthTeam3Losses, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, -1, -1));

        lblSouthTeam4Wins.setText("11");
        pnlSouthStandings.add(lblSouthTeam4Wins, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, -1, -1));

        lblSouthTeam4Losses.setText("17");
        pnlSouthStandings.add(lblSouthTeam4Losses, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, -1, -1));

        lblSouthTeam5Wins.setText("8");
        pnlSouthStandings.add(lblSouthTeam5Wins, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, -1, -1));

        lblSouthTeam5Losses.setText("20");
        pnlSouthStandings.add(lblSouthTeam5Losses, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, -1, -1));

        lblSouthTeam6Wins.setText("1");
        pnlSouthStandings.add(lblSouthTeam6Wins, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, -1, -1));

        lblSouthTeam6Losses.setText("27");
        pnlSouthStandings.add(lblSouthTeam6Losses, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, -1, -1));

        lblSouthTeam4GB.setText("4");
        pnlSouthStandings.add(lblSouthTeam4GB, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, 20, -1));

        lblSouthTeam5GB.setText("7");
        pnlSouthStandings.add(lblSouthTeam5GB, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 20, -1));

        lblSouthTeam3GB.setText("1");
        pnlSouthStandings.add(lblSouthTeam3GB, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, 20, -1));

        lblSouthTeam2GB.setText("--");
        pnlSouthStandings.add(lblSouthTeam2GB, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, 20, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("GB");
        pnlSouthStandings.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, -1, -1));

        lblSouthTeam6GB.setText("14");
        pnlSouthStandings.add(lblSouthTeam6GB, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, 20, -1));

        lblSouthTeam1GB.setText("--");
        pnlSouthStandings.add(lblSouthTeam1GB, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 20, -1));

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblSouthWinner.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSouthWinner.setText("Alabama");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSouthWinner, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(lblSouthWinner)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlSouthLayout = new javax.swing.GroupLayout(pnlSouth);
        pnlSouth.setLayout(pnlSouthLayout);
        pnlSouthLayout.setHorizontalGroup(
            pnlSouthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSouthLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlSouthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlSouthLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(100, 100, 100)
                        .addComponent(jLabel3))
                    .addGroup(pnlSouthLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pnlSouthStandings, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        pnlSouthLayout.setVerticalGroup(
            pnlSouthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSouthLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlSouthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlSouthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlSouthLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlSouthStandings, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.add(pnlSouth, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 300, 320));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 320, 340));

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lboxWest.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "BYU", "Pepperdine", "UCLA", "Stanford", "California", "USC" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(lboxWest);

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel24.setText("WEST");

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel25.setText("WINNER");

        pnlWestStandings.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel26.setText("TEAM NAME");
        pnlWestStandings.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel27.setText("WINS");
        pnlWestStandings.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 0, -1, -1));

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel28.setText("LOSSES");
        pnlWestStandings.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, -1, -1));

        lblWestTeam1.setText("BYU");
        pnlWestStandings.add(lblWestTeam1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, -1, -1));

        lblWestTeam2.setText("Pepperdine");
        pnlWestStandings.add(lblWestTeam2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, -1, -1));

        lblWestTeam3.setText("UCLA");
        pnlWestStandings.add(lblWestTeam3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, -1, -1));

        lblWestTeam4.setText("Stanford");
        pnlWestStandings.add(lblWestTeam4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, -1, -1));

        lblWestTeam5.setText("California");
        pnlWestStandings.add(lblWestTeam5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, -1, -1));

        lblWestTeam6.setText("USC");
        pnlWestStandings.add(lblWestTeam6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, -1, -1));

        lblWestTeam1Wins.setText("25");
        pnlWestStandings.add(lblWestTeam1Wins, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, -1, -1));

        lblWestTeam1Losses.setText("3");
        pnlWestStandings.add(lblWestTeam1Losses, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, -1, -1));

        lblWestTeam2Wins.setText("23");
        pnlWestStandings.add(lblWestTeam2Wins, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, -1, -1));

        lblWestTeam2Losses.setText("5");
        pnlWestStandings.add(lblWestTeam2Losses, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, -1, -1));

        lblWestTeam3Wins.setText("21");
        pnlWestStandings.add(lblWestTeam3Wins, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, -1, -1));

        lblWestTeam3Losses.setText("7");
        pnlWestStandings.add(lblWestTeam3Losses, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, -1, -1));

        lblWestTeam4Wins.setText("16");
        pnlWestStandings.add(lblWestTeam4Wins, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, -1, -1));

        lblWestTeam4Losses.setText("12");
        pnlWestStandings.add(lblWestTeam4Losses, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, -1, -1));

        lblWestTeam5Wins.setText("10");
        pnlWestStandings.add(lblWestTeam5Wins, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, -1, -1));

        lblWestTeam5Losses.setText("18");
        pnlWestStandings.add(lblWestTeam5Losses, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, -1, -1));

        lblWestTeam6Wins.setText("7");
        pnlWestStandings.add(lblWestTeam6Wins, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, -1, -1));

        lblWestTeam6Losses.setText("21");
        pnlWestStandings.add(lblWestTeam6Losses, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setText("GB");
        pnlWestStandings.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, -1, -1));

        lblWestTeam1GB.setText("--");
        pnlWestStandings.add(lblWestTeam1GB, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 20, -1));

        lblWestTeam2GB.setText("2");
        pnlWestStandings.add(lblWestTeam2GB, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, 20, -1));

        lblWestTeam3GB.setText("4");
        pnlWestStandings.add(lblWestTeam3GB, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, 20, -1));

        lblWestTeam4GB.setText("9");
        pnlWestStandings.add(lblWestTeam4GB, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, 20, -1));

        lblWestTeam5GB.setText("15");
        pnlWestStandings.add(lblWestTeam5GB, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 20, -1));

        lblWestTeam6GB.setText("18");
        pnlWestStandings.add(lblWestTeam6GB, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, 20, -1));

        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblWestWinner.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblWestWinner.setText("BYU");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblWestWinner, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(lblWestWinner)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlWestLayout = new javax.swing.GroupLayout(pnlWest);
        pnlWest.setLayout(pnlWestLayout);
        pnlWestLayout.setHorizontalGroup(
            pnlWestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlWestLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlWestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlWestLayout.createSequentialGroup()
                        .addComponent(jLabel25)
                        .addGap(0, 236, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlWestLayout.createSequentialGroup()
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnlWestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel24)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(pnlWestStandings, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlWestLayout.setVerticalGroup(
            pnlWestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlWestLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlWestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(jLabel25))
                .addGroup(pnlWestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlWestLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlWestLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlWestStandings, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel5.add(pnlWest, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 300, 320));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 360, 320, 340));

        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lboxNorth.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Washington", "Washington St", "Oregon", "Wisconsin", "DePaul", "Notre Dame" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(lboxNorth);

        jLabel47.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel47.setText("NORTH");

        jLabel48.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel48.setText("WINNER");

        pnlNorthStandings.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel49.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel49.setText("TEAM NAME");
        pnlNorthStandings.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel50.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel50.setText("WINS");
        pnlNorthStandings.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 0, -1, -1));

        jLabel51.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel51.setText("LOSSES");
        pnlNorthStandings.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, -1, -1));

        lblNorthTeam1.setText("Washington");
        pnlNorthStandings.add(lblNorthTeam1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, -1, -1));

        lblNorthTeam2.setText("Washington St");
        pnlNorthStandings.add(lblNorthTeam2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, -1, -1));

        lblNorthTeam3.setText("Oregon");
        pnlNorthStandings.add(lblNorthTeam3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, -1, -1));

        lblNorthTeam4.setText("Wisconsin");
        pnlNorthStandings.add(lblNorthTeam4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, -1, -1));

        lblNorthTeam5.setText("DePaul");
        pnlNorthStandings.add(lblNorthTeam5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, -1, -1));

        lblNorthTeam6.setText("Notre Dame");
        pnlNorthStandings.add(lblNorthTeam6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, -1, -1));

        lblNorthTeam1Wins.setText("28");
        pnlNorthStandings.add(lblNorthTeam1Wins, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, -1, -1));

        lblNorthTeam1Losses.setText("0");
        pnlNorthStandings.add(lblNorthTeam1Losses, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, -1, -1));

        lblNorthTeam2Wins.setText("23");
        pnlNorthStandings.add(lblNorthTeam2Wins, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, -1, -1));

        lblNorthTeam2Losses.setText("5");
        pnlNorthStandings.add(lblNorthTeam2Losses, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, -1, -1));

        lblNorthTeam3Wins.setText("20");
        pnlNorthStandings.add(lblNorthTeam3Wins, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, -1, -1));

        lblNorthTeam3Losses.setText("8");
        pnlNorthStandings.add(lblNorthTeam3Losses, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, -1, -1));

        lblNorthTeam4Wins.setText("10");
        pnlNorthStandings.add(lblNorthTeam4Wins, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, -1, -1));

        lblNorthTeam4Losses.setText("18");
        pnlNorthStandings.add(lblNorthTeam4Losses, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, -1, -1));

        lblNorthTeam5Wins.setText("5");
        pnlNorthStandings.add(lblNorthTeam5Wins, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, -1, -1));

        lblNorthTeam5Losses.setText("23");
        pnlNorthStandings.add(lblNorthTeam5Losses, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, -1, -1));

        lblNorthTeam6Wins.setText("0");
        pnlNorthStandings.add(lblNorthTeam6Wins, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, -1, -1));

        lblNorthTeam6Losses.setText("28");
        pnlNorthStandings.add(lblNorthTeam6Losses, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("GB");
        pnlNorthStandings.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, -1, -1));

        lblNorthTeam1GB.setText("--");
        pnlNorthStandings.add(lblNorthTeam1GB, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 20, -1));

        lblNorthTeam2GB.setText("5");
        pnlNorthStandings.add(lblNorthTeam2GB, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, 20, -1));

        lblNorthTeam3GB.setText("8");
        pnlNorthStandings.add(lblNorthTeam3GB, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, 20, -1));

        lblNorthTeam4GB.setText("18");
        pnlNorthStandings.add(lblNorthTeam4GB, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, 20, -1));

        lblNorthTeam5GB.setText("23");
        pnlNorthStandings.add(lblNorthTeam5GB, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 20, -1));

        lblNorthTeam6GB.setText("28");
        pnlNorthStandings.add(lblNorthTeam6GB, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, 20, -1));

        jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblNorthWinner.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNorthWinner.setText("Washington");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNorthWinner, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(lblNorthWinner)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlNorthLayout = new javax.swing.GroupLayout(pnlNorth);
        pnlNorth.setLayout(pnlNorthLayout);
        pnlNorthLayout.setHorizontalGroup(
            pnlNorthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNorthLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlNorthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlNorthLayout.createSequentialGroup()
                        .addComponent(jLabel47)
                        .addGap(100, 100, 100)
                        .addComponent(jLabel48))
                    .addGroup(pnlNorthLayout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pnlNorthStandings, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        pnlNorthLayout.setVerticalGroup(
            pnlNorthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNorthLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlNorthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel47)
                    .addComponent(jLabel48))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlNorthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlNorthLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlNorthStandings, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel8.add(pnlNorth, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 300, 320));

        getContentPane().add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 340));

        jPanel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lboxEast.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Kentucky", "DePaul", "UConn", "South Carolina", "Virginia", "West Virginia" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane4.setViewportView(lboxEast);

        jLabel70.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel70.setText("EAST");

        jLabel71.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel71.setText("WINNER");

        pnlEastStandings.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel72.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel72.setText("TEAM NAME");
        pnlEastStandings.add(jLabel72, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel73.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel73.setText("WINS");
        pnlEastStandings.add(jLabel73, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 0, -1, -1));

        jLabel74.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel74.setText("LOSSES");
        pnlEastStandings.add(jLabel74, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, -1, -1));

        lblEastTeam1.setText("Kentucky");
        pnlEastStandings.add(lblEastTeam1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, -1, -1));

        lblEastTeam2.setText("DePaul");
        pnlEastStandings.add(lblEastTeam2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, -1, -1));

        lblEastTeam3.setText("UConn");
        pnlEastStandings.add(lblEastTeam3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, -1, -1));

        lblEastTeam4.setText("South Carolina");
        pnlEastStandings.add(lblEastTeam4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, -1, -1));

        lblEastTeam5.setText("Virginia");
        pnlEastStandings.add(lblEastTeam5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, -1, -1));

        lblEastTeam6.setText("West Virginia");
        pnlEastStandings.add(lblEastTeam6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, -1, -1));

        lblEastTeam1Wins.setText("20");
        pnlEastStandings.add(lblEastTeam1Wins, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, -1, -1));

        lblEastTeam1Losses.setText("8");
        pnlEastStandings.add(lblEastTeam1Losses, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, -1, -1));

        lblEastTeam2Wins.setText("18");
        pnlEastStandings.add(lblEastTeam2Wins, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, -1, -1));

        lblEastTeam2Losses.setText("10");
        pnlEastStandings.add(lblEastTeam2Losses, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, -1, -1));

        lblEastTeam3Wins.setText("15");
        pnlEastStandings.add(lblEastTeam3Wins, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, -1, -1));

        lblEastTeam3Losses.setText("13");
        pnlEastStandings.add(lblEastTeam3Losses, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, -1, -1));

        lblEastTeam4Wins.setText("14");
        pnlEastStandings.add(lblEastTeam4Wins, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, -1, -1));

        lblEastTeam4Losses.setText("14");
        pnlEastStandings.add(lblEastTeam4Losses, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, -1, -1));

        lblEastTeam5Wins.setText("12");
        pnlEastStandings.add(lblEastTeam5Wins, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, -1, -1));

        lblEastTeam5Losses.setText("16");
        pnlEastStandings.add(lblEastTeam5Losses, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, -1, -1));

        lblEastTeam6Wins.setText("5");
        pnlEastStandings.add(lblEastTeam6Wins, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, -1, -1));

        lblEastTeam6Losses.setText("23");
        pnlEastStandings.add(lblEastTeam6Losses, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("GB");
        pnlEastStandings.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, -1, -1));

        lblEastTeam1GB.setText("--");
        pnlEastStandings.add(lblEastTeam1GB, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 20, -1));

        lblEastTeam2GB.setText("2");
        pnlEastStandings.add(lblEastTeam2GB, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, 20, -1));

        lblEastTeam3GB.setText("5");
        pnlEastStandings.add(lblEastTeam3GB, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, 20, -1));

        lblEastTeam4GB.setText("6");
        pnlEastStandings.add(lblEastTeam4GB, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, 20, -1));

        lblEastTeam5GB.setText("8");
        pnlEastStandings.add(lblEastTeam5GB, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 20, -1));

        lblEastTeam6GB.setText("15");
        pnlEastStandings.add(lblEastTeam6GB, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, 20, -1));

        jPanel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblEastWinner.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEastWinner.setText("Kentucky");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblEastWinner, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(lblEastWinner)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlEastLayout = new javax.swing.GroupLayout(pnlEast);
        pnlEast.setLayout(pnlEastLayout);
        pnlEastLayout.setHorizontalGroup(
            pnlEastLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEastLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlEastLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlEastLayout.createSequentialGroup()
                        .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addGroup(pnlEastLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel70)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlEastLayout.createSequentialGroup()
                        .addComponent(jLabel71)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(pnlEastStandings, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlEastLayout.setVerticalGroup(
            pnlEastLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEastLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlEastLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel70)
                    .addComponent(jLabel71))
                .addGroup(pnlEastLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlEastLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlEastLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlEastStandings, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel11.add(pnlEast, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 300, 320));

        getContentPane().add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 0, 320, 340));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel93.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel93.setText("South/West Winner");

        lblSouthWestWinner.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSouthWestWinner.setText("BYU");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel93)
                        .addGap(0, 7, Short.MAX_VALUE))
                    .addComponent(lblSouthWestWinner, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel93)
                .addGap(18, 18, 18)
                .addComponent(lblSouthWestWinner)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 490, 140, 120));

        jPanel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel95.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel95.setText("North/East Winner");

        lblNorthEastWinner.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNorthEastWinner.setText("Kentucky");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel95, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblNorthEastWinner, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel95)
                .addGap(18, 18, 18)
                .addComponent(lblNorthEastWinner)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 120, 140, 120));

        jLabel97.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel97.setText("Champion");

        lblChampion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblChampion.setText("BYU");

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel97)
                .addContainerGap(31, Short.MAX_VALUE))
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblChampion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel97)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblChampion)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 300, -1, -1));

        btnPlay.setText("Play");
        btnPlay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnPlayMouseReleased(evt);
            }
        });
        getContentPane().add(btnPlay, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 400, 60, -1));

        btnReset.setText("Reset");
        btnReset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnResetMouseReleased(evt);
            }
        });
        getContentPane().add(btnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 440, -1, -1));

        btnQuit.setText("Quit");
        btnQuit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnQuitMouseReleased(evt);
            }
        });
        getContentPane().add(btnQuit, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 640, 60, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("NCAA");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Women's Soccer");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel4))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, 140, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnQuitMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnQuitMouseReleased
        System.exit(0);
    }//GEN-LAST:event_btnQuitMouseReleased

    private void btnResetMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnResetMouseReleased
        //This blanks out the entire GUI
        lblNorthTeam1.setText("");
        lblNorthTeam2.setText("");
        lblNorthTeam3.setText("");
        lblNorthTeam4.setText("");
        lblNorthTeam5.setText("");
        lblNorthTeam6.setText("");
        
        lblNorthTeam1Wins.setText("");
        lblNorthTeam2Wins.setText("");
        lblNorthTeam3Wins.setText("");
        lblNorthTeam4Wins.setText("");
        lblNorthTeam5Wins.setText("");
        lblNorthTeam6Wins.setText("");
        lblNorthTeam1Losses.setText("");
        lblNorthTeam2Losses.setText("");
        lblNorthTeam3Losses.setText("");
        lblNorthTeam4Losses.setText("");
        lblNorthTeam5Losses.setText("");
        lblNorthTeam6Losses.setText("");
        lblNorthTeam1GB.setText("");
        lblNorthTeam2GB.setText("");
        lblNorthTeam3GB.setText("");
        lblNorthTeam4GB.setText("");
        lblNorthTeam5GB.setText("");
        lblNorthTeam6GB.setText("");
        
        lblSouthTeam1.setText("");
        lblSouthTeam2.setText("");
        lblSouthTeam3.setText("");
        lblSouthTeam4.setText("");
        lblSouthTeam5.setText("");
        lblSouthTeam6.setText("");
        lblSouthTeam1Wins.setText("");
        lblSouthTeam2Wins.setText("");
        lblSouthTeam3Wins.setText("");
        lblSouthTeam4Wins.setText("");
        lblSouthTeam5Wins.setText("");
        lblSouthTeam6Wins.setText("");
        lblSouthTeam1Losses.setText("");
        lblSouthTeam2Losses.setText("");
        lblSouthTeam3Losses.setText("");
        lblSouthTeam4Losses.setText("");
        lblSouthTeam5Losses.setText("");
        lblSouthTeam6Losses.setText("");
        lblSouthTeam1GB.setText("");
        lblSouthTeam2GB.setText("");
        lblSouthTeam3GB.setText("");
        lblSouthTeam4GB.setText("");
        lblSouthTeam5GB.setText("");
        lblSouthTeam6GB.setText("");
        
        lblWestTeam1.setText("");
        lblWestTeam2.setText("");
        lblWestTeam3.setText("");
        lblWestTeam4.setText("");
        lblWestTeam5.setText("");
        lblWestTeam6.setText("");
        lblWestTeam1Wins.setText("");
        lblWestTeam2Wins.setText("");
        lblWestTeam3Wins.setText("");
        lblWestTeam4Wins.setText("");
        lblWestTeam5Wins.setText("");
        lblWestTeam6Wins.setText("");
        lblWestTeam1Losses.setText("");
        lblWestTeam2Losses.setText("");
        lblWestTeam3Losses.setText("");
        lblWestTeam4Losses.setText("");
        lblWestTeam5Losses.setText("");
        lblWestTeam6Losses.setText("");
        lblWestTeam1GB.setText("");
        lblWestTeam2GB.setText("");
        lblWestTeam3GB.setText("");
        lblWestTeam4GB.setText("");
        lblWestTeam5GB.setText("");
        lblWestTeam6GB.setText("");
        
        lblEastTeam1.setText("");
        lblEastTeam2.setText("");
        lblEastTeam3.setText("");
        lblEastTeam4.setText("");
        lblEastTeam5.setText("");
        lblEastTeam6.setText("");
        lblEastTeam1Wins.setText("");
        lblEastTeam2Wins.setText("");
        lblEastTeam3Wins.setText("");
        lblEastTeam4Wins.setText("");
        lblEastTeam5Wins.setText("");
        lblEastTeam6Wins.setText("");
        lblEastTeam1Losses.setText("");
        lblEastTeam2Losses.setText("");
        lblEastTeam3Losses.setText("");
        lblEastTeam4Losses.setText("");
        lblEastTeam5Losses.setText("");
        lblEastTeam6Losses.setText("");
        lblEastTeam1GB.setText("");
        lblEastTeam2GB.setText("");
        lblEastTeam3GB.setText("");
        lblEastTeam4GB.setText("");
        lblEastTeam5GB.setText("");
        lblEastTeam6GB.setText("");
        
        lblNorthWinner.setText("");
        lblSouthWinner.setText("");
        lblWestWinner.setText("");
        lblEastWinner.setText("");
        lblNorthEastWinner.setText("");
        lblSouthWestWinner.setText("");
        lblChampion.setText("");
        
    }//GEN-LAST:event_btnResetMouseReleased

    private void btnPlayMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPlayMouseReleased
      
        //Creates a random number generator
        Random rndGenerator = new Random();
        
        //Score variables to be used for the teams
        int hScore;
        int oScore;
        
        //ArrayList and Tournament for the North Teams
        ArrayList <Soccer> alNorth = new ArrayList<>();
        
        //Stores the teams in arraylist
        for(int i = 0; i < lboxNorth.getModel().getSize(); i++)
        {
            Soccer NorthNames = new Soccer("North", 0 , lboxNorth.getModel().getElementAt(i).toString(), 0, 0);
            alNorth.add(NorthNames);
        }
        
        //This for loop allows the teams to play each other twice and determines the home team.
        for(int i = 0; i < 2; i++)
        {
            //This for loop makes sure to run through every team.
            for(int j = 0; j < alNorth.size(); j++)
            {
                //This for loop makes sure they dont play themselves
                for(int k = j+1; k < alNorth.size(); k++)
                {
                    hScore = 0;
                    oScore = 0;
                    //This determines who should be the home team.
                    if(i % 2 == 0)
                    {
                        do
                       {
                        hScore = rndGenerator.nextInt(101) + 5;
                        oScore = rndGenerator.nextInt(101);
                       }while(hScore == oScore);
                        
                        if (hScore > oScore)
                       {
                           alNorth.get(j).Wins += 1;
                           alNorth.get(k).Losses += 1;
                       }
                       else
                       {
                           alNorth.get(k).Wins += 1;
                           alNorth.get(j).Losses += 1;
                       }
                    }
                    else
                    {
                        do
                       {
                        hScore = rndGenerator.nextInt(101);
                        oScore = rndGenerator.nextInt(101) + 5;
                       }while(hScore == oScore);
                        
                        if (hScore > oScore)
                       {
                           alNorth.get(k).Wins += 1;
                           alNorth.get(j).Losses += 1;
                       }
                       else
                       {
                           alNorth.get(j).Wins += 1;
                           alNorth.get(k).Losses += 1;
                       }
                    }
                }
            }
        }
        
        
        //This for loop loops through every team so that theya ll play the other teams once.
        for(int i = 0; i < alNorth.size(); i++)
        {
            //This for loop is so that they each play the other 18 teams only once.
            for(int j = 0; j < 18; j++)
            {
                hScore = 0;
                oScore = 0;
                do
                {
                   hScore = rndGenerator.nextInt(101);
                   oScore = rndGenerator.nextInt(101);
                }while(hScore == oScore);
                
                if (hScore > oScore)
                {
                    alNorth.get(i).Wins += 1;
                }
                else
                {
                    alNorth.get(i).Losses += 1;
                }
            }
             
        }
       
       //This automatically sorts the teams based on the number of wins.
       Collections.sort(alNorth, new Comparator<Soccer>()
        {
            public int compare(Soccer t1, Soccer t2)
            {
                return Integer.valueOf(t2.Wins).compareTo(t1.Wins);
            }
        });
        
        lblNorthTeam1.setText(alNorth.get(0).getName());
        lblNorthTeam2.setText(alNorth.get(1).getName());
        lblNorthTeam3.setText(alNorth.get(2).getName());
        lblNorthTeam4.setText(alNorth.get(3).getName());
        lblNorthTeam5.setText(alNorth.get(4).getName());
        lblNorthTeam6.setText(alNorth.get(5).getName());
        lblNorthTeam1Wins.setText(String.valueOf(alNorth.get(0).getWins()));
        lblNorthTeam2Wins.setText(String.valueOf(alNorth.get(1).getWins()));
        lblNorthTeam3Wins.setText(String.valueOf(alNorth.get(2).getWins()));
        lblNorthTeam4Wins.setText(String.valueOf(alNorth.get(3).getWins()));
        lblNorthTeam5Wins.setText(String.valueOf(alNorth.get(4).getWins()));
        lblNorthTeam6Wins.setText(String.valueOf(alNorth.get(5).getWins()));
        lblNorthTeam1Losses.setText(String.valueOf(alNorth.get(0).getLosses()));
        lblNorthTeam2Losses.setText(String.valueOf(alNorth.get(1).getLosses()));
        lblNorthTeam3Losses.setText(String.valueOf(alNorth.get(2).getLosses()));
        lblNorthTeam4Losses.setText(String.valueOf(alNorth.get(3).getLosses()));
        lblNorthTeam5Losses.setText(String.valueOf(alNorth.get(4).getLosses()));
        lblNorthTeam6Losses.setText(String.valueOf(alNorth.get(5).getLosses()));
        
        lblNorthTeam1GB.setText(String.valueOf(alNorth.get(0).getLosses() - alNorth.get(0).getLosses()));
        lblNorthTeam2GB.setText(String.valueOf(alNorth.get(1).getLosses() - alNorth.get(0).getLosses()));
        lblNorthTeam3GB.setText(String.valueOf(alNorth.get(2).getLosses() - alNorth.get(0).getLosses()));
        lblNorthTeam4GB.setText(String.valueOf(alNorth.get(3).getLosses() - alNorth.get(0).getLosses()));
        lblNorthTeam5GB.setText(String.valueOf(alNorth.get(4).getLosses() - alNorth.get(0).getLosses()));
        lblNorthTeam6GB.setText(String.valueOf(alNorth.get(5).getLosses() - alNorth.get(0).getLosses()));
        
        lblNorthWinner.setText(alNorth.get(0).getName());
       
       
        //ArrayList and tournament for the East teams
        ArrayList <Soccer> alEast = new ArrayList<>();
        
        for(int i = 0; i < lboxEast.getModel().getSize(); i++)
        {
            Soccer EastNames = new Soccer("East", 0 , lboxEast.getModel().getElementAt(i).toString(), 0, 0);
            alEast.add(EastNames);
        }
        
        for(int i = 0; i < 2; i++)
        {
            for(int j = 0; j < alEast.size(); j++)
            {
                for(int k = j+1; k < alEast.size(); k++)
                {
                    hScore = 0;
                    oScore = 0;
                    if(i % 2 == 0)
                    {
                        do
                       {
                        hScore = rndGenerator.nextInt(101) + 5;
                        oScore = rndGenerator.nextInt(101);
                       }while(hScore == oScore);
                        
                        if (hScore > oScore)
                       {
                           alEast.get(j).Wins += 1;
                           alEast.get(k).Losses += 1;
                       }
                       else
                       {
                           alEast.get(k).Wins += 1;
                           alEast.get(j).Losses += 1;
                       }
                    }
                    else
                    {
                        do
                       {
                        hScore = rndGenerator.nextInt(101);
                        oScore = rndGenerator.nextInt(101) + 5;
                       }while(hScore == oScore);
                        
                        if (hScore > oScore)
                       {
                           alEast.get(k).Wins += 1;
                           alEast.get(j).Losses += 1;
                       }
                       else
                       {
                           alEast.get(j).Wins += 1;
                           alEast.get(k).Losses += 1;
                       }
                    }
                }
            }
        }
        
        
        
       for(int i = 0; i < alEast.size(); i++)
        {
            for(int j = 0; j < 18; j++)
            {
                hScore = 0;
                oScore = 0;
                do
                {
                   hScore = rndGenerator.nextInt(101);
                   oScore = rndGenerator.nextInt(101);
                }while(hScore == oScore);
                
                if (hScore > oScore)
                {
                    alEast.get(i).Wins += 1;
                }
                else
                {
                    alEast.get(i).Losses += 1;
                }
            }
             
        }
       
       
       Collections.sort(alEast, new Comparator<Soccer>()
        {
            public int compare(Soccer t1, Soccer t2)
            {
                return Integer.valueOf(t2.Wins).compareTo(t1.Wins);
            }
        });
        
        lblEastTeam1.setText(alEast.get(0).getName());
        lblEastTeam2.setText(alEast.get(1).getName());
        lblEastTeam3.setText(alEast.get(2).getName());
        lblEastTeam4.setText(alEast.get(3).getName());
        lblEastTeam5.setText(alEast.get(4).getName());
        lblEastTeam6.setText(alEast.get(5).getName());
        lblEastTeam1Wins.setText(String.valueOf(alEast.get(0).getWins()));
        lblEastTeam2Wins.setText(String.valueOf(alEast.get(1).getWins()));
        lblEastTeam3Wins.setText(String.valueOf(alEast.get(2).getWins()));
        lblEastTeam4Wins.setText(String.valueOf(alEast.get(3).getWins()));
        lblEastTeam5Wins.setText(String.valueOf(alEast.get(4).getWins()));
        lblEastTeam6Wins.setText(String.valueOf(alEast.get(5).getWins()));
        lblEastTeam1Losses.setText(String.valueOf(alEast.get(0).getLosses()));
        lblEastTeam2Losses.setText(String.valueOf(alEast.get(1).getLosses()));
        lblEastTeam3Losses.setText(String.valueOf(alEast.get(2).getLosses()));
        lblEastTeam4Losses.setText(String.valueOf(alEast.get(3).getLosses()));
        lblEastTeam5Losses.setText(String.valueOf(alEast.get(4).getLosses()));
        lblEastTeam6Losses.setText(String.valueOf(alEast.get(5).getLosses()));
        lblEastTeam1GB.setText(String.valueOf(alEast.get(0).getLosses() - alEast.get(0).getLosses()));
        lblEastTeam2GB.setText(String.valueOf(alEast.get(1).getLosses() - alEast.get(0).getLosses()));
        lblEastTeam3GB.setText(String.valueOf(alEast.get(2).getLosses() - alEast.get(0).getLosses()));
        lblEastTeam4GB.setText(String.valueOf(alEast.get(3).getLosses() - alEast.get(0).getLosses()));
        lblEastTeam5GB.setText(String.valueOf(alEast.get(4).getLosses() - alEast.get(0).getLosses()));
        lblEastTeam6GB.setText(String.valueOf(alEast.get(5).getLosses() - alEast.get(0).getLosses()));
        
        lblEastWinner.setText(alEast.get(0).getName());
        
        
        //ArrayList and tournament for the South Teams
        ArrayList <Soccer> alSouth = new ArrayList<>();
        
        for(int i = 0; i < lboxSouth.getModel().getSize(); i++)
        {
            Soccer SouthNames = new Soccer("South", 0 , lboxSouth.getModel().getElementAt(i).toString(), 0, 0);
            alSouth.add(SouthNames);
        }
        
        for(int i = 0; i < 2; i++)
        {
            for(int j = 0; j < alSouth.size(); j++)
            {
                for(int k = j+1; k < alSouth.size(); k++)
                {
                    hScore = 0;
                    oScore = 0;
                    if(i % 2 == 0)
                    {
                        do
                       {
                        hScore = rndGenerator.nextInt(101) + 5;
                        oScore = rndGenerator.nextInt(101);
                       }while(hScore == oScore);
                        
                        if (hScore > oScore)
                       {
                           alSouth.get(j).Wins += 1;
                           alSouth.get(k).Losses += 1;
                       }
                       else
                       {
                           alSouth.get(k).Wins += 1;
                           alSouth.get(j).Losses += 1;
                       }
                    }
                    else
                    {
                        do
                       {
                        hScore = rndGenerator.nextInt(101);
                        oScore = rndGenerator.nextInt(101) + 5;
                       }while(hScore == oScore);
                        
                        if (hScore > oScore)
                       {
                           alSouth.get(k).Wins += 1;
                           alSouth.get(j).Losses += 1;
                       }
                       else
                       {
                           alSouth.get(j).Wins += 1;
                           alSouth.get(k).Losses += 1;
                       }
                    }
                }
            }
        }
        
        
        
      for(int i = 0; i < alSouth.size(); i++)
        {
            for(int j = 0; j < 18; j++)
            {
                hScore = 0;
                oScore = 0;
                do
                {
                   hScore = rndGenerator.nextInt(101);
                   oScore = rndGenerator.nextInt(101);
                }while(hScore == oScore);
                
                if (hScore > oScore)
                {
                    alSouth.get(i).Wins += 1;
                }
                else
                {
                    alSouth.get(i).Losses += 1;
                }
            }
             
        }
       
       
       Collections.sort(alSouth, new Comparator<Soccer>()
        {
            public int compare(Soccer t1, Soccer t2)
            {
                return Integer.valueOf(t2.Wins).compareTo(t1.Wins);
            }
        });
        
        lblSouthTeam1.setText(alSouth.get(0).getName());
        lblSouthTeam2.setText(alSouth.get(1).getName());
        lblSouthTeam3.setText(alSouth.get(2).getName());
        lblSouthTeam4.setText(alSouth.get(3).getName());
        lblSouthTeam5.setText(alSouth.get(4).getName());
        lblSouthTeam6.setText(alSouth.get(5).getName());
        lblSouthTeam1Wins.setText(String.valueOf(alSouth.get(0).getWins()));
        lblSouthTeam2Wins.setText(String.valueOf(alSouth.get(1).getWins()));
        lblSouthTeam3Wins.setText(String.valueOf(alSouth.get(2).getWins()));
        lblSouthTeam4Wins.setText(String.valueOf(alSouth.get(3).getWins()));
        lblSouthTeam5Wins.setText(String.valueOf(alSouth.get(4).getWins()));
        lblSouthTeam6Wins.setText(String.valueOf(alSouth.get(5).getWins()));
        lblSouthTeam1Losses.setText(String.valueOf(alSouth.get(0).getLosses()));
        lblSouthTeam2Losses.setText(String.valueOf(alSouth.get(1).getLosses()));
        lblSouthTeam3Losses.setText(String.valueOf(alSouth.get(2).getLosses()));
        lblSouthTeam4Losses.setText(String.valueOf(alSouth.get(3).getLosses()));
        lblSouthTeam5Losses.setText(String.valueOf(alSouth.get(4).getLosses()));
        lblSouthTeam6Losses.setText(String.valueOf(alSouth.get(5).getLosses()));
        lblSouthTeam1GB.setText(String.valueOf(alSouth.get(0).getLosses() - alSouth.get(0).getLosses()));
        lblSouthTeam2GB.setText(String.valueOf(alSouth.get(1).getLosses() - alSouth.get(0).getLosses()));
        lblSouthTeam3GB.setText(String.valueOf(alSouth.get(2).getLosses() - alSouth.get(0).getLosses()));
        lblSouthTeam4GB.setText(String.valueOf(alSouth.get(3).getLosses() - alSouth.get(0).getLosses()));
        lblSouthTeam5GB.setText(String.valueOf(alSouth.get(4).getLosses() - alSouth.get(0).getLosses()));
        lblSouthTeam6GB.setText(String.valueOf(alSouth.get(5).getLosses() - alSouth.get(0).getLosses()));
        
        lblSouthWinner.setText(alSouth.get(0).getName());
        
        
        //ArrayList and tournament for west teams
        ArrayList <Soccer> alWest = new ArrayList<>();
        
        for(int i = 0; i < lboxWest.getModel().getSize(); i++)
        {
            Soccer WestNames = new Soccer("West", 0 , lboxWest.getModel().getElementAt(i).toString(), 0, 0);
            alWest.add(WestNames);
        }
        
        for(int i = 0; i < 2; i++)
        {
            for(int j = 0; j < alWest.size(); j++)
            {
                for(int k = j+1; k < alWest.size(); k++)
                {
                    hScore = 0;
                    oScore = 0;
                    if(i % 2 == 0)
                    {
                        do
                       {
                        hScore = rndGenerator.nextInt(101) + 5;
                        oScore = rndGenerator.nextInt(101);
                       }while(hScore == oScore);
                        
                        if (hScore > oScore)
                       {
                           alWest.get(j).Wins += 1;
                           alWest.get(k).Losses += 1;
                       }
                       else
                       {
                           alWest.get(k).Wins += 1;
                           alWest.get(j).Losses += 1;
                       }
                    }
                    else
                    {
                        do
                       {
                        hScore = rndGenerator.nextInt(101);
                        oScore = rndGenerator.nextInt(101) + 5;
                       }while(hScore == oScore);
                        
                        if (hScore > oScore)
                       {
                           alWest.get(k).Wins += 1;
                           alWest.get(j).Losses += 1;
                       }
                       else
                       {
                           alWest.get(j).Wins += 1;
                           alWest.get(k).Losses += 1;
                       }
                    }
                }
            }
        }
        
        
        
       for(int i = 0; i < alWest.size(); i++)
        {
            for(int j = 0; j < 18; j++)
            {
                hScore = 0;
                oScore = 0;
                do
                {
                   hScore = rndGenerator.nextInt(101);
                   oScore = rndGenerator.nextInt(101);
                }while(hScore == oScore);
                
                if (hScore > oScore)
                {
                    alWest.get(i).Wins += 1;
                }
                else
                {
                    alWest.get(i).Losses += 1;
                }
            }
             
        }
       
       
       Collections.sort(alWest, new Comparator<Soccer>()
        {
            public int compare(Soccer t1, Soccer t2)
            {
                return Integer.valueOf(t2.Wins).compareTo(t1.Wins);
            }
        });
        
        lblWestTeam1.setText(alWest.get(0).getName());
        lblWestTeam2.setText(alWest.get(1).getName());
        lblWestTeam3.setText(alWest.get(2).getName());
        lblWestTeam4.setText(alWest.get(3).getName());
        lblWestTeam5.setText(alWest.get(4).getName());
        lblWestTeam6.setText(alWest.get(5).getName());
        lblWestTeam1Wins.setText(String.valueOf(alWest.get(0).getWins()));
        lblWestTeam2Wins.setText(String.valueOf(alWest.get(1).getWins()));
        lblWestTeam3Wins.setText(String.valueOf(alWest.get(2).getWins()));
        lblWestTeam4Wins.setText(String.valueOf(alWest.get(3).getWins()));
        lblWestTeam5Wins.setText(String.valueOf(alWest.get(4).getWins()));
        lblWestTeam6Wins.setText(String.valueOf(alWest.get(5).getWins()));
        lblWestTeam1Losses.setText(String.valueOf(alWest.get(0).getLosses()));
        lblWestTeam2Losses.setText(String.valueOf(alWest.get(1).getLosses()));
        lblWestTeam3Losses.setText(String.valueOf(alWest.get(2).getLosses()));
        lblWestTeam4Losses.setText(String.valueOf(alWest.get(3).getLosses()));
        lblWestTeam5Losses.setText(String.valueOf(alWest.get(4).getLosses()));
        lblWestTeam6Losses.setText(String.valueOf(alWest.get(5).getLosses()));
        lblWestTeam1GB.setText(String.valueOf(alWest.get(0).getLosses() - alWest.get(0).getLosses()));
        lblWestTeam2GB.setText(String.valueOf(alWest.get(1).getLosses() - alWest.get(0).getLosses()));
        lblWestTeam3GB.setText(String.valueOf(alWest.get(2).getLosses() - alWest.get(0).getLosses()));
        lblWestTeam4GB.setText(String.valueOf(alWest.get(3).getLosses() - alWest.get(0).getLosses()));
        lblWestTeam5GB.setText(String.valueOf(alWest.get(4).getLosses() - alWest.get(0).getLosses()));
        lblWestTeam6GB.setText(String.valueOf(alWest.get(5).getLosses() - alWest.get(0).getLosses()));
        
        lblWestWinner.setText(alWest.get(0).getName());
        
        
        
    //North vs East game
     int NorthScore = 0;
     int EastScore = 0;
     do
     {
         NorthScore = rndGenerator.nextInt(101);
         EastScore = rndGenerator.nextInt(101);
     }while(NorthScore == EastScore);
     
     if (NorthScore > EastScore)
     {
         lblNorthEastWinner.setText(lblNorthWinner.getText());
     }
     else
     {
         lblNorthEastWinner.setText(lblEastWinner.getText());
     }
        
     //South vs West game
     int SouthScore = 0;
     int WestScore = 0;
     do
     {
         SouthScore = rndGenerator.nextInt(101);
         WestScore = rndGenerator.nextInt(101);
     }while(SouthScore == WestScore);
     
     if (SouthScore > WestScore)
     {
         lblSouthWestWinner.setText(lblSouthWinner.getText());
     }
     else
     {
         lblSouthWestWinner.setText(lblWestWinner.getText());
     }
        
     
     //Championship Game
     int SouthWestScore = 0;
     int NorthEastScore = 0;
     do
     {
         SouthWestScore = rndGenerator.nextInt(101);
         NorthEastScore = rndGenerator.nextInt(101);
     }while(SouthWestScore == NorthEastScore);
     
     if (SouthWestScore > NorthEastScore)
     {
         lblChampion.setText(lblSouthWestWinner.getText());
     }
     else
     {
         lblChampion.setText(lblNorthEastWinner.getText());
     }
        
       
     
        
        
    }//GEN-LAST:event_btnPlayMouseReleased

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
            for (javax.swing.UIManager.LookAndFeelInfo info : getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            //getLogger(class.getName()).log(SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        invokeLater(new Runnable() {
            public void run() {
                new frmMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPlay;
    private javax.swing.JButton btnQuit;
    private javax.swing.JButton btnReset;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lblChampion;
    private javax.swing.JLabel lblEastTeam1;
    private javax.swing.JLabel lblEastTeam1GB;
    private javax.swing.JLabel lblEastTeam1Losses;
    private javax.swing.JLabel lblEastTeam1Wins;
    private javax.swing.JLabel lblEastTeam2;
    private javax.swing.JLabel lblEastTeam2GB;
    private javax.swing.JLabel lblEastTeam2Losses;
    private javax.swing.JLabel lblEastTeam2Wins;
    private javax.swing.JLabel lblEastTeam3;
    private javax.swing.JLabel lblEastTeam3GB;
    private javax.swing.JLabel lblEastTeam3Losses;
    private javax.swing.JLabel lblEastTeam3Wins;
    private javax.swing.JLabel lblEastTeam4;
    private javax.swing.JLabel lblEastTeam4GB;
    private javax.swing.JLabel lblEastTeam4Losses;
    private javax.swing.JLabel lblEastTeam4Wins;
    private javax.swing.JLabel lblEastTeam5;
    private javax.swing.JLabel lblEastTeam5GB;
    private javax.swing.JLabel lblEastTeam5Losses;
    private javax.swing.JLabel lblEastTeam5Wins;
    private javax.swing.JLabel lblEastTeam6;
    private javax.swing.JLabel lblEastTeam6GB;
    private javax.swing.JLabel lblEastTeam6Losses;
    private javax.swing.JLabel lblEastTeam6Wins;
    private javax.swing.JLabel lblEastWinner;
    private javax.swing.JLabel lblNorthEastWinner;
    private javax.swing.JLabel lblNorthTeam1;
    private javax.swing.JLabel lblNorthTeam1GB;
    private javax.swing.JLabel lblNorthTeam1Losses;
    private javax.swing.JLabel lblNorthTeam1Wins;
    private javax.swing.JLabel lblNorthTeam2;
    private javax.swing.JLabel lblNorthTeam2GB;
    private javax.swing.JLabel lblNorthTeam2Losses;
    private javax.swing.JLabel lblNorthTeam2Wins;
    private javax.swing.JLabel lblNorthTeam3;
    private javax.swing.JLabel lblNorthTeam3GB;
    private javax.swing.JLabel lblNorthTeam3Losses;
    private javax.swing.JLabel lblNorthTeam3Wins;
    private javax.swing.JLabel lblNorthTeam4;
    private javax.swing.JLabel lblNorthTeam4GB;
    private javax.swing.JLabel lblNorthTeam4Losses;
    private javax.swing.JLabel lblNorthTeam4Wins;
    private javax.swing.JLabel lblNorthTeam5;
    private javax.swing.JLabel lblNorthTeam5GB;
    private javax.swing.JLabel lblNorthTeam5Losses;
    private javax.swing.JLabel lblNorthTeam5Wins;
    private javax.swing.JLabel lblNorthTeam6;
    private javax.swing.JLabel lblNorthTeam6GB;
    private javax.swing.JLabel lblNorthTeam6Losses;
    private javax.swing.JLabel lblNorthTeam6Wins;
    private javax.swing.JLabel lblNorthWinner;
    private javax.swing.JLabel lblSouthTeam1;
    private javax.swing.JLabel lblSouthTeam1GB;
    private javax.swing.JLabel lblSouthTeam1Losses;
    private javax.swing.JLabel lblSouthTeam1Wins;
    private javax.swing.JLabel lblSouthTeam2;
    private javax.swing.JLabel lblSouthTeam2GB;
    private javax.swing.JLabel lblSouthTeam2Losses;
    private javax.swing.JLabel lblSouthTeam2Wins;
    private javax.swing.JLabel lblSouthTeam3;
    private javax.swing.JLabel lblSouthTeam3GB;
    private javax.swing.JLabel lblSouthTeam3Losses;
    private javax.swing.JLabel lblSouthTeam3Wins;
    private javax.swing.JLabel lblSouthTeam4;
    private javax.swing.JLabel lblSouthTeam4GB;
    private javax.swing.JLabel lblSouthTeam4Losses;
    private javax.swing.JLabel lblSouthTeam4Wins;
    private javax.swing.JLabel lblSouthTeam5;
    private javax.swing.JLabel lblSouthTeam5GB;
    private javax.swing.JLabel lblSouthTeam5Losses;
    private javax.swing.JLabel lblSouthTeam5Wins;
    private javax.swing.JLabel lblSouthTeam6;
    private javax.swing.JLabel lblSouthTeam6GB;
    private javax.swing.JLabel lblSouthTeam6Losses;
    private javax.swing.JLabel lblSouthTeam6Wins;
    private javax.swing.JLabel lblSouthWestWinner;
    private javax.swing.JLabel lblSouthWinner;
    private javax.swing.JLabel lblWestTeam1;
    private javax.swing.JLabel lblWestTeam1GB;
    private javax.swing.JLabel lblWestTeam1Losses;
    private javax.swing.JLabel lblWestTeam1Wins;
    private javax.swing.JLabel lblWestTeam2;
    private javax.swing.JLabel lblWestTeam2GB;
    private javax.swing.JLabel lblWestTeam2Losses;
    private javax.swing.JLabel lblWestTeam2Wins;
    private javax.swing.JLabel lblWestTeam3;
    private javax.swing.JLabel lblWestTeam3GB;
    private javax.swing.JLabel lblWestTeam3Losses;
    private javax.swing.JLabel lblWestTeam3Wins;
    private javax.swing.JLabel lblWestTeam4;
    private javax.swing.JLabel lblWestTeam4GB;
    private javax.swing.JLabel lblWestTeam4Losses;
    private javax.swing.JLabel lblWestTeam4Wins;
    private javax.swing.JLabel lblWestTeam5;
    private javax.swing.JLabel lblWestTeam5GB;
    private javax.swing.JLabel lblWestTeam5Losses;
    private javax.swing.JLabel lblWestTeam5Wins;
    private javax.swing.JLabel lblWestTeam6;
    private javax.swing.JLabel lblWestTeam6GB;
    private javax.swing.JLabel lblWestTeam6Losses;
    private javax.swing.JLabel lblWestTeam6Wins;
    private javax.swing.JLabel lblWestWinner;
    private javax.swing.JList lboxEast;
    private javax.swing.JList lboxNorth;
    private javax.swing.JList lboxSouth;
    private javax.swing.JList lboxWest;
    private javax.swing.JPanel pnlEast;
    private javax.swing.JPanel pnlEastStandings;
    private javax.swing.JPanel pnlNorth;
    private javax.swing.JPanel pnlNorthStandings;
    private javax.swing.JPanel pnlSouth;
    private javax.swing.JPanel pnlSouthStandings;
    private javax.swing.JPanel pnlWest;
    private javax.swing.JPanel pnlWestStandings;
    // End of variables declaration//GEN-END:variables
}
