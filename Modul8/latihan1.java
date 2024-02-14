/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Modul8;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class latihan1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);

        System.out.println("Karakter 1 : ");
        String kl = sc.next();
        System.out.println("Karakter 2 : ");
        String k2 = sc.next();

        if (kl.compareTo(k2) > 0) {
            System.out.println("Karakter pertama lebih besar dari pada karakter 2 : ");

        } else if (kl.compareTo(k2) < 0) {
            System.out.println("Karakter pertama lebih kecil darip ada karakter 2 : ");

        } else {
            System.out.println("Kedua karakter adalah sama ");

        }
    }

}
