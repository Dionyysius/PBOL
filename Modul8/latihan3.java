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
public class latihan3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Masukan Input kata : ");
        String nama = sc.nextLine();
        
        System.out.println("Posisi awal : ");
        int awal = sc.nextInt();
        System.out.println("Posisi akhir : ");
        int akhir = sc.nextInt();
        
        System.out.println(nama.substring(awal, akhir));
    }
    
}
