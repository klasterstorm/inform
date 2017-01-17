/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inform;


import static inform.MainFrame.minGraphic;
import static inform.MainFrame.modelFrame;
import static inform.MainFrame.modelFrame2;
import static inform.MainFrame.nonTXT;
import static inform.MainFrame.samplesNumber;
import static inform.MainFrame.streamArray2;
import static inform.MainFrame.suppArr;
import static inform.MinGraphics.gendI;
import static inform.MinGraphics.gstartI;
import static inform.MinGraphics.numberOfGraph;
import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author KLASTER
 */
public class ModelFrame42 extends javax.swing.JFrame {

    private static final long serialVersionUID = 1L;

    /**
     * Creates new form ModelFrame
     */
    public ModelFrame42() {
        initComponents();

    }
    
    public int intImpuls = 100;
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
    
    public void Line(Graphics g,int max1,int min1, int max2, int min2){
        
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
        

        g.setColor(Color.DARK_GRAY);
        g.drawString(String.valueOf(max2),20,81);
        g.drawString(String.valueOf(min2),20,lline1);
        //g.drawString(String.valueOf(" ============ ХОЧУ ЗНАЧЕНИЕ ============ "),20,lline2);
        //g.drawString(String.valueOf(" ============ ХОЧУ ЗНАЧЕНИЕ ============ "),20,lline3);
        //g.drawString(String.valueOf(" ============ ХОЧУ ЗНАЧЕНИЕ ============ "),20,lline4);
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
        int ggendI = (int) (gendI - 1);
        //System.out.println(gstartI + " !========================================! " + gendI);
        int xuy = (int) (ggendI - gstartI);
        
        
            Label1.setText(1 + " < " + "n0" + " < " + (maxSamples-1));
            
            Line(g, 0, (int) maxSamples,1,0);

            for(int i = 0; i <= maxSamples; i++){

                x2 = Math.ceil(((width / maxSamples) * i) + minWidth);
                
                //System.out.println(i + " *-* " + x2 +" +-+ "+ minWidth + "---" + (maxWidth + minWidth) + " s-e"+gstartI+"-"+ggendI);
                
                g.setColor(Color.MAGENTA);
                
                if(intImpuls < i) {
                    
                    if (push_ToArr == 1){
                        streamArray2[i][suppArr-1] = String.valueOf(maxSamples);
                    }

                    y2 = minHeight;
                    g.drawLine((int)x1, (int)y1, (int)x2, (int)y2);


                }
                else {

                    if (push_ToArr == 1){
                        streamArray2[i][suppArr-1] = String.valueOf(1);
                    }


                    y2 = maxHeight + minHeight;
                    g.drawLine((int)x1, (int)y1, (int)x2, (int)y2);
                    //System.out.println("Текущий каунт " + count + " <= " + intImpuls + " УВЕЛИЧИВАЮ");


                    //count++;
                }

                x1 = x2;
                y1 = y2;
            }
            
        pushToArr = 0;
    }

    public void paint(Graphics g) {
        modelFrameWidth = modelFrame2.getWidth();
        modelFrameHeight = modelFrame2.getHeight();
        super.paint(g);
        fillScreen(g);
        Cage(g);
        Graphics(g,pushToArr);

        System.out.println("ModelFrame paint");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Label1 = new javax.swing.JLabel();
        TextField = new javax.swing.JTextField();
        SelectButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Задержанный единичный скачок  ");
        setAlwaysOnTop(true);

        jButton1.setText("Добавить");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Задержка скачка ( n0 )");

        Label1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label1.setText("jLabel1");

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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Label1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TextField)
                    .addComponent(SelectButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Label1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SelectButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 16, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 11, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(197, 197, 197)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
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
        intImpuls = Integer.parseInt(TextField.getText());
        if (maxSamples > intImpuls & intImpuls > 0 ){
            repaint();
        }
        //else {
            
        //}
        //System.out.println(maxSamples + " > " + intImpuls + " > " + "0");
    }//GEN-LAST:event_SelectButtonActionPerformed

    public static void minRepaint() {
        minGraphic.setSize(minGraphic.getWidth(), minGraphic.getHeight());
        System.out.println("МИН РЕПЕИНТ");
    }
    
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        numberOfGraph = 2;
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
    private javax.swing.JTextField TextField;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
