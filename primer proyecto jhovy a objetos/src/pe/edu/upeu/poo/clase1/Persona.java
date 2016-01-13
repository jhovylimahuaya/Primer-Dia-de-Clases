package pe.edu.upeu.poo.clase1;

import java.util.Date;

public class Persona {
	String nombre;
	String apePaterno;
	String apeMaterno;
	Double altura;
	String dni;
	String celular;
	Date fechadenacimiento;
	String email;
	String tipodesangre;
	String direccion;
	String religion;
	String sexo;
	String estadocivil;
	Boolean vive;
	
	public int getEdad(){
		return 0;
		
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ",\n apePaterno=" + apePaterno + ",\n apeMaterno=" + apeMaterno + ",\n altura="
				+ altura + ",\n dni=" + dni + ",\n celular=" + celular + ",\n fechadenacimiento=" + fechadenacimiento
				+ ",\n email=" + email + ",\n tipodesangre=" + tipodesangre + ",\n direccion=" + direccion + ",\n religion="
				+ religion + ",\n sexo=" + sexo + ",\n estadocivil=" + estadocivil + ",\n vive=" + vive + "]";
	}
	
	
}
