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
public class latihan6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukan Input kata : ");
        String kata = sc.nextLine();
        String result = null;
        kata = kata.replaceAll("a", "4");
        kata = kata.replaceAll("i", "1");
        kata = kata.replaceAll("e", "3");
        kata = kata.replaceAll("o", "0");
        kata = kata.replaceAll("u", "11");

        System.out.println("Output " + kata);

    }

}
