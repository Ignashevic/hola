package com.ipartek.formacion.hola.pojo;

public class Libro {

	// atributos
	private String titulo;
	private String autor;
	private int numeropaginas;

	/*
	 * Constructores
	 * 
	 * Sirven para instanciar/crear objetos de la clase </br> Tienen el mismo
	 * nombre que la clase No hace falta especificar el <code>return</code>
	 * 
	 * sobrecarga: es un metodo con el mismo nombre y mismo return, pero </br>
	 * con diferentes parametros
	 * 
	 */

	// constructor por defecto
	public Libro() {
		super();
		this.numeropaginas = 0;
		this.autor = "anonimo";
		this.titulo = "desconocido";
	}

	// constructor con parametros
	public Libro(String titulo, int numeropaginas) {
		super();
		this.titulo = titulo;
		this.autor = "anonimo";
		this.setNumeropaginas(numeropaginas);
	}

	public Libro(String titulo, String autor, int numeropaginas) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.numeropaginas = numeropaginas;
	}

	// getters y setters
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getNumeropaginas() {
		return numeropaginas;
	}

	public void setNumeropaginas(int numeropaginas) {
		this.numeropaginas = (numeropaginas < 0) ? 0 : numeropaginas;
	}

	// otros metodos

	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", autor=" + autor + ", numeropaginas=" + numeropaginas + "]";
	}

}
