/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul3;

import java.awt.Color;//mengimport kelas color 
import java.awt.Container;//mengimpor kelas container
import javax.swing.ButtonGroup;
import javax.swing.JButton;//mengimport kelas JButton
import javax.swing.JCheckBox;//mengimport kelas JCheckBox
import javax.swing.JFrame;;//mengimport kelas JFrame
import javax.swing.JLabel;//mengimport kelas JLabel 
import javax.swing.JRadioButton;//mengimport kelas JRadioButton 
import javax.swing.JTextField;//mengimport kelas JTextField

/**
 *
 * @author ACER
 */
public class Ch14AbsolutePositoning1 extends JFrame {
    private static final int FRAME_WIDTH = 600;//deklarasi final lebar 600 pixel
    private static final int FRAME_HEIGHT = 600;//deklarasi final tinggi 600 pixel 
    private static final int FRAME_X_ORIGIN = 300;//deklarasi final posisi 300 pixel 
    private static final int FRAME_Y_ORIGIN = 100;// deklarasi final posisi 100 pixel 
    private static final int BUTTON_WIDTH = 90;//deklarasi final lebar button 90 pixel 
    private static final int BUTTON_HEIGHT = 40;//deklarasi final tinggi button 40 pixel 
   private JButton cancelButton;//deklarasi cancel button  bertipe JButton
   private JButton okButton;//deklarasi okButton bertipe JButton
   private JTextField text;//deklarasi variabel text bertipe textField
   private JLabel nama,jenis,hobi;//deklarasi variabel nama, jenis, hobi bertipe JLabel
   private JTextField txtField;//deklarasi txtField bertipe text field
   private JRadioButton buttonL, buttonP;//deklarasi variabel buttonL dan buttonP bertipe JButton
   private ButtonGroup group;//deklarasi variabel group bertipe ButtonGrub
   private JCheckBox check;//deklarasi variabel check bertipe JCheckBox
   
   public static void main(String[] args){
       //kelas main 
       Ch14AbsolutePositoning1 frame = new Ch14AbsolutePositoning1();
       frame.setVisible(true);
   
   
   
   }
  public Ch14AbsolutePositoning1(){
      Container contentPane = getContentPane();//membuat objek contentPane
      setSize(FRAME_WIDTH,FRAME_HEIGHT);//mengatur ukuran frame
      setResizable(true);//mengizinkan jendela untuk dapat diubah ukurannya
      setTitle ("Program Ch14AbsolutePositioning");//memberi judul
      setLocation(FRAME_X_ORIGIN,FRAME_Y_ORIGIN);//mengatur lokasi 
      //mengatur contentPane
      contentPane.setLayout(null);//mengatur layout 
      contentPane.setBackground(Color.white);//mengatur warna
      //membuat JLabel nama dan mengatur ukuran dan lokasi 
       nama = new JLabel("Nama : ");
       nama.setBounds(20, 30, 150, 30);
       //membuat JTextField dan mengatur ukuran dan lokasi 
       text = new JTextField(20);
       text.setBounds(120, 30, 300, 30);
       //menambahkan JLabel nama dan JtextField text ke container
       contentPane.add(nama);
       contentPane.add(text);
       //membuat buttongroup
       group = new ButtonGroup();
       //membuat JLabel jenis dan Jradio button jenis kelamin buttonL dan buttonP mengatur ukuran dan lokasi 
       jenis=new JLabel("Jenis Kelamin : ");
       jenis.setBounds(20, 70, 150, 30);
       buttonL = new JRadioButton("Laki-Laki");
       buttonL.setBounds(120, 70, 150, 30);
       buttonP = new JRadioButton("Perempuan");
       buttonP.setBounds(290, 70, 150, 30); 
       //menambahkan radio button ke button group 
       group.add(buttonL);
       group.add(buttonP);
       //menmabhkan label jenis buttonL dan ButtonP ke container 
       contentPane.add(jenis);
       contentPane.add(buttonL);
       contentPane.add(buttonP);
      //membuat Jlabel hobi mengatur ukuran dan lokasi nya
        jenis=new JLabel("Hobi : ");
        jenis.setBounds(20, 120, 150, 30);
        contentPane.add(jenis);
       int tinggi=120;//deklarasi variabel tinggi int
       String[] hoby = {"Olahraga","Shopping","Computer Games","Nonton Bioskop"};//membuat array String hobi 
       //menyetak ukuran check box mengunakan perulangan dengan menjadikan setiap element array di array hobi 
       //menjadi check box
       //setiap perulangan akan mencetak check box dengantinggi yang berbeda berjarak 120 pixel 
       //dan memasukan nya kedalambutton group dan memasukan kedalam container
        for (int i = 0; i < hoby.length; i++) {
            check = new JCheckBox(hoby[i]);
            check.setBounds(120,tinggi , 150, 30);
            group.add(check);
            contentPane.add(check);
            tinggi+=38;
             
        }
      
      
      
       //membuat dan mengatur lokasi button 
      okButton = new JButton("Ok");
      okButton.setBounds(200,500, BUTTON_WIDTH,BUTTON_HEIGHT);
      
      contentPane.add(okButton);//menambahkan ok button di container
      
      cancelButton=new JButton("CANCEL");
      cancelButton.setBounds(300, 500, BUTTON_WIDTH, BUTTON_HEIGHT);
   
      contentPane.add(cancelButton);//menambahkan cancel button di container
       
      setDefaultCloseOperation(EXIT_ON_CLOSE);//mengatur agar program berhenti saat layar diclose
  
  
  
  }
    
}
