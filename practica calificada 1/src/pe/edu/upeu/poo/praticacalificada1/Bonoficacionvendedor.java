package pe.edu.upeu.poo.praticacalificada1;

import java.util.Scanner;

public class Bonoficacionvendedor {

	public static void main(String[] args) {
		
		Bonificacioncorrespondienteaunvendedor b = new Bonificacioncorrespondienteaunvendedor();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Bienvenido a nuestra ayuda de bonificaciones");
		System.out.println("Ingrese su nombre:");

		String nombre = scan.nextLine();
		System.out.println("Bienvenido S@ " + nombre);

		System.out.println("Ingrese el monto vendido");
		double monto = scan.nextDouble();

		System.out.println(nombre + b.calcBoni(monto));
				
	}

}
