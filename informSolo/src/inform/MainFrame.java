/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inform;

import static inform.TextFrame.setTextToTextField;
import java.awt.Frame;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;

/**
 *
 * @author KLASTER
 */
@SuppressWarnings("serial")

public class MainFrame extends javax.swing.JFrame {

    public MainFrame() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jFrame2 = new javax.swing.JFrame();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenu10 = new javax.swing.JMenu();
        jMenu11 = new javax.swing.JMenu();

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
        setTitle("Рабочая область");
        setBounds(new java.awt.Rectangle(0, 0, 1280, 720));
        setMinimumSize(new java.awt.Dimension(2000, 1000));
        setSize(new java.awt.Dimension(1280, 720));

        jMenu1.setText("Ф1айл");

        jMenuItem1.setText("Открыть файл");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Инструменты");

        jMenuItem2.setText("Информация о сигнале");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuItem3.setText("Ввести min-max");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuBar1.add(jMenu2);

        jMenu4.setText("Моделирование");

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_1, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem4.setText("Задержанный единичный импульс ");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem4);

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_2, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem5.setText("Задержанный единичный скачок");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem5);

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_3, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem6.setText("Убывающая экспонента");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem6);

        jMenuItem7.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_4, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem7.setText("Синусоида с заданными амплитудой");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem7);

        jMenuItem8.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_5, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem8.setText("«Меандр» ");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem8);

        jMenuItem9.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_6, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem9.setText("«Пила» ");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem9);

        jMenuItem10.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_7, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem10.setText("Сигнал с экспоненциальной огибающей");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem10);

        jMenuItem11.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_8, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem11.setText("Сигнал с балансной огибающей");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem11);

        jMenuItem12.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_9, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem12.setText("Сигнал с тональной огибающей");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem12);

        jMenuBar1.add(jMenu4);

        jMenu5.setText("Фильтрация");
        jMenuBar1.add(jMenu5);

        jMenu6.setText("Анализ");
        jMenuBar1.add(jMenu6);

        jMenu7.setText("Настройки");
        jMenuBar1.add(jMenu7);

        jMenu10.setText("Справка");

        jMenu11.setText("О авторах");
        jMenu11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu11MouseClicked(evt);
            }
        });
        jMenu11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu11ActionPerformed(evt);
            }
        });
        jMenu10.add(jMenu11);

        jMenuBar1.add(jMenu10);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    //для вычисления времени не макс графике
    public static long timeMaxGraphic = 0;
    public static ArrayList timeMaxGraphicArray = new ArrayList();
    //сколько TextFrame открыто 
    public static int openFrameNow = 0;
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
    
    public static String [][] streamArray2;
    
    public static int suppArr = 0;
    public static int qwe = 1;
    
    public static String textToArea;
    public static String nameFiled = "nit";
    
    public String textInfo = "nit";
    
    //минимальное и максимальное значение, которое ввел пользователь
    public static int maxUserValue = 0;
    public static int minUserValue = 0;

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        
        JFileChooser fileopen = new JFileChooser();       
        fileopen.setDialogTitle("Выберите файл для загрузки");// выбрать название
        int ret = fileopen.showDialog(null, "Открыть файл");                
        if (ret == JFileChooser.APPROVE_OPTION) {
            File file = fileopen.getSelectedFile();
            //Чтение из файла
            nameFiled = file.getName();
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedReader bufferReader = null;
            try {
                bufferReader = new BufferedReader(new FileReader(file));
            } 
            catch (FileNotFoundException ex) {
            }

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
                                streamArray2 = new String [Integer.parseInt(samplesNumber)][50];
                                init();
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
            catch (IOException ex) {
            }

            jDesktopPane1.add(minGraphic);
            minGraphic.show();
            
           
            
//            graphFrame.setVisible(true);
//            graphFrame.setSize(200, (100 * Integer.parseInt(channelsNumber)) + 10);
//            maxGraphFrame.setVisible(true);
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    //рассчитывает значения временной шкалы на MaxGraphics
    @SuppressWarnings("unchecked")
    public static String calculateTime(long time){
        //подгоняем дату+время начала под формат
        startDate = startDate.replace("-", ".");
        String dateForFormat =  startDate + " " + startTime;
        
        //вот и формат, собственно
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy H:mm");  

        try {
            //переводим дату в формат date
            date = format.parse(dateForFormat);

        } catch (ParseException ex) {}
        
        SimpleDateFormat format2 = new SimpleDateFormat("H:mm:ss");
        
        cal.clear();

        //cal.setTimeInMillis(danilapidor);
        cal.setTimeInMillis(date.getTime() + time);
        //System.out.println("!_!_!_!_!__!_!_!_!__!_!__! " + cal.getTimeInMillis());
        //cal.setTimeInMillis(date.getTime());
        //System.out.println(date.getTime());

        return format2.format(cal.getTime());
        
    }
    
    @SuppressWarnings("unchecked")
    public static String thisTime(){
        //подгоняем дату+время начала под формат
        startDate = startDate.replace("-", ".");
        String dateForFormat = startTime;
        SimpleDateFormat format2 = new SimpleDateFormat("H:mm:ss");
        //вот и формат, собственно
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy H:mm");  

        try {
            //переводим дату в формат date
            date = format2.parse(dateForFormat);

        } catch (ParseException ex) {}
        

        
        cal.clear();

        //cal.setTimeInMillis(danilapidor);
        cal.setTimeInMillis(date.getTime());
        //System.out.println("!_!_!_!_!__!_!_!_!__!_!__! " + cal.getTimeInMillis());
        //cal.setTimeInMillis(date.getTime());
        //System.out.println(date.getTime());

        return cal.getTimeInMillis()+"";
        
    }
 
 
    public static int calculateChannel(){
        return Integer.parseInt(channelsNumber) + suppArr;
    }

    public void init(){
        for (int i = 0;i < Integer.parseInt(samplesNumber);i++){
            for (int j = 0;j < 15;j++){
                Random rand = new Random();
                //streamArray2[i][j] = Integer.toString(rand.nextInt(990) + 1);
                streamArray2[i][j] = Integer.toString(0);
            }
        }
    }


    public static Date date = null;

    
    //создаём объект класса Calendar и присваиваем ему наше время в миллисекундах
    public static Calendar cal = new Calendar() {

        @Override
        protected void computeTime() {
        }

        @Override
        protected void computeFields() {
        }

        @Override
        public void add(int field, int amount) {
        }

        @Override
        public void roll(int field, boolean up) {
        }

        @Override
        public int getMinimum(int field) {
            return 0;
        }

        @Override
        public int getMaximum(int field) {
            return 0;
        }

        @Override
        public int getGreatestMinimum(int field) {
            return 0;
        }

        @Override
        public int getLeastMaximum(int field) {
            return 0;
        }
    }; 
            
    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
       
        
        
        
        long someLongInt = ((long) (1 / Double.parseDouble(samplingRate) *  Double.parseDouble(samplesNumber)) * 1000);
//        cal.setTimeZone(TimeZone.getTimeZone("GMT+0"));
//        System.out.println("time zone: " + cal.getTimeZone());
//        System.out.println("someLongInt: " + someLongInt);
        cal.setTimeInMillis(someLongInt);
        
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy H:mm:ss.SSS");
//        timeMaxGraphic = cal.getTimeInMillis();
        System.out.println("Длительность : " + format.format(cal.getTimeInMillis()-36000000));
        String dlit = format.format(cal.getTimeInMillis()-36000000);
        timeMaxGraphic = someLongInt;
         
        startDate = startDate.replace("-", ".");
        String dateForFormat =  startDate + " " + startTime;
        
        
        SimpleDateFormat format1 = new SimpleDateFormat("dd.MM.yyyy H:mm:ss.SSS");
                      
//        System.out.println("startDate.replace " + dateForFormat );       
        try {
            date = format1.parse(dateForFormat);
        } catch (ParseException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        //System.out.println("date: " + date);
        
        
//        System.out.println("date.getTime(): " + date.getTime());
        long endDate = date.getTime() + someLongInt;
        
        cal.setTimeInMillis( endDate);
        SimpleDateFormat format3 = new SimpleDateFormat("dd.MM.yyyy H:mm:ss.SSS");
        
        //System.out.println("Дата окончания:  " + format3.format(cal.getTime()));
        
        //System.out.println("Длительность:  " + dlit);
        String nameChanels = "";
        for(int i = 0; i < channelsNames.length; i++){
            int j = i +1;
            nameChanels += j + ") " +channelsNames[i] + "\n";
        }
        
       
        textInfo = "Общее число каналов: " + channelsNumber + "\n" +
                      "Общее количество отсчетов: " +  samplesNumber + "\n" +
                      "Частота дискретизации: " + samplingRate + "\n" + 
                      "Дата и время начала записи: " + startDate + " " + startTime + "\n" + 
                      "Дата и время окончания записи: " + format3.format(cal.getTime()) + "\n" + 
//                      "Длительность: " + dlit + "\n" +
                      "Имя каналов: " + "\n" + nameChanels + "\n" + 
                      "Имя файла: " + nameFiled;
        
        int widht = 500;
        int height = 300;
        
        autorsFrame.setSize(widht, height); 
        autorsFrame.setVisible(true);
        autorsFrame.setTitle("Информация о сигнале");
//      посылаем строку и размер текстового поля (не фрейма!)
        setTextToTextField(textInfo, widht, height);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenu11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu11ActionPerformed
        
    }//GEN-LAST:event_jMenu11ActionPerformed

    private void jMenu11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu11MouseClicked
//      устанавливаем размер окна (фрейма)
        int widht = 250;
        int height = 186;
        autorsFrame.setSize(widht, height);
        autorsFrame.setTitle("Авторы");
        autorsFrame.setVisible(true);
//      посылаем строку и размер текстового поля (не фрейма!)
        setTextToTextField("\nБаян Евгений\nДаниленко Данила\n\n\n\n\n\n\nБ8319а, 2016 год",widht, height);
    }//GEN-LAST:event_jMenu11MouseClicked

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        userMinMaxFrame.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        modelFrame.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        modelFrame2.setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        modelFrame3.setVisible(true);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        modelFrame4.setVisible(true);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        modelFrame5.setVisible(true);
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        modelFrame6.setVisible(true);
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        modelFrame7.setVisible(true);
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    
    public static double FPS = 2;
    
    public static Frame autorsFrame = new TextFrame();
    public static Frame userMinMaxFrame = new UserMinMaxFrame();
    public static MinGraphics minGraphic = new MinGraphics();
    public static MaxGraphics maxGraphic = new MaxGraphics();
    public static ModelFrame41 modelFrame = new ModelFrame41();
    public static ModelFrame42 modelFrame2 = new ModelFrame42();
    public static ModelFrame43 modelFrame3 = new ModelFrame43();
    public static ModelFrame44 modelFrame4 = new ModelFrame44();
    public static ModelFrame45 modelFrame5 = new ModelFrame45();
    public static ModelFrame46 modelFrame6 = new ModelFrame46();
    public static ModelFrame47 modelFrame7 = new ModelFrame47();
    
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
                userMinMaxFrame.setVisible(false);
                autorsFrame.setVisible(false);
                modelFrame.setVisible(false);
                modelFrame2.setVisible(false);
                modelFrame3.setVisible(false);
                modelFrame4.setVisible(false);
                modelFrame5.setVisible(false);
                modelFrame6.setVisible(false);
                modelFrame7.setVisible(false);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
