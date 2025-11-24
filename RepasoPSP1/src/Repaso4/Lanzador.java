package Repaso4;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Lanzador {
	public static void main(String[] args) {
		File f = new File (".");
		Scanner sc = new Scanner (System.in);
		try {
			Process pb = new ProcessBuilder("java","Repaso4.Media").directory(f).start();
			try(PrintWriter pw = new PrintWriter(new OutputStreamWriter(pb.getOutputStream()))){
				System.out.println("Escriba numeros");
				int num = sc.nextInt();
				while(num != 0) {
					pw.println(num);
					num = sc.nextInt();
				}
			}
			try(BufferedReader br = new BufferedReader(new InputStreamReader(pb.getInputStream()))){
				String aux = "";
				while((aux = br.readLine())!=null) {
					System.out.println(aux);
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
