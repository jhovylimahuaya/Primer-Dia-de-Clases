package pe.edu.upeu.poo.clase2;

public class Repaso {

	public static void main(String[] args) {
		Repaso r = new Repaso();
		
		double a = 25;
		double b = 144;
			/**
			 * Suma +
			 * Resta -
			 * Multiplicacion *
			 * Division /
			 * Modulo %
			 * Clase de ayuda metematica "Math"
			 */
		
		
		//esta instrución me sirve para imprimir en la consola
		System.out.println(a+b);
		System.out.println("operaciones logicas");
		
		/**
		 * and &&
		 * or ||
		 * negacion !
		 */
		
		System.out.println(!true);
		System.out.println("Calculando su IGV");
		System.out.println("Su pago de IGV es: "+r.calcIGV(100));
		System.out.println("Calculando Indice de Masa Corporal");
		System.out.println("Su IMC es: "+r.calcIMC(74,1.67 ));
		
		
	}	
		public int sumar(int num1, int num2){
		return num1+num2;	
		}
		public double calcIGV(double monto){
			double IGV = 0.18;
			return monto*IGV;
		}
		public double calcIMC(double peso, double altura){
			return peso/Math.pow(altura, 2);
		}
		
		
}
