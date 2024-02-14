/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul3;

import javax.swing.BorderFactory;//mengimport BorderFactory
import javax.swing.JDialog;//mengimport JDialog
import javax.swing.JFrame;//mengimport JFrrame
import javax.swing.JLabel;//mengimport JLabel 
import javax.swing.JMenu;//mengimport JMenu
import javax.swing.JMenuBar;//mengimport menubar
import javax.swing.JMenuItem;//mengimport menuItem 
import javax.swing.JPanel;//mengimport JPanel 
import javax.swing.JTextField;//mengimport JTextField

/**
 *
 * @author ACER
 */
public class JFrame1 extends JFrame {

    public JFrame1() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//saat jendela ditutup program akan berhenti 
        this.setBounds(100, 100, 500, 700);//mengatur letak dan ukuran frame
        JPanel panel = new JPanel();//membuat objek JPanel 
        JTextField text1 = new JTextField();//membuat objek JTextField
        JLabel label = new JLabel();//membuat objek JLabel 
        JMenuBar menu = new JMenuBar();//membuat Objek Menubar
        JMenu menu1 = new JMenu("Input");//membuat objek JMnu
        //membuat menu menu apa saja yang akan ada di menubar
        JMenuItem tambahManager = new JMenuItem("Tambah Manager");//menu tambah Manager
        JMenuItem tambahMarketing = new JMenuItem("Tambah Marketing");//menutambah marketing 
        JMenuItem tambahHonorer = new JMenuItem("Tambah Honorer");//menu tambah honorer
        
        JDialog d = new JDialog();//membuat objek Jdialog
        //menambahkan ke dalam JMenu 
        menu1.add(tambahManager);
        menu1.add(tambahMarketing);
        menu1.add(tambahHonorer);
        //menambahkan menu ke menubar
        menu.add(menu1);
        //menambahkan menu bar ke panel 
        panel.add(menu);
        //mengatur menu bar
        this.setJMenuBar(menu);
        //menambahkan menubar kedalam frame
        this.add(panel);
        this.setVisible(true);//mengatur agar frame terlihat 

    }

   
    public static void main(String[] args) {
        new JFrame1();

    }
}
