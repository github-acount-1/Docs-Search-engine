/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package SearchEngineLastPackage;
import java.awt.*;

import javax.imageio.IIOException;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Iterator;
import static javafx.scene.input.KeyCode.ENTER;
import javax.swing.*;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


import java.awt.Desktop;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.JScrollPane;
import java.util.StringTokenizer;
/**
 *
 * @author Belayneh
 */
//public class GUIMainCodeClass {
public class GUIMainCodeClass extends JFrame implements ActionListener, KeyListener,MouseListener{

    
    
    
    private JList<String> foundList;
    private JList<File> foundList2;
    private JList<String> foundListConcatBoth;
     
    public static JProgressBar pbar;
    
    public static JScrollPane scrollPane,sp,spp;
    
    public static JPanel panel,panel2;
    public static JLabel label,label2;
    public static JButton searchButton,openButton,button3,button4,exploreButton,clearButton,pauseButton,exploreButton2;
    public static JComboBox combobox1,combobox2,combobox3,pattern;
    public static JTextField text,text2;
    javax.swing.JLabel jLabel1 = new javax.swing.JLabel();
    JTextArea area=new JTextArea(1,30);;
    //JFrame frame=new JFrame("Search Engine");
    JFrame frame=new JFrame();
   //Font fonts = new Font("Times new(\" Roman", Font.BOLD, 14); 
 
    JLabel select;
    JPanel listPanel, okPanel,listPanel3;
    JPanel [] listPanel2;
    private JList list;
    private JList lists;
    public static ArrayList<String> arrl = new ArrayList<>();   
    public static  ArrayList<String> arrl2 = new ArrayList<>();
    public static ArrayList<String> arrlist = new ArrayList<>();   
    public static  ArrayList<String> arrlist2 = new ArrayList<>();
   public static  Iterator <String> iter=arrl2.iterator();
   public static ArrayList<String> arrlists2 = new ArrayList<String>();
   public static  Iterator <String> iterate=arrlists2.iterator();
   public static String file1,file2,file3,file4;
   public static int telme=0,counted=0,tel=0,progress=0,p=0;
   
   
   public static  File Test,Test2;
   public static String openfoundList="";
   public static int MY_MINIMUM=0;
  public static int MY_MAXIMUM=MainSearchControClass.progres;
   public static  boolean stop = false,selected=false;  
Container con=getContentPane();
 public GUIMainCodeClass(){
     super("Document Search Engine");
     setResizable(false);
      //System.out.println("in Gui "+progress);
   try{  
      
     setSize(980, 580);
     setDefaultCloseOperation(EXIT_ON_CLOSE);
        
     panel=new JPanel();      
      
     setLayout(new FlowLayout());
     //ImageIcon searchIcon = new ImageIcon("C:\\Users\\preffered customer\\Graphisoft\\Desktop\\2\\tool.png");
     ImageIcon searchIcon = new ImageIcon("C:\\Users\\Belayneh\\Pictures\\SplashScrn and\\SearchEngineLastProject\\put on\\tool.png");
     searchButton=new JButton(searchIcon);
        //System.out.println("you are22");
      openButton=new JButton("Open");
      
      //ImageIcon exploreIcon = new ImageIcon("C:\\Users\\preffered customer\\Graphisoft\\Desktop\\2\\hard-drive.png");
      ImageIcon exploreIcon = new ImageIcon("C:\\Users\\Belayneh\\Pictures\\SplashScrn and\\SearchEngineLastProject\\put on\\hard-drive.png");
      exploreButton=new JButton(exploreIcon);
      
      clearButton=new JButton("Clean up");
      pauseButton=new JButton("Wait");
      exploreButton2 = new JButton("Explore");
      
      jLabel1.setText("Files found:___________________________________________________________________________________________________________ ");
      jLabel1.setForeground(Color.GRAY);
      jLabel1.setFont(new Font("", Font.BOLD, 14));
      //openButton.setForeground(Color.blue);
      combobox1=new JComboBox();
      combobox1.setBackground(Color.WHITE);
      
      select=new JLabel("select file type");
      //combobox1.addItem(" --select--");
      combobox1.addItem(" ");
      //combobox1.addItem("All");
      combobox1.addItem("PDF");
      combobox1.addItem("TXT");
      combobox1.addItem("DOC");
      combobox1.addItem("XLS");
      combobox1.addItem("All");
      
      
     text=new JTextField();
     text.setBackground(Color.WHITE);
     text.setForeground(Color.DARK_GRAY);
     //Font fieldFont = new Font("Ubuntu",Font.PLAIN, 13);
     Font fieldFont = new Font("Ubuntu",Font.ITALIC, 13);
     //Font fieldFont = new Font("Microsoft (\"Himalaya",Font.PLAIN, 13);
     
     text.setFont(fieldFont);
     text.setBounds(20, 20, 300, 28);
     text.setToolTipText("Type Part or All of File Name");
     
     searchButton.setBounds(430, 20, 70, 28);
     searchButton.setBackground(Color.WHITE);
     searchButton.setToolTipText("Search");
     
     openButton.setBounds(20, 518, 80, 28);
     openButton.setFont(fieldFont);
     openButton.setBackground(Color.WHITE);
     openButton.setToolTipText("Open Selected File");
     //openButton.setForeground(Color.DARK_GRAY);
     
     exploreButton.setBounds(890, 20, 70, 28);
     exploreButton.setFont(fieldFont);
     exploreButton.setBackground(Color.WHITE);
     exploreButton.setToolTipText("File Explorer");
     
     exploreButton2.setBounds(810, 20, 70, 28);
     
     clearButton.setBounds(485, 17, 90, 30);
     pauseButton.setBounds(580, 17, 70, 30);
     jLabel1.setBounds(23, 45, 950, 25);
     
     
     select.setBounds(328, 10, 80, 10);
     combobox1.setBounds(325, 20, 95, 28);
     combobox1.setFont(fieldFont);
     combobox1.setToolTipText("Select File Type");

    
     con.add(text);
     con.add(select);
     con.add(jLabel1);
     con.add(searchButton);
     con.add(openButton);
     con.add(exploreButton);
     //con.add(exploreButton2);
     //con.add(clearButton);
     //con.add(pauseButton);
    
     con.add(combobox1);
     //con.setLocation(550,100);
     setLocation(200,60);
     try{   
         
         
     listPanel = new JPanel(new GridLayout(1,2));
     //listPanel.setBorder(BorderFactory.createTitledBorder("             Lists of result:"));//search result
        //*******************************************************
        
                   
            foundList = new JList<>(MainSearchControClass.listModel);//listModel
            foundList2 = new JList<>(MainSearchControClass.listModel2);//listModel 
                foundList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
                foundList2.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
                         sp=new JScrollPane();//foundList 
                         JScrollBar bar=sp.getVerticalScrollBar(); 
                         JScrollBar barr=sp.getHorizontalScrollBar();
                    JScrollPane sp1=new JScrollPane(foundList);//foundList
                          JScrollBar bar1=sp1.getVerticalScrollBar();
                          JScrollBar bar12=sp1.getHorizontalScrollBar();
                    JScrollPane sp2=new JScrollPane(foundList2);//foundList2
                        sp1.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);//get rid of 2nd scrollbar   
                        sp1.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
                          JScrollBar bar2=sp2.getVerticalScrollBar();
                          JScrollBar bar22=sp2.getHorizontalScrollBar();
                             bar1.setModel(bar2.getModel()); //<--------------synchronize
                             bar12.setModel(bar22.getModel());//<--------------synchronize
              
                
                
                
                   
                  listPanel.add(sp1);
                  listPanel.add(sp2); 
                    
        //*******************************************************
              
      foundList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
              listPanel.setBounds(20, 70, 950, 450);
              
     con.add(listPanel);
  
     }
     catch(NullPointerException et){
         System.out.println("NullPointerException!");
     }
  
     setLayout(null);
     
   }
   catch(Exception ex){
       System.out.println("error12!");//+ex.getMessage()
   }
   UIManager.put("ProgressBar.background", Color.BLACK); //colour of the background
   UIManager.put("ProgressBar.foreground", Color.RED);  //colour of progress bar

   UIManager.put("ProgressBar.selectionForeground", Color.red);
      UIManager.put("ProgressBar.selectionBackground", Color.green);
   pbar = new JProgressBar();
   pbar.setStringPainted(true);
   
    
      
     
          pbar.setStringPainted(true);
       //pbar.setName("Completed");
       pbar.setBounds(670, 518, 300, 24);
       con.add(pbar);
       //pbar.setBackground(Color.GREEN);
        super.addNotify();
        requestFocus();  
    combobox1.addActionListener(new ActionListener() {

         @Override
         public void actionPerformed(ActionEvent e) {
            try{
                   TestAllClass.makeDefPattern=0;
                
                String selected = (String)combobox1.getSelectedItem();
                if(selected.toString().equals("All")){
                       
                    TestAllClass.pattern="*.{PDF,TXT,DOC,XLS}";
                }  
                else if(selected.toString().equals("PDF")){
                    TestAllClass.pattern="*.PDF";
                   
                    } 
               else if(selected.toString().equals("TXT")){
                    TestAllClass.pattern="*.TXT";
                   
                    } 
                else if(selected.toString().equals("DOC")){
                    TestAllClass.pattern="*.DOC";
                   
                    } 
                else if(selected.toString().equals("XLS")){
                    TestAllClass.pattern="*.XLS";
                   
                    } 
                
            }
            catch(Exception et){
                
            } 
         }
     });    
        
    //Action Listener and action performed for Explore button
    
    
    exploreButton2.addActionListener(new java.awt.event.ActionListener() {
        @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                
                
                 try{
              //++TestAllClass.procesBreak;
              
              
              JFileChooser chooser;
               File file, directory;
                int status;
               chooser = new JFileChooser( );
               status = chooser.showOpenDialog(null);
             if (status == JFileChooser.APPROVE_OPTION) {
                   file = chooser.getSelectedFile();
               System.out.println("The name is: "+file.getName());
                   
              }
             }
             catch(Exception exep){
                 
             }
                
                
                
            }
        });
    
    
    
    
    
    
    
    pauseButton.addActionListener(new ActionListener() {

         @Override
         public void actionPerformed(ActionEvent e) {
           try{  
              stop=true;
             ++TestAllClass.procesPause;
             }
            catch(Exception exep){
                 
             }
             //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
         }
     });  
    exploreButton.addActionListener(new ActionListener() {

         @Override
         public void actionPerformed(ActionEvent e) {
           try{  
            
             JFileChooser fileChooser = new JFileChooser();
             int returnValue = fileChooser.showOpenDialog(null);
           if (returnValue == JFileChooser.APPROVE_OPTION) {
              File selectedFile = fileChooser.getSelectedFile();
                
                 MainSearchControClass.foundFile2From=selectedFile;
                    StringTokenizer st2 = new StringTokenizer(selectedFile.getName().toString());
                    MainSearchControClass.foundFileFrom=st2.nextToken("\\.");
                     
                        //TestAllClass.addOnJList();
              if(!Desktop.isDesktopSupported()){
                        System.out.println("Desktop is not supported");
                         // return;
                         }
                         
                        Desktop desktop = Desktop.getDesktop();
                          desktop.open(selectedFile);
              

                //System.out.println("It is 2: "+selectedFile.getName());
            }
           }
           catch(Exception excs){
               
           }
            
         }
     });
    
    clearButton.addActionListener(new ActionListener() {

         @Override
         public void actionPerformed(ActionEvent e) {
             stop = false;
             // Create a new Thread to do the counting
          Thread t = new Thread() {
           @Override
               public void run() {  // override the run() for the running behaviors       
            try{ 
                //int n1=Integer.parseInt(listPanel.getSize());
                //for(int p=0;p<MainSearchControlClass.listModel2.getSize();p++){
                //foundList.removeAll();
                //foundList2.removeAll();
                //listPanel.removeAll();
                listPanel.remove(p);
                //updateBar(0);
                pbar.setValue(0);
                   ++p;
                //}
                try {
                    sleep(1);  // milliseconds
                     }
                 catch (InterruptedException ex) {}   
                   
              }
            catch(Exception er){
                
              }
             //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
          }
         }; 
        t.start();  // call back run()    
       }
     });
        
   searchButton.addActionListener(new ActionListener() {

         @Override
         public void actionPerformed(ActionEvent e) {
             
          stop = false;
            // Create a new Thread to do the counting
          Thread t = new Thread() {
           @Override
               public void run() {  // override the run() for the running behaviors      
           
            try{
              
             if(!text.getText().isEmpty()){   
                     pbar.setValue(0);
                     //pbar.setStringPainted(true);
                  MainSearchControClass.input1=text.getText();
                 //TestAllClass.searchDocuments();
                 TestAllClass.searchDocuments(text.getText());
                 //pbar.setString("running...");
                  //pbar.setStringPainted(true);
              }
             else {
                 
                 text.setText("Please enter the search document here!");
               }
                     //Suspend this thread via sleep() and yield control to other threads.
                     // Also provide the necessary delay.
                     try {
                        sleep(10);  // milliseconds
                     } 
                     catch (InterruptedException ex) {}
             
              }
            catch(Exception ex){
                System.out.println("error in input!");
            }
             //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
         }
        }; 
        t.start();  // call back run() 
       }
     });
   
   openButton.addActionListener(new ActionListener() {

         @Override
         public void actionPerformed(ActionEvent e) {
             try{
                 //File[] name;
                 Object[] name;
                 Object[] name2; 
                  //System.out.println("counted is "+counted);
                  name =  foundList.getSelectedValues();
                  name2=foundList2.getSelectedValues();
                    //name2=foundList2.getSelectedValuesList();
                  Path pat;
                  int pi=0,pd=0;
                  Iterator<File>ite2=MainSearchControClass.fileGoten.iterator();
              
                
              if(!Desktop.isDesktopSupported()){
                        System.out.println("Desktop is not supported");
                         // return;
                         }
                     //if(selected==true){
                         
                        Desktop desktop = Desktop.getDesktop();
                        Desktop desktop2 = Desktop.getDesktop();
                         if(Test!=null){    
                          desktop.open(Test);
                            }
                         if(Test2!=null){  
                          desktop2.open(Test2);
                           }
            }
              
            catch(IOException ex){
                //System.out.println(ex.getMessage());//"error in input!"
            }
             //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
         }
     });
     foundList2.addMouseListener(new java.awt.event.MouseAdapter() {
         public void mouseClicked(java.awt.event.MouseEvent evt){
             //foundmouse(y);
             //foundList
             if(evt.getClickCount()==2){
                 try{
                     //selected =true;
                    System.out.println("You clicked me");
                      //selected =true;
                    if(!Desktop.isDesktopSupported()){
                        System.out.println("Desktop is not supported");
                         // return;
                         }
                     //if(selected==true){
                         
                        Desktop desktop = Desktop.getDesktop();
                             
                          desktop.open(Test);
                          
                       //}     
                    
                 }
                 catch(Exception es){
                     
                 }
             }
             
         }
     });
     foundList.addMouseListener(new java.awt.event.MouseAdapter() {
         public void mouseClicked(java.awt.event.MouseEvent evt){
             //foundmouse(y);
             //foundList
             if(evt.getClickCount()==2){
                 try{
                     //selected =true;
                    System.out.println("You clicked me");
                      //selected =true;
                    if(!Desktop.isDesktopSupported()){
                        System.out.println("Desktop is not supported");
                         // return;
                         }
                     //if(selected==true){
                         
                        Desktop desktop = Desktop.getDesktop();
                             
                          desktop.open(Test2);
                          
                       //}     
                    
                 }
                 catch(Exception es){
                     
                 }
             }
             
         }
     });
     
   /*  private void foundmouse(java.awt.Event.MouseEvent y){
               
     }*/
   
   foundList2.addListSelectionListener(new ListSelectionListener() {

         @Override
         public void valueChanged(ListSelectionEvent e) {
             
            try{ 
            //if(selected==true){    
                //selected=true;
             if(!e.getValueIsAdjusting()){
               
                Iterator<File>ite=foundList2.getSelectedValuesList().iterator();
                 
                 if(!Desktop.isDesktopSupported()){
                        System.out.println("Desktop is not supported");
                         // return;
                         }
                     //if(selected==true){
                         
                        Desktop desktop = Desktop.getDesktop();
                             Test=ite.next();
                          //desktop.open(ite.next());
                
                       //}     
                 }
               //}
            }
            catch(Exception exep){
             //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
           }
     }); 
    //foundList.addListSelectionListener(new ListSelectionListener()
   
    foundList.addListSelectionListener(new ListSelectionListener() {

         @Override
         public void valueChanged(ListSelectionEvent e) {
            try{ 
             if(!e.getValueIsAdjusting()){
                int p=0,q=0;
                 foundList.getSelectedValuesList();
                 //System.out.println(foundList.getComponent(n));
                //Iterator<File>ite=foundList2.getSelectedValuesList().iterator();
                Iterator<File>ite2=MainSearchControClass.fileGoten.iterator();
                for(int n=0;n<foundList.getSelectedValuesList().size();n++){
                for(int t=0;t<MainSearchControClass.listModel.getSize();t++){
                        
                  if(foundList.getSelectedValuesList().get(n).equals(MainSearchControClass.arrlis1.get(t))){ 
                                   
                      //System.out.println("selected now2 is! "+ClassOfMain.arrlis3.get(t));
                      if(!Desktop.isDesktopSupported()){
                        System.out.println("Desktop is not supported");
                        
                         }
                         //String ike=ite2.next().toString();
                     
                        Desktop desktop = Desktop.getDesktop();
                                 ++p;
                          //desktop.open(MainSearchControClass.arrlis3.get(t));
                           Test2=MainSearchControClass.arrlis3.get(t); 
                           //System.out.println("in found  "+foundList.getSelectedValuesList().get(n));
                           //System.out.println("in main  "+MainSearchControClass.arrlis1.get(t));
                        //}
                         // break;
                   }
                if(p!=0){     
                      break;  
                    }  
                }
               if(p!=0){     
                      break;  
                    } 
              }
             }
            }
            catch(Exception exep){
                
             //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
           }
     }); 
   
   //Focus listener and Adapter 
   text.addFocusListener(new FocusAdapter(){
       public void focusGained(FocusEvent evt) {
                jTextField1FocusGained(evt);
            }
            public void focusLost(FocusEvent evt) {
                jTextField1FocusLost(evt);
            }
            
            
            private void jTextField1FocusLost(java.awt.event.FocusEvent evt) {                                      
        // TODO add your handling code here:
         try {
            JTextField src = (JTextField)evt.getSource();
            if (src.getText().equals("") ){
                src.setText("\twhat are you looking for?");
            }
        } catch (ClassCastException ignored) {
            /* I only listen to JTextFields */
        }
    }
            
            private void jTextField1FocusGained(java.awt.event.FocusEvent evt) {                                        
        // TODO add your handling code here:
        try {
            JTextField src = (JTextField)evt.getSource();
            if (src.getText().equals("\twhat are you looking for?")) {
                src.setText("");
            }
        } catch (ClassCastException ignored) {
            /* I only listen to JTextFields */
        }
    }
            
            
   });
   
   
   
   text.addKeyListener(new KeyListener() {

         @Override
         public void keyTyped(KeyEvent e) {
             if(e.getSource().equals(ENTER)){
                    //ENTER=e.getKeyCode();
                              if(!text.getText().isEmpty()){   
                              
                               }
                             else {
                                    
                                    text.setText("Please enter the search document!");
                                 } 
             }
             
             //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
         }

         @Override
         public void keyPressed(KeyEvent e) {
            stop = false;
            // Create a new Thread to do the refreshing
          Thread t = new Thread() {
           @Override
               public void run() {  // override the run() for the running behaviors    
              try{
                   
                  //int codes=Integer.parseInt(e.getKeyCode());// KeyEvent.getKeyText(code)
            if(e.getKeyCode()==KeyEvent.VK_ENTER){      
            
                          if(!text.getText().isEmpty()){ 
                                   pbar.setValue(0);
                                   //pbar.setStringPainted(true);
                                MainSearchControClass.input1=text.getText();
                                //TestAllClass.searchDocuments();
                                TestAllClass.searchDocuments(text.getText());
                                 //System.out.println(13);
                                      //pbar.setString("running...");
                                        //pbar.setStringPainted(true);
                                repaint();
                               }
                             else {
                                  
                                    text.setText("Please enter the search documents!");
                                 } 
                     }
              
                    // Suspend this thread via sleep() and yield control to other threads.
                     // Also provide the necessary delay.
                     try {
                        sleep(10);  // milliseconds
                     }
                     catch (InterruptedException ex) {}
            
            }
            catch(Exception ex){
                System.out.println("error in input entering!");
            }
           }
        }; 
        t.start();  // call back run()   
             
             //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
         }

         @Override
         public void keyReleased(KeyEvent e) {
             if(e.getSource().equals(ENTER)){
                   
                            if(!text.getText().isEmpty()){   
                          
                               }
                             else {
                                    //text.setText(DocumentSearchEngine.input2);
                                    text.setText("Please enter the search document!");
                                 } 
             }
             
            // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
         }
     });
   
         
 }
 
  public static void updateBar(int newValue) {
      
    pbar.setValue(newValue);
    
   }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyTyped(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyReleased(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mousePressed(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
       
     
    
}

    

    

