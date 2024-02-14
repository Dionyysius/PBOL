/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul5;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JRootPane;

/**
 *
 * @author ACER
 */
public class Ch14JButtonFrame1 extends JFrame implements ActionListener {
    private static final int FRAME_WIDTH    = 300;//deklarasi variabel final lebar frame 300 pixel 
    private static final int FRAME_HEIGHT   = 200;//deklarasi variabell final tinggi frame 200 pixel 
    private static final int FRAME_X_ORIGIN = 150;//deklarasi final letak frame
    private static final int FRAME_Y_ORIGIN = 250;//deklarasi final letak frame
    private static final int BUTTON_WIDTH = 80;
    private static final int BUTTON_HEIGHT = 80;
    private JButton button;
    
    public static void main(String[] args){
        Ch14JButtonFrame1 frame = new Ch14JButtonFrame1();
        frame.setVisible(true);
        
        
    
    
    
    }

    public Ch14JButtonFrame1() {
        Container contentPane = getContentPane();
        contentPane.setLayout(new FlowLayout());
        
        //mengatur frame 
        setSize(FRAME_WIDTH ,FRAME_HEIGHT);
        setResizable(false);
        setTitle("Program Ch7JButtonFrame");
        setLocation(FRAME_X_ORIGIN, FRAME_Y_ORIGIN);
        
        
        //mengatur button 
        button = new JButton("CLick me");
        button.setSize(BUTTON_WIDTH, BUTTON_HEIGHT);
        contentPane.add(button );
        
        //menambah action listener pada button 
        button.addActionListener(this);
        
        
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       JButton clickedButton = (JButton) e.getSource();//memanggil getSource melalui objek JButton
        //Dari tombol diklik kemudian mendapatkan root pane 
        //Root pane adalah komponen Swing yang mengandung semua elemen GUI dalam frame.
        JRootPane rootPane = clickedButton.getRootPane();
        //program mengambil parent (induk) dari root pane di JFrame
        Frame frame = (JFrame) rootPane.getParent();
        //ketika tombol diklik program akan mengubah judul frame
        String buttonText = clickedButton.getText();
        frame.setTitle("You ClickedButton "+buttonText);
    }
    
    
}
