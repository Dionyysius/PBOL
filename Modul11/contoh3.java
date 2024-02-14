/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul11;

/**
 *
 * @author ACER
 */
public class contoh3 implements Runnable {

    public void run() {
        for (int x = 1; x <= 5; x++) {
            try {
                System.out.println("Angka : " + x);
                Thread.sleep(1000);
            } catch (Exception exc) {
                System.out.println("Pesan Error : " + exc.getMessage());
            }
        }
    }


    public static void main(String[] args) {
        // Buat Objek dari class Cetak
        contoh3 out = new contoh3();
        // Mulai jalankan Thread
        Thread td = new Thread(out);
        td.start();
        
    }
}

