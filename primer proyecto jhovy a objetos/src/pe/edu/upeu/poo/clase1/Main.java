package pe.edu.upeu.poo.clase1;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {

	public static void main(String[] args) {
		
		Persona jhovy = new Persona();
		jhovy.nombre = "Jhovy Nhewspkki";
		jhovy.altura = 1.68;
		jhovy.apeMaterno = "Paco";	//camelcase
		jhovy.apePaterno = "Limahuaya";
		jhovy.celular = "935991141";
		jhovy.direccion = "Av. Ejercito 426";
		jhovy.dni = "70100587";
		jhovy.email = "jhovylimahuaya@gmail.com";
		jhovy.estadocivil = "comprometido";
		jhovy.religion = "catolico";
		jhovy.sexo = "masculino";
		jhovy.tipodesangre = "o+";
		jhovy.vive = true;
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		try {
			jhovy.fechadenacimiento = sdf.parse("11/04/1996");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		System.out.print(jhovy);
		

	}

}
