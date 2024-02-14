/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul2;

/**
 *
 * @author ACER
 */
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class HelloFramee extends JFrame
{
 public HelloFramee()
 {
 this.setSize(1000,500);
 this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 this.setTitle("Hello World!");
 this.setVisible(true);

 JPanel jp=new JPanel();
 JButton but1=new JButton();

but1=new JButton("Click Me");
 but1.setText("Okay");
 jp.add(but1);
 this.add(jp);
 }

 public static void main(String[] args)
 {
HelloFramee hf = new HelloFramee(); 


 
 
 }
}