/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul5;

import java.awt.Container;
import java.awt.Frame;
import java.awt.GraphicsConfiguration;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author ACER
 */
public class JFrame1 extends JFrame implements ActionListener {
private JLabel Jnama, Jjenis, Jkaryawan, Jalamat, Jnomor, Jlahir;
    private JButton simpan, batal;
    private JCheckBox karyawan;
    private JTextField nama, alamat, nomor;
    private JComboBox<String> tanggalBox, bulanBox, tahunBox;
    private ButtonGroup group;
    public JFrame1() {
       
        this.setBounds(100, 100, 500, 700);
        JPanel panel = new JPanel();
        JTextField text1 = new JTextField();
        JLabel label = new JLabel();
        JMenuBar menu = new JMenuBar();
        JMenu menu1 = new JMenu("Input");
        JMenuItem tambahManager = new JMenuItem("Tambah Manager");
        tambahManager.addActionListener(this);
        JMenuItem tambahMarketing = new JMenuItem("Tambah Marketing");
        tambahMarketing.addActionListener(this);
        JMenuItem tambahHonorer = new JMenuItem("Tambah Honorer");
        tambahHonorer.addActionListener(this);
   
        menu1.add(tambahManager);
        menu1.add(tambahMarketing);
        menu1.add(tambahHonorer);
        menu.add(menu1);
        panel.add(menu);
        this.setJMenuBar(menu);
        this.add(panel);
        
        
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        Dialog d = new Dialog("Masukan data : "+e.getActionCommand());
        
        d.setVisible(false);
        d.setVisible(true);
        
    }

 
    public static void main(String[] args) {
        JFrame f = new JFrame1();
        f.setVisible(true);
        

    }

   
}
