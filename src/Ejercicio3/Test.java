package Ejercicio3;

public class Test {
	public static void main(String[] args) {
		Libro miLibro = new Libro("Titulo inventado", 123456789, "Yo", 22548);
		miLibro.addPagina("pagina uno", 1);
		miLibro.addPagina("pagina dos", 2);
		System.out.println(miLibro.getPagina(1));
		System.out.println(miLibro.getPagina(2));
	}
}
