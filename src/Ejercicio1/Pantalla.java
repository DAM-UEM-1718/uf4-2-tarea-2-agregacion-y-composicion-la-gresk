package Ejercicio1;

public class Pantalla {
	private String Color;
	private int Pulgadas;

	public Pantalla(String color, int pulgadas) {
		this.Color = color;
		this.Pulgadas = pulgadas;
	}

	public String getColor() {
		return Color;
	}

	public void setColor(String Color) {
		this.Color = Color;
	}

	public int getPulgadas() {
		return Pulgadas;
	}

	public void setPulgadas(int Pulgadas) {
		this.Pulgadas = Pulgadas;
	}

	@Override
	public String toString() {
		return "Pantalla [Color=" + Color + ", Pulgadas=" + Pulgadas + "]";
	}

}