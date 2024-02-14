/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul3;

import java.awt.BorderLayout;//mengimport borderLayout
import java.awt.Container;//mengimport container
import java.awt.FlowLayout;//mengimport flowLayout 
import java.awt.Frame;//mengimport frame
import javax.swing.ButtonGroup;//mengimport buttonGroup
import javax.swing.JButton;//mengimport Jbutton 
import javax.swing.JCheckBox;//mengimport JCheckBox
import javax.swing.JComboBox;//mengimport JComboBox
import javax.swing.JFrame;//mengimport JFrame
import javax.swing.JDialog;//Mengimport JDialog
import javax.swing.JLabel;//Mengimport JLabel
import javax.swing.JPanel;//mengimport jPanel
import javax.swing.JRadioButton;//mengimport radioButton
import javax.swing.JTextField;//mengimport JTextField

/**
 *
 * @author ACER
 */
public class JDialog1 extends JDialog {

    private JLabel Jnama, Jjenis, Jkaryawan, Jalamat, Jnomor, Jlahir;//deklarasi Jnama, Jjenis, Jkaryawan, Jalamat, Jnomor, Jlahir bertipe JLabel 
    private JButton simpan, batal;//deklarsi simpan, batal bertipe JButton 
    private JCheckBox karyawan;//deklarasi karyawan bertipe JCheckBox
    private JTextField nama, alamat, nomor;//deklarasi nama, alamat, nomor bertipe JTextField
    private JComboBox<String> tanggalBox, bulanBox, tahunBox;//deklarasi tanggalBox, bulanBox, tahunBox diubah menjadi string bertipe JComboBox
    private ButtonGroup group;//deklarasi ButtonGroup 

    public JDialog1(Frame parent) {

        Container contentPane = getContentPane();//membuat objek contentPane
        contentPane.setLayout(null);//memngatur Layout sama dengan null 

        this.setSize(800, 700);//mengatur ukuran JDialog
        //mengatur JLabel JNama
        Jnama = new JLabel("Nama                    : ");//judul
        Jnama.setBounds(10, 10, 120, 30);//ukuran dan letak 
        contentPane.add(Jnama);//menambahkan JNama contentPane
        //mengatur textfield
        nama = new JTextField(100);//objek JTextField
        nama.setBounds(130, 10, 500, 30);//ukuran dan letak
        contentPane.add(nama);//menmabahkan nama ke container
        //mengatur JLabel Jalamat
        Jalamat = new JLabel("Alamat                  : ");
        Jalamat.setBounds(10, 50, 120, 30);
        contentPane.add(Jalamat);
        //mengatur Jtextfield alamat
        alamat = new JTextField(100);
        alamat.setBounds(130, 50, 500, 30);
        contentPane.add(alamat);
        //mengatur JLabel Jnomor
        Jnomor = new JLabel("nomor                   : ");
        Jnomor.setBounds(10, 90, 120, 30);
        contentPane.add(Jnomor);
        //mengatur JTextField nomor
        nomor = new JTextField(100);
        nomor.setBounds(130, 90, 500, 30);
        contentPane.add(nomor);
        //mengatur JLabel JLahir
        Jlahir = new JLabel("Tanggal Lahir     : ");
        Jlahir.setBounds(10, 130, 120, 30);
        contentPane.add(Jlahir);
        
        String[] tanggal = new String[31];//membuat array sebanyak 31
        String[] bulan = {"Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember"};//membuat array bulan
        String[] tahun = new String[31];//membuat array tahun sebanyak 31
        //mengisi array tanggal dan tahun 
        for (int i = 0; i < tanggal.length; i++) {
            tanggal[i] = String.valueOf(i + 1);//array akan di isi dengan nilai i ditambah satu
            tahun[i] = String.valueOf(2023 - i);//array akan diisi dengan 2023 dikurangi i

        }
        //membuat JComboBox tanggal 
        tanggalBox = new JComboBox<>(tanggal);
        tanggalBox.setBounds(130, 130, 50, 30);
        contentPane.add(tanggalBox);
        //membuat JComboBox bulan 
        bulanBox = new JComboBox<>(bulan);
        bulanBox.setBounds(200, 130, 100, 30);
        contentPane.add(bulanBox);
        //mengatur JComboBox tahun
        tahunBox = new JComboBox<>(tahun);
        tahunBox.setBounds(320, 130, 80, 30);
        contentPane.add(tahunBox);
        //membuat JLabel JKaryawan
        Jkaryawan = new JLabel("Jenis Karyawan : ");
        Jkaryawan.setBounds(10, 170, 120, 30);
        contentPane.add(Jkaryawan);
        //perulangan ini akan mencetak JCheckBox sesuai dengan isi array jenisKaryawan 
        String[] jenisKaryawan = {"Manager", "Marketing", "Honorer"};
        group = new ButtonGroup();
        int x = 170;
        for (int i = 0; i < jenisKaryawan.length; i++) {
            karyawan = new JCheckBox(jenisKaryawan[i]);
            karyawan.setBounds(130, x, 120, 30);//posisi y array akan memiliki jarak yang berbeda setiap looping 
            //akan bertambah 40 dari posisi sebelumnya
            group.add(karyawan);
            contentPane.add(karyawan);

            x += 40;

        }
        //membuat dan mengatur JButton simpan
        simpan = new JButton("Simpan");
        simpan.setBounds(240, 500, 90, 45);
        contentPane.add(simpan);
        //membuat dan mengatur Jbutton batal 
        batal = new JButton("Batal");
        batal.setBounds(390, 500, 90, 45);
        contentPane.add(batal);
        this.setVisible(true);

    }

    public static void main(String[] args) {
        //membuat frame baru 
        JFrame frame = new JFrame("Data Identitas");
        //membuat button baru 
        JButton b = new JButton("Tampilkan Dialog");
        b.addActionListener(e -> {
            JDialog1 d = new JDialog1(frame);

        });//saat button tampilkan dialog diclick akan memicu JDialog untuk muncul
        frame.setLayout(new FlowLayout());//mengatur frame layout dengan flow layout
        frame.add(b);//menambahkan button b
        frame.setSize(800, 700);//mengatur ukuran frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//saat frame ditutup program akan berhenti 
        frame.setVisible(true);//mengatur akan program bisa dilihat 

    }

}
