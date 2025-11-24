package Repaso1;

import java.util.Scanner;

public class SumaDigitos {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int valor = 0;
		int sumatorio = 0;
		while(sc.hasNextInt()) {
			valor = sc.nextInt();
			sumatorio += valor;
		}
		System.out.println(sumatorio);
		sc.close();
	}
}
