/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul11;

/**
 *
 * @author ACER
 */
class Job implements Runnable {
	private static Thread [] jobs = new Thread[4];
	private int threadID;
	public Job(int ID) {
		threadID = ID;
	}
        @Override
	public void run() {
        System.out.println("Thread " + threadID + " is doing something");
        // Implement what the thread should do here
    }

	public static void main(String [] args) {
		for(int i=0; i<jobs.length; i++) {
		    jobs[i] = new Thread(new Job(i));
		    jobs[i].start();
		}
		try {
		    for(int i=0; i<jobs.length; i++) {
		        jobs[i].join();
		    }
		} catch(InterruptedException e) { System.out.println(e); }
	}
}
