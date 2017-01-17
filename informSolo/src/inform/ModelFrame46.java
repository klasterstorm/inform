/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inform;


import static inform.MainFrame.minGraphic;
import static inform.MainFrame.modelFrame;
import static inform.MainFrame.modelFrame2;
import static inform.MainFrame.modelFrame3;
import static inform.MainFrame.modelFrame4;
import static inform.MainFrame.modelFrame6;
import static inform.MainFrame.nonTXT;
import static inform.MainFrame.samplesNumber;
import static inform.MainFrame.streamArray2;
import static inform.MainFrame.suppArr;
import static inform.MinGraphics.gendI;
import static inform.MinGraphics.gstartI;
import java.awt.Color;
import java.awt.Graphics;
import static java.lang.Math.sin;
import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 *
 * @author KLASTER
 */
public class ModelFrame46 extends javax.swing.JFrame {

    private static final long serialVersionUID = 1L;

    /**
     * Creates new form ModelFrame
     */
    public ModelFrame46() {
        initComponents();

    }
    
    public double L = 0.99;
    public double maxSamples = 0;
    public int modelFrameWidth;
    public int modelFrameHeight;

    public void fillScreen(Graphics g){
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, modelFrameWidth - 200, modelFrameHeight);
    }
    
    public void Cage(Graphics g){
        g.setColor(Color.DARK_GRAY);
        g.drawRect(60, 81, modelFrameWidth - 320, modelFrameHeight - 141);
    }
    
    public void Line(Graphics g,int max1,int min1, double max2, double min2){
        
        //Полоски вертикальные
        g.setColor(Color.LIGHT_GRAY);
        
        int line1 = ((modelFrameWidth - (320 - 60)) / 2) + (60 / 2);
        int line2 = (line1 + 60) / 2;
        int line3 = ((modelFrameWidth - (320 - 60)) + line1) / 2;
        
        g.drawLine(60, 81, 60, modelFrameHeight - 40);
        g.drawLine(line1, 81,line1, modelFrameHeight - 40);
        g.drawLine(line2, 81,line2, modelFrameHeight - 40);
        g.drawLine(line3, 81,line3, modelFrameHeight - 40);
        g.drawLine(modelFrameWidth - (320 - 60), 81, modelFrameWidth - (320 - 60), modelFrameHeight - 40);
        
        
        //Текс для вертикальных полосок
        
        int avrg = (max1 + min1) / 2;
        int avrg2 = (max1 + avrg) / 2;
        int avrg3 = (min1 + avrg) / 2;
        
        g.setColor(Color.DARK_GRAY);
        g.drawString(String.valueOf(max1),60, modelFrameHeight - 20);
        g.drawString(String.valueOf(avrg2),line2, modelFrameHeight - 20);
        g.drawString(String.valueOf(avrg),line1, modelFrameHeight - 20);
        g.drawString(String.valueOf(avrg3),line3, modelFrameHeight - 20);
        g.drawString(String.valueOf(min1),modelFrameWidth - (320 - 60), modelFrameHeight - 20);
        
        //Полоски горизонтальные
        
        int lline1 = modelFrameHeight - 60;
        int lline2 = (lline1 + 81) / 2;
        int lline3 = (lline1 + lline2) /  2;
        int lline4 = (lline2 + 81) / 2;
        
        g.setColor(Color.LIGHT_GRAY);
        g.drawLine(40, 81, modelFrameWidth - (320 - 60), 81);
        g.drawLine(40, lline1, modelFrameWidth - (320 - 60), lline1);
        g.drawLine(40, lline2, modelFrameWidth - (320 - 60), lline2);
        g.drawLine(40, lline3, modelFrameWidth - (320 - 60), lline3);
        g.drawLine(40, lline4, modelFrameWidth - (320 - 60), lline4);
        
        //Текст для горизонтальных полосок
        
        double hortext = (max2 + min2)/2;
        double hortext2 = (hortext + max2)/2;
        double hortext3 = (hortext + min2)/2;
        
        g.setColor(Color.DARK_GRAY);
        g.drawString(String.valueOf(numberAfterPoint(max2,15)),20,81);
        g.drawString(String.valueOf(numberAfterPoint(min2,15)),20,lline1);
        g.drawString(String.valueOf(numberAfterPoint(hortext,15)),20,lline2);
        g.drawString(String.valueOf(numberAfterPoint(hortext3,15)),20,lline3);
        g.drawString(String.valueOf(numberAfterPoint(hortext2,15)),20,lline4);
    }
    
    public static double numberAfterPoint(double numberMain,int number){
        return new BigDecimal(numberMain).setScale(number, RoundingMode.HALF_UP).doubleValue();
    }
    
    public void Graphics(Graphics g, int push_ToArr){
        maxSamples = Integer.parseInt(samplesNumber);
        

        
        double minWidth = 60;
        double maxWidth = modelFrameWidth - 320;
        double minHeight = 81;
        double maxHeight = modelFrameHeight - 141;
        double width = (maxWidth - minWidth) + 60;

        
        double x1 = 60;
        double y1 = maxHeight + minHeight;
        double x2 = 60;
        double y2 = maxHeight + minHeight;
        double diffXY = maxHeight - minHeight;
        int ggendI = (int) (gendI - 1);
        //System.out.println(gstartI + " !========================================! " + gendI);
//        int xuy = (int) (ggendI - gstartI);
     
        boolean firstValue = false;
        double maxValue = 11511;
        double minValue = 11511;


        //Label1.setText(0 + " < " + "a" + " < " + 1);

        //Находим максимум и минимум
        for(int n = 0; n < maxSamples; n++){
            double w = Math.toRadians(180);
            double f = Math.toRadians(360);
            double value = (n % L) / L;

            if (maxValue == 11511){
                maxValue = value;
            }
            else{
                if(value > maxValue){
                    maxValue = value;
                }
            }



            if (minValue == 11511){
                minValue = value;
            }
            else{
                if(value < minValue){
                    minValue = value;
                }
            }

            //System.out.println("АМПЛИТУДА МИН ---- МАКС " + minValue + " +++ " + maxValue);

        }

        double kekValue = maxValue - minValue;

        for(int i = 0; i < maxSamples; i++){
            x2 = Math.ceil(((width / maxSamples) * i) + minWidth);

            g.setColor(Color.MAGENTA);

            double value = (i % this.L) / this.L;
            //System.out.println("VALUE - " + value);
            y2 = (((value * 100) / kekValue));
            //System.out.println("100% - " + y2);
            y2 = 100 - y2;
            y2 = ((y2 * maxHeight) / 100) + minHeight;
            //System.out.println("Y2 - " + y2);


            if (push_ToArr == 1){
                streamArray2[i][suppArr-1] = String.valueOf(100 - y2);
            }

            if (minValue < 0){
                g.drawLine((int)x1, (int) ((int)y1 - ((modelFrameHeight/2) - (minHeight - 11))), (int)x2, (int) ((int)y2 - ((modelFrameHeight/2) - (minHeight - 11))));
            }
            else {
                g.drawLine((int)x1, (int) y1, (int)x2, (int) y2);
            }




            x1 = x2;
            y1 = y2;
        }
        Line(g, 0, (int) maxSamples, maxValue, minValue);


        
        pushToArr = 0;
    }

    public void paint(Graphics g) {
        modelFrameWidth = modelFrame6.getWidth();
        modelFrameHeight = modelFrame6.getHeight();
        //TextField1.setText(String.valueOf(L));
        super.paint(g);
        fillScreen(g);

        Graphics(g,pushToArr);
        
        Cage(g);
        
        //System.out.println("ModelFrame paint");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        TextField3 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        SelectButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("“Пила” ");
        setAlwaysOnTop(true);

        jButton1.setText("Добавить к графикам");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        TextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextField3ActionPerformed(evt);
            }
        });

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Период ( L )");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TextField3)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Шаблоны данных");

        jButton2.setText("1");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("3");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("2");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        SelectButton.setText("Применить");
        SelectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelectButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SelectButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SelectButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 123, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 614, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public int pushToArr = 0;
    
    private void SelectButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelectButtonActionPerformed

        //if (1 >= L & L >= 0 ){
        L = Double.valueOf(TextField3.getText());
            repaint();  
        //}
    }//GEN-LAST:event_SelectButtonActionPerformed

    public static void minRepaint() {
        minGraphic.setSize(minGraphic.getWidth(), minGraphic.getHeight());
        System.out.println("МИН РЕПЕИНТ");
    }
    
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        pushToArr = 1;
        repaint();
        minRepaint();
        suppArr++;
    }//GEN-LAST:event_jButton1ActionPerformed

    private void TextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextField3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        L = Double.valueOf(maxSamples - 1);
        repaint();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        L = Double.valueOf((maxSamples / 2) - 1);
        repaint();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        L = Double.valueOf((maxSamples / 3) - 1);
        repaint();
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(ModelFrame41.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModelFrame41.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModelFrame41.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModelFrame41.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModelFrame41().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SelectButton;
    public static javax.swing.JTextField TextField3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    // End of variables declaration//GEN-END:variables
}
