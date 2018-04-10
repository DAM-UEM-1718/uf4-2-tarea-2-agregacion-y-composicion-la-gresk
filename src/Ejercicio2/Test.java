package Ejercicio2;

public class Test {
	public static void main(String[] args) {
		Atleta Carlos =new Atleta("Carlos", 1995);
		Carrera miCarrera=new Carrera (100,1,2018);
		miCarrera.addCalle(1);
		miCarrera.setAtleta(1, Carlos);
		miCarrera.setTiempo(1, 5.25);
		
		System.out.println(miCarrera.getCalle(1));
		
	}
}
