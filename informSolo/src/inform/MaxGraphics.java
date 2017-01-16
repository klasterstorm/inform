/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inform;



import static inform.MainFrame.channelsNames;
import static inform.MainFrame.channelsNumber;
import static inform.MainFrame.maxGraphic;
import static inform.MainFrame.minGraphic;
import static inform.MainFrame.supChannelsNames;
import static inform.MainFrame.userMinMaxFrame;
import static inform.MinGraphics.Graphics;
import static inform.MinGraphics.border1X;
import static inform.MinGraphics.border2X;
import static inform.MinGraphics.borderProp1X;
import static inform.MinGraphics.borderProp2X;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import javax.swing.BorderFactory;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
/**
 *
 * @author KLASTER
 */
public class MaxGraphics extends javax.swing.JInternalFrame {

    public static int [] MaxGraphQueue;
    public static int topQueue;
    private static final long serialVersionUID = 1L;
    public static int zoomBool = 0;
    public static int intSupportLine = 1;
    
    
    public int maxLine1 = 0;
    public int maxLine2 = 0;
    public int maxLineY = 0;
    
    public int maxZoom = 0;
    
    
    
    public MaxGraphics() {
        initComponents();
        MaxGraphQueue = new int [10];
        topQueue = 0;
        for (int i = 0; i < MaxGraphQueue.length; i++){
            MaxGraphQueue[i] = -99;
        }

            
    }
    

    
    public static void minRepaint() {
        minGraphic.setSize(minGraphic.getWidth(), minGraphic.getHeight());
        //System.out.println("МИН РЕПЕИНТ");
    }
    
    
    public void fillScreen(Graphics g){
        g.setColor(Color.white);
        g.fillRect(15, 31, maxGraphic.getWidth() - 30, maxGraphic.getHeight() - 70);
        g.setColor(Color.black);
    }
    
    public static void Cage(Graphics g, int width,int height) {
        for (int i = 0; i < topQueue; i++){
            g.setColor(Color.GRAY);
            g.drawRect(100, (i * (height + 7)) + 51, width, height);
            g.setColor(Color.BLACK);
        }
    }
    
    
    public static double maxSliderValue;
    public int xline1 = 0;
    public int xline2 = 0;
    
    public void paint(Graphics g){
        super.paint(g);
        fillScreen(g);
        for (int i = 0; i < topQueue;i++){
            //Отрисовка графика
            Graphics(g,MaxGraphQueue[i],i,maxGraphic.getWidth()-200,((maxGraphic.getHeight()-151)/topQueue),20,20,1,100,zoomBool,intSupportLine);   
            Cage(g,maxGraphic.getWidth()-200,((maxGraphic.getHeight()-151)/topQueue));
            
            //Названия каналов
            if(MaxGraphQueue[i] > Integer.parseInt(channelsNumber)-1){
                //supChannelsNames[MaxGraphQueue[i]]
                System.out.println(i + " {+} " + MaxGraphQueue[i] + " {+} " + Integer.parseInt(channelsNumber) + " {+} " +  (i - Integer.parseInt(channelsNumber)));
                g.drawString(supChannelsNames[MaxGraphQueue[i] - Integer.parseInt(channelsNumber)], maxGraphic.getWidth()-80, (((maxGraphic.getHeight() - 130)/topQueue) * (i + 1)) + 31);
            }
            else {
                g.drawString(channelsNames[MaxGraphQueue[i]], maxGraphic.getWidth()-80, (((maxGraphic.getHeight() - 130)/topQueue) * (i + 1)) + 31);
            }


        }
        
        if (0 == topQueue) {
            g.drawString("Нет активных графиков", (maxGraphic.getWidth() / 2) - 80, maxGraphic.getHeight() / 2);     
        }
        
        //System.out.println(maxLine1 + " MaxLine " + maxLineY);
        if (maxLine1 > 100 & maxLine2 > 100){
            if (maxZoom == 1){
                g.drawLine(maxLine1, 100, maxLine1, ((maxGraphic.getHeight() - 151)));
                g.drawLine(maxLine2, 100, maxLine2, ((maxGraphic.getHeight() - 151)));
            }
        }

        


        //jToolBar1.repaint();
        //maxSliderValue = MaxSlider.getValue();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popUpMenu = new javax.swing.JPopupMenu();
        menuPopUp = new javax.swing.JPopupMenu();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jSeparator1 = new javax.swing.JSeparator();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jRadioButtonMenuItem2 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem3 = new javax.swing.JRadioButtonMenuItem();
        jCheckBoxMenuItem3 = new javax.swing.JCheckBoxMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jToolBar1 = new javax.swing.JToolBar();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        popUpMenu.setBackground(new java.awt.Color(51, 51, 255));

        menuPopUp.setBackground(new java.awt.Color(204, 204, 204));

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        jRadioButtonMenuItem2.setSelected(true);
        jRadioButtonMenuItem2.setText("jRadioButtonMenuItem2");

        jRadioButtonMenuItem3.setSelected(true);
        jRadioButtonMenuItem3.setText("jRadioButtonMenuItem3");

        jCheckBoxMenuItem3.setSelected(true);
        jCheckBoxMenuItem3.setText("jCheckBoxMenuItem3");

        jMenuItem3.setText("jMenuItem3");

        setClosable(true);
        setForeground(new java.awt.Color(51, 0, 153));
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Осциллограмма");
        setToolTipText("Осциллограмма");
        setAutoscrolls(true);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosed(evt);
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                formMouseReleased(evt);
            }
        });

        jToolBar1.setRollover(true);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inform/1.png"))); // NOI18N
        jButton1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton1);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inform/2.png"))); // NOI18N
        jButton2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton2.setFocusable(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton2);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inform/3.png"))); // NOI18N
        jButton3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton3.setFocusable(false);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(779, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(448, Short.MAX_VALUE)
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    public int test = 0;
    public int index;
    
    ActionListener deleteGraphicsListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (topQueue != 0) {
                for (int h = index; h<MaxGraphQueue.length-1; h++) {
                    MaxGraphQueue[h] = MaxGraphQueue[h+1];
                }
                MaxGraphQueue[topQueue] = -99;
                topQueue--;
                repaint();
                minRepaint();
            } 
            else {
                //System.out.println("графиков нет");
            }
        }

    };
    
    ActionListener localListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            global.setSelected(false);
            local.setSelected(true);
            user.setSelected(false);
            zoomBool = 1;
            repaint();
        }

    };
    
    ActionListener globalListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            global.setSelected(true);
            local.setSelected(false);
            user.setSelected(false);
            zoomBool = 0;
            repaint();
        }

    };
    
    ActionListener userListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            global.setSelected(false);
            local.setSelected(false);
            user.setSelected(true);
            userMinMaxFrame.setVisible(true);
        }

    };
    
    public static JRadioButtonMenuItem local;
    public static JRadioButtonMenuItem global;
    public static JRadioButtonMenuItem user;
            
       
    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
       //System.out.println("formMousePressed на MaxGraphics");
       if(test == 0) {
            local = new JRadioButtonMenuItem("локальный масштаб");
            global = new JRadioButtonMenuItem("глобальный масштаб");
            user = new JRadioButtonMenuItem("задать масштаб");
            global.setSelected(true);
                    
            JMenuItem osc = new JMenuItem("закрыть");
            osc.addActionListener(deleteGraphicsListener);
            
            local.addActionListener(localListener);
            global.addActionListener(globalListener);
            user.addActionListener(userListener);
            
            menuPopUp.add(global);
            menuPopUp.add(local);
            menuPopUp.add(user);
            menuPopUp.add(osc);
            test = 1;
        }
        int paddingTop = 41;
        int marginTop = 7;
        if(evt.getButton() == MouseEvent.BUTTON3){ 
            //System.out.println("formMousePressed на MaxGraphics = ПКМ");
            menuPopUp.show(this, evt.getPoint().x, evt.getPoint().y);

            for (int i = 0; i < 20;i++){
                if(evt.getPoint().y > 31){
                    if(evt.getPoint().y > (i * (((maxGraphic.getHeight()-151)/topQueue) + 7)) + 51 & evt.getPoint().y < ((i+1) * (((maxGraphic.getHeight()-151)/topQueue) + 7)) + 51){
                        //System.out.println("MAX - Текущий индекс равен = " + i);
                        index = i;
                    }
                }
            }


            //System.out.println("index: " + index);
//            repaint();
        }
        else {
            for (int i = 0; i < 20;i++){
                if(evt.getPoint().y > 31){
                    if(evt.getPoint().y > (i * (((maxGraphic.getHeight()-151)/topQueue) + 7)) + 51 & evt.getPoint().y < ((i+1) * (((maxGraphic.getHeight()-151)/topQueue) + 7)) + 51){
                        //maxLineY = ((((maxGraphic.getHeight()-131)/topQueue) * 1) + (1 * marginTop) + paddingTop);
                        maxLine1 = evt.getPoint().x;
                    }
                }
            }
            
            maxZoom = 1;
        }

        repaint();
        
        
        
        
        
    }//GEN-LAST:event_formMousePressed

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
        MinGraphics.open = false;
        jButton1Border = false;
        jButton2Border = false;
        jButton3Border = false;
        for (int i = 0; i<MaxGraphQueue.length; i++){
            MaxGraphQueue[i] = -99;
        }
    }//GEN-LAST:event_formInternalFrameClosed
    //нужны для рисования обводки у активной кнопки
    boolean jButton1Border = false;
    boolean jButton2Border = false;
    boolean jButton3Border = false;
    

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        Border emptyBorder = BorderFactory.createEmptyBorder(1, 1, 1, 1);
        Border lineBorder = BorderFactory.createLineBorder(Color.BLACK);
        
        if (jButton1Border == true){
            jButton1.setBorder(emptyBorder);
            jButton1Border = false;
            intSupportLine = 0;
        } else {
            jButton3.setBorder(emptyBorder);
            jButton2.setBorder(emptyBorder);
            jButton1.setBorder(lineBorder);
            jButton1Border = true;
            intSupportLine = 1;
        }
        repaint();
        
        jButton2Border = false;
        jButton3Border = false;
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Border emptyBorder = BorderFactory.createEmptyBorder(1, 1, 1, 1);
        
        if (jButton2Border == true){
            jButton2.setBorder(emptyBorder);
            jButton2Border = false;
        } else {
            jButton1.setBorder(emptyBorder);
            jButton3.setBorder(emptyBorder);
            jButton2.setBorder(new LineBorder(Color.BLACK));
            jButton2Border = true;
        }
        
        jButton1Border = false;
        jButton3Border = false;
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Border emptyBorder = BorderFactory.createEmptyBorder(1, 1, 1, 1);
        
        if (jButton3Border == true){
            jButton3.setBorder(emptyBorder);
            jButton3Border = false;
        } else {
            jButton1.setBorder(emptyBorder);
            jButton2.setBorder(emptyBorder);
            jButton3.setBorder(new LineBorder(Color.BLACK));
            jButton3Border = true;
        }
        
        jButton2Border = false;
        jButton1Border = false;
    }//GEN-LAST:event_jButton3ActionPerformed

    private void formMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseReleased
        int paddingTop = 41;
        int marginTop = 7;
        
        for (int i = 0; i < 20;i++){
            if(evt.getPoint().y > 31){
                if(evt.getPoint().y > (i * (((maxGraphic.getHeight()-151)/topQueue) + 7)) + 51 & evt.getPoint().y < ((i+1) * (((maxGraphic.getHeight()-151)/topQueue) + 7)) + 51){
                    maxLineY = ((((maxGraphic.getHeight()-131)/topQueue) * 1) + (1 * marginTop) + paddingTop);
                    maxLine2 = evt.getPoint().x;

                    //System.out.println(" ========================= ");

                    //System.out.println("Глобальые ЗНАЧЕНИЯ " + border1X + " --- " + border2X);

                    int maxborderProp1X = ((maxLine1 - 100) * 100) / (maxGraphic.getWidth() - 100);
                    int maxborderProp2X = ((maxLine2 - 100) * 100) / (maxGraphic.getWidth() - 100);

                    int borderDiffer = border2X - border1X;
                    border1X = ((maxborderProp1X * borderDiffer) / 100) + border1X;
                    border2X = ((maxborderProp2X * borderDiffer) / 100) + border1X;

                    borderProp1X = border1X * 100 / minGraphic.getWidth();
                    borderProp2X = border2X * 100 / minGraphic.getWidth();
                    //System.out.println("Локальная ПРОПОРЦИЯ " + maxborderProp1X + " --- " + maxborderProp2X);
                    //System.out.println("Локальные ЗНАЧЕНИЯ " + border1X + " --- " + border2X);
                    //System.out.println(" ========================= ");
                    minRepaint();
                    maxZoom = 0;
                    repaint(); 
                }
            }
        }
        
    }//GEN-LAST:event_formMouseReleased

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        for (int i = 0; i < 20;i++){
            if(evt.getPoint().y > 31){
                if(evt.getPoint().y > (i * (((maxGraphic.getHeight()-151)/topQueue) + 7)) + 51 & evt.getPoint().y < ((i+1) * (((maxGraphic.getHeight()-151)/topQueue) + 7)) + 51){
                    maxLine2 = evt.getPoint().x;
                    repaint();
                }
            }
        }
    }//GEN-LAST:event_formMouseDragged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem3;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem2;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JToolBar jToolBar1;
    public static javax.swing.JPopupMenu menuPopUp;
    private javax.swing.JPopupMenu popUpMenu;
    // End of variables declaration//GEN-END:variables
}
