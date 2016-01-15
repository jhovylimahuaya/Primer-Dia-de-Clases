package pe.edu.upeu.poo.praticacalificada1;

public class Lavocal {
	
	public String calcVocal(double numero){
		
		int nume = (int) numero;
		
		String resultado = "";

		if (nume == 1) {
			resultado = "A";
		} else if (nume == 2) {
			resultado = "E";
		} else if (nume == 3) {
			resultado = "I";
		} else if (nume == 4) {
			resultado = "O";
		} else if(nume == 5){
			resultado = "U";
		} else if(nume > 5){
			resultado = "Ud, ha ingresado un valor incorrecto";
		}

		return resultado;
	}

}
