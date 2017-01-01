/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inform;

import static inform.MainFrame.channelsNumber;
import static inform.MainFrame.graphFrame;
import static inform.MainFrame.samplesNumber;
import static inform.MainFrame.streamArray;
import java.awt.Color;
import java.awt.Graphics;


public class MinGraphics extends javax.swing.JFrame {

    private static final long serialVersionUID = 1L;
    
    public MinGraphics() {
        initComponents();
        repaint();
        
    }
    
    public static double MaxNumber(double number,double max) {
        double maxNumber = 0;
        if (number > max) {
            maxNumber = number;
            return maxNumber;
        }
        else {
            return max;
        }
    }
    
    public static double MinNumber(double number,double min) {
        double minNumber = 101;
        if (number < min) {
            minNumber = number;
            return minNumber;
        }
        else {
            return min;
        }
    }
    

    @Override
    public void paint(Graphics g){
        
        //Ширина и высота фрейма
        int maxFrameHeight = graphFrame.getHeight();
        int maxFrameWidth = graphFrame.getWidth();
        
        //Ограничение по ресайзу в высоту
        graphFrame.setSize(maxFrameWidth, (100 * Integer.parseInt(channelsNumber)) + 10);
        
        g.setColor(Color.white);
        g.fillRect(0, 0, maxFrameWidth, maxFrameHeight);
        g.setColor(Color.black);
        
        //Цикл кол-ва каналов
        for (int j = 0; j < Integer.parseInt(channelsNumber); j++){
            double y2 = 1;
            double y1 = 0;
            double max = Double.MIN_VALUE;
            double min = Double.MAX_VALUE;

            //Находим максимальное и минимальное значение для текущего канала
            for (int i = 0; i < Integer.parseInt(samplesNumber); i++) {
                y2 = Double.parseDouble(streamArray[i][j]);
                max = MaxNumber(y2,max);
                min = MinNumber(y2,min);
            }

            //Доп точки для построения линии
            double x2 = 0;
            double x1 = 0;
            

            if (max > 0){
                //Отнимаем общую часть
                max = max - min; 
            }
            else {

            }

            


            //Chart какой то там - ПОДКЛЮЧИТЬ БИБЛИОТЕКУ
            
            //Цикл для кол-ва измерений
            for (int i = 1; i < Integer.parseInt(samplesNumber)+1; i++) {
                
                //Считываем значение
                y2 = Double.parseDouble(streamArray[i-1][j]);
                //Отнимаем общую часть
                y2 = y2 - min;
                //Бахаем пропорцию
                y2 = ((y2 * 60) / max);
                //В нормальных графиках числа идут так (снизу)0..100(сверху)
                //а в графике наоборот (сверху)0..100(снизу)
                //Переворачиваем
                y2 = 100 - y2;
                
                //Ширина графика, так же пропорция, но с текущей шириной фрейма
                x2 = (i * (maxFrameWidth)) / Integer.parseInt(samplesNumber);

                //Линии графика                
                g.drawLine((int)x1, (int)y1 + (100 * j) + 1, (int)x2, (int)y2 + (100 * j) + 1); 
                                
                //Линии отделяющие графики
                g.drawLine(0, ((maxFrameHeight / Integer.parseInt(channelsNumber))*i)+21, maxFrameWidth, ((maxFrameHeight / Integer.parseInt(channelsNumber))*i)+21); 
                
                //Эти точки, чтобы линии шли последовательно
                x1 = x2;
                y1 = y2;
            } 
        }
    }

    
   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setTitle("Мин.Грифики");
        setAlwaysOnTop(true);
        setBounds(new java.awt.Rectangle(200, 23, 200, 200));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 406, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 625, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
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
            java.util.logging.Logger.getLogger(Graphics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Graphics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Graphics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Graphics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
   
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MinGraphics().setVisible(true);
            }
        });
        
        
        
        
        
    }
    

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

}
