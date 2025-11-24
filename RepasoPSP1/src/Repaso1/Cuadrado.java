package Repaso1;

import java.util.Scanner;

public class Cuadrado {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int valor = 0;
		while(sc.hasNextInt()) {
			valor = sc.nextInt();
			System.out.println(valor*valor);
		}
		sc.close();
	}
}
