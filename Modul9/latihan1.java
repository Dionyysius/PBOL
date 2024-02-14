/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Modul9;

import java.io.File;

/**
 *
 * @author ACER
 */
public class latihan1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        File file = new File("sample.txt");
        if (!file.exists()) {
            System.out.println("Maaf file tidak ditemukan ");
            
        }else{
            System.out.println("File ditemukan");
            System.out.println("Nama File : "+file.getName());
            System.out.println("Full Path : "+file.getAbsoluteFile().getParentFile().getPath());
        }
    }
    
}
