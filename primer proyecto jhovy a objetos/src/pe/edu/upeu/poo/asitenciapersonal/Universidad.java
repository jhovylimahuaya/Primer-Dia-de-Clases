package pe.edu.upeu.poo.asitenciapersonal;

public class Universidad {
	
	private String UPeU;
	private String ruc;
	private String direccion;
	private String Email;
	private Personae rectora = new Personae();
	public String getUPeU() {
		return UPeU;
	}
	public void setUPeU(String uPeU) {
		UPeU = uPeU;
	}
	public String getRuc() {
		return ruc;
	}
	public void setRuc(String ruc) {
		this.ruc = ruc;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public Personae getRectora() {
		return rectora;
	}
	public void setRectora(Personae rectora) {
		this.rectora = rectora;
	}
	
	

}
