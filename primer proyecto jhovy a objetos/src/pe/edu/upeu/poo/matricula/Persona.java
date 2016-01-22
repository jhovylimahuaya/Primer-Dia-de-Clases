package pe.edu.upeu.poo.matricula;

import java.util.Date;

public class Persona {

	private String nombre;
	private String apePaterno;
	private String apeMaterno;
	private String dni;
	private String direccion;
	private String celular;
	private String religion;
	private Boolean sexo;
	private LugardeNacimiento lugardeNacimiento;
	private Date FechaDeNacimiento;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApePaterno() {
		return apePaterno;
	}
	public void setApePaterno(String apePaterno) {
		this.apePaterno = apePaterno;
	}
	public String getApeMaterno() {
		return apeMaterno;
	}
	public void setApeMaterno(String apeMaterno) {
		this.apeMaterno = apeMaterno;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public String getReligion() {
		return religion;
	}
	public void setReligion(String religion) {
		this.religion = religion;
	}
	public Boolean getSexo() {
		return sexo;
	}
	public void setSexo(Boolean sexo) {
		this.sexo = sexo;
	}
	public LugardeNacimiento getLugardeNacimiento() {
		return lugardeNacimiento;
	}
	public void setLugardeNacimiento(LugardeNacimiento lugardeNacimiento) {
		this.lugardeNacimiento = lugardeNacimiento;
	}
	public Date getFechaDeNacimiento() {
		return FechaDeNacimiento;
	}
	public void setFechaDeNacimiento(Date fechaDeNacimiento) {
		FechaDeNacimiento = fechaDeNacimiento;
	}

	
	
	
}
