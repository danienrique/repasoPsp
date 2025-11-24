package Repaso4;

import java.util.Scanner;

public class Media {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int aux = 0;
		int cont = 0;
		while(sc.hasNextInt()) {
			aux += sc.nextInt();
			cont++;
		}
		System.out.println(aux/cont);
	}
}
