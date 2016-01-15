package pe.edu.upeu.poo.clase2;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Repaso r = new Repaso();
		
		/** 
		 * para ingresar datos por teclado scan es el objeto
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Ingrese su peso en kilogramos");
		
		double peso = scan.nextDouble();
		
		System.out.println("Ingrese su altura en metros");
		
		double altura = scan.nextDouble();
		
		System.out.println("su IMC es: "+ r.calcIMC(peso, altura));
		
	}

}
