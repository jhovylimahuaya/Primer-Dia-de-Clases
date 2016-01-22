package pe.edu.upeu.poo.asitenciapersonal;

import java.util.Date;

public class Personae {
	
	private String nombre;
	private String apePaterno;
	private String apeMaterno;
	private String dni;
	private String Direccion;
	private String Celular;
	private String religion;
	private Boolean sexo;
	private Lugardenacimiento lugardenacimiento;
	private Date fechadenacimiento;
	
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
		return Direccion;
	}
	public void setDireccion(String direccion) {
		Direccion = direccion;
	}
	public String getCelular() {
		return Celular;
	}
	public void setCelular(String celular) {
		Celular = celular;
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
	public Lugardenacimiento getLugardenacimiento() {
		return lugardenacimiento;
	}
	public void setLugardenacimiento(Lugardenacimiento lugardenacimiento) {
		this.lugardenacimiento = lugardenacimiento;
	}
	public Date getFechadenacimiento() {
		return fechadenacimiento;
	}
	public void setFechadenacimiento(Date fechadenacimiento) {
		this.fechadenacimiento = fechadenacimiento;
	}
	
	

}
