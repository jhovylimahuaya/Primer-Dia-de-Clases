package pe.edu.upeu.poo.matricula;

public class Institucion{
	
	private String razonSocial;
	private int RUC;
	private String Direccion;
	private String Email;
	private String Celular;
	private String Fax;
	private String redessociales;
	private Persona Director = new Persona();
	private String web;
	private String Logotipo;
	private Matricula matricula = new Matricula();
	
	public Matricula getMatricula() {
		return matricula;
	}
	public void setMatricula(Matricula matricula) {
		this.matricula = matricula;
	}
	public String getRazonSocial() {
		return razonSocial;
	}
	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}
	public int getRUC() {
		return RUC;
	}
	public void setRUC(int rUC) {
		RUC = rUC;
	}
	public String getDireccion() {
		return Direccion;
	}
	public void setDireccion(String direccion) {
		Direccion = direccion;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getCelular() {
		return Celular;
	}
	public void setCelular(String celular) {
		Celular = celular;
	}
	public String getFax() {
		return Fax;
	}
	public void setFax(String fax) {
		Fax = fax;
	}
	public String getRedessociales() {
		return redessociales;
	}
	public void setRedessociales(String redessociales) {
		this.redessociales = redessociales;
	}
	public Persona getDirector() {
		return Director;
	}
	public void setDirector(Persona director) {
		Director = director;
	}
	public String getWeb() {
		return web;
	}
	public void setWeb(String web) {
		this.web = web;
	}
	public String getLogotipo() {
		return Logotipo;
	}
	public void setLogotipo(String logotipo) {
		Logotipo = logotipo;
	}

	
	
}
