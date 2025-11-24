package com.iesLazaro.Repaso2;

import java.util.Scanner;

public class GeneraCaracteres {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String lineaTratar = sc.nextLine();
		String[] lineaDividida = lineaTratar.split("");
		for(int i = 0; i < lineaDividida.length; i++) {
			System.out.println(lineaDividida[i]);
		}
		sc.close();
	}
}
