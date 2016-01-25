package pe.edu.upeu.poo.Bomberman;

public class JuegoBatalla {

	private boolean players;
	private String personje;
	private Dificultad dificultad = new Dificultad();
	public boolean isPlayers() {
		return players;
	}
	public void setPlayers(boolean players) {
		this.players = players;
	}
	public String getPersonje() {
		return personje;
	}
	public void setPersonje(String personje) {
		this.personje = personje;
	}
	public Dificultad getDificultad() {
		return dificultad;
	}
	public void setDificultad(Dificultad dificultad) {
		this.dificultad = dificultad;
	}
	
	
}
