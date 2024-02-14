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
public class Lat2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukan Jarak perjalanan Anda (KM) : ");
        int jarak = sc.nextInt();
        System.out.println("Masukan banyaknya bensin yang dihabiskan (Liter) : ");
        int liter = sc.nextInt();
        int konsumsi = 0;

        try {

            konsumsi = jarak / liter;
        } catch (Exception e) {

            konsumsi = 0;
        }

        System.out.println("Konsumsi BBm anda adalah : " + konsumsi + "Km/Liter");

    }

}
