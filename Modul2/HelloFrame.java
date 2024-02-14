/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul2;

/**
 *
 * @author ACER
 */
import javax.swing.JFrame;
public class HelloFrame extends JFrame
{
 public HelloFrame()
 {
 this.setSize(500,500);
 this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 this.setTitle("Hello World!");
 this.setVisible(true);
 }

 public static void main(String[] args)
 {
 new HelloFrame();
 
 }
} 
