package com.ipartek.formacion.hola.ejercicios;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.util.ArrayList;

import org.junit.Test;

public class ArrayListTest {

	ArrayList<String> paises;

	/**
	 * aprendiendo a usar arraylist
	 */
	@Test
	public void test() {
		assertNull("Deberia ser null", paises);

		paises = new ArrayList<String>();
		assertNotNull("No deberia ser null", paises);

		assertEquals("0 paises", 0, paises.size());

		paises.add("España");

		assertEquals("1 pais", 1, paises.size());

		paises.add("Uzbekistan");
		paises.add("Portugal");
		paises.add("Barakaldo");
		paises.add("Alemania");

		assertEquals("5 paises", 5, paises.size());

		assertEquals("Barakaldo", paises.remove(3));

		assertEquals("4 paises", 4, paises.size());

		paises.add(1, "Portugalete");

		assertEquals("5 paises", 5, paises.size());

		assertEquals("España", paises.get(0));
		assertEquals("Portugalete", paises.get(1));
		assertEquals("Uzbekistan", paises.get(2));

	}

}
