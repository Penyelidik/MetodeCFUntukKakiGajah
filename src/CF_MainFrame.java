/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PcKu-Asus
 */
import java.lang.Math;
import java.text.DecimalFormat;
public class CF_MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form CF_MainFrame
     */
    
    public CF_MainFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        demam = new javax.swing.ButtonGroup();
        bengkak = new javax.swing.ButtonGroup();
        panas = new javax.swing.ButtonGroup();
        abses = new javax.swing.ButtonGroup();
        tungkai = new javax.swing.ButtonGroup();
        lengan = new javax.swing.ButtonGroup();
        dada = new javax.swing.ButtonGroup();
        zakar = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TA = new javax.swing.JTextArea();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        CF1_1 = new javax.swing.JRadioButton();
        CF1_2 = new javax.swing.JRadioButton();
        CF1_3 = new javax.swing.JRadioButton();
        CF1_4 = new javax.swing.JRadioButton();
        CF1_5 = new javax.swing.JRadioButton();
        CF2_1 = new javax.swing.JRadioButton();
        CF2_2 = new javax.swing.JRadioButton();
        CF2_3 = new javax.swing.JRadioButton();
        CF2_4 = new javax.swing.JRadioButton();
        CF2_5 = new javax.swing.JRadioButton();
        CF3_5 = new javax.swing.JRadioButton();
        CF3_4 = new javax.swing.JRadioButton();
        CF3_3 = new javax.swing.JRadioButton();
        CF3_2 = new javax.swing.JRadioButton();
        CF3_1 = new javax.swing.JRadioButton();
        CF4_5 = new javax.swing.JRadioButton();
        CF4_4 = new javax.swing.JRadioButton();
        CF4_3 = new javax.swing.JRadioButton();
        CF4_2 = new javax.swing.JRadioButton();
        CF4_1 = new javax.swing.JRadioButton();
        CF5_5 = new javax.swing.JRadioButton();
        CF5_4 = new javax.swing.JRadioButton();
        CF5_3 = new javax.swing.JRadioButton();
        CF5_2 = new javax.swing.JRadioButton();
        CF5_1 = new javax.swing.JRadioButton();
        CF6_5 = new javax.swing.JRadioButton();
        CF6_4 = new javax.swing.JRadioButton();
        CF6_3 = new javax.swing.JRadioButton();
        CF6_2 = new javax.swing.JRadioButton();
        CF6_1 = new javax.swing.JRadioButton();
        CF7_5 = new javax.swing.JRadioButton();
        CF7_4 = new javax.swing.JRadioButton();
        CF7_3 = new javax.swing.JRadioButton();
        CF7_2 = new javax.swing.JRadioButton();
        CF7_1 = new javax.swing.JRadioButton();
        CF8_5 = new javax.swing.JRadioButton();
        CF8_4 = new javax.swing.JRadioButton();
        CF8_3 = new javax.swing.JRadioButton();
        CF8_2 = new javax.swing.JRadioButton();
        CF8_1 = new javax.swing.JRadioButton();
        CF2_6 = new javax.swing.JRadioButton();
        CF3_6 = new javax.swing.JRadioButton();
        CF4_6 = new javax.swing.JRadioButton();
        CF5_6 = new javax.swing.JRadioButton();
        CF6_6 = new javax.swing.JRadioButton();
        CF7_6 = new javax.swing.JRadioButton();
        CF8_6 = new javax.swing.JRadioButton();
        CF1_6 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Certainty Factor");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Detektor penyakit Kaki Gajah");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(72, 72, 72))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("Demam berulang 3-5 kali :");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setText("Ciri-ciri :");

        jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6.setText("Pembengkakan kelenjar getah bening:");

        jLabel7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel7.setText("Filarial Abses:");

        jLabel8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel8.setText("Pembesaran Tungkai:");

        jLabel9.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel9.setText("Pembesaran Lengan:");

        jLabel10.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel10.setText("Pembesaran Buah Dada:");

        jLabel11.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel11.setText("Pembesaran Buah Zakar:");

        jButton1.setBackground(new java.awt.Color(51, 255, 51));
        jButton1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton1.setText("Kalkulasi");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        TA.setEditable(false);
        TA.setColumns(20);
        TA.setRows(5);
        TA.setText("\n");
        jScrollPane1.setViewportView(TA);

        jLabel12.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel12.setText("Hasil Diagnosa");

        jLabel13.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel13.setText("Panas dan sakit radang saluran kelenjar getah bening");

        demam.add(CF1_1);
        CF1_1.setText("Tidak");

        demam.add(CF1_2);
        CF1_2.setText("Jarang");

        demam.add(CF1_3);
        CF1_3.setText("Kadang");

        demam.add(CF1_4);
        CF1_4.setText("Cukup Sering");

        demam.add(CF1_5);
        CF1_5.setText("Sering");

        bengkak.add(CF2_1);
        CF2_1.setText("Tidak");

        bengkak.add(CF2_2);
        CF2_2.setText("Jarang");
        CF2_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CF2_2ActionPerformed(evt);
            }
        });

        bengkak.add(CF2_3);
        CF2_3.setText("Kadang");

        bengkak.add(CF2_4);
        CF2_4.setText("Cukup Sering");

        bengkak.add(CF2_5);
        CF2_5.setText("Sering");

        panas.add(CF3_5);
        CF3_5.setText("Sering");

        panas.add(CF3_4);
        CF3_4.setText("Cukup Sering");

        panas.add(CF3_3);
        CF3_3.setText("Kadang");

        panas.add(CF3_2);
        CF3_2.setText("Jarang");

        panas.add(CF3_1);
        CF3_1.setText("Tidak");

        abses.add(CF4_5);
        CF4_5.setText("Sering");

        abses.add(CF4_4);
        CF4_4.setText("Cukup Sering");

        abses.add(CF4_3);
        CF4_3.setText("Kadang");

        abses.add(CF4_2);
        CF4_2.setText("Jarang");

        abses.add(CF4_1);
        CF4_1.setText("Tidak");

        tungkai.add(CF5_5);
        CF5_5.setText("Sering");

        tungkai.add(CF5_4);
        CF5_4.setText("Cukup Sering");

        tungkai.add(CF5_3);
        CF5_3.setText("Kadang");

        tungkai.add(CF5_2);
        CF5_2.setText("Jarang");

        tungkai.add(CF5_1);
        CF5_1.setText("Tidak");

        lengan.add(CF6_5);
        CF6_5.setText("Sering");

        lengan.add(CF6_4);
        CF6_4.setText("Cukup Sering");

        lengan.add(CF6_3);
        CF6_3.setText("Kadang");

        lengan.add(CF6_2);
        CF6_2.setText("Jarang");

        lengan.add(CF6_1);
        CF6_1.setText("Tidak");

        dada.add(CF7_5);
        CF7_5.setText("Sering");

        dada.add(CF7_4);
        CF7_4.setText("Cukup Sering");

        dada.add(CF7_3);
        CF7_3.setText("Kadang");

        dada.add(CF7_2);
        CF7_2.setText("Jarang");

        dada.add(CF7_1);
        CF7_1.setText("Tidak");

        zakar.add(CF8_5);
        CF8_5.setText("Sering");

        zakar.add(CF8_4);
        CF8_4.setText("Cukup Sering");

        zakar.add(CF8_3);
        CF8_3.setText("Kadang");

        zakar.add(CF8_2);
        CF8_2.setText("Jarang");

        zakar.add(CF8_1);
        CF8_1.setText("Tidak");

        bengkak.add(CF2_6);
        CF2_6.setText("Selalu");

        panas.add(CF3_6);
        CF3_6.setText("Selalu");

        abses.add(CF4_6);
        CF4_6.setText("Selalu");

        tungkai.add(CF5_6);
        CF5_6.setText("Selalu");

        lengan.add(CF6_6);
        CF6_6.setText("Selalu");

        dada.add(CF7_6);
        CF7_6.setText("Selalu");

        zakar.add(CF8_6);
        CF8_6.setText("Selalu");

        demam.add(CF1_6);
        CF1_6.setText("Selalu");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4)
                    .addComponent(jLabel12)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel6)
                                .addComponent(jLabel7)
                                .addComponent(jLabel8)
                                .addComponent(jLabel9)
                                .addComponent(jLabel10)
                                .addComponent(jLabel11)
                                .addComponent(jLabel13))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(CF1_1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(CF1_2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(CF1_3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(CF1_4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(CF1_5))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(CF2_1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(CF2_2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(CF2_3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(CF2_4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(CF2_5))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(CF3_1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(CF3_2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(CF3_3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(CF3_4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(CF3_5))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(CF5_1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(CF5_2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(CF5_3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(CF5_4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(CF5_5))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(CF4_1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(CF4_2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(CF4_3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(CF4_4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(CF4_5)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(CF6_1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(CF6_2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(CF6_3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(CF6_4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(CF6_5))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(CF8_1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(CF8_2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(CF8_3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(CF8_4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(CF8_5))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(CF7_1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(CF7_2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(CF7_3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(CF7_4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(CF7_5)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CF1_6)
                                    .addComponent(CF2_6)
                                    .addComponent(CF3_6)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(CF5_6)
                                        .addComponent(CF4_6))
                                    .addComponent(CF6_6, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addComponent(CF8_6, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(CF7_6, javax.swing.GroupLayout.Alignment.TRAILING))))
                    .addComponent(jScrollPane1))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(CF1_1)
                            .addComponent(CF1_2)
                            .addComponent(CF1_3)
                            .addComponent(CF1_4)
                            .addComponent(CF1_5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(CF2_1)
                            .addComponent(CF2_2)
                            .addComponent(CF2_3)
                            .addComponent(CF2_4)
                            .addComponent(CF2_5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(CF3_1)
                            .addComponent(CF3_2)
                            .addComponent(CF3_3)
                            .addComponent(CF3_4)
                            .addComponent(CF3_5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(CF4_1)
                            .addComponent(CF4_2)
                            .addComponent(CF4_3)
                            .addComponent(CF4_4)
                            .addComponent(CF4_5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(CF5_1)
                            .addComponent(CF5_2)
                            .addComponent(CF5_3)
                            .addComponent(CF5_4)
                            .addComponent(CF5_5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(CF6_1)
                            .addComponent(CF6_2)
                            .addComponent(CF6_3)
                            .addComponent(CF6_4)
                            .addComponent(CF6_5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(CF7_1)
                            .addComponent(CF7_2)
                            .addComponent(CF7_3)
                            .addComponent(CF7_4)
                            .addComponent(CF7_5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(CF8_1)
                            .addComponent(CF8_2)
                            .addComponent(CF8_3)
                            .addComponent(CF8_4)
                            .addComponent(CF8_5)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(CF1_6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CF2_6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CF3_6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CF4_6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CF5_6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CF6_6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CF7_6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CF8_6)))
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        DecimalFormat twoDForm = new DecimalFormat("#.##");
        Double[] CFE = new Double[8];
        if(CF1_1.isSelected())
        {
            CFE[0] = 0.0;
        }
        if(CF1_2.isSelected())
        {
            CFE[0] = 0.2;
        }
        if(CF1_3.isSelected())
        {
            CFE[0] = 0.4;
        }
        if(CF1_4.isSelected())
        {
            CFE[0] = 0.6;
        }
        if(CF1_5.isSelected())
        {
            CFE[0] = 0.8;
        }
        if(CF1_6.isSelected())
        {
            CFE[0] = 1.0;
        }
        
        //================================================
        if(CF2_1.isSelected())
        {
            CFE[1] = 0.0;
        }
        if(CF2_2.isSelected())
        {
            CFE[1] = 0.2;
        }
        if(CF2_3.isSelected())
        {
            CFE[1] = 0.4;
        }
        if(CF2_4.isSelected())
        {
            CFE[1] = 0.6;
        }
        if(CF2_5.isSelected())
        {
            CFE[1] = 0.8;
        }
        if(CF2_6.isSelected())
        {
            CFE[1] = 1.0;
        }
        //===============================
        if(CF3_1.isSelected())
        {
            CFE[2] = 0.0;
        }
        if(CF3_2.isSelected())
        {
            CFE[2] = 0.2;
        }
        if(CF3_3.isSelected())
        {
            CFE[2] = 0.4;
        }
        if(CF3_4.isSelected())
        {
            CFE[2] = 0.6;
        }
        if(CF3_5.isSelected())
        {
            CFE[2] = 0.8;
        }
        if(CF3_6.isSelected())
        {
            CFE[2] = 1.0;
        }
        //===============================
        if(CF4_1.isSelected())
        {
            CFE[3] = 0.0;
        }
        if(CF4_2.isSelected())
        {
            CFE[3] = 0.2;
        }
        if(CF4_3.isSelected())
        {
            CFE[3] = 0.4;
        }
        if(CF4_4.isSelected())
        {
            CFE[3] = 0.6;
        }
        if(CF4_5.isSelected())
        {
            CFE[3] = 0.8;
        }
        if(CF4_6.isSelected())
        {
            CFE[3] = 1.0;
        }
        //===============================
        
        if(CF5_1.isSelected())
        {
            CFE[4] = 0.0;
        }
        if(CF5_2.isSelected())
        {
            CFE[4] = 0.2;
        }
        if(CF5_3.isSelected())
        {
            CFE[4] = 0.4;
        }
        if(CF5_4.isSelected())
        {
            CFE[4] = 0.6;
        }
        if(CF5_5.isSelected())
        {
            CFE[4] = 0.8;
        }
        if(CF5_6.isSelected())
        {
            CFE[4] = 1.0;
        }
        //===============================
        
        if(CF6_1.isSelected())
        {
            CFE[5] = 0.0;
        }
        if(CF6_2.isSelected())
        {
            CFE[5] = 0.2;
        }
        if(CF6_3.isSelected())
        {
            CFE[5] = 0.4;
        }
        if(CF6_4.isSelected())
        {
            CFE[5] = 0.6;
        }
        if(CF6_5.isSelected())
        {
            CFE[5] = 0.8;
        }
        if(CF6_6.isSelected())
        {
            CFE[5] = 1.0;
        }
        //===============================
        
        if(CF7_1.isSelected())
        {
            CFE[6] = 0.0;
        }
        if(CF7_2.isSelected())
        {
            CFE[6] = 0.2;
        }
        if(CF7_3.isSelected())
        {
            CFE[6] = 0.4;
        }
        if(CF7_4.isSelected())
        {
            CFE[6] = 0.6;
        }
        if(CF7_5.isSelected())
        {
            CFE[6] = 0.8;
        }
        if(CF7_6.isSelected())
        {
            CFE[6] = 1.0;
        }
        //===============================
        
        if(CF8_1.isSelected())
        {
            CFE[7] = 0.0;
        }
        if(CF8_2.isSelected())
        {
            CFE[7] = 0.2;
        }
        if(CF8_3.isSelected())
        {
            CFE[7] = 0.4;
        }
        if(CF8_4.isSelected())
        {
            CFE[7] = 0.6;
        }
        if(CF8_5.isSelected())
        {
            CFE[7] = 0.8;
        }
        if(CF8_6.isSelected())
        {
            CFE[7] = 1.0;
        }
        //===============================
       // CFE[0] = Double.parseDouble(CFE1.getText());//Mengambil nilai dari textfield,convert ke array of double
        //CFE[1] = Double.parseDouble(CFE2.getText());
        //CFE[2] = Double.parseDouble(CFE3.getText());
        //CFE[3] = Double.parseDouble(CFE4.getText());
        //CFE[4] = Double.parseDouble(CFE5.getText());
        //CFE[5] = Double.parseDouble(CFE6.getText());
        //CFE[6] = Double.parseDouble(CFE7.getText());//akhir dari pengambilan nilai
        //CFE[7] = Double.parseDouble(CFE8.getText());//akhir dari pengambilan nilai
        Double[] CFH = new Double[] { 0.4, 0.6 , 0.6 , 0.6 , 0.8 ,0.8 ,0.8 ,0.8 };//NILAI DARI PAKAR
       // TA.setText(Double.toString(CFE[1]));
        Double[] CFtot = new Double[8];
        for(int i = 0; i<8;i++)
        {
             CFtot[i] = Double.valueOf(twoDForm.format(CFE[i]*CFH[i]));          
             
        }
        
        
        Double[] Ctot = new Double[8];
        Ctot[0] = CFtot[0];
        for(int i =0;i<7;i++)
        {
            if(Ctot[i] >= 0 && CFtot[i+1]>=0){
             Ctot[i+1] = Double.valueOf(twoDForm.format(Ctot[i]+(CFtot[i+1]*(1-Ctot[i]))));
            }
            else if(Ctot[i]<0 && CFtot[i+1] <0 )
            {
                Ctot[i+1] = Double.valueOf(twoDForm.format(Ctot[i]+(CFtot[i+1]*(1+Ctot[i]))));
            }
            else 
            {
                Ctot[i+1] = Double.valueOf(twoDForm.format((Ctot[i]+CFtot[i+1])/ (1-Math.min(Math.abs(Ctot[i]),Math.abs(CFtot[i+1])))));
            }
        }
      TA.setText(Double.toString(Ctot[7]*100));
    }//GEN-LAST:event_jButton1ActionPerformed

    private void CF2_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CF2_2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CF2_2ActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CF_MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CF_MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CF_MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CF_MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CF_MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton CF1_1;
    private javax.swing.JRadioButton CF1_2;
    private javax.swing.JRadioButton CF1_3;
    private javax.swing.JRadioButton CF1_4;
    private javax.swing.JRadioButton CF1_5;
    private javax.swing.JRadioButton CF1_6;
    private javax.swing.JRadioButton CF2_1;
    private javax.swing.JRadioButton CF2_2;
    private javax.swing.JRadioButton CF2_3;
    private javax.swing.JRadioButton CF2_4;
    private javax.swing.JRadioButton CF2_5;
    private javax.swing.JRadioButton CF2_6;
    private javax.swing.JRadioButton CF3_1;
    private javax.swing.JRadioButton CF3_2;
    private javax.swing.JRadioButton CF3_3;
    private javax.swing.JRadioButton CF3_4;
    private javax.swing.JRadioButton CF3_5;
    private javax.swing.JRadioButton CF3_6;
    private javax.swing.JRadioButton CF4_1;
    private javax.swing.JRadioButton CF4_2;
    private javax.swing.JRadioButton CF4_3;
    private javax.swing.JRadioButton CF4_4;
    private javax.swing.JRadioButton CF4_5;
    private javax.swing.JRadioButton CF4_6;
    private javax.swing.JRadioButton CF5_1;
    private javax.swing.JRadioButton CF5_2;
    private javax.swing.JRadioButton CF5_3;
    private javax.swing.JRadioButton CF5_4;
    private javax.swing.JRadioButton CF5_5;
    private javax.swing.JRadioButton CF5_6;
    private javax.swing.JRadioButton CF6_1;
    private javax.swing.JRadioButton CF6_2;
    private javax.swing.JRadioButton CF6_3;
    private javax.swing.JRadioButton CF6_4;
    private javax.swing.JRadioButton CF6_5;
    private javax.swing.JRadioButton CF6_6;
    private javax.swing.JRadioButton CF7_1;
    private javax.swing.JRadioButton CF7_2;
    private javax.swing.JRadioButton CF7_3;
    private javax.swing.JRadioButton CF7_4;
    private javax.swing.JRadioButton CF7_5;
    private javax.swing.JRadioButton CF7_6;
    private javax.swing.JRadioButton CF8_1;
    private javax.swing.JRadioButton CF8_2;
    private javax.swing.JRadioButton CF8_3;
    private javax.swing.JRadioButton CF8_4;
    private javax.swing.JRadioButton CF8_5;
    private javax.swing.JRadioButton CF8_6;
    private javax.swing.JTextArea TA;
    private javax.swing.ButtonGroup abses;
    private javax.swing.ButtonGroup bengkak;
    private javax.swing.ButtonGroup dada;
    private javax.swing.ButtonGroup demam;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.ButtonGroup lengan;
    private javax.swing.ButtonGroup panas;
    private javax.swing.ButtonGroup tungkai;
    private javax.swing.ButtonGroup zakar;
    // End of variables declaration//GEN-END:variables
}
