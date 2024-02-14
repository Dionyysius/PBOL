/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul3;

import java.awt.BorderLayout;//mengimport BorderLayout
import java.awt.Color;//mengimport color
import java.awt.Container;//mengimport container
import java.awt.FlowLayout;//mengimport flowlayout 
import java.awt.GridLayout;//mengimport gridlayout
import javax.swing.BorderFactory;//mengimport BorderFactory
import javax.swing.JButton;//mengimport JButton 
import javax.swing.JFrame;//mengimport Jframe
import javax.swing.JList;//mengimport JList
import javax.swing.JPanel;//mengimport JPanel 
import javax.swing.JScrollPane;//mengimport JScrollPane

/**
 *
 * @author ACER
 */
public class Ch14JListSample extends JFrame {
    private static final int FRAME_WIDTH = 300;//deklarasi variabel final lebar frame 300
    private static final int FRAME_HEIGHT = 250;//deklarasi variabel final tinggi frame 250
    private static final int FRAME_X_ORIGIN = 150;//deklarasi variabel final letak frame
    private static final int FRAME_Y_ORIGIN = 250;//deklarasi variabel final letak frame
    private JList list;//deklarasi variabel list bertipe JList

    public static void main(String[] args) {
        Ch14JListSample frame = new Ch14JListSample();
        frame.setVisible(true);
    }
    public Ch14JListSample(){
        Container contentPane;//deklarasi variabel contentpane bertipe container
        JPanel listPanel, okPanel;//deklarasi variabel listPanel dan okPanel bertipe JPanel 
        JButton okButton;//deklarasi variabel okButton bertipe JButton 
        
         String[] names = {"Ape", "Bat", "Bee", "Cat",
            "Dog", "Eel", "Fox", "Gnu",
            "Hen", "Man", "Sow, Yak"};//membuat array names bertipe String
         
         //mengatur frame
        setSize(FRAME_WIDTH, FRAME_HEIGHT);//ukuran
        setTitle("Program Ch14JListSample2");//juduil
        setLocation(FRAME_X_ORIGIN, FRAME_Y_ORIGIN);//loakasi 
        //mengatur contentPane 
        contentPane = getContentPane();//objek contentPane
        contentPane.setBackground(Color.white);//warna background
        contentPane.setLayout(new BorderLayout());//layour mengunakan borderLayout
        
        //membuat list dan mengatur list 
        listPanel = new JPanel(new GridLayout(0,1));//meletakan panel secara berurutan dengan ukuran yang sama 
        listPanel.setBorder(BorderFactory.createTitledBorder("Three-letter Animal Names"));//menambahkan border dengan judul "Three-letter Animal Names"
        //membuat list 
        list=new JList(names);
        listPanel.add(new JScrollPane(list));//menambahkan daftar list dengan scroolPane agar bisa discroll
        
        okPanel = new JPanel(new FlowLayout());//membuat okPanel dan diatur oleh flowlayout kedalam panel ukuran menyesuaikan frame
        okButton = new JButton("OK");//membuat ok panel 
        okPanel.add(okButton);//menambahkan okButton ke okPanel 
        
        contentPane.add(listPanel,BorderLayout.CENTER);//meletakan list ditangah mengunakan border
        contentPane.add(okPanel,BorderLayout.SOUTH);//meletakan okPanel diselatan 
        
        setDefaultCloseOperation( EXIT_ON_CLOSE);//jika frame ditutup maka program akan berhenti 

        



        

    
    
    }
}
