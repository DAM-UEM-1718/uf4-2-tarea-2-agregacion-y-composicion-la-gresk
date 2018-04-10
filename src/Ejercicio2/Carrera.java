package Ejercicio2;

import java.util.ArrayList;
import java.util.Arrays;
/**
 * 
 * @author Ivan
 *
 */
public class Carrera {
	private int distancia;
	private int ronda;
	private long fecha;
	private Calle[] calles;
	private int numCalles;

	public class Calle {
		private int numero;
		private Atleta corredor;
		private double tiempo;

		public Calle(int numero) {
			this.numero = numero;
		}

		public int getNumero() {
			return numero;
		}

		public Atleta getCorredor() {
			return corredor;
		}

		public void setCorredor(Atleta corredor) {
			this.corredor = corredor;
		}

		public double getTiempo() {
			return tiempo;
		}

		public void setTiempo(double tiempo) {
			this.tiempo = tiempo;
		}

		@Override
		public String toString() {
			return "Calle [numero=" + numero + ", corredor=" + corredor.getNombre() + ", tiempo=" + tiempo + "]";
		}

	}

	public Carrera(int distancia, int ronda, long fecha) {
		this.distancia = distancia;
		this.ronda = ronda;
		this.fecha = fecha;
		this.calles = new Calle[10];
		this.numCalles = 0;
	}

	public int getDistancia() {
		return distancia;
	}

	public void setDistancia(int distancia) {
		this.distancia = distancia;
	}

	public int getRonda() {
		return ronda;
	}

	public void setRonda(int ronda) {
		this.ronda = ronda;
	}

	public long getFecha() {
		return fecha;
	}

	public void setFecha(long fecha) {
		this.fecha = fecha;
	}

	public void addCalle(int num) {
		this.calles[numCalles] = new Calle(num);
		this.numCalles++;
	}

	public void setAtleta(int numCalle,Atleta atleta) {
		this.calles[numCalle-1].setCorredor(atleta);
	}
	public void setTiempo(int numCalle,Double tiempo) {
		this.calles[numCalle-1].setTiempo(tiempo);
	}
	public String getCalle(int numCalle) {
		return calles[numCalle-1].toString();
	}

	@Override
	public String toString() {
		return "Carrera [distancia=" + distancia + ", ronda=" + ronda + ", fecha=" + fecha + ", calles="
				+ Arrays.toString(calles) + ", numCalles=" + numCalles + "]";
	}
	
}
