package pe.edu.upeu.poo.praticacalificada1;

import java.util.Scanner;

public class Pares {

	public static void main(String[] args) {
		
		Scanner par = new Scanner(System.in);
		
		int numero;
		
			System.out.println("Ingrese el número indicado");
			
			numero = par.nextInt();
			
		for (int i = 1; i <= numero;i++) {
			
			System.out.print("\n"+i*2);
		}
		
	}

}
