/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inform;

import java.awt.Frame;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.awt.Graphics;
import java.awt.List;
import java.awt.Point;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import org.knowm.xchart.QuickChart;
import org.knowm.xchart.SwingWrapper;
import org.knowm.xchart.XChartPanel;
import org.knowm.xchart.XYChart;

/**
 *
 * @author KLASTER
 */
@SuppressWarnings("serial")

public class MainFrame extends javax.swing.JFrame {
    public MainFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jFrame2 = new javax.swing.JFrame();
        StreamButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        StreamArea = new javax.swing.JTextArea();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        StreamButton.setText("Загрузить файл с потоками");
        StreamButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StreamButtonActionPerformed(evt);
            }
        });

        StreamArea.setColumns(20);
        StreamArea.setRows(5);
        jScrollPane1.setViewportView(StreamArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(StreamButton, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 562, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(StreamButton, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 483, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //Кол-во каналов
    public static String channelsNumber = "";
    //Кол-во строк в файле(+12 для описания файла)
    public static String samplesNumber = "";
    //Какая-то хурма, пусть тут валяется, мб пригодится.
    public static String samplingRate = "";
    //Старт измерения(дата)
    public static String startDate = "";
    //Старт измерения(время)
    public static String startTime = "";
    //Названия каналов. Записанны в массиве, чтобы было проще к ним обращаться.
    public static String[] channelsNames;
    //Данные из файла
    public static String[][] streamArray;

    private void StreamButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StreamButtonActionPerformed
        
        
       
        
        //Чтение из файла
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        File file = new File("/Users/KLASTER/Desktop/1.txt");
        BufferedReader bufferReader = null;
        try {
            bufferReader = new BufferedReader(new FileReader(file));
        } 
        catch (FileNotFoundException ex) {}
       
        //Чтение из файла, которое работает у меня
//        BufferedReader reader = null;
//        try {
//            reader = new BufferedReader(
//                    new InputStreamReader(new FileInputStream("/Users/danilenkodanilasergeevic/Desktop/1.txt")));
//        } catch (FileNotFoundException ex) {
//            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
//        }

        
        String line = "";
        int count = 1;
        try {
            while ((line = bufferReader.readLine()) != null) {
                //Первые 12 строчек описание файла, разбираю их кейсом
                if (count <= 12) {
                    switch(count) {
                        case 2:
                            channelsNumber = line.replaceAll(" ", "");
                            break;
                        case 4:
                            samplesNumber = line.replaceAll(" ", "");
                            //Считали кол-во строк и кол-во измерений. 
                            //Создаю массив с этим размером.
                            streamArray = new String [Integer.parseInt(samplesNumber)][Integer.parseInt(channelsNumber)];
                            break;
                        case 6:
                            samplingRate = line.replaceAll(" ", "");
                            break;
                        case 8:
                            startDate = line.replaceAll(" ", "");
                            break;
                        case 10:
                            startTime = line.replaceAll(" ", "");
                            break;
                        case 12:
                            //Загоняю в массив название каналов, отделяя элементы по ";"
                            channelsNames = line.split(";");
                            break;
                    }
                }
                //Дальше идут данные. Кладу их в массив, разделяя элементы по наличию пробела
                else{
                    streamArray[count-13] = line.split(" ");
                }
                count++;
            }
        } 

        catch (IOException ex) {}

        
        /* Вывод массива c данными в консоль */
/*
                System.out.println(Integer.parseInt(samplesNumber));
                System.out.println(Integer.parseInt(channelsNumber));
                for (int i=0;i<(Integer.parseInt(samplesNumber));i++){
                    for (int j=0;j<(Integer.parseInt(channelsNumber));j++){
                        System.out.print("["+streamArray[i][j]+"]"+" ");
                    }
                    System.out.print(i+"\n");
                }
        */
        
        /* Вывод массива с каналами в консоль */
        /*
        for (int i = 0;i<channelsNames.length;i++){
            System.out.print(i+" --->"+channelsNames[i]+"\n");
        }
        */
        
        graphFrame.setVisible(true);
        graphFrame.setSize(200, (100 * Integer.parseInt(channelsNumber)) + 10);
        
    }//GEN-LAST:event_StreamButtonActionPerformed

    public static Frame graphFrame = new MinGraphics();    
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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
                graphFrame.setVisible(false);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea StreamArea;
    private javax.swing.JButton StreamButton;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
