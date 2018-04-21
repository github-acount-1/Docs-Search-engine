/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package SearchEngineLastPackage;
import java.io.*;
import java.nio.file.FileSystems;
import java.nio.file.FileVisitResult;
import static java.nio.file.FileVisitResult.CONTINUE;
//import static java.nio.file.FileVisitResult.CONTINUE;
import java.nio.file.Files;
import java.nio.file.FileVisitOption;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import javax.swing.filechooser.FileSystemView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.StringTokenizer;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;



/**
 *
 * @author Belayneh
 */
//public class MainSearchControClass {
public class MainSearchControClass extends SimpleFileVisitor<Path>{

  public static DefaultListModel<String> listModel = new DefaultListModel<>();
  public static DefaultListModel<String> listModel3 = new DefaultListModel<>();
  public static DefaultListModel<File> listModel2 = new DefaultListModel<>();
  public static ArrayList<String> arrl = new ArrayList<>();   
  public static  ArrayList<String> arrl2 = new ArrayList<>();
  public static ArrayList<String> arrlist = new ArrayList<>();   
  public static  ArrayList<String> arrlist2 = new ArrayList<String>();
   public static  Iterator <String> iter=arrl2.iterator();
   public static ArrayList<String> arrlis1 = new ArrayList<String>();
   public static ArrayList<String> arrlis2 = new ArrayList<String>();
   public static ArrayList<File> arrlis3 = new ArrayList<File>();
         public static ArrayList<String> arrlists = new ArrayList<String>();
         public static  Iterator <String> iterates=arrlists.iterator();
         public static ArrayList<File> fileGoten = new ArrayList<File>();
         public static  Iterator <File> iterFiles=fileGoten.iterator();
   public static String foundFile,foundFileFrom="",file1,file2,file3,file4; 
   public static int counter1=0,counter2=0,counter3=0,m=1,counter4=0,counter5=0,c=0,c2=0,c3=0,test=0,fin=0;
   public static String input1="",input2="";
   public static int finalTest = 0;
   private static String matcher1="",matche10="";
   public static char pz,pz2;
   public static String flm="fil";
 public static FileVisitOption options;
 private final PathMatcher matcher2;
 public static int numMatches = 0,progres=0,w=0,q=0;
   public static  File foundFile2,foundFile2From=null,fl,fileGet;
     public static String pater="";
     public static int finalTotal = 0;
    public MainSearchControClass(){
         matcher2=null;
         
     }
    public MainSearchControClass(String pattern,String fileName){    
         matcher2 = FileSystems.getDefault().getPathMatcher("glob:"+fileName+pattern);
         //matcher2 = FileSystems.getDefault().getPathMatcher("regex:"+patter);
        
         
     }
     
    public  void findSearch(Path file) throws FileNotFoundException  {
        //GUICodeClass guclass=new GUICodeClass();
        Scanner m=new Scanner(System.in);
        Path nameFound = file.getFileName();
        String tau="";
           //++w;
       //if (nameFound != null){ //To seach all file Type
        if (nameFound != null&& matcher2.matches(nameFound) ) {
            if(TestAllClass.procesBreak!=0){
                
                //break; 
               }
            numMatches++;
                //++w;
                TestAllClass.compose.add(file.toFile());
                
                 file1 = file.getFileName().toString();
                 file2=file.getParent().toString();
          
                //input1="Machine";
           finalTest=0;
          
 
        try{
                         //StringTokenizer st = new StringTokenizer(tau.substring(a));  
                                     pz=file2.charAt(0);
                               
                         StringTokenizer st = new StringTokenizer(file.getFileName().toString());       
                          foundFile=st.nextToken("\\.");
                         //StringTokenizer st2 = new StringTokenizer(foundFile2From.getName()); 
                          //foundFile=file.getFileName().toString();
                          
                             listModel.addElement(foundFile);
                               //foundFileFrom=st2.nextToken("\\.");//foundFile2From.getName();
                               //listModel.addElement(foundFileFrom);
                             listModel3.addElement(foundFile);
                          foundFile2=file.toFile();
                          //foundFile.concat(foundFile2.toString());
                             listModel2.addElement(foundFile2);
                             //listModel2.addElement(foundFile2From);
                             ++GUIMainCodeClass.counted;
                             fileGet=file.normalize().toFile();
                             fileGoten.add(file.normalize().toFile());
                                         
                              //arrlist.add(tau);     
           
                     ++finalTest;        
           
                     int we=0;
                  GUIMainCodeClass.pbar.setMinimum(0);
                  GUIMainCodeClass.pbar.setMaximum(500); //20343  
                  
                          ++we;
                     
              try {
                 SwingUtilities.invokeLater(new Runnable() {
                     
                  public void run() {
                   //GUICodeClass.updateBar(h);
                    GUIMainCodeClass.updateBar(w);
                   //GUICodeClass.pbar.setValue(progres);
               
                  }
                 });
                java.lang.Thread.sleep(10);
               }
              catch (InterruptedException e) {;}
           
            //   }
              if(we!=0){
               // break; 
               }
            // } 
          
             ++finalTest;        
             ++counter2;
                     
                          arrlis1.add(foundFile);
                          arrlis2.add(foundFile);
                          arrlis3.add(foundFile2);

        
        }
        catch(Exception es){
           //System.out.println("out of range error!"); 
        }
        
//       }
        //System.out.println("w2= "+w);//w2= 10343 
        ++w;
        }
        //++w;
        
   }
  /* void done() {
       
        System.out.println("Matched: " + numMatches);
        finalTotal = finalTotal + numMatches;
         //++w;  
   } */
   
  @Override
   public FileVisitResult visitFile(Path file0,
            BasicFileAttributes attrs) throws FileNotFoundException { //Very Crucial Method
        findSearch(file0);
        return CONTINUE;
    }

    // Invoke the pattern matching
    // method on each directory.
    @Override
    public FileVisitResult preVisitDirectory(Path dir,
            BasicFileAttributes attrs) throws FileNotFoundException {
        findSearch(dir);
        return CONTINUE;
    }

    @Override
    public FileVisitResult visitFileFailed(Path file, IOException exc) {
                //System.err.println(exc);
        return CONTINUE;
    }
     
          
        
    
}
    
    

