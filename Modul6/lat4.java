/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul6;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class lat4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bil1 = 0;
        int bil2 = 0;
        int hasil = 0;
        boolean error = true;

        do {
            try {
                System.out.print("Masukan Bilangan 1 : ");
                bil1 = sc.nextInt();

                error = false;
            } catch (Exception e) {
                System.out.println("Terjadi Kesalahan Pada penginputan !!!!");
                error = true;
                sc.next();
            }

        } while (error == true);

        do {
            try {

                System.out.print("Masukan Bilangan 2 : ");
                bil2 = sc.nextInt();

                error = false;
            } catch (Exception e) {
                System.out.println("Terjadi Kesalahan Pada penginputan !!!!");
                error = true;
                sc.next();
            }

        } while (error == true);

        hasil = bil1 + bil2;
        System.out.println("Hasil Penjumlahan Kedua Bilangan itu adalah : " + hasil);

    }

}
