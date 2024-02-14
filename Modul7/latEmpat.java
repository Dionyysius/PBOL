/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul7;

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
import java.util.InputMismatchException;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author ACER
 */
public class latEmpat extends JFrame implements ActionListener {

    private JLabel label1, label2, label3;
    private JTextField b1, b2, b3;
    private JComboBox statusBox;
    private JButton simpan;
    int nim, tahun;
    String nama, status;

    public latEmpat() {
        Container contentPane = getContentPane();
        //mengatur Frame
        setSize(500, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Pendaftaran Seminar ");
        this.setLocationRelativeTo(null);

        contentPane.setLayout(null);
        //mengatur label 1
        label1 = new JLabel("No Induk ");
        label1.setBounds(10, 10, 180, 25);
        contentPane.add(label1);
        //mengatur text field untuk bilangan pertama
        b1 = new JTextField();
        b1.setBounds(180, 10, 150, 25);
        contentPane.add(b1);
        //mengatur label kedua
        label2 = new JLabel("Nama ");
        label2.setBounds(10, 40, 180, 25);
        contentPane.add(label2);
        //mengatur text field untu kbilangan kedua
        b2 = new JTextField();
        b2.setBounds(180, 40, 150, 25);
        contentPane.add(b2);
        //mengatur label yang mengatur hasil 
        label2 = new JLabel("Status");
        label2.setBounds(10, 70, 180, 25);
        contentPane.add(label2);
        //mengatur text field untuk menampilkan hasil 
        String[] statusdata = {"Mahasiswa", "Dosen"};
        statusBox = new JComboBox(statusdata);
        statusBox.setBounds(180, 80, 150, 25);
        contentPane.add(statusBox);
        //memunculkan tombol untuk mengatur operasi pertambahan
        simpan = new JButton("simpan");
        simpan.setBounds(180, 190, 100, 25);
        contentPane.add(simpan);
        //menambahkan action listener command akan beraksi ketika jumlah dipicu 
        simpan.addActionListener(this);
        simpan.setActionCommand("simpan");

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
                        nim = Integer.parseInt(b1.getText());
                        nama = b2.getText();
                        status = (String) statusBox.getSelectedItem();

                        if (b1.getText().length() != 9) {
                            throw new Exception("\"Maaf, format NIM anda salah, NIM harus 9 Angka\"");
                        } else {

                        }
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
                    }
                    if (status.equals("Mahasiswa")) {
                        try {
                            tahun = Integer.parseInt(b1.getText().substring(0, 2));
                        } catch (InputMismatchException ex) {
                            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);

                        }
                        try {
                            if (tahun <= 13) {
                                JOptionPane.showMessageDialog(null, "Terima Kasih Sudah Mendaftar Seminar", "Simpan", JOptionPane.INFORMATION_MESSAGE);
                            } else {
                                throw new Exception("Maaf, Peserta yang boleh mengikuti seminar harus lahir sebelum tahun 2013.");
                            }
                        } catch (Exception ex) {
                            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Terima Kasih Sudah Mendaftar Seminar", "Simpan", JOptionPane.INFORMATION_MESSAGE);
                    }
                }
            }

        });

        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
//ketika tombol jumlah dipicu maka operasi penjumlahan dimulai
        if (e.getSource() == simpan) {
            try {
                nim = Integer.parseInt(b1.getText());
                nama = b2.getText();
                status = (String) statusBox.getSelectedItem();

                if (b1.getText().length() != 9) {
                    if (status.equals("Mahasiswa")) {
                        int tahun = Integer.parseInt(b1.getText().substring(0, 2));
                        if (tahun <= 13) {
                            JOptionPane.showMessageDialog(this, "Terima Kasih Sudah Mendaftar Seminar", "Simpan", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(this, "Maaf, Peserta yang boleh mengikuti seminar harus lahir sebelum tahun 2013.", "ERROR", JOptionPane.ERROR_MESSAGE);
                        }
                    } else {
                        JOptionPane.showMessageDialog(this, "Terima Kasih Sudah Mendaftar Seminar", "Simpan", JOptionPane.INFORMATION_MESSAGE);
                    }
                } else {
                    throw new Exception("Maaf, format NIM anda salah.");
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public static void main(String[] args) {
        new latEmpat();
    }

}
