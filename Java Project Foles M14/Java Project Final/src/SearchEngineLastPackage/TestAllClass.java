/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package SearchEngineLastPackage;
import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
//import java.net.URL;
import java.nio.file.Files;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.SwingUtilities;
import javax.swing.UnsupportedLookAndFeelException;
/**
 *
 * @author Belayneh
 */
public class TestAllClass {
public static int num=0,procesBreak=0,procesPause=0,makeDefPattern=10; 
   public static File[] takes=null;
   public static ArrayList<File> compose=new ArrayList<File>();
   public static  Iterator <File> iterCompose=compose.iterator();
   public static String read="",pattern="";
  public static String[] FoundList;
  public static  File[] fln;
  
  public TestAllClass(){
      
  }
  
  public static void splashScreen()
  {
       // <editor-fold defaultstate="collapsed" desc="SPLASH SCREEN"> 
         JWindow window = new JWindow();
         window.getContentPane().add(
         //new JLabel("", new ImageIcon("C:\\Users\\preffered customer\\Graphisoft\\Desktop\\2\\splash5.gif"), SwingConstants.CENTER));
        new JLabel("", new ImageIcon("C:\\Users\\Belayneh\\Pictures\\SplashScrn and\\SearchEngineLastProject\\put on\\splash5.gif"), SwingConstants.CENTER)); 
         window.setBounds(400, 190, 600, 400);
         window.setVisible(true);
            try {
                Thread.sleep(5500);
                //Thread
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
                window.setVisible(false);
                window.dispose();// </editor-fold>
  }
  
  public static void lookFeel()
  {
       // <editor-fold defaultstate="collapsed" desc="NIMBUS LOOK AND FEEL"> 
      for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {//Windows
                    try {
                        javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    } catch (ClassNotFoundException ex) {
                        Logger.getLogger(TestAllClass.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (InstantiationException ex) {
                        Logger.getLogger(TestAllClass.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (IllegalAccessException ex) {
                        Logger.getLogger(TestAllClass.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (UnsupportedLookAndFeelException ex) {
                        Logger.getLogger(TestAllClass.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    break;
                }
            }// </editor-fold>
  }
  
  public static void main(String[] args) throws FileNotFoundException, IOException {
      
      splashScreen();
      lookFeel();
      
      try{
       GUIMainCodeClass guclass=new GUIMainCodeClass();
           
     guclass.setVisible(true);
     guclass.setDefaultCloseOperation(EXIT_ON_CLOSE);
         //searchDocuments();
      }
      catch(Exception excep){
          
      }
  }
  public static void searchDocuments(String fileName){
    //if(procesBreak!=0){  
    
    
            
    
     try{
            
                   //String pattern="";  
                  fln=File.listRoots();
                  //System.out.println("fileSystem root is  "+fln);
                for(File pa1:fln){
                    if(procesBreak!=0){
                        //break;
                        //System.exit(0);
                       }
                    if(makeDefPattern!=0){
                        pattern="*.{TXT,PDF,DOC,WPD,XLS,XLW}";
                        //System.out.println("Now pattern is  "+pattern);
                      }
                    
                    //System.out.println("fileSystem root is  "+pa1);
                      MainSearchControClass.finalTest=0;
                       String str = pa1.toString();
                       //String slash = "\\";
                       String slash = "\\";
                            
                       String s = new StringBuilder(str).append(slash).toString();
                             //GUIMainCodeClass.pbar.setString("running...");
                        Path startingDir = Paths.get(s);
                      
                     MainSearchControClass javaap=new MainSearchControClass(pattern,fileName);
                      Files.walkFileTree(startingDir,javaap);
                      
                
              }  
            }
            catch(IOException ex){
                System.out.println("error from input action!");
            }
             //throw new Uns
         if(MainSearchControClass.q<MainSearchControClass.w){//100343//20343
            try {
             
                      GUIMainCodeClass.pbar.setMinimum(0);
                       GUIMainCodeClass.pbar.setMaximum(MainSearchControClass.w);
                     SwingUtilities.invokeLater(new Runnable() {
                      @Override
                      public void run() {
                        GUIMainCodeClass.updateBar(MainSearchControClass.w);
                                //GUIMainCodeClass.pbar.setString("running...");
                                 //GUIMainCodeClass.pbar.setStringPainted(true);
                         //GUICodeClass.pbar.setValue(progres);
 //                         System.out.println("total search result2= "+MainSearchControClass.w); 
                        }
                      });
                      java.lang.Thread.sleep(10);
                      //}
                    }
                   catch (InterruptedException e) {;}     
             
            }
           
              GUIMainCodeClass.progress=0;
           
   }   
          
    
  public static void addOnJList( ){
     GUIMainCodeClass guclassAgain=new GUIMainCodeClass();
           
     guclassAgain.setVisible(true);
     guclassAgain.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
  }  
}
