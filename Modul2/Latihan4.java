/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul2;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author ACER
 */
public class Latihan4 extends JFrame {
    public Latihan4(){
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("find");
        this.setBounds(100, 100, 300, 150);
        String keyword = null;
        
       JPanel panel = new JPanel();
       JButton button = new JButton();
       JButton button1 = new JButton();
       JTextField text = new JTextField();
       JLabel label = new JLabel();
       label.setText("Keyword");
       text.setText("                                                 ");
       text.setColumns(20);
       button1.setActionCommand(keyword);
       button.setText("Find");
       panel.add(label);
       panel.add(text);
      panel.add(button);
       
       this.add(panel);
      this.setResizable(false);
       this.setVisible(true);
       
       
        
    
    
    
    }
    public static void main(String[]args){
    new Latihan4();
    
    
    }
}
