/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul3;

import java.awt.Color;//mengimport kelas color 
import java.awt.Container;//mengimpor kelas container
import javax.swing.JButton;//mengimport kelas JButton
import javax.swing.JFrame;//mengimport kelas JFrame
import javax.swing.JTextField;//mengimport kelas JTextField

/**
 *
 * @author ACER
 */
public class Ch14AbsolutePositoning extends JFrame {
    private static final int FRAME_WIDTH = 600;//deklarasi final lebar 600pixel 
    private static final int FRAME_HEIGHT = 600;//deklarasi final tinggi 600 pixel 
    private static final int FRAME_X_ORIGIN = 300;//deklarasi final posisi 300 pixel 
    private static final int FRAME_Y_ORIGIN = 100;//deklarasi final posisi 100 pixel 
    private static final int BUTTON_WIDTH = 80;//deklarasi final lebar button 
    private static final int BUTTON_HEIGHT = 40;//deklarasi final tinggi button 
   private JButton cancelButton;//deklarasi variabel cancel button 
   private JButton okButton;//deklarasi variabel okButton 
   private JTextField txtField;//deklarasi variabel txtField 
   
   public static void main(String[] args){
       //kelas main 
       Ch14AbsolutePositoning frame = new Ch14AbsolutePositoning();
       frame.setVisible(true);
   
   
   
   }
  public Ch14AbsolutePositoning(){
      Container contentPane = getContentPane();//membuat objek container dengan nama content pane
      setSize(FRAME_WIDTH,FRAME_HEIGHT);//mengeset ukuran frame
      setResizable(true);//Mengizinkan jendela untuk dapat diubah ukurannya 

      setTitle ("Program Ch14AbsolutePositioning");//memberi judul 
      setLocation(FRAME_X_ORIGIN,FRAME_Y_ORIGIN);// mengatur lokasi frame
      //mengeset contentPane
      contentPane.setLayout(null);//mngeset layout
      contentPane.setBackground(Color.white);//mengeset warna
      
      //membuat dan mengatur lokasi button 
      okButton = new JButton("Ok");
     okButton.setBounds(200,500, BUTTON_WIDTH,BUTTON_HEIGHT);
      //okButton.setBounds(110,100, BUTTON_WIDTH,BUTTON_HEIGHT);
   
      contentPane.add(okButton);//menambahkan ok button di container
      
      cancelButton=new JButton("CANCEL");
      //cancelButton.setBounds(160, 100, BUTTON_WIDTH, BUTTON_HEIGHT);
       cancelButton.setBounds(300, 500, BUTTON_WIDTH, BUTTON_HEIGHT);
   
      contentPane.add(cancelButton);//menambahkan cancel button di container
      
      setDefaultCloseOperation(EXIT_ON_CLOSE);//mengatur agar program berhenti saat layar diclose
  
  
  
  }
    
}
