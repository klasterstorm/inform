/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inform;

import static inform.MainFrame.WriteFile;
import static inform.MainFrame.channelsNames;
import static inform.MainFrame.samplesNumber;
import static inform.MainFrame.saveForm;
import static inform.MainFrame.supChannelsNames;
import static inform.MainFrame.superPosText;
import static inform.MainFrame.superPosText2;
import static inform.MainFrame.suppArr;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author KLASTER
 */
public class SuperPosForm extends javax.swing.JFrame {

    /**
     * Creates new form SaveForm
     */
    public SuperPosForm() {
        initComponents();
    }
    
    public static boolean superPosFormArr[] = new boolean [20];
    public static int startSample = 0;
    public static int endSample = 0;

    
    public static int numberTrueSuperPoskArr(){
        int count = 0;
        for(int i = 0;i < superPosFormArr.length-1; i++){
            if (superPosFormArr[i] == true){
                count++;
            }
        }
        System.out.println("Кол-во тру" + count);
        return count;
    }
    
    
    public static String name(int count){
        System.out.println((channelsNames.length) + " > " + count);
        if((channelsNames.length) > count){
            return channelsNames[count];
        }
        else {
            System.out.println("ИМЯ "+supChannelsNames[count - (channelsNames.length)]);
            System.out.println("ИНДЕКС " + (count - (channelsNames.length)));
            return supChannelsNames[count - (channelsNames.length)];
        }
    }
    
    public static void disableCheck(){
        J0.setVisible(false);
        J1.setVisible(false);
        J2.setVisible(false);
        J3.setVisible(false);
        J4.setVisible(false);
        J5.setVisible(false);
        J6.setVisible(false);
        J7.setVisible(false);
        J8.setVisible(false);
        J9.setVisible(false);
        J10.setVisible(false);
        J11.setVisible(false);
        J12.setVisible(false);
        J13.setVisible(false);
        J14.setVisible(false);
        J15.setVisible(false);
        J16.setVisible(false);
        J17.setVisible(false);
        J18.setVisible(false);
    }

    public static void initCheck(int count){
        switch(count){ 
            case 0: 
                J0.setVisible(true);
                J0.setText(name(count));
                break; 
            case 1: 
                J1.setVisible(true);
                J1.setText(name(count));
                break; 
            case 2: 
                J2.setVisible(true);
                J2.setText(name(count));
                break; 
            case 3: 
                J3.setVisible(true);
                J3.setText(name(count));
                break; 
            case 4: 
                J4.setVisible(true);
                J4.setText(name(count));
                break; 
            case 5: 
                J5.setVisible(true);
                J5.setText(name(count));
                break; 
            case 6: 
                J6.setVisible(true);
                J6.setText(name(count));
                break; 
            case 7: 
                J7.setVisible(true);
                J7.setText(name(count));
                break; 
            case 8:
                J8.setVisible(true);
                J8.setText(name(count));
                break; 
            case 9: 
                J9.setVisible(true);
                J9.setText(name(count));
                break; 
            case 10: 
                J10.setVisible(true);
                J10.setText(name(count));
                break; 
            case 11:
                J11.setVisible(true);
                J11.setText(name(count));
                break; 
            case 12:
                J12.setVisible(true);
                J12.setText(name(count));
                break; 
            case 13: 
                J13.setVisible(true);
                J13.setText(name(count));
                break; 
            case 14: 
                J14.setVisible(true);
                J14.setText(name(count));
                break; 
            case 15:
                J15.setVisible(true);
                J15.setText(name(count));
                break; 
            case 16: 
                J16.setVisible(true);
                J16.setText(name(count));
                break; 
            case 17:
                J17.setVisible(true);
                J17.setText(name(count));
                break; 
            case 18:
                J18.setVisible(true);
                J18.setText(name(count));
                break; 
        }
    }
    
    public void finalCheck(){
        superPosFormArr[0] = J0.isSelected();
        superPosFormArr[1] = J1.isSelected();
        superPosFormArr[2] = J2.isSelected();
        superPosFormArr[3] = J3.isSelected();
        superPosFormArr[4] = J4.isSelected();
        
        superPosFormArr[5] = J5.isSelected();
        superPosFormArr[6] = J6.isSelected();
        superPosFormArr[7] = J7.isSelected();
        superPosFormArr[8] = J8.isSelected();
        superPosFormArr[9] = J9.isSelected();
        
        superPosFormArr[10] = J10.isSelected();
        superPosFormArr[11] = J11.isSelected();
        superPosFormArr[12] = J12.isSelected();
        superPosFormArr[13] = J13.isSelected();
        superPosFormArr[14] = J14.isSelected();
        
        superPosFormArr[15] = J15.isSelected();
        superPosFormArr[16] = J16.isSelected();
        superPosFormArr[17] = J17.isSelected();
        superPosFormArr[18] = J18.isSelected();
        superPosFormArr[19] = true;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        J9 = new javax.swing.JCheckBox();
        J8 = new javax.swing.JCheckBox();
        J7 = new javax.swing.JCheckBox();
        J6 = new javax.swing.JCheckBox();
        J5 = new javax.swing.JCheckBox();
        J4 = new javax.swing.JCheckBox();
        J3 = new javax.swing.JCheckBox();
        J2 = new javax.swing.JCheckBox();
        J1 = new javax.swing.JCheckBox();
        J0 = new javax.swing.JCheckBox();
        J10 = new javax.swing.JCheckBox();
        J11 = new javax.swing.JCheckBox();
        J12 = new javax.swing.JCheckBox();
        J13 = new javax.swing.JCheckBox();
        J14 = new javax.swing.JCheckBox();
        J15 = new javax.swing.JCheckBox();
        J16 = new javax.swing.JCheckBox();
        J17 = new javax.swing.JCheckBox();
        J18 = new javax.swing.JCheckBox();
        jPanel1 = new javax.swing.JPanel();
        JSUM = new javax.swing.JButton();
        JUMN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Суперпозиция каналов");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Каналы", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        J9.setText("9");

        J8.setText("8");

        J7.setText("7");

        J6.setText("6");

        J5.setText("5");
        J5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J5ActionPerformed(evt);
            }
        });

        J4.setText("4");
        J4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J4ActionPerformed(evt);
            }
        });

        J3.setText("3");

        J2.setText("2");

        J1.setText("1");

        J0.setText("0");

        J10.setText("10");

        J11.setText("11");

        J12.setText("12");

        J13.setText("13");

        J14.setText("14");

        J15.setText("15");

        J16.setText("16");

        J17.setText("17");

        J18.setText("18");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(J1)
                    .addComponent(J0)
                    .addComponent(J2)
                    .addComponent(J3)
                    .addComponent(J4)
                    .addComponent(J5)
                    .addComponent(J6)
                    .addComponent(J7)
                    .addComponent(J8)
                    .addComponent(J9))
                .addGap(105, 105, 105)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(J14)
                    .addComponent(J15)
                    .addComponent(J16)
                    .addComponent(J17)
                    .addComponent(J18)
                    .addComponent(J13)
                    .addComponent(J10)
                    .addComponent(J11)
                    .addComponent(J12))
                .addContainerGap(134, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(J10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(J11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(J12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(J13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(J14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(J15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(J16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(J17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(J18)
                        .addGap(29, 29, 29))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(J0)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(J1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(J2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(J3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(J4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(J5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(J6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(J7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(J8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(J9)))
                .addGap(17, 17, 17))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        JSUM.setText("Сумма");
        JSUM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JSUMActionPerformed(evt);
            }
        });

        JUMN.setText("Произведение");
        JUMN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JUMNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(JSUM, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JUMN, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JSUM, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JUMN, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        System.out.println("АКТИВЕЙТЕД");
    }//GEN-LAST:event_formWindowActivated

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        endSample = Integer.parseInt(samplesNumber);
        //Jot.setText(String.valueOf(startSample));
        //Jdo.setText(String.valueOf(endSample));
        System.out.println("ОУПЕНД");
                System.out.println("Я СТАРТАНУЛ");
                disableCheck();
                for(int i = 0; i < (channelsNames.length + suppArr);i++){
                    initCheck(i);
                    System.out.println("Текущий индекс " + i);
                }
    }//GEN-LAST:event_formWindowOpened

    private void J4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_J4ActionPerformed

    private void J5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_J5ActionPerformed

    private void JSUMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JSUMActionPerformed
        finalCheck();
        superPosText.setVisible(true);
    }//GEN-LAST:event_JSUMActionPerformed

    private void JUMNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JUMNActionPerformed
        finalCheck();
        superPosText2.setVisible(true);
    }//GEN-LAST:event_JUMNActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SaveForm().setVisible(true);

            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JCheckBox J0;
    public static javax.swing.JCheckBox J1;
    public static javax.swing.JCheckBox J10;
    public static javax.swing.JCheckBox J11;
    public static javax.swing.JCheckBox J12;
    public static javax.swing.JCheckBox J13;
    public static javax.swing.JCheckBox J14;
    public static javax.swing.JCheckBox J15;
    public static javax.swing.JCheckBox J16;
    public static javax.swing.JCheckBox J17;
    public static javax.swing.JCheckBox J18;
    public static javax.swing.JCheckBox J2;
    public static javax.swing.JCheckBox J3;
    public static javax.swing.JCheckBox J4;
    public static javax.swing.JCheckBox J5;
    public static javax.swing.JCheckBox J6;
    public static javax.swing.JCheckBox J7;
    public static javax.swing.JCheckBox J8;
    public static javax.swing.JCheckBox J9;
    private javax.swing.JButton JSUM;
    private javax.swing.JButton JUMN;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
