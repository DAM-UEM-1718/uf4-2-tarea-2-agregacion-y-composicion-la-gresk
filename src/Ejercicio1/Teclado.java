package Ejercicio1;

public class Teclado {
	private String Tipo;
	private String tama�o;
	
	

	public Teclado(String tipo, String tama�o) {
		Tipo = tipo;
		this.tama�o = tama�o;
	}



	public String getTipo() {
		return Tipo;
	}



	public void setTipo(String tipo) {
		Tipo = tipo;
	}



	public String getTama�o() {
		return tama�o;
	}



	public void setTama�o(String tama�o) {
		this.tama�o = tama�o;
	}



	@Override
	public String toString() {
		return "Teclado [Tipo=" + Tipo + ", tama�o=" + tama�o + "]";
	}

	
	
	
}