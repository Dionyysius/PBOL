/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul11;

import java.util.Calendar;

/**
 *
 * @author ACER
 */
public class jam {
    public static void main(String[] args) {
        Thread secondThread = new Thread(new Second());
        Thread minuteThread = new Thread(new Minute());
        Thread hourThread = new Thread(new Hour());

        secondThread.start();
        minuteThread.start();
        hourThread.start();
    }
}

class Second implements Runnable {
    public void run() {
        while (true) {
            Calendar cal = Calendar.getInstance();
            int second = cal.get(Calendar.SECOND);
            System.out.println("Detik: " + second);

            try {
                Thread.sleep(1000); // Tunggu 1 detik
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Minute implements Runnable {
    public void run() {
        while (true) {
            Calendar cal = Calendar.getInstance();
            int minute = cal.get(Calendar.MINUTE);
            System.out.println("Menit: " + minute);

            try {
                Thread.sleep(60000); // Tunggu 1 menit
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Hour implements Runnable {
    public void run() {
        while (true) {
            Calendar cal = Calendar.getInstance();
            int hour = cal.get(Calendar.HOUR_OF_DAY);
            System.out.println("Jam: " + hour);

            try {
                Thread.sleep(3600000); // Tunggu 1 jam
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

