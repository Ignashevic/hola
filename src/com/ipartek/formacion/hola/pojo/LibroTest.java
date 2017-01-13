package com.ipartek.formacion.hola.pojo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LibroTest {

	@Test
	public void testTitulo() {

		Libro librojava = new Libro();

		librojava.setTitulo("java7");

		assertEquals("java7", librojava.getTitulo());

	}

	@Test
	public void testConstructorConParametros() {

		Libro L = new Libro("java 7", 324);
		assertEquals("java 7", L.getTitulo());
		assertEquals("anonimo", L.getAutor());
		assertEquals(324, L.getNumeropaginas());

		// paginas negativas
		L = new Libro("java 7", -324);
		assertEquals("java 7", L.getTitulo());
		assertEquals("anonimo", L.getAutor());
		assertEquals(0, L.getNumeropaginas());
	}

	@Test
	public void testNumeroPaginas() {
		Libro L = new Libro();
		// numero paginas positivo
		L.setNumeropaginas(300);
		assertEquals(300, L.getNumeropaginas());

		// numero paginas negativo == 0
		L.setNumeropaginas(-300);
	}

	@Test
	public void testLibro() {
		Libro L = new Libro();
		assertEquals("desconocido", L.getTitulo());
		assertEquals("anonimo", L.getAutor());
		assertEquals(0, L.getNumeropaginas());
	}

}
