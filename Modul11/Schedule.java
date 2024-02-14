/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul11;

import static java.lang.Thread.sleep;

/**
 *
 * @author ACER
 */
class Schedule implements Runnable {
	private static Thread [] jobs = new Thread[10];
	private int threadID;
                private String toSay;
	public Schedule(int ID) {
		threadID = ID;
	}
        @Override
//	public void run() {
//        System.out.println("Thread " + threadID + " is doing something");
//        // Implement what the thread should do here
//    }
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

	public static void  main(String [] args) {
		int nextThread = 0;
		
                
		for(int i=0; i<jobs.length; i++) {
		    jobs[i] = new Thread(new Job(i));
		    jobs[i].setPriority(Thread.MIN_PRIORITY);
		    jobs[i].start();
		}
		try {
		    for(;;) {
		        jobs[nextThread].setPriority(Thread.NORM_PRIORITY);
		        Thread.sleep(10);
		        jobs[nextThread].setPriority(Thread.MIN_PRIORITY);
		        nextThread = (nextThread + 1) % jobs.length;
		    }
		} catch(InterruptedException e) { System.out.println(e); }
	}
}