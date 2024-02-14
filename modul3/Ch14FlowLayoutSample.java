/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul3;

import java.awt.Color;//mengimport BorderLayout 
import java.awt.Container;//mengimport color
import java.awt.FlowLayout;//mengimport kelas container
import javax.swing.JButton;//mengimport kelas JButton 
import javax.swing.JFrame;//Mengimport kelas Jframe

/**
 *
 * @author ACER
 */
public class Ch14FlowLayoutSample extends JFrame {
    private static final int FRAME_WIDTH    = 800;//deklarasi variabel final tinggi frame 800 pixel 
    private static final int FRAME_HEIGHT   = 900;//deklarasi variabel final tinggi frame 900 pixel 
    private static final int FRAME_X_ORIGIN = 150;//deklarasi final letak frame
    private static final int FRAME_Y_ORIGIN = 250;//deklarasi final letak frame

    public static void main(String [] args){
        Ch14FlowLayoutSample frame = new Ch14FlowLayoutSample();
        frame.setVisible(true);
    
    
    }
    
    public Ch14FlowLayoutSample(){
        Container contentPane;//deklarasi variabel contentPane bertipe container
        JButton button1,button2,button3,button4,button5;//deklarasi variabel  button1, button2, button3, button4, button5 bertipe JButton 

        
       //mengatur Frame 
        setSize(FRAME_WIDTH,FRAME_HEIGHT);//ukuran frame
        setTitle("Program Ch14FlowLayoutSample");//judul frame
        setLocation(    FRAME_X_ORIGIN,FRAME_Y_ORIGIN);//letak frame
         //mengatur content pane
        contentPane = getContentPane();//membuat object contentPane
        contentPane.setBackground(Color.white);//mengatur warna background contentPane
        contentPane.setLayout(new FlowLayout());//mengatur layout contentPane sama dengan objeck flowLayout

        
       //membuat 4 button 
        button1 = new JButton("button 1");
        button2 = new JButton("button 2");
        button3 = new JButton("Button 3");
        button4 = new JButton("Button 4");
        button5 = new JButton("Button 5");
        
        //memasukan 4 button kedalam container 
        contentPane.add(button1);
        contentPane.add(button2);
        contentPane.add(button3);
        contentPane.add(button4);
        contentPane.add(button5);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);//program akan keluar saat jendela di close 
        
        
        
        
        
        
    
    
    
    
    }
    
}
