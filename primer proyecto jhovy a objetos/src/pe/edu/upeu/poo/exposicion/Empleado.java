package pe.edu.upeu.poo.exposicion;

public class Empleado {
	
	public Empleado (String n, String c, int t){
		nombre = n;
		codigo = c;
		tipodeempleado = t;
		}
	public String nombre;
	public String codigo;
	public int tipodeempleado;
	
	public String getNombre(){
		return nombre;
	}
	public String getCodigo(){
		return codigo;
	}
	public int getTipodeempleado(){
		return tipodeempleado;
	
	}
	
}
