/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul5;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author ACER
 */
public class Latihan5 extends JFrame implements ActionListener{
    JLabel label1, label2, label3;
    JTextField bil1, bil2, bil3;
    
    public Latihan5(){
         this.setSize(400, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Input data");
         this.setLocationRelativeTo(null);
         
         JPanel panel = new JPanel();
         panel.setLayout(null);
         
         label1 = new JLabel("Bilangan 1 :");
         label1.setBounds(10, 10, 80, 25); 
         bil1 = new JTextField();
          bil1.setBounds(100, 10, 150, 25);
         
         label2 = new JLabel("Bilangan 2 :");
         label2.setBounds(10, 40, 80, 25); 
         bil2 = new JTextField();
          bil2.setBounds(100, 40, 150, 25);
          
        label3 = new JLabel("Hasil :");
         label3.setBounds(10, 70, 80, 25); 
        bil3 = new JTextField();
          bil3.setBounds(100, 70, 150, 25);
          
          JButton jumlah = new JButton("Jumlah");
          jumlah.setBounds(100, 110, 100, 25);
          
           JButton kurang = new JButton("kurang");
          kurang.setBounds(200, 110, 100, 25);
          
           JButton kali = new JButton("kali");
          kali.setBounds(100, 140, 100, 25);
          
           JButton bagi = new JButton("bagi");
          bagi.setBounds(200, 140, 100, 25);
          
          panel.add(jumlah);
          panel.add(kurang);
          panel.add(kali);
          panel.add(bagi);
          panel.add(label1);
          panel.add(bil1);
          panel.add(label2);
          panel.add(bil2);
          panel.add(label3);
          panel.add(bil3);
         add(panel);
         
         jumlah.addActionListener(this);
         jumlah.setActionCommand("jumlah");
          kurang.addActionListener(this);
         kurang.setActionCommand("kurang");
          kali.addActionListener(this);
         kali.setActionCommand("kali");
          bagi.addActionListener(this);
         bagi.setActionCommand("bagi");
         
         bil2.addKeyListener(new KeyListener() {
             @Override
             public void keyTyped(KeyEvent e) {
               
             }

             @Override
             public void keyPressed(KeyEvent e) {
                  if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                      
             double angka1 = Double.parseDouble(bil1.getText());
             double angka2 = Double.parseDouble(bil2.getText());
             double angka3 = angka1 + angka2 ;
             String angka = angka3+"";
             bil3.setText(angka);
                    };
                  
             }

             @Override
             public void keyReleased(KeyEvent e) {
                 
             }
         });
         setVisible(true);
         
    }
    @Override
    public void actionPerformed(ActionEvent e) {
         String command = e.getActionCommand();
         if(command.equals("jumlah")){
             double angka1 = Double.parseDouble(bil1.getText());
             double angka2 = Double.parseDouble(bil2.getText());
             double angka3 = angka1 + angka2 ;
             String angka = angka3+"";
             bil3.setText(angka);
         }else if(command.equals("kurang")){
             double angka1 = Double.parseDouble(bil1.getText());
             double angka2 = Double.parseDouble(bil2.getText());
             double angka3 = angka1 - angka2 ;
             String angka = angka3+"";
             bil3.setText(angka);
         }else if(command.equals("kali")){
             double angka1 = Double.parseDouble(bil1.getText());
             double angka2 = Double.parseDouble(bil2.getText());
             double angka3 = angka1 * angka2 ;
             String angka = angka3+"";
             bil3.setText(angka);
         }else if(command.equals("bagi")){
             double angka1 = Double.parseDouble(bil1.getText());
             double angka2 = Double.parseDouble(bil2.getText());
             double angka3 = angka1 / angka2 ;
             String angka = angka3+"";
             bil3.setText(angka);
         }
         
    }
    public static void main(String[] args) {
        new Latihan5().setVisible(true);
    }
    
}