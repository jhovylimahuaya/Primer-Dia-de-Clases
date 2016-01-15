package pe.edu.upeu.poo.praticacalificada1;

import java.util.Scanner;

public class Vocal {

	public static void main(String[] args) {
		
		Lavocal v = new Lavocal();
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Bienvenido");
		System.out.println("Ingrese su nombre:");

		String nombre = scan.nextLine();
		System.out.println("Hola " + nombre);

		System.out.println("Ingresa el número");
		double numero = scan.nextDouble();

		System.out.println(v.calcVocal(numero));

	}

}
