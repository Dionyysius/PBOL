/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul2;

import javax.swing.JFrame;

/**
 *
 * @author ACER
 */
public class Frameku extends JFrame {
    public Frameku(){
        this.setSize(300, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Ini Kelas turunan dari kelas JFrame");
        this.setVisible(true);
    
    
    
    }
    public static void main(String[] args){
    new Frameku();
    
    }
    
}
