package Ejercicio1;

public class CPU {

	private String Marca;
	private int Capacidad;

	public CPU(String marca, int capacidad) {
		this.Marca = marca;
		this.Capacidad = capacidad;
	}

	public String getMarca() {
		return Marca;
	}

	public void setMarca(String Marca) {
		this.Marca = Marca;
	}

	public int getCapacidad() {
		return Capacidad;
	}

	public void setCapacidad(int Capacidad) {
		this.Capacidad = Capacidad;
	}

	@Override
	public String toString() {
		return "CPU [Marca=" + Marca + ", Capacidad=" + Capacidad + "]";
	}

}