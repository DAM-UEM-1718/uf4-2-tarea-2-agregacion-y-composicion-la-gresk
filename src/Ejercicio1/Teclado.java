package Ejercicio1;

public class Teclado {
	private String Tipo;
	private String tamaño;
	
	

	public Teclado(String tipo, String tamaño) {
		Tipo = tipo;
		this.tamaño = tamaño;
	}



	public String getTipo() {
		return Tipo;
	}



	public void setTipo(String tipo) {
		Tipo = tipo;
	}



	public String getTamaño() {
		return tamaño;
	}



	public void setTamaño(String tamaño) {
		this.tamaño = tamaño;
	}



	@Override
	public String toString() {
		return "Teclado [Tipo=" + Tipo + ", tamaño=" + tamaño + "]";
	}

	
	
	
}