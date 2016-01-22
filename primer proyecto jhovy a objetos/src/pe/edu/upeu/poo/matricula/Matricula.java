package pe.edu.upeu.poo.matricula;

public class Matricula {
	
	private String Codigo;
	private String nroMatricula;
	private String Partidadenacimiento;
	private String nroHermanos;
	private Boolean traslado;
	private String certificadodeestudios;
	private String Gradodeestudios;
	private TipodePago tipodepago;
	
	public String getCodigo() {
		return Codigo;
	}
	public void setCodigo(String codigo) {
		Codigo = codigo;
	}
	public String getNroMatricula() {
		return nroMatricula;
	}
	public void setNroMatricula(String nroMatricula) {
		this.nroMatricula = nroMatricula;
	}
	public String getPartidadenacimiento() {
		return Partidadenacimiento;
	}
	public void setPartidadenacimiento(String partidadenacimiento) {
		Partidadenacimiento = partidadenacimiento;
	}
	public String getNroHermanos() {
		return nroHermanos;
	}
	public void setNroHermanos(String nroHermanos) {
		this.nroHermanos = nroHermanos;
	}
	public Boolean getTraslado() {
		return traslado;
	}
	public void setTraslado(Boolean traslado) {
		this.traslado = traslado;
	}
	public String getCertificadodeestudios() {
		return certificadodeestudios;
	}
	public void setCertificadodeestudios(String certificadodeestudios) {
		this.certificadodeestudios = certificadodeestudios;
	}
	public String getGradodeestudios() {
		return Gradodeestudios;
	}
	public void setGradodeestudios(String gradodeestudios) {
		Gradodeestudios = gradodeestudios;
	}
	public TipodePago getTipodepago() {
		return tipodepago;
	}
	public void setTipodepago(TipodePago tipodepago) {
		this.tipodepago = tipodepago;
	}
	
	
	
	

}
