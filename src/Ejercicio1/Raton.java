package Ejercicio1;

public class Raton {
	private String MarcaRaton;
	private String peso;

	public Raton(String marcaRaton, String peso) {
		MarcaRaton = marcaRaton;
		this.peso = peso;
	}

	public String getMarcaRaton() {
		return MarcaRaton;
	}

	public void setMarcaRaton(String MarcaRaton) {
		this.MarcaRaton = MarcaRaton;
	}

	public String getPeso() {
		return peso;
	}

	public void setPeso(String peso) {
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "Raton [MarcaRaton=" + MarcaRaton + ", peso=" + peso + "]";
	}

}