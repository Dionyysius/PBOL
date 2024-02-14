/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul5;
//mengimport 
import java.awt.Color;
import static java.awt.Color.white;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;


/**
 *
 * @author ACER
 */
public class eventwarna extends JFrame {
    //membuat variabel 
    private JButton merah,kuning;
    public eventwarna(){
        Container contentPane = getContentPane();//membuat objeck kontainer
        setSize(600,600);//mengatur ukuran frame
        setTitle("Event Warna : ");//memberi judul pada frame
       contentPane.setBackground(Color.white);
        contentPane.setLayout(null);//mengeset layout null 
        merah = new JButton("MERAH ");//membuat Objek JButton merah 
        merah.setBounds(100, 30, 100, 30);//mengatur letak button merah dan mengatur ukuran button 
        merah.addActionListener(e->{contentPane.setBackground(Color.RED);});
         //menambahkan action listener saat button di pencet maka background akan berubah merah
        contentPane.add(merah);//menambahkan merah ke contentainer
        
        kuning = new JButton("KUNING ");//membuta Objek JButton Kuning 
        kuning.setBounds(300, 30, 100,30 );//mengatur letak button merah dan mengatur ukuran button 
        kuning.addActionListener(e->{contentPane.setBackground(Color.YELLOW);});
        //menambahkan action listener saat button di pencet maka background akan berubah kuning
        contentPane.add(kuning);//menambahkan kuning ke contentainer
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);//program akan berhenti ketika layar close
        
        
    
    
    
    
    }
    public static void main(String[]args){
    eventwarna frame = new eventwarna();//membuat objek eventwarna
    frame.setVisible(true);
    }
    
}
