package pe.edu.upeu.poo.Bomberman;

public class MenuPricipal {
	
	private JuegoNormal normal = new JuegoNormal();
	private JuegoBatalla batalla = new JuegoBatalla();
	private Opciones opciones;
	public JuegoNormal getNormal() {
		return normal;
	}
	public void setNormal(JuegoNormal normal) {
		this.normal = normal;
	}
	public JuegoBatalla getBatalla() {
		return batalla;
	}
	public void setBatalla(JuegoBatalla batalla) {
		this.batalla = batalla;
	}
	public Opciones getOpciones() {
		return opciones;
	}
	public void setOpciones(Opciones opciones) {
		this.opciones = opciones;
	}
	

}
