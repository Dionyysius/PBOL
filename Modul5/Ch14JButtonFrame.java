/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul5;

import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author ACER
 */
public class Ch14JButtonFrame extends JFrame {

    private static final int FRAME_WIDTH = 300;//deklarasi variabel final lebar frame 300 pixel 
    private static final int FRAME_HEIGHT = 200;//deklarasi variabell final tinggi frame 200 pixel 
    private static final int FRAME_X_ORIGIN = 150;//deklarasi final letak frame
    private static final int FRAME_Y_ORIGIN = 250;//deklarasi final letak frame
    private static final int BUTTON_WIDTH = 80;
    private static final int BUTTON_HEIGHT = 80;
    private JButton button;

    public static void main(String[] args) {
        Ch14JButtonFrame frame = new Ch14JButtonFrame();
        frame.setVisible(true);

    }

    public Ch14JButtonFrame() {
        Container contentPane = getContentPane();
        contentPane.setLayout(new FlowLayout());

        //mengatur frame 
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setResizable(false);
        setTitle("Program Ch7JButtonFrame");
        setLocation(FRAME_X_ORIGIN, FRAME_Y_ORIGIN);

        //mengatur button 
        button = new JButton("CLick me");
        button.setSize(BUTTON_WIDTH, BUTTON_HEIGHT);
        contentPane.add(button);
        //membuat button handler
        ButtonHandler handler = new ButtonHandler();
        button.addActionListener(handler);
        //program akan berhenti ketika frame ditutup
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

}
