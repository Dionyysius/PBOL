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
public class latihan7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        StringBuffer fullName = new StringBuffer();
        System.out.print("Masukan First Name : ");
        String firstName = sc.nextLine();
        System.out.print("Masukan Middle Name : ");
        String middleName = sc.nextLine();
        System.out.print("Masukan Last Name : ");
        String lastName = sc.nextLine();

        fullName.append(firstName).append(" ").append(middleName).append(" ").append(lastName);

        System.out.println("Fullname: " + fullName.toString());
    }
    
}
