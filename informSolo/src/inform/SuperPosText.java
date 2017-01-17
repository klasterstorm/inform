/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inform;

import static inform.MainFrame.modelFrame13;
import static inform.SuperPosForm.superPosFormArr;

/**
 *
 * @author KLASTER
 */
public class SuperPosText extends javax.swing.JFrame {

    /**
     * Creates new form SuperPosText
     */
    public SuperPosText() {
        initComponents();
    }
    
    public static double superPosArrSUM[] = new double [20];

    public static void disableCheck(){
        JTO.setVisible(true);
        JT0.setVisible(false);
        JT1.setVisible(false);
        JT2.setVisible(false);
        JT3.setVisible(false);
        JT4.setVisible(false);
        JT5.setVisible(false);
        JT6.setVisible(false);
        JT7.setVisible(false);
        JT8.setVisible(false);
        JT9.setVisible(false);
        JT10.setVisible(false);
        JT11.setVisible(false);
        JT12.setVisible(false);
        JT13.setVisible(false);
        JT14.setVisible(false);
        JT15.setVisible(false);
        JT16.setVisible(false);
        JT17.setVisible(false);
        JT18.setVisible(false);
        
        AO.setVisible(true);
        A0.setVisible(false);
        A1.setVisible(false);
        A2.setVisible(false);
        A3.setVisible(false);
        A4.setVisible(false);
        A5.setVisible(false);
        A6.setVisible(false);
        A7.setVisible(false);
        A8.setVisible(false);
        A9.setVisible(false);
        A10.setVisible(false);
        A11.setVisible(false);
        A12.setVisible(false);
        A13.setVisible(false);
        A14.setVisible(false);
        A15.setVisible(false);
        A16.setVisible(false);
        A17.setVisible(false);
        A18.setVisible(false);
        
    }
    
    public static void initCheckSuperPos(int count){
        switch(count){ 
            case 0: 
                JT0.setVisible(true);
                A0.setVisible(true);
                break; 
            case 1: 
                JT1.setVisible(true);
                A1.setVisible(true);
                break; 
            case 2: 
                JT2.setVisible(true);
                A2.setVisible(true);
                break; 
            case 3: 
                JT3.setVisible(true);
                A3.setVisible(true);
                break; 
            case 4: 
                JT4.setVisible(true);
                A4.setVisible(true);
                break; 
            case 5: 
                JT5.setVisible(true);
                A5.setVisible(true);
                break; 
            case 6: 
                JT6.setVisible(true);
                A6.setVisible(true);
                break; 
            case 7: 
                JT7.setVisible(true);
                A7.setVisible(true);
                break; 
            case 8:
                JT8.setVisible(true);
                A8.setVisible(true);
                break; 
            case 9: 
                JT9.setVisible(true);
                A9.setVisible(true);
                break; 
            case 10: 
                JT10.setVisible(true);
                A10.setVisible(true);
                break; 
            case 11:
                JT11.setVisible(true);
                A11.setVisible(true);
                break; 
            case 12:
                JT12.setVisible(true);
                A12.setVisible(true);
                break; 
            case 13: 
                JT13.setVisible(true);
                A13.setVisible(true);
                break; 
            case 14: 
                JT14.setVisible(true);
                A14.setVisible(true);
                break; 
            case 15:
                JT15.setVisible(true);
                A15.setVisible(true);
                break; 
            case 16: 
                JT16.setVisible(true);
                A16.setVisible(true);
                break; 
            case 17:
                JT17.setVisible(true);
                A17.setVisible(true);
                break; 
            case 18:
                JT18.setVisible(true);
                A18.setVisible(true);
                break; 
            case 19:
                JTO.setVisible(true);
                AO.setVisible(true);
                break; 
        }
    } 
    
    
    public void finalSSUMCheck(){
        superPosArrSUM[0] = Double.valueOf(JT0.getText());
        superPosArrSUM[1] = Double.valueOf(JT1.getText());
        superPosArrSUM[2] = Double.valueOf(JT2.getText());
        superPosArrSUM[3] = Double.valueOf(JT3.getText());
        superPosArrSUM[4] = Double.valueOf(JT4.getText());
        
        superPosArrSUM[5] = Double.valueOf(JT5.getText());
        superPosArrSUM[6] = Double.valueOf(JT6.getText());
        superPosArrSUM[7] = Double.valueOf(JT7.getText());
        superPosArrSUM[8] = Double.valueOf(JT8.getText());
        superPosArrSUM[9] = Double.valueOf(JT9.getText());
        
        superPosArrSUM[10] = Double.valueOf(JT10.getText());
        superPosArrSUM[11] = Double.valueOf(JT11.getText());
        superPosArrSUM[12] = Double.valueOf(JT12.getText());
        superPosArrSUM[13] = Double.valueOf(JT13.getText());
        superPosArrSUM[14] = Double.valueOf(JT14.getText());
        
        superPosArrSUM[15] = Double.valueOf(JT15.getText());
        superPosArrSUM[16] = Double.valueOf(JT16.getText());
        superPosArrSUM[17] = Double.valueOf(JT17.getText());
        superPosArrSUM[18] = Double.valueOf(JT18.getText());
        superPosArrSUM[19] = Double.valueOf(JTO.getText());
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JT0 = new javax.swing.JTextField();
        A0 = new javax.swing.JLabel();
        A1 = new javax.swing.JLabel();
        JT1 = new javax.swing.JTextField();
        A2 = new javax.swing.JLabel();
        JT2 = new javax.swing.JTextField();
        A3 = new javax.swing.JLabel();
        JT3 = new javax.swing.JTextField();
        A4 = new javax.swing.JLabel();
        JT4 = new javax.swing.JTextField();
        JT5 = new javax.swing.JTextField();
        A5 = new javax.swing.JLabel();
        A6 = new javax.swing.JLabel();
        JT6 = new javax.swing.JTextField();
        JT7 = new javax.swing.JTextField();
        A7 = new javax.swing.JLabel();
        JT8 = new javax.swing.JTextField();
        A8 = new javax.swing.JLabel();
        A9 = new javax.swing.JLabel();
        JT9 = new javax.swing.JTextField();
        JT16 = new javax.swing.JTextField();
        A11 = new javax.swing.JLabel();
        A16 = new javax.swing.JLabel();
        JT11 = new javax.swing.JTextField();
        JT17 = new javax.swing.JTextField();
        A12 = new javax.swing.JLabel();
        A17 = new javax.swing.JLabel();
        JT12 = new javax.swing.JTextField();
        A18 = new javax.swing.JLabel();
        A13 = new javax.swing.JLabel();
        JT18 = new javax.swing.JTextField();
        JT13 = new javax.swing.JTextField();
        JT14 = new javax.swing.JTextField();
        JTO = new javax.swing.JTextField();
        A14 = new javax.swing.JLabel();
        AO = new javax.swing.JLabel();
        A15 = new javax.swing.JLabel();
        A10 = new javax.swing.JLabel();
        JT15 = new javax.swing.JTextField();
        JT10 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        JT0.setText("0");

        A0.setText("a[0]");

        A1.setText("a[1]");

        JT1.setText("0");

        A2.setText("a[2]");

        JT2.setText("0");

        A3.setText("a[3]");

        JT3.setText("0");

        A4.setText("a[4]");

        JT4.setText("0");

        JT5.setText("0");

        A5.setText("a[5]");

        A6.setText("a[6]");

        JT6.setText("0");

        JT7.setText("0");

        A7.setText("a[7]");

        JT8.setText("0");

        A8.setText("a[8]");

        A9.setText("a[9]");

        JT9.setText("0");

        JT16.setText("0");

        A11.setText("a[11]");

        A16.setText("a[16]");

        JT11.setText("0");

        JT17.setText("0");

        A12.setText("a[12]");

        A17.setText("a[17]");

        JT12.setText("0");

        A18.setText("a[18]");

        A13.setText("a[13]");

        JT18.setText("0");

        JT13.setText("0");

        JT14.setText("0");

        JTO.setText("0");

        A14.setText("a[14]");

        AO.setText("a");

        A15.setText("a[15]");

        A10.setText("a[10]");

        JT15.setText("0");

        JT10.setText("0");

        jButton1.setText("Ок");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(A8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JT8, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(A7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(JT7, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(A6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(JT6, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(A5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(JT5, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(A4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(JT4, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(A3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(JT3, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(A2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(JT2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(A1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(JT1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(A0)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(JT0, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(AO)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JTO, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(A18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JT18, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(A17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JT17, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(A16)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(JT16, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(A15)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(JT15, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(A14)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(JT14, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(A13)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(JT13, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(A12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(JT12, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(A11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(JT11, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(A10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(JT10, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(A9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JT9, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTO, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AO)
                    .addComponent(JT9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(A9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JT10, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(A10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JT11, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(A11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JT12, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(A12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JT13, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(A13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JT14, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(A14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JT15, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(A15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JT16, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(A16))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JT17, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(A17))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JT18, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(A18)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JT0, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(A0))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JT1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(A1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JT2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(A2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JT3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(A3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JT4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(A4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JT5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(A5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JT6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(A6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JT7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(A7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JT8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(A8))))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        disableCheck();
        for(int i = 0; i < (superPosFormArr.length - 1);i++){
            if (superPosFormArr[i] == true){
                initCheckSuperPos(i);
            }
        }
    }//GEN-LAST:event_formWindowOpened

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        finalSSUMCheck();    
        modelFrame13.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(SuperPosText.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SuperPosText.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SuperPosText.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SuperPosText.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SuperPosText().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel A0;
    public static javax.swing.JLabel A1;
    public static javax.swing.JLabel A10;
    public static javax.swing.JLabel A11;
    public static javax.swing.JLabel A12;
    public static javax.swing.JLabel A13;
    public static javax.swing.JLabel A14;
    public static javax.swing.JLabel A15;
    public static javax.swing.JLabel A16;
    public static javax.swing.JLabel A17;
    public static javax.swing.JLabel A18;
    public static javax.swing.JLabel A2;
    public static javax.swing.JLabel A3;
    public static javax.swing.JLabel A4;
    public static javax.swing.JLabel A5;
    public static javax.swing.JLabel A6;
    public static javax.swing.JLabel A7;
    public static javax.swing.JLabel A8;
    public static javax.swing.JLabel A9;
    public static javax.swing.JLabel AO;
    public static javax.swing.JTextField JT0;
    public static javax.swing.JTextField JT1;
    public static javax.swing.JTextField JT10;
    public static javax.swing.JTextField JT11;
    public static javax.swing.JTextField JT12;
    public static javax.swing.JTextField JT13;
    public static javax.swing.JTextField JT14;
    public static javax.swing.JTextField JT15;
    public static javax.swing.JTextField JT16;
    public static javax.swing.JTextField JT17;
    public static javax.swing.JTextField JT18;
    public static javax.swing.JTextField JT2;
    public static javax.swing.JTextField JT3;
    public static javax.swing.JTextField JT4;
    public static javax.swing.JTextField JT5;
    public static javax.swing.JTextField JT6;
    public static javax.swing.JTextField JT7;
    public static javax.swing.JTextField JT8;
    public static javax.swing.JTextField JT9;
    public static javax.swing.JTextField JTO;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}
