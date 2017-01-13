package com.ipartek.formacion.hola.pojo;

/**
 * Clase {@code Libro} representa un libro
 * 
 * @author Curso
 * 
 */
public class LibroNoEncapsulado {

	// Atributos
	public int numeropaginas;
	public String nombre;
	public String autor;

	// metodos o funciones de la clase libro
	public String describete() {
		return "Descripcion: " + this.nombre + " , " + this.numeropaginas + " paginas y fue escrito por " + this.autor;
	}

	/**
	 * Aumento el numero de paginas dependiendo de el numero que reciba
	 * 
	 * @param numpaginas
	 *            numero paginas nuevas escritas
	 */
	public void escribir(int numpaginas) {
		this.numeropaginas += numpaginas;
	}

}
