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
public class latDua {
    
    public static void main(String[] args) {
        int s=0;
        int v=0;
        int t=0;
        
        try{
            latDua lat = new latDua();
            s=lat.getJarak();
            v=lat.getKecepatan();
            t=lat.hitungWaktu(s, v);
        
        }catch(InputMismatchException e){
            System.out.println("Maaf terjadi kesalaahan input");
        
        }catch(ArithmeticException e){
            System.out.println("Maaf terjadi kesalahan perhitungan ");
        
        }finally{
            System.out.println("Waktu yang diperlukan adalah : "+t+"jam");
        }
    }

    public latDua() {
    }
    
    public int getJarak() throws InputMismatchException{
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukan Jarak Kendaraan anda (km) :");
        int jarak = sc.nextInt();
        return jarak;
    
    
    }
     public int getKecepatan() throws InputMismatchException{
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukan Kecepatan Kendaraan anda (km/jam) : ");
        int kecepatan = sc.nextInt();
        return kecepatan;
    
    
    }
     public int hitungWaktu(int jarak,int kecepatan) throws ArithmeticException{
         int waktu = 0;
         waktu=jarak/kecepatan;
        return waktu;
    }
}
