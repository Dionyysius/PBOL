/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul6;

/**
 *
 * @author ACER
 */
import java.awt.Container;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author ACER
 */
public class Lat5 extends JFrame implements ActionListener {

    private JLabel label1, label2, label3;
    private JTextField b1, b2, b3;
    private JButton jumlah;
    double panjang;
    double lebar;

    public Lat5() {
        Container contentPane = getContentPane();
        //mengatur Frame
        setSize(500, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Masukan Data ");
        this.setLocationRelativeTo(null);

        contentPane.setLayout(null);
        //mengatur label 1
        label1 = new JLabel("Masukan Panjang (m) ");
        label1.setBounds(10, 10, 180, 25);
        contentPane.add(label1);
        //mengatur text field untuk bilangan pertama
        b1 = new JTextField();
        b1.setBounds(180, 10, 150, 25);
        contentPane.add(b1);
        //mengatur label kedua
        label2 = new JLabel("Masukan Lebar (m) ");
        label2.setBounds(10, 40, 180, 25);
        contentPane.add(label2);
        //mengatur text field untu kbilangan kedua
        b2 = new JTextField();
        b2.setBounds(180, 40, 150, 25);
        contentPane.add(b2);
        //mengatur label yang mengatur hasil 
        label2 = new JLabel("Luas (m2) :  ");
        label2.setBounds(10, 70, 180, 25);
        contentPane.add(label2);
        //mengatur text field untuk menampilkan hasil 
        b3 = new JTextField();
        b3.setBounds(180, 80, 150, 25);
        contentPane.add(b3);
        //memunculkan tombol untuk mengatur operasi pertambahan
        jumlah = new JButton("Jumlah");
        jumlah.setBounds(180, 190, 100, 25);
        contentPane.add(jumlah);
        //menambahkan action listener command akan beraksi ketika jumlah dipicu 
        jumlah.addActionListener(this);
        jumlah.setActionCommand("jumlah");

        //memanggil overrideding ketika b2 dipicu 
        b1.addKeyListener(new KeyAdapter() {

            @Override//ketika menekan enter maka operasi penjumlahan segera dimulai 
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    b2.requestFocus();

                }
            }

        });

        b2.addKeyListener(new KeyAdapter() {

            @Override//ketika menekan enter maka operasi penjumlahan segera dimulai 
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    try {
                        panjang = Double.parseDouble(b1.getText());
                        lebar = Double.parseDouble(b2.getText());
                    } catch (Exception b) {
                        JOptionPane.showMessageDialog(null, "Maaf Input salah Mohon ulangi kembali", "ERROR", JOptionPane.ERROR_MESSAGE);

                    }
                    double angka3 = panjang * lebar;
                    //dan program akan ditampilkan di text field ketiga
                    String hasil = angka3 + "";
                    b3.setText(hasil);

                }
            }

        });

        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
//ketika tombol jumlah dipicu maka operasi penjumlahan dimulai
        String command = e.getActionCommand();
        command.equals("jumlah");
        try {
            panjang = Double.parseDouble(b1.getText());
            lebar = Double.parseDouble(b2.getText());
        } catch (Exception b) {
            JOptionPane.showMessageDialog(null, "Maaf Input salah Mohon ulangi kembali", "ERROR", JOptionPane.ERROR_MESSAGE);

        }
        double angka3 = panjang * lebar;
        //dan program akan ditampilkan di text field ketiga
        String hasil = angka3 + "";
        b3.setText(hasil);
    }

    public static void main(String[] args) {
        new Lat5().setVisible(true);

    }

}
