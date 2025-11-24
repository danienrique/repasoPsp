package Repaso1;

public class GeneraNumero {
	public static void main(String[] args) {
		int aux = Integer.parseInt(args[0]);
		int aux2 = aux;
		while(aux2>1) {
			System.out.println(aux2);
			aux2--;
		}
	}
}