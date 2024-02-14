/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Modul9;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JOptionPane;

/**
 *
 * @author ACER
 */
public class latihan2c extends JFrame {

    /**
     * @param args the command line arguments
     */
    JButton open, save;
    int status;

    public static void main(String[] args) {
        // TODO code application logic here
        latihan2c frame = new latihan2c();//membuat objek eventwarna
        frame.setVisible(true);

    }

    public latihan2c() {
        Container contentPane = getContentPane();//membuat objeck kontainer
        JFileChooser chooser = new JFileChooser();
        setSize(600, 600);//mengatur ukuran frame
        setTitle("Stream : ");//memberi judul pada frame
        contentPane.setBackground(Color.white);
        contentPane.setLayout(null);//mengeset layout null 
        open = new JButton("OPEN ");//membuat Objek JButton merah 
        open.setBounds(100, 30, 100, 30);//mengatur letak button merah dan mengatur ukuran button 
        open.addActionListener(e -> {
            chooser.showOpenDialog(null);
        });

        if (status == JFileChooser.APPROVE_OPTION) {
            JOptionPane.showMessageDialog(open, "Anda membuka file : " + open.getName());

        } else {
        }
        //menambahkan action listener saat button di pencet maka background akan berubah merah
        contentPane.add(open);//menambahkan merah ke contentainer

        save = new JButton("SAVE ");//membuta Objek JButton Kuning 
        save.setBounds(300, 30, 100, 30);//mengatur letak button merah dan mengatur ukuran button 
        save.addActionListener(e -> {
            chooser.showSaveDialog(null);
        });
        //menambahkan action listener saat button di pencet maka background akan berubah kuning
        contentPane.add(save);//menambahkan kuning ke contentainer

        setDefaultCloseOperation(EXIT_ON_CLOSE);//program akan berhenti ketika layar close

    }
}
