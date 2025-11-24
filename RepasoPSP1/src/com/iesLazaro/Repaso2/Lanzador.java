package com.iesLazaro.Repaso2;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Lanzador {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		File f = new File (".");
		try {
			Process pb = new ProcessBuilder("java","com.iesLazaro.Repaso2.GeneraCaracteres").directory(f).start();
			
			//Process 1
			try(PrintWriter pw = new PrintWriter(new OutputStreamWriter(pb.getOutputStream()));
					BufferedReader br = new BufferedReader(new InputStreamReader(pb.getInputStream()));
						BufferedReader brError = new BufferedReader(new InputStreamReader(pb.getErrorStream()))){
				System.out.println("Escribeme una linea");
				String lineaBase = sc.nextLine();
				pw.println(lineaBase);
				pw.close();
				
				String lineaRespuestaProceso1 = "";
				while((lineaRespuestaProceso1 = br.readLine())!=null) {
					System.out.println(lineaRespuestaProceso1);
				}
			}
		}catch(Exception e) {
			e.getStackTrace();
		}
		
		
		
		sc.close();
	}
}
