package Repaso1;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Lanzador {
	public static void main(String[] args) {
		File f = new File(".");
		ArrayList<Integer> listaNumeros = new ArrayList<Integer>();
		try{
			
			//Process 1
			Process pbGN = new ProcessBuilder("java","Repaso1.GeneraNumero",args[0]).directory(f).start();
			try(BufferedReader br = new BufferedReader(new InputStreamReader(pbGN.getInputStream()))){
				String i = "";
//				int aux = 0;
				while((i= br.readLine())!=null) {
					listaNumeros.add(Integer.parseInt(i));
					System.out.println(i);
//					System.out.println(listaNumeros.get(aux));
//					aux++;
				}
			}try(BufferedReader br = new BufferedReader(new InputStreamReader(pbGN.getErrorStream()))){
				String i = "";
				while((i= br.readLine())!=null) {
					System.out.println(i);
				}
			}
			pbGN.waitFor();

			//Process 2
			Process pbCuadrado = new ProcessBuilder("java","Repaso1.Cuadrado").directory(f).start();
			try(PrintWriter pwCuadrado = new PrintWriter(new OutputStreamWriter(pbCuadrado.getOutputStream()));
					BufferedReader brCuadrado = new BufferedReader(new InputStreamReader(pbCuadrado.getInputStream()));
					BufferedReader brCuadradoerror = new BufferedReader(new InputStreamReader(pbCuadrado.getErrorStream()))){
				for(int aux:listaNumeros) {
					pwCuadrado.println(aux);
				}
				pwCuadrado.close();
				String i = "";
				while((i = brCuadrado.readLine()) != null) {
					System.out.println(i);
				}
				while((i = brCuadradoerror.readLine()) != null) {
					System.out.println(i);
				}
			}
			pbCuadrado.waitFor();
			
			//Process 3
			Process pbSuma = new ProcessBuilder("java","Repaso1.SumaDigitos").directory(f).start();
			try(PrintWriter pwSuma = new PrintWriter(new OutputStreamWriter(pbSuma.getOutputStream()));
					BufferedReader brSuma = new BufferedReader(new InputStreamReader(pbSuma.getInputStream()))){
				for(int aux:listaNumeros) {
					pwSuma.println(aux);
				}
				pwSuma.close();
				String i = "";
				while((i = brSuma.readLine()) != null) {
					System.out.println(i);
				}
			}
			pbSuma.waitFor();
		} catch(Exception e) {
			e.getStackTrace();
		}
	}
}