/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Modul8;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class latihan2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner sc = new Scanner(System.in);

        System.out.println("Masukan Input kata : ");
        String nama = sc.nextLine();
        int x = nama.length();
        char[] names = new char[x];
        for (int i = 0; i < nama.length(); i++) {
            names[i] = nama.charAt(i);
        }
        Arrays.sort(names);
        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i]);

        }

    }

}
