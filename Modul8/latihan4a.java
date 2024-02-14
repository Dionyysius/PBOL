/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul8;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class latihan4a {
 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Meminta input untuk dua kalimat
        System.out.print("Masukkan kalimat pertama: ");
        String kalimat1 = input.nextLine();

        System.out.print("Masukkan kalimat kedua: ");
        String kalimat2 = input.nextLine();

        // Menggabungkan kalimat pertama dan kedua
        String kalimatGabungan = kalimat1 + " " + kalimat2;

        // Menampilkan hasil gabungan
        System.out.println("Output: " + kalimatGabungan);
    }
}

    
