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
public class latihan9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan sebuah kalimat : ");
        String sentence = scanner.nextLine();
        
        StringTokenizer tokens = new StringTokenizer(sentence);
        
        System.out.println("Kalimat anda terdiri dari kata - kata berikut ini : ");
        while(tokens.hasMoreTokens()){
            System.out.println(tokens.nextToken()+"  ");
        }
    
    }
    
}
