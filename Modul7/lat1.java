/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul7;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class lat1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double waktu = 0;
        
        try{
            System.out.println("Masukan Jarak Perjalanan Anda (km) : ");
            int jarak = sc.nextInt();
            System.out.println("Masukan Kecepatan kendaraan anda (km/jam) : ");
            int kecepatan = sc.nextInt();
            waktu=jarak/kecepatan;
        
        
        }catch(InputMismatchException e){
            System.out.println("Maaf terjadi kesalahan input");
        
        }catch(ArithmeticException e){
            System.out.println("Maaf terjadi kesalahan perhitungan");
        
        }finally{
            System.out.println("waktu yang dibutuhkan adalah : "+waktu+" jam");
        
        }
        System.out.println("Terimakasih");
        
        
    }
    
}
