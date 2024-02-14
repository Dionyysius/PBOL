/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Modul8;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author ACER
 */
public class latihan10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan kalimat: ");
        String kalimat = scanner.nextLine();

        StringTokenizer st = new StringTokenizer(kalimat);
        int jumlahKata = st.countTokens();

        System.out.println("Jumlah kata: " + jumlahKata + " kata");

        scanner.close();
    }

}
