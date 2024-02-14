/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul11;

/**
 *
 * @author ACER
 */
public class contoh2 extends Thread {
    public void run(){
          try {
            for (int x = 1; x <=5; x++) {
                System.out.println("Angka : " + x);
                Thread.sleep(1000);

            }

        } catch (Exception exc) {
            exc.printStackTrace();

        }
    
    }
    
    public static void main(String[] args) {
        contoh2 out = new contoh2();
        contoh2 out2 = new contoh2();
        out2.start();
        out.start();
        
    }
    
    
}
