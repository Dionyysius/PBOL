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
public class latihan8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner scanner = new Scanner(System.in);

        System.out.print("Input kata: ");
        String kata = scanner.nextLine();

        StringBuffer reversed = new StringBuffer(kata).reverse();
        System.out.println("Reverse kata: " + reversed);

        String status = kata.equals(reversed.toString()) ? "Palindrome" : "Bukan Palindrome";
        System.out.println("Status: " + status);
    }
    
}
