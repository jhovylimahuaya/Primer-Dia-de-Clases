package pe.edu.upeu.poo.Bomberman;

public class JuegoNormal {
	
	private boolean player;
	private Dificultad dificultad = new Dificultad();
	private String siguienteNivel;
	public boolean isPlayer() {
		return player;
	}
	public void setPlayer(boolean player) {
		this.player = player;
	}
	public Dificultad getDificultad() {
		return dificultad;
	}
	public void setDificultad(Dificultad dificultad) {
		this.dificultad = dificultad;
	}
	public String getSiguienteNivel() {
		return siguienteNivel;
	}
	public void setSiguienteNivel(String siguienteNivel) {
		this.siguienteNivel = siguienteNivel;
	}
	

}
