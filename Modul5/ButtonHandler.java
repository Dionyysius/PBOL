/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul5;

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
public class ButtonHandler implements ActionListener {

    public ButtonHandler() {
    }

    @Override
    public void actionPerformed(ActionEvent event) {//override dari kelas action Listener
        JButton clickedButton = (JButton) event.getSource();//memanggil getSource melalui objek JButton
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
