/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul3;

import java.awt.Color;//mengimport color dari kelas awt
import java.awt.Container;//mengimport kelas container
import java.awt.GridLayout;//mengimport kelas gridLayout
import javax.swing.JButton;//mengimport kelas JButton
import javax.swing.JFrame;//Mengimport kelas JFrame 

/**
 *
 * @author ACER
 */
public class Ch14GridLayoutSample extends JFrame {
    private static final int FRAME_WIDTH    = 300;//deklarasi variabel final lebar frame 300 pixel 
    private static final int FRAME_HEIGHT   = 200;//deklarasi variabell final tinggi frame 200 pixel 
    private static final int FRAME_X_ORIGIN = 150;//deklarasi final letak frame
    private static final int FRAME_Y_ORIGIN = 250;//deklarasi final letak frame

    public static void main(String[] args) {
        Ch14GridLayoutSample frame = new Ch14GridLayoutSample();
        frame.setVisible(true);
    }
    
    public Ch14GridLayoutSample(){
        Container contentPane;//deklarasi variabel contentPane bertipe container
        JButton   button1, button2, button3, button4, button5;//membuat lima button bertipe JButton 

        //mengatur frame
        setSize      (FRAME_WIDTH, FRAME_HEIGHT);//ukuran frame
        setTitle     ("Program Ch14GridLayoutSample");//judulframe
        setLocation  (FRAME_X_ORIGIN, FRAME_Y_ORIGIN);//letak frame 
        //mengatur container
        contentPane = getContentPane( );//objek container 
        contentPane.setBackground( Color.white );//mengatur background
        contentPane.setLayout(new GridLayout(2,3));//mengatur layout contentPane dengan objeck gridLayout
        //membuat JButton 
        button1 = new JButton("button 1");
        button2 = new JButton("button 2");
        button3 = new JButton("button 3");
        button4 = new JButton("button 4");
        button5 = new JButton("button 5");
        //menambahkan JButton ke container 
        contentPane.add(button1);
       contentPane.add(button2);
        contentPane.add(button3);
        contentPane.add(button4);
        contentPane.add(button5);

        //porgram berhenti saat frame ditutup 
        setDefaultCloseOperation( EXIT_ON_CLOSE);


    
    }

}
