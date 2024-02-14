/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul3;

import java.awt.BorderLayout;//mengimport BorderLayout 
import java.awt.Color;//mengimport color
import java.awt.Container;//mengimport kelas container
import javax.swing.JButton;//mengimport kelas JButton 
import javax.swing.JFrame;//Mengimport kelas Jframe

/**
 *
 * @author ACER
 */
public class Ch14BorderLayoutSample extends JFrame {
     private static final int FRAME_WIDTH    = 300;//deklarasi variabel final tinggi frame 300 pixel 
    private static final int FRAME_HEIGHT   = 200;//deklarasi variabel final tinggi frame 200 pixel 
    private static final int FRAME_X_ORIGIN = 150;//deklarasi final letak frame
    private static final int FRAME_Y_ORIGIN = 250;//deklarasi final letak frame

    public static void main(String[] args) {
        Ch14BorderLayoutSample frame = new Ch14BorderLayoutSample();
        frame.setVisible(true);
    }
 public Ch14BorderLayoutSample(){
     Container contentPane;//deklarasi variabel contentPane bertipe container
        JButton   button1, button2, button3, button4, button5;//deklarasi variabel  button1, button2, button3, button4, button5 bertipe JButton 

        //mengatur Frame 
        setSize      (FRAME_WIDTH, FRAME_HEIGHT);//ukuran frame
        setTitle     ("Program Ch14BorderLayoutSample");//judul frame
        setLocation  (FRAME_X_ORIGIN, FRAME_Y_ORIGIN);//letak frame
        //mengatur content pane
        contentPane = getContentPane( );//membuat object contentPane
        contentPane.setBackground( Color.white );//mengatur warna background contentPane
        contentPane.setLayout(new BorderLayout());//mengatur layout contentPane sama dengan objeck borderLayout

        //membuat 4 button 
        button1 = new JButton("button 1");
        button2 = new JButton("button 2");
        button3 = new JButton("button 3");
        button4 = new JButton("button 4");
        button5 = new JButton("button 5");
        //menambahkan 4 button ke container dan mengatur lokasi nya
        contentPane.add(button1,BorderLayout.NORTH);//utara
        contentPane.add(button2,BorderLayout.SOUTH);//selatan
        contentPane.add(button3,BorderLayout.EAST);//timur
        contentPane.add(button4,BorderLayout.WEST);//barat
        contentPane.add(button5,BorderLayout.CENTER);//tengah

        setDefaultCloseOperation(EXIT_ON_CLOSE);//program akan keluar saat jendela di close 
  
 
 
 
 }
    
    
}
