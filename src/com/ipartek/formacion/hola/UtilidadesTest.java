package com.ipartek.formacion.hola;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class UtilidadesTest {

	@Test
	public void testGetNumeroAleatorio() {
		int numero = -1;
		final int NUMERO_MAXIMO = 10;

		// crear array con todo false
		boolean[] aResultado = new boolean[NUMERO_MAXIMO];

		// generar mil numeros aleatorios y atualizar el array con true
		for (int i = 0; i < 1000; i++) {
			numero = Utilidades.getNumeroAleatorio(NUMERO_MAXIMO);
			aResultado[numero] = true;
		}

		// recorer array comprobar todo true;
		for (int i = 0; i < NUMERO_MAXIMO; i++) {
			assertTrue(aResultado[i]);
		}
	}

	@Test
	public void testSumaTonta() {
		/*
		 * int num1 = (int) (Math.random() * 150 - 50); int num2 = (int)
		 * (Math.random() * 150 - 50); int numero = Utilidades.sumaTonta(num1,
		 * num2);
		 */
		assertEquals("no suma bien", 5, Utilidades.sumaTonta(2, 3));
		assertEquals("un numero negativo retorna 0", 0, Utilidades.sumaTonta(-2, 3));
		assertEquals("dos numeros negativos retornan 0", 0, Utilidades.sumaTonta(-2, -3));
		assertEquals("un numero negativo retorna 0", 0, Utilidades.sumaTonta(2, -3));
		assertEquals(">100 retorna 0", 0, Utilidades.sumaTonta(1, 100));

		/*
		 * if (num1 < 0 || num2 < 0) { assertTrue(true); } else if (num1 > 0 &&
		 * num2 > 0) { assertTrue(true); } else if (num1 + num2 > 100) {
		 * assertTrue(true); }
		 */

	}

	@Test
	public void testNoFallaNunca() {
		assertTrue(true);
	}
}
