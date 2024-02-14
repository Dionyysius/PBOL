/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul5;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author ACER
 */
public class Dialog extends JDialog implements ActionListener {

    private JLabel Jnama, Jjenis, Jkaryawan, Jalamat, Jnomor, Jlahir;
    private JButton simpan, batal;
    private JCheckBox karyawan;
    private JTextField nama, alamat, nomor;
    private JComboBox<String> tanggalBox, bulanBox, tahunBox;
    private ButtonGroup group;

    Dialog(String string) {

        //membuat container
        Container contentPane = getContentPane();
        contentPane.setLayout(new FlowLayout());

        //mengatur JDialog
        setTitle(string);
        setSize(800, 400);
        setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        setLayout(null); // Menonaktifkan layout manager
        setLocationRelativeTo(null);
        //mengatur Label nama
        Jnama = new JLabel("Nama                    : ");
        Jnama.setBounds(10, 10, 120, 30);
        contentPane.add(Jnama);
        //mengatur text field nama
        nama = new JTextField(100);
        nama.setBounds(130, 10, 500, 30);
        contentPane.add(nama);
        //mengatur label alamat
        Jalamat = new JLabel("Alamat                  : ");
        Jalamat.setBounds(10, 50, 120, 30);
        contentPane.add(Jalamat);
        //mengatur text field alamat
        alamat = new JTextField(100);
        alamat.setBounds(130, 50, 500, 30);
        contentPane.add(alamat);
        //mengatur labeh nomor
        Jnomor = new JLabel("nomor                   : ");
        Jnomor.setBounds(10, 90, 120, 30);
        contentPane.add(Jnomor);
        //mengatur text field nomor 
        nomor = new JTextField(100);
        nomor.setBounds(130, 90, 500, 30);
        contentPane.add(nomor);
        //mengatur JLabel tanggal lahir
        Jlahir = new JLabel("Tanggal Lahir     : ");
        Jlahir.setBounds(10, 130, 120, 30);
        contentPane.add(Jlahir);
// membuat array string untuk tanggal lahir JComboBox
        String[] tanggal = new String[31];
        String[] bulan = {"Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember"};
        String[] tahun = new String[31];
        //for untuk mencetak tanggal dan tahun 
        for (int i = 0; i < tanggal.length; i++) {
            tanggal[i] = String.valueOf(i + 1);
            tahun[i] = String.valueOf(2023 - i);

        }
        //membuat combo box tanggal
        tanggalBox = new JComboBox<>(tanggal);
        tanggalBox.setBounds(130, 130, 50, 30);
        contentPane.add(tanggalBox);
        //mengatur combo box bulan
        bulanBox = new JComboBox<>(bulan);
        bulanBox.setBounds(200, 130, 100, 30);
        contentPane.add(bulanBox);
        //mengatur combo box tahun 
        tahunBox = new JComboBox<>(tahun);
        tahunBox.setBounds(320, 130, 80, 30);
        contentPane.add(tahunBox);

        //mengatur tombol simpan 
        simpan = new JButton("Simpan");
        simpan.setBounds(240, 210, 90, 45);
        simpan.addActionListener(this);
        contentPane.add(simpan);
        //mengatur tombol batal
        batal = new JButton("Batal");
        batal.setBounds(390, 210, 90, 45);
        batal.addActionListener(this);
        contentPane.add(batal);
        //membuat Mouse listener untuk menampilkan tips saat mouse menunjuk content
        MouseAdapter m = new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                if (e.getSource() == nama) {
                    nama.setToolTipText(" Isi nama anda disini");

                } else if (e.getSource() == alamat) {
                    alamat.setToolTipText("Masukan Alamat anda disini ");

                } else if (e.getSource() == nomor) {
                    nomor.setToolTipText("Masukan nomor anda disini ");

                } else if (e.getSource() == tanggalBox) {
                    tanggalBox.setToolTipText("Masukan tanggal lahir anda ");

                } else if (e.getSource() == bulanBox) {
                    bulanBox.setToolTipText("Masukan bulan lahir anda ");

                } else if (e.getSource() == tahunBox) {
                    tahunBox.setToolTipText("Masukan Tahun Lahir anda ");

                } else if (e.getSource() == simpan) {
                    simpan.setToolTipText("Klik untuk menyimpan ");

                } else if (e.getSource() == batal) {
                    batal.setToolTipText("Klik untuk membatalkan ");

                }

            }
        };
        //mengadd mouse listener ke content 
        nama.addMouseListener(m);
        alamat.addMouseListener(m);
        nomor.addMouseListener(m);
        tanggalBox.addMouseListener(m);
        bulanBox.addMouseListener(m);
        tahunBox.addMouseListener(m);
        simpan.addMouseListener(m);
        batal.addMouseListener(m);

        nomor.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {//ketika enter ditekan pada text field nomor data yang sudah tersimpan
                //akan muncul sesuai data nomor dan jika tidak ada akan muncu ldialog
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    String data[][] = {
                        {"225314001", "Herodion Yulis Putra", "Bantul", "22", "Juli", "2003"},
                        {"225314018", "Achmad Herlambang Prasetyo", "depok", "17", "Agustus", "2000"},
                        {"225314022", "Stefanus Saputra", "Karawang", "4", "April", "2003"}

                    };
                    String ketemu = "tidak";
                    for (int i = 0; i < data.length; i++) {
                        if (nomor.getText().equals(data[i][0])) {
                            nama.setText(data[i][1]);
                            alamat.setText(data[i][2]);
                            //mengatur nilai combobox lahir 
                            String tanggal = data[i][3];
                            String bulan = data[i][4];
                            String tahun = data[i][5];
                            //mengatur nilai ComboBox sesuai tanggal 
                            tanggalBox.setSelectedItem(tanggal);
                            bulanBox.setSelectedItem(bulan);
                            tahunBox.setSelectedItem(tahun);
                            ketemu = "Ya";
                            break;
                            //jika nomor ditemukan berhentikan loop 
                        }

                    }//jika tidak ditemukan maka akan muncul dialog massage
                    if (ketemu.equals("tidak")) {
                        JOptionPane.showMessageDialog(null, "data tidak ditemukan");
                        nomor.setText("");

                    }

                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }
        });
        //menampilkan dialog 
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        //seharus nya ketika tombol batal dan simpan ditekan maka akan ada message dialog yang akan muncul 
        switch (command) {
            case "simpan":
                JOptionPane.showMessageDialog(null, "Data telah disimpan");
                this.dispose();
                break;

            case "selesai":
                this.dispose();
                break;

        }
    }

}
