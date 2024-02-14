/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul11;

/**
 *
 * @author ACER
 */
public class output extends Thread {
    private String toSay;
	public output(String st) {
		toSay = st;
	}
	public void run() {
		try {
			for(;;) {
				System.out.println(toSay);
				sleep(1000);
			}
		} catch(InterruptedException e) {
			System.out.println(e);
		}
	}
    public static void main(String[] args) {
        output thr1 = new output("Heloo");
          output thr2 = new output("There");
          thr1.start();
          thr2.start();
    }
    
}
