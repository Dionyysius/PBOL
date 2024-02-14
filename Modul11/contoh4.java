/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul11;

/**
 *
 * @author ACER
 */
public class contoh4 {
     public static void main(String[] args) {
        Thread out = new Thread (new Runnable () {
            public void run () {
                try {
                    for (int x = 1; x <= 5; x++) {
                        System.out.println("Angka" + x);
                        Thread.sleep(1000); // Waktu pending
                    }
                } catch (Exception exc) {
                    exc.printStackTrace();
                }
            }
        });
        out.start();
        }

}
