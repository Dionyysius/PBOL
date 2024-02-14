/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul2;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author ACER
 */
public class Frameeku extends JFrame {
    public Frameeku(){
        this.setSize(300, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Ini Class turunan dari Class JFrame");
        this.setVisible(true);
        
        JPanel panel = new JPanel();
        JButton tombol = new JButton();
        tombol.setText("Ini tombol");
        panel.add(tombol);
        this.add(panel);
    
    
    
    
    
    }
    
    public static void main(String[] args){
    
    new Frameeku();
    
    }
    
}
