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
public class ModelFrame44 extends javax.swing.JFrame {

    private static final long serialVersionUID = 1L;

    /**
     * Creates new form ModelFrame
     */
    public ModelFrame44() {
        initComponents();

    }
    
    public double a = 0.99;
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
        
        //if (gstartI > -1){
            Label1.setText(0 + " < " + "a" + " < " + 1);
            
            //Находим максимум и минимум
            for(int n = 0; n < maxSamples; n++){
                double w = Math.toRadians(180);
                double f = Math.toRadians(360);
                double value = a * sin(n * w + f);
                
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
                
                System.out.println("АМПЛИТУДА МИН ---- МАКС " + minValue + " +++ " + maxValue);

            }

            double kekValue = maxValue - minValue;
            
            for(int i = 0; i < maxSamples; i++){
                x2 = Math.ceil(((width / maxSamples) * i) + minWidth);
                //x2 = Math.ceil(((width / xuy) * (n - gstartI)) + minWidth);
                
                //System.out.println(n + " *-* " + x2 +" +-+ "+ minWidth + "---" + (maxWidth + minWidth) + " s-e"+gstartI+"-"+ggendI);
                
                g.setColor(Color.MAGENTA);

                    


                //y2 = minHeight;

                //double asdfg = Math.pow(pidor, n);
                

                double w = Math.toRadians(180);
                double f = Math.toRadians(360);
                double value = a * sin(i * w + f);
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
        modelFrameWidth = modelFrame4.getWidth();
        modelFrameHeight = modelFrame4.getHeight();
        TextField.setText(String.valueOf(a));
        super.paint(g);
        fillScreen(g);

        Graphics(g,pushToArr);
        
        Cage(g);
        
        System.out.println("ModelFrame paint");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        TextField = new javax.swing.JTextField();
        SelectButton = new javax.swing.JButton();
        Label1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Дискретизированная убывающая экспонента");
        setAlwaysOnTop(true);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        TextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldActionPerformed(evt);
            }
        });

        SelectButton.setText("Применить");
        SelectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelectButtonActionPerformed(evt);
            }
        });

        Label1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label1.setText("jLabel1");

        jButton1.setText("Добавить");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Амплитуда(а)");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                    .addComponent(SelectButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                    .addComponent(TextField, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Label1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(104, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Label1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SelectButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 214, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
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
    
    private void TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldActionPerformed

    private void SelectButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelectButtonActionPerformed

        if (1 >= a & a >= 0 ){
            a = Double.valueOf(TextField.getText());
            repaint();  
        }
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
    private javax.swing.JLabel Label1;
    private javax.swing.JButton SelectButton;
    public static javax.swing.JTextField TextField;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
