/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul2;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;


/**
 *
 * @author ACER
 */
public class FrameKuu extends JFrame {
    public FrameKuu(){
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Ini Kelas turunan dari kelas JFrame");
        this.setBounds(100, 100, 300, 150);
       JPanel panel = new JPanel();
        String[] makanan = {"Nasi goreng","Ayam Goreng","Telur Goreng"};
        JLabel label = new JLabel();
        JTextField text = new JTextField();
       JCheckBox box = new JCheckBox();
       JRadioButton rb = new JRadioButton();
       ButtonGroup languageGroup = new ButtonGroup();
        for (int i = 0; i < makanan.length; i++) {
            box = new JCheckBox(makanan[i]);
            rb = new JRadioButton(makanan[i]);
             languageGroup.add(box);
        languageGroup.add(rb);
            panel.add(box);
             panel.add(rb);
        }
         
        
        
        
        
        
        JButton tombol = new JButton();
        text.setText("Ini text");
        label.setText("Ini Label");
        
         this.setVisible(true);
       
        tombol.setText("Ini tombol");
        panel.add(label);
        panel.add(text);
        
      
       
        
        panel.add(tombol);
        this.add(panel);
        
        
        
    
    
    
    }
    
    
    public static void main(String[] args){
        new FrameKuu();
    }
    
}
