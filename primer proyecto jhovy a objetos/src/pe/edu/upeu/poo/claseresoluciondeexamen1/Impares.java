package pe.edu.upeu.poo.claseresoluciondeexamen1;

import java.util.Scanner;

public class Impares {

	public static void main(String[] args) {
		
		
		Scanner impar = new Scanner(System.in);
		
			System.out.println("Ingrese el número");
			
			int num = impar.nextInt();
			
		for (int i = 1; i <= num ; i=3) {
			
			System.out.print("\n"+i);
		}

	}

}
