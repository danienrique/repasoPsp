package Repaso3;

import java.lang.Thread.State;

public class Main {
	public static void main(String[] args) {
		Robot r1 = new Robot("Hoal");
		Robot r2 = new Robot("Knekro");

		System.out.println(r1.getState());
		r1.start();
		try {
			r1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(r1.getState());
		System.out.println(r2.getState());
		r2.start();
		try {
			r2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(r2.getState());
		System.out.println("Acabado todos");
	}
}