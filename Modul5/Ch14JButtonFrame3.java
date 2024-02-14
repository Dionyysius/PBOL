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
public class Ch14JButtonFrame3 extends JFrame implements ActionListener {
    private static final int FRAME_WIDTH    = 300;//deklarasi variabel final lebar frame 300 pixel 
    private static final int FRAME_HEIGHT   = 200;//deklarasi variabell final tinggi frame 200 pixel 
    private static final int FRAME_X_ORIGIN = 150;//deklarasi final letak frame
    private static final int FRAME_Y_ORIGIN = 250;//deklarasi final letak frame
    private static final int BUTTON_WIDTH = 80;
    private static final int BUTTON_HEIGHT = 80;
    private JButton button,button2;
    
    public static void main(String[] args){
        Ch14JButtonFrame3 frame = new Ch14JButtonFrame3();
        frame.setVisible(true);
        
        
    
    
    
    }

    public Ch14JButtonFrame3() {
        Container contentPane = getContentPane();
        contentPane.setLayout(new FlowLayout());
        
        //mengatur frame 
        setSize(FRAME_WIDTH ,FRAME_HEIGHT);
        setResizable(false);
        setTitle("Program Ch7JButtonFrame");
        setLocation(FRAME_X_ORIGIN, FRAME_Y_ORIGIN);
        
        
        //mengatur button 
        button = new JButton("Click me");
        button.setSize(BUTTON_WIDTH, BUTTON_HEIGHT);
        contentPane.add(button );
        
        //mengatur button 
        button2 = new JButton("Tombol 2");
        button2.setSize(BUTTON_WIDTH, BUTTON_HEIGHT);
        contentPane.add(button2 );
        
        //menambah action listener pada button dan button2
        button.addActionListener(this);
        button2.addActionListener(this);
        
        
        
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton clickedButton = (JButton) e.getSource();//override dari kelas action Listener
        
        JRootPane rootPane = clickedButton.getRootPane();//memanggil getSource melalui objek JButton
         //Dari tombol diklik kemudian mendapatkan root pane 
        //Root pane adalah komponen Swing yang mengandung semua elemen GUI dalam frame.
        Frame frame = (JFrame) rootPane.getParent();
         //program mengambil parent (induk) dari root pane di JFrame
          //ketika tombol diklik program akan mengubah judul frame dan jika tombol 2 dklik akan mengubah judul frame lagi
        String buttonText = clickedButton.getText();
        if (buttonText.equals("Click me")) {
            frame.setTitle("Dibuat dengan cara 2"+buttonText);
            
        }else{
            frame.setTitle("You Clicked "+buttonText);
        
        }
        
       
    }
    
    
}
