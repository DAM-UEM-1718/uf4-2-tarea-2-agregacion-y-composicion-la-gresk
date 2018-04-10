package Ejercicio1;

public class Test {
	public static void main(String[] args) {
		CPU miCPU = new CPU("Lenovo", 1000);
		Pantalla miPantalla = new Pantalla("Dorado", 17);
		Teclado miTeclado = new Teclado("Mecanico", "Grande");
		Raton miRaton = new Raton("Razer", "Muy ligero");
		Ordenador miOrdenador = new Ordenador(miCPU, miPantalla, miTeclado, miRaton);

		System.out.println("Las partes de mi ordenador son:");
		System.out.println(miOrdenador.getCPU());
		System.out.println(miOrdenador.getPantalla());
		System.out.println(miOrdenador.getRaton());
		System.out.println(miOrdenador.getTeclado());
	}

}