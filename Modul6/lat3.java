/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul6;

import javax.swing.JOptionPane;

/**
 *
 * @author ACER
 */
public class lat3 {

    public static void main(String[] args) {
        int age = 0;
        boolean error = true;
//        String inputStr = JOptionPane.showInputDialog(null, "Masukan umur anda ! ");
//        age = Integer.parseInt(inputStr);
//        System.out.println("Umur anda : " + age + " tahun ");

       do {
            try {
                String inputStr = JOptionPane.showInputDialog(null, "Masukan umur anda ! ");

                age = Integer.parseInt(inputStr);
                error = false;

            } catch (Exception e) {

                JOptionPane.showMessageDialog(null, "Input Salah Ulang Kembali !!!!");

                error = true;

            }
            System.out.println("Umur anda : " + age + " tahun ");
        } while (error == true);

    }

}
