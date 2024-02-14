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
public class latihan5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Scanner sc = new Scanner(System.in);
        
        System.out.println("Masukan Input kata : ");
        String nama = sc.nextLine();
        String result = nama.replaceAll("[a,i,u,e,o]", "%");
        System.out.println("Output : "+result);
    }
    
}
