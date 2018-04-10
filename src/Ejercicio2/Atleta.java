package Ejercicio2;

public class Atleta {
	private String nombre;
	private long nacimiento;

	public Atleta(String nombre, long nacimiento) {
		this.nombre = nombre;
		this.nacimiento = nacimiento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public long getNacimiento() {
		return nacimiento;
	}

	public void setNacimiento(long nacimiento) {
		this.nacimiento = nacimiento;
	}

}
