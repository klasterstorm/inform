/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inform;


import static inform.MainFrame.calculateTime;
import static inform.MainFrame.minGraphic;
import static inform.MainFrame.modelFrame;
import static inform.MainFrame.modelFrame10;
import static inform.MainFrame.modelFrame2;
import static inform.MainFrame.modelFrame3;
import static inform.MainFrame.modelFrame4;
import static inform.MainFrame.modelFrame7;
import static inform.MainFrame.modelFrame9;
import static inform.MainFrame.samplesNumber;
import static inform.MainFrame.samplingRate;
import static inform.MainFrame.startTime;
import static inform.MainFrame.streamArray2;
import static inform.MainFrame.suppArr;
import static inform.MainFrame.thisTime;
import static inform.MinGraphics.gendI;
import static inform.MinGraphics.gstartI;
import java.awt.Color;
import java.awt.Graphics;
import static java.lang.Math.sin;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

/**
 *
 * @author KLASTER
 */
public class ModelFrame50 extends javax.swing.JFrame {

    private static final long serialVersionUID = 1L;

    /**
     * Creates new form ModelFrame
     */
    public ModelFrame50() {
        initComponents();

    }
    public double ti = 200;
    public double f = 0.005;
    public double t = 0;
    
    public double aa = 0;
    public double bb = 100;
    
    public double a = 50;
    public double fo = 0.001;
    public double fn = 0.02;
    public double fi = 0.03;
    public double m = 1;




    
    
    
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
        g.drawString(String.valueOf(numberAfterPoint(max2,3)),20,81);
        g.drawString(String.valueOf(numberAfterPoint(min2,3)),20,lline1);
        g.drawString(String.valueOf(numberAfterPoint(hortext,3)),20,lline2);
        g.drawString(String.valueOf(numberAfterPoint(hortext3,3)),20,lline3);
        g.drawString(String.valueOf(numberAfterPoint(hortext2,3)),20,lline4);
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
     
        boolean firstValue = false;
        double maxValue = 11511;
        double minValue = 11511;
        
        int maxProc = 222;
        int minProc = 222;

        
        //if (gstartI > -1){
            Label1.setText(0 + " < " + "a" + " < " + 1);
            
            //Находим максимум и минимум
            for(int n = 0; n < maxSamples; n++){
                //System.out.println(startTime + " - " + samplingRate + " - " + thisTime("100"));

                //t = Integer.parseInt(thisTime()) + ((n * Integer.parseInt(samplingRate)));
                //n = StartTime;
                //System.out.println(n + " - " + t);
                
                //double value = a * sin(n * Math.toRadians(ti) + Math.toRadians(fi));
                
                // Текущее время + (Номер отсчета * частота дискретизации)
                //t = Integer.parseInt(thisTime()) + ((n * Integer.parseInt(samplingRate)));
                
                
                t = ((n * Integer.parseInt(samplingRate)));
                
                //ti = 200;
                double value = aa + (bb - aa) * frand();
                
                //System.out.println("VALUE ___ 1 " + a);
                //System.out.println("VALUE ___ 2 " + Math.exp(-t / ti));
                //System.out.println("VALUE ___ 3 " + Math.cos(Math.toRadians(360) * f * t + fi));
                //System.out.println("VALUE ___ 4 " + value);

                
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
                

                
            }
            System.out.println("АМПЛИТУДА МИН ---- МАКС " + minValue + " +++ " + maxValue);
            System.out.println("DIFFER " + (maxValue - minValue));

            double differValue = maxValue - minValue;

            System.out.println("DIFFER_ABS " + differValue);
            
            
            for(int n = 0; n < maxSamples; n++){
                t = ((n * Integer.parseInt(samplingRate)));
                double value = aa + (bb - aa) * frand();
                y2 = (((value * 100) / differValue));
                
                if (maxProc == 222){
                    maxProc = (int) y2;
                }
                else{
                    if(y2 > maxProc){
                        maxProc = (int) y2;
                    }
                }
                
                
                
                if (minProc == 222){
                    minProc = (int) y2;
                }
                else{
                    if(y2 < minProc){
                        minProc = (int) y2;
                    }
                }
            }
            
            System.out.println("MAX - MIN %%% " + maxProc + " ___" + minProc);
            
            for(int i = 0; i < maxSamples; i++){
                x2 = Math.ceil(((width / maxSamples) * i) + minWidth);
                
                g.setColor(Color.MAGENTA);

                t = ((i * Integer.parseInt(samplingRate)));
                
                double value = aa + (bb - aa) * frand();

                y2 = (((value * 100) / differValue));
                y2 = (maxProc) - y2;
                y2 = ((y2 * maxHeight) / 100) + minHeight + 1;



                if (push_ToArr == 1){
                    streamArray2[i][suppArr-1] = String.valueOf(100 - y2);
                }
                
                //if (minValue < 0){
                //    g.drawLine((int)x1, (int) ((int)y1 - ((modelFrameHeight/2) - (minHeight - 11))), (int)x2, (int) ((int)y2 - ((modelFrameHeight/2) - (minHeight - 11))));
                //}
                //else {
                    g.drawLine((int)x1, (int) y1, (int)x2, (int) y2);
                //}
                    
 
                    

                x1 = x2;
                y1 = y2;
            }
            Line(g, 0, (int) maxSamples, maxValue, minValue);
        
       
        
        pushToArr = 0;
    }

    public double frand(){
        double v = Math.random() * 10 + 1;
        return numberAfterPoint((v / 10),3);
    }
    
    public void paint(Graphics g) {
        modelFrameWidth = modelFrame10.getWidth();
        modelFrameHeight = modelFrame10.getHeight();
        TextField11.setText(String.valueOf(aa));
        TextField22.setText(String.valueOf(bb));
        //TextField33.setText(String.valueOf(fn));
        //TextField44.setText(String.valueOf(a));
        //TextField55.setText(String.valueOf(m));

        super.paint(g);
        fillScreen(g);

        Graphics(g,pushToArr);
        
        Cage(g);

        //System.out.println("ModelFrame paint");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        TextField2 = new javax.swing.JTextField();
        Label2 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        TextField3 = new javax.swing.JTextField();
        Label3 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        SelectButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        TextField1 = new javax.swing.JTextField();
        Label1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        TextField22 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        TextField11 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        SelectButton1 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();

        jPanel5.setBackground(new java.awt.Color(214, 214, 214));
        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Шаблоны данных");

        jButton2.setText("1");

        jButton3.setText("3");

        jButton4.setText("2");

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

        jPanel3.setBackground(new java.awt.Color(214, 214, 214));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        TextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextField2ActionPerformed(evt);
            }
        });

        Label2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label2.setText("0° < w < 180°");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Круговая частота ( w )");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TextField2)
                    .addComponent(Label2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Label2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(214, 214, 214));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        TextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextField3ActionPerformed(evt);
            }
        });

        Label3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label3.setText("0° < f < 360°");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Начальная фаза ( f )");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TextField3)
                    .addComponent(Label3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Label3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        SelectButton.setText("Применить");
        SelectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelectButtonActionPerformed(evt);
            }
        });

        jButton1.setText("Добавить к графикам");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(214, 214, 214));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        TextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextField1ActionPerformed(evt);
            }
        });

        Label1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label1.setText("0 < a < 1");

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Амплитуда ( а )");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TextField1)
                    .addComponent(Label1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Label1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Дискретизированная убывающая экспонента");
        setAlwaysOnTop(true);

        jPanel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        TextField22.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextField22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextField22ActionPerformed(evt);
            }
        });

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Конец интервала ( b )");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TextField22))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextField22, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        jPanel8.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        TextField11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextField11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextField11ActionPerformed(evt);
            }
        });

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Начала интервала ( a )");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TextField11))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        SelectButton1.setText("Применить");
        SelectButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelectButton1ActionPerformed(evt);
            }
        });

        jButton8.setText("Добавить к графикам");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                            .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(SelectButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 164, Short.MAX_VALUE)
                .addComponent(SelectButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 700, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextField2ActionPerformed

    private void TextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextField3ActionPerformed

    private void SelectButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelectButtonActionPerformed

        //if (1 >= L & L >= 0 ){
           // a = Double.valueOf(TextField1.getText());
           // repaint();
            //}
    }//GEN-LAST:event_SelectButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        pushToArr = 1;
        repaint();
        minRepaint();
        suppArr++;
    }//GEN-LAST:event_jButton1ActionPerformed

    private void TextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextField1ActionPerformed

    private void TextField11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextField11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextField11ActionPerformed

    private void SelectButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelectButton1ActionPerformed
        //System.out.println("RANDOM --- " + frand());
        aa = Double.parseDouble(TextField11.getText());
        bb = Double.parseDouble(TextField22.getText());
        //fn = Double.parseDouble(TextField33.getText());
        //a = Double.parseDouble(TextField44.getText());
        //m = Double.parseDouble(TextField55.getText());
        repaint();
    }//GEN-LAST:event_SelectButton1ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        pushToArr = 1;
        repaint();
        minRepaint();
        suppArr++;
    }//GEN-LAST:event_jButton8ActionPerformed

    private void TextField22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextField22ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextField22ActionPerformed

    public int pushToArr = 0;
    
    public static void minRepaint() {
        minGraphic.setSize(minGraphic.getWidth(), minGraphic.getHeight());
        System.out.println("МИН РЕПЕИНТ");
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
    private javax.swing.JLabel Label2;
    private javax.swing.JLabel Label3;
    private javax.swing.JButton SelectButton;
    private javax.swing.JButton SelectButton1;
    public static javax.swing.JTextField TextField1;
    public static javax.swing.JTextField TextField11;
    public static javax.swing.JTextField TextField2;
    private javax.swing.JTextField TextField22;
    public static javax.swing.JTextField TextField3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    // End of variables declaration//GEN-END:variables
}
