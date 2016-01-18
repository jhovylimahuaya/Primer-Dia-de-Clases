package pe.edu.upeu.poo.praticacalificada1;

public class Bonificacioncorrespondienteaunvendedor {

	public String calcBoni(double monto){
		
		double boni = monto;

		String resultado = "";

		if (boni >= 0 && boni <=1000) {
			resultado = " no tienes descuento";
		} else if (boni >= 1001 && boni <= 5000) {
			resultado = " tu descuento del 3% es: " + monto*0.03;
		} else if (boni >= 5001 && boni <= 20000) {
			resultado = " tu descuento del 5% es: "+ monto*0.05;
		} else if (boni >= 20001) {
			resultado = " tu descuento del 8% es: "+ monto*0.08;
		}

		return resultado;
		
		
	}
	
	
	
}
