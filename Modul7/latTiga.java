/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul7;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class latTiga {

    public static void main(String[] args) {
        latTiga lat = new latTiga();

        System.out.println("***   INPUT DATA PELAMAR  ***");
        boolean ask = true;

        while (ask) {
            try {
                System.out.print("NIM : ");
                lat.getNIM();
                ask = false;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }
        ask = true;
        System.out.print("Nama : ");
        lat.getNama();

        while (ask) {
            try {
                System.out.print("IPK : ");
                lat.getIPK();
                ask = false;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }
        System.out.println("Terima Kasih, data sudah kami simpan....");

    }

    public String getNIM() throws Exception {
        Scanner sc = new Scanner(System.in);
        String nim = sc.next();
        if (nim.length() != 9) {
            throw new Exception("Maaf, format NIM anda salah !!!");

        }
        return nim;

    }

    public double getIPK() throws Exception {
        Scanner sc = new Scanner(System.in);
        double ipk = sc.nextDouble();
        if (ipk < 2.75) {
            throw new Exception("Maaf, Jumlah IPK anda belum memenuhi persyaratan!!!");

        } else if (ipk > 4.00) {
            throw new Exception("Maaf, IPK tidak boleh melebihi 4.00!!!");

        }
        return ipk;

    }

    public String getNama() {
        Scanner sc = new Scanner(System.in);
        String nama = sc.next();
        return nama;

    }

}
