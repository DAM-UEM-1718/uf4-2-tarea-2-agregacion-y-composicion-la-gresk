package Ejercicio3;
/**
 * 
 * @author Carlos
 *
 */
public class Libro {
	private String titulo;
	private long isbn;
	private String autor;
	private int anoPublicacion;
	private Pagina[] paginas;
	private int numPaginas;

	public class Pagina {
		private String contenido;
		private int numero;

		public Pagina(String contenido, int numero) {
			this.contenido = contenido;
			this.numero = numero;
		}

		public String getContenido() {
			return contenido;
		}

		public void setContenido(String contenido) {
			this.contenido = contenido;
		}

		public int getNumero() {
			return numero;
		}

		public void setNumero(int numero) {
			this.numero = numero;
		}

		@Override
		public String toString() {
			return "Pagina [contenido=" + contenido + ", numero=" + numero + "]";
		}

	}

	public Libro(String titulo, long isbn, String autor, int anoPublicacion) {
		this.titulo = titulo;
		this.isbn = isbn;
		this.autor = autor;
		this.anoPublicacion = anoPublicacion;
		this.paginas = new Pagina[1000];
		this.numPaginas = 0;

	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public long getIsbn() {
		return isbn;
	}

	public void setIsbn(long isbn) {
		this.isbn = isbn;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getAnoPublicacion() {
		return anoPublicacion;
	}

	public void setAnoPublicacion(int anoPublicacion) {
		this.anoPublicacion = anoPublicacion;
	}

	public int getNumPaginas() {
		return numPaginas;
	}

	public void addPagina(String contenido, int numPagina) {
		this.paginas[this.numPaginas] = new Pagina(contenido, numPagina);
		this.numPaginas++;
	}

	public String getPagina(int numPagina) {
		if (numPagina <= 1000 && numPagina > 0) {
			return this.paginas[numPagina - 1].toString();
		}
		return null;
	}

}
