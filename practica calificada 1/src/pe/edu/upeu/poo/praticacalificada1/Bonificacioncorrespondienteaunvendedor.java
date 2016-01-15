package pe.edu.upeu.poo.praticacalificada1;

public class Bonificacioncorrespondienteaunvendedor {

	public String calcBoni(double monto){
		
		double boni = monto;

		String resultado = "";

		if (boni >= 0 && boni <=1000) {
			resultado = " no tienes descuento";
		} else if (boni >= 1001 && boni <= 5000) {
			resultado = " tu descuento es del 3%";
		} else if (boni >= 5001 && boni <= 20000) {
			resultado = " tu descuento es del 5%";
		} else if (boni >= 20001) {
			resultado = " tu descuento es del 8%";
		}

		return resultado;
		
		
	}
	
	
	
}
