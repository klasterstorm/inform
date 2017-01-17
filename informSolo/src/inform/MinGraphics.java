/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inform;



import static inform.MainFrame.calculateChannel;
import static inform.MainFrame.calculateTime;
import static inform.MainFrame.channelsNames;
import static inform.MainFrame.channelsNumber;
import static inform.MainFrame.jDesktopPane1;
import static inform.MainFrame.maxGraphic;
import static inform.MainFrame.samplesNumber;
import static inform.MainFrame.streamArray;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JMenuItem;
import static inform.MainFrame.minGraphic;
import static inform.MainFrame.modelFrame;
import static inform.MainFrame.samplesNumber;
import static inform.MainFrame.samplingRate;
import static inform.MainFrame.streamArray2;
import static inform.MainFrame.supChannelsNames;
import static inform.MainFrame.timeMaxGraphic;
import static inform.MainFrame.timeMaxGraphicArray;
import static inform.MainFrame.usage;
import static inform.MaxGraphics.MaxGraphQueue;
import static inform.MaxGraphics.intSupportDot;
//import static inform.MaxGraphics.MaxSlider;
import static inform.MaxGraphics.maxSliderValue;
import static inform.MaxGraphics.topQueue;
import static inform.UserMinMaxFrame.v1;
import static inform.UserMinMaxFrame.v2;

/**
 *
 * @author KLASTER
 */
public class MinGraphics extends javax.swing.JInternalFrame implements MouseListener, MouseMotionListener {

    private static final long serialVersionUID = 1L;

    Graphics g;
    public static int border1X = 1;
    public static int border2X = 1;
    public static int borderY = 1;

    public static int borderProp1X = 0;
    public static int borderProp2X = 100;
    
    public static int numberOfGraph = 0;
    

    
    int topPadding = 31;

    
    public MinGraphics(){
        initComponents();

    }
    
    public void initAll(){
        borderProp1X = 1;
        borderProp2X = 99;
        border1X = (minGraphic.getWidth() * borderProp1X / 100);
        border2X = (minGraphic.getWidth() * borderProp2X / 100);
        //System.out.println(borderProp1X + " - " + border1X + " -=-=-=-=-=-=-=- " + borderProp2X + " - " + border2X);
        maxRepaint();
        repaint();
    }

    public void fillActiveScreen(Graphics g,int i) {
        Color clr = new Color(203,224,255);
        g.setColor(clr);
        g.fillRect(12, (((minGraphic.getHeight() - 80)/calculateChannel()) * (MaxGraphQueue[i])) + 31, minGraphic.getWidth()-24, ((minGraphic.getHeight() - 80) / calculateChannel()));
    }

    @Override
    public void paint(Graphics g){
        super.paint(g);
        //Закрашиваем экран
        fillScreen(g);
        
        for (int i = 0; i < topQueue;i++){
            fillActiveScreen(g,i);
            
            g.setColor(Color.BLUE);

            int borderHeight = ((minGraphic.getHeight() - 80) / calculateChannel());
            g.drawLine((int) (border1X + maxSliderValue), ((((minGraphic.getHeight() - 80) / calculateChannel()) * (MaxGraphQueue[i]))) + 31, (int) (border1X + maxSliderValue), ((((minGraphic.getHeight() - 80) / calculateChannel()) * (MaxGraphQueue[i]))) + 31 + borderHeight);
            g.drawLine((int) (border2X + maxSliderValue), ((((minGraphic.getHeight() - 80) / calculateChannel()) * (MaxGraphQueue[i]))) + 31, (int) (border2X + maxSliderValue), ((((minGraphic.getHeight() - 80) / calculateChannel()) * (MaxGraphQueue[i]))) + 31 + borderHeight);


            g.setColor(Color.BLACK);
            //repaint();
        }
        
        
        //Цикл который выводит все каналы
        for (int j = 0; j < calculateChannel(); j++){
            

            //Мин. графики
            Graphics(g,j,j,minGraphic.getWidth()-26,((minGraphic.getHeight()-80)/calculateChannel()),10,21,0,0,0,0);

            //Разделяющие линии
            //g.drawLine(21, ((((minGraphic.getHeight()-180)/calculateChannel()) * (j + 1)) + (j * 21)) + 41, minGraphic.getWidth()-21, ((((minGraphic.getHeight()-180)/calculateChannel()) * (j + 1)) + (j * 21)) + 41);
            
            
            g.drawLine(
                    21, 
                    ((((minGraphic.getHeight() - 80)/calculateChannel()) * (j + 1)) + 31), 
                    minGraphic.getWidth()-21, 
                    ((((minGraphic.getHeight() - 80)/calculateChannel()) * (j + 1))) + 31); 
            

            //Названия каналов
            if(j > Integer.parseInt(channelsNumber)-1){
                //System.out.println("INDEXX - "+ (j - channelsNames.length));
                supChannelsNames[j - channelsNames.length] = "Model_"+((j - channelsNames.length)+1);
                g.drawString(supChannelsNames[j - channelsNames.length], 
                        (minGraphic.getWidth()-21) / 2, 
                        ((((minGraphic.getHeight() - 80) / calculateChannel()) * (j + 1))) + 31);
            }
            else {
                g.drawString(
                        channelsNames[j], 
                        (minGraphic.getWidth()-21) / 2, 
                        ((((minGraphic.getHeight() - 80) / calculateChannel()) * (j + 1))) + 31);
            }

        }

        //repaint();
    }

    
    public void fillScreen(Graphics g){
        g.setColor(Color.white);
        g.fillRect(12, topPadding, minGraphic.getWidth()-26, minGraphic.getHeight()-80);
        g.setColor(Color.black);
    }
    
    public static double gstartI;// = (Integer.parseInt(samplesNumber) * borderProp1X / 100) + maxSliderValue;
    public static double gendI;// = (Integer.parseInt(samplesNumber) * borderProp2X / 100) + maxSliderValue;
    
    public static double MaxNumber(double number,double max) {
        if (max == 0){
            max = number;
        }
        if (max < number) {
            max = number;
            return max;
        }
        else{
            return max;
        }
    }
    
    public static double MinNumber(double number,double min) {
        if (min == 0){
            min = number;
        }
        if (min > number) {
            min = number;
            return min;
        }
        else {
            return min;
        }
    }
 
    
    public static void Graphics(Graphics g,int numberOfGraphic, int numberInQueue,int graphicWidth, int graphicHeight, int graphicPadding,int marginTop,int minGraph,int marginRight,int zoom,int supportLine) {
        

        
        int nnumberOfGraphic = numberOfGraphic;


        
        double y2 = 1;
        double y1 = 0;

        double max = 0;
        double min = 0;

        double mmax = 0;
        double mmin = 0;


        //Доп точки для построения линии
        double x2;
        double x1;



        double startI = 0;
        double endI = 0;
        double differI = 0;
        if (minGraph == 1){
            //x1 = ((maxGraphic.getHeight()-151) / topQueue);
            //x1 = 100;
            if (usage == 0){
                startI = (Integer.parseInt(samplesNumber) * borderProp1X / 100) + maxSliderValue;
                endI = (Integer.parseInt(samplesNumber) * borderProp2X / 100) + maxSliderValue;
            }
            else {
                startI = v1;
                endI = v2;
            }

            //startI = v1;
            //endI = v2;
            //gstartI = startI;
            //gendI = endI;
     
            System.out.println(gstartI + " !-! " + gendI);
            
            differI = endI - startI;
        }
        else {
            //x1 = 0;
            //x2 = 0;
            startI = 1;
            endI = Integer.parseInt(samplesNumber)+1;
            differI = Integer.parseInt(samplesNumber)+1;
            //startI = v1;
            //endI = v2;
            //gstartI = startI;
            //gendI = endI;
        }

        //Находим максимальное и минимальное значение для текущего канала
        try {
        if (zoom == 1){
            if(nnumberOfGraphic > Integer.parseInt(channelsNumber)-1){
                for (int i = (int)startI; i < (int)endI; i++) {
                    y2 = Double.parseDouble(streamArray2[i][nnumberOfGraphic - Integer.parseInt(channelsNumber)]);
                    max = MaxNumber(y2,max);
                    min = MinNumber(y2,min);
                    mmax = max;
                    mmin = min;
                }
            }
            else {
                for (int i = (int)startI; i < (int)endI; i++) {
                    y2 = Double.parseDouble(streamArray[i][nnumberOfGraphic]);
                    max = MaxNumber(y2,max);
                    min = MinNumber(y2,min);
                    mmax = max;
                    mmin = min;
                }
            }
        }
        else {
            if(nnumberOfGraphic > Integer.parseInt(channelsNumber)-1){
                for (int i = 0; i < Integer.parseInt(samplesNumber); i++) {
                    //System.out.println("1)" + streamArray2[i][nnumberOfGraphic - Integer.parseInt(channelsNumber)]);
                    //System.out.println("2)" + i + " = " + (nnumberOfGraphic - Integer.parseInt(channelsNumber)));
                    y2 = Double.parseDouble(streamArray2[i][nnumberOfGraphic - Integer.parseInt(channelsNumber)]);
                    max = MaxNumber(y2,max);
                    min = MinNumber(y2,min);
                    mmax = max;
                    mmin = min;
                }
            }
            else {
                for (int i = 0; i < Integer.parseInt(samplesNumber); i++) {
                    y2 = Double.parseDouble(streamArray[i][nnumberOfGraphic]);
                    max = MaxNumber(y2,max);
                    min = MinNumber(y2,min);
                    mmax = max;
                    mmin = min;
                }
            }
        }
        }
        catch(NullPointerException e){
            System.err.print("Вылет в мин");
        }
        //Отнимаем общую часть
        max = max - min; 

        
        //Инициализируем начальные точки
        if (minGraph == 1){
            x1 = (1 * (graphicWidth)) / (differI) + marginRight;
            //y1 = (1 * (graphicWidth)) / (differI) + marginRight;;
        }
        else {
            //x1 = (1 * (graphicWidth)) / Integer.parseInt(samplesNumber) + marginRight;
            x1 = 0;
        }
        
        int firstLine = 1;
        
        int count = 1;
        //Цикл для кол-ва измерений
        for (int i = ((int)startI); i < ((int)endI - 1); i++) {
        //while ()

            if (nnumberOfGraphic > Integer.parseInt(channelsNumber)-1){
                if (i - 1 > -1){
                    //Считываем значение
                    y2 = Double.parseDouble(streamArray2[i-1][nnumberOfGraphic - Integer.parseInt(channelsNumber)]);
                }
            }
            else {
                if (i - 1 > -1){
                    //Считываем значение
                    y2 = Double.parseDouble(streamArray[i-1][nnumberOfGraphic]);
                }
            }



            //Отнимаем общую часть
            y2 = y2 - min;

            //Бахаем пропорцию
            y2 = ((y2 * graphicHeight + 20) / max);


            //В нормальных графиках числа идут так (снизу)0..100(сверху)
            //а в графике наоборот (сверху)0..100(снизу)
            //Переворачиваем
            y2 = graphicHeight - y2;

            //Ширина графика, так же пропорция, но с текущей шириной фрейма
            if (minGraph == 1){
                x2 = (count * (graphicWidth)) / (differI) + marginRight;
            }
            else {
                x2 = (i * (graphicWidth)) / Integer.parseInt(samplesNumber) + marginRight;
            }
            
            
            
            
            g.setColor(Color.MAGENTA);
            if (firstLine == 1){
                if (minGraph == 1){
                    g.drawLine((int)x2, (int)y2 + ((graphicHeight + 7) * numberInQueue) + 31 + marginTop, (int)x2, (int)y2 + ((graphicHeight + 7) * numberInQueue) + 31 + marginTop);
                }
                else {
                    g.drawLine((int)x2+12, (int)y2 + ((graphicHeight) * numberInQueue) + marginTop + 10, (int)x2+12, (int)y2 + ((graphicHeight) * numberInQueue) + marginTop + 10); 
                }
                firstLine = 0;
            }
            else {
                if (minGraph == 1){
                    g.setColor(Color.MAGENTA);
                    g.drawLine((int)x1, (int)y1 + ((graphicHeight + 7) * numberInQueue) + 31 + marginTop, (int)x2, (int)y2 + ((graphicHeight + 7) * numberInQueue) + 31 + marginTop);
                    if (intSupportDot == 1){
                        g.setColor(Color.RED);
                        g.fillOval((int)x1 - 4, (int)y1 + ((graphicHeight + 7) * numberInQueue) + 31 + marginTop - 4, 8, 8);
                    }
                }
                else {
                    g.drawLine((int)x1+12, (int)y1 + ((graphicHeight) * numberInQueue) + marginTop + 10, (int)x2+12, (int)y2 + ((graphicHeight) * numberInQueue) + marginTop + 10); 
                }
            }


            //g.drawRect(1, (graphicPadding*i) + marginTop, (graphicPadding*i) + marginTop, 1);
            //Линии графика          





            g.setColor(Color.BLACK);
            //Эти точки, чтобы линии шли последовательно
            x1 = x2;
            y1 = y2;
            count++;
        }

        if (supportLine == 1){
            int x11 = (((graphicHeight + 7) * numberInQueue) + 31 + marginTop);
            int x22 = ((((graphicHeight + 7) * (numberInQueue + 1)) + 31 + marginTop) - 7);
            int x33 = (x11 + x22) / 2;
            int x44 = (x11 + x33) / 2;
            int x55 = (x22 + x33) / 2;
            int fontPadding = 5;
            
            int y22 = (int) mmin;
            int y11 = (int) mmax; 
            int y33 = (y11 + y22) / 2;
            int y44 = (y11 + y33) / 2;
            int y55 = (y22 + y33) / 2;


            g.setColor(Color.LIGHT_GRAY);
            g.drawLine(50, x11, maxGraphic.getWidth()-50, x11);
            g.drawLine(50, x44, maxGraphic.getWidth()-50, x44);
            g.drawLine(50, x33, maxGraphic.getWidth()-50, x33);
            g.drawLine(50, x55, maxGraphic.getWidth()-50, x55);
            g.drawLine(50, x22, maxGraphic.getWidth()-50, x22);
            
            
            int z11 = 51;
            int z22 = (maxGraphic.getHeight() - 60);
            
            int c11 = 100; //min
            int c22 = maxGraphic.getWidth() - 100; //max
            int c33 = (c11 + c22) / 2;
            int c44 = (c11 + c33) / 2;
            int c55 = (c22 + c33) / 2;
            
            g.drawLine(c11, z11, c11, z22);
            g.drawLine(c22, z11, c22, z22);
            g.drawLine(c33, z11, c33, z22);
            g.drawLine(c44, z11, c44, z22);
            g.drawLine(c55, z11, c55, z22);


        }
        if (minGraph == 1){
            int fontPadding = 5;
            int x11 = (((graphicHeight + 7) * numberInQueue) + 31 + marginTop);
            int x22 = ((((graphicHeight + 7) * (numberInQueue + 1)) + 31 + marginTop) - 7);
            int x33 = (x11 + x22) / 2;
            int x44 = (x11 + x33) / 2;
            int x55 = (x22 + x33) / 2;
            int y22 = (int) mmin;
            int y11 = (int) mmax; 
            int y33 = (y11 + y22) / 2;
            int y44 = (y11 + y33) / 2;
            int y55 = (y22 + y33) / 2;
            int z22 = (maxGraphic.getHeight() - 60);
            int c11 = 100; //min
            int c22 = maxGraphic.getWidth() - 100; //max
            int c33 = (c11 + c22) / 2;
            int c44 = (c11 + c33) / 2;
            int c55 = (c22 + c33) / 2;
            
            g.setColor(Color.BLACK);
            
            

            
            g.drawString(String.valueOf(Math.round(y11)), 30, x11 + fontPadding + 5);
            g.drawString(String.valueOf(Math.round(y44)), 30, x44 + fontPadding);
            g.drawString(String.valueOf(Math.round(y33)), 30, x33 + fontPadding);
            g.drawString(String.valueOf(Math.round(y55)), 30, x55 + fontPadding);
            g.drawString(String.valueOf(Math.round(y22)), 30, x22);

            long maxTimeDiffer = (long) ((1 / Double.parseDouble(samplingRate) *  Double.parseDouble(samplesNumber)) * 1000);
            long minTimeDiffer = (long) ((1 / Double.parseDouble(samplingRate) *  Double.parseDouble(samplesNumber)) * 1000);
            maxTimeDiffer = (maxTimeDiffer * borderProp2X) / 100;
            minTimeDiffer = (maxTimeDiffer * borderProp1X) / 100;
            long td2 = (maxTimeDiffer + minTimeDiffer) / 2;
            long td1 = (td2 + minTimeDiffer) / 2;
            long td3 = (td2 + maxTimeDiffer) / 2;
            
            g.drawString(calculateTime(minTimeDiffer), c11, z22 + fontPadding);
            g.drawString(calculateTime(td1), c44, z22 + fontPadding);
            g.drawString(calculateTime(td2), c33, z22 + fontPadding);
            g.drawString(calculateTime(td3), c55, z22 + fontPadding);
            g.drawString(calculateTime(maxTimeDiffer), c22, z22 + fontPadding);
            
        }
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();

        jPopupMenu1.setBackground(new java.awt.Color(153, 153, 255));
        jPopupMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPopupMenu1MousePressed(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPopupMenu1MouseClicked(evt);
            }
        });

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Превью графиков");
        setAlignmentX(0.1F);
        setAlignmentY(0.1F);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                formMouseMoved(evt);
            }
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                formMouseReleased(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 216, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 595, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    

    
    
    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_formMouseClicked

    public static boolean open = false;
    ActionListener actionListener = new ActionListener() {
                
                @Override
                public void actionPerformed(ActionEvent e) {
                    
                    if (open == false) {
                        jDesktopPane1.add(maxGraphic);
                        maxGraphic.show();
                        open = true;
                        
                    }
                    repaint();
                    boolean flag = false;
                    for (int i = 0; i<MaxGraphQueue.length; i++) {
                        if (MaxGraphQueue[i] == index) {
                            //System.out.println("такой график уже добавлен");
                            flag = true;
                        }
                    }
                    if (flag == false) {
                        maxGraphic.setSize(maxGraphic.getWidth()-1, maxGraphic.getHeight()-1);
                        maxGraphic.setSize(maxGraphic.getWidth()+1, maxGraphic.getHeight()+1);
                        MaxGraphQueue[topQueue] = index;
                        topQueue++;
                    }
                }
            };

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        usage = 0;
        if(test == 0) {
            
            JMenuItem osc = new JMenuItem("осцилограмма");
            osc.addActionListener(actionListener);
            jPopupMenu1.add(osc);
            
            jPopupMenu1.add("второй выбор");
            test = 1;
        }
        if(evt.getButton() == MouseEvent.BUTTON3){ 
            initAll();
            jPopupMenu1.show(this, evt.getPoint().x, evt.getPoint().y);
            
            //System.out.println("ПКМ");
            
            for (int i = 0; i < 20;i++){
                if(evt.getPoint().y > 31){
                    if(evt.getPoint().y > ((((minGraphic.getHeight() - 80) / calculateChannel()) * (i))) + 31 & evt.getPoint().y < ((((minGraphic.getHeight() - 80) / calculateChannel()) * (i + 1))) + 31){
                        //System.out.println("Текущий индекс равен = " + i);
                        index = i;
                    }
                }
            }
            repaint();
        }
        else {
            
            //System.out.print("ЛКМ");
            
            for (int i = 0; i < 20;i++){
                if(evt.getPoint().y > 31){
                    if(evt.getPoint().y > ((((minGraphic.getHeight() - 80) / calculateChannel()) * (i))) + 31 & evt.getPoint().y < ((((minGraphic.getHeight() - 80) / calculateChannel()) * (i + 1))) + 31){
                        System.out.println("Текущий индекс равен = " + i);
                        border1X = evt.getPoint().x;
                    }
                }
            }
        }
        repaint();
        borderProp1X = border1X * 100 / minGraphic.getWidth();
//        MaxSlider.setValue(0);
        
        


    }//GEN-LAST:event_formMousePressed

    private void jPopupMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPopupMenu1MouseClicked
        
    }//GEN-LAST:event_jPopupMenu1MouseClicked

    private void jPopupMenu1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPopupMenu1MousePressed
 
    }//GEN-LAST:event_jPopupMenu1MousePressed

    private void formMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseReleased
            if(evt.getPoint().y < 100 + topPadding && evt.getPoint().y > topPadding) {
                border2X = evt.getPoint().x;
            } 
            else {
                if(evt.getPoint().y < 200 + topPadding && evt.getPoint().y > topPadding) {
                    border2X = evt.getPoint().x;
                } 
                else {
                    if(evt.getPoint().y < 300 + topPadding && evt.getPoint().y > topPadding) {
                        border2X = evt.getPoint().x;
                    } 
                    else {
                        if(evt.getPoint().y < 400 + topPadding && evt.getPoint().y > topPadding) {
                            border2X = evt.getPoint().x;
                        } 
                        else {
                            if(evt.getPoint().y < 500 + topPadding && evt.getPoint().y > topPadding) {
                                border2X = evt.getPoint().x;
                            } 
                            else {
                                if(evt.getPoint().y < 600 + topPadding && evt.getPoint().y > topPadding) {
                                    border2X = evt.getPoint().x;
                                } 
                            }
                        }
                    }
                }
            }
            maxRepaint();
            borderProp2X = border2X * 100 / minGraphic.getWidth();
            usage = 0;
            repaint();
            
            


    }//GEN-LAST:event_formMouseReleased
    public static void modelRepaint() {
        modelFrame.setSize(modelFrame.getWidth(), modelFrame.getHeight());
        //System.out.println("МОДЕЛ РЕПЕИНТ");
    }
    
    
    public static void maxRepaint() {
        maxGraphic.setSize(maxGraphic.getWidth(), maxGraphic.getHeight());
        //System.out.println("МАКС РЕПЕИНТ");
    }
    
    
    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        border2X = evt.getPoint().x;
        repaint();
        maxRepaint();
    }//GEN-LAST:event_formMouseDragged

    private void formMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseMoved

    }//GEN-LAST:event_formMouseMoved


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPopupMenu jPopupMenu1;
    // End of variables declaration//GEN-END:variables
    
    @Override
    public void mouseClicked(MouseEvent e) {
    
    }

    public int test = 0;
    public int index;


    @Override
    public void mousePressed(MouseEvent e) {
       
    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        }

    @Override
    public void mouseExited(MouseEvent e) {
        }

    @Override
    public void mouseDragged(MouseEvent e) {
        }

    @Override
    public void mouseMoved(MouseEvent e) {
        }
   





}
