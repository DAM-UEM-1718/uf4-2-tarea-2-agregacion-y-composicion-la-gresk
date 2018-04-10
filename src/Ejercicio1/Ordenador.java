package Ejercicio1;
/**
 * 
 * @author Alejandro y Antonio
 *
 */
public class Ordenador {
	private CPU CPU;
	private Pantalla Pantalla;
	private Teclado Teclado;
	private Raton Raton;

	public Ordenador(CPU CPU, Pantalla Pantalla, Teclado Teclado, Raton Raton) {
		this.CPU = CPU;
		this.Pantalla = Pantalla;
		this.Teclado = Teclado;
		this.Raton = Raton;
	}

	public String getCPU() {
		return CPU.toString();
	}

	public String getPantalla() {
		return Pantalla.toString();
	}

	public String getTeclado() {
		return Teclado.toString();
	}

	public String getRaton() {
		return Raton.toString();
	}

}