package com.ipartek.formacion.hola.pojo;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class RecetaTest {

	@Test
	public void testGluten() {

		Receta testmarmi = new Receta();

		Ingrediente aingredientes[] = new Ingrediente[16];

		aingredientes[0] = new Ingrediente(4, "patatas", false);
		aingredientes[1] = new Ingrediente(500, "bonito limpio", false);
		aingredientes[2] = new Ingrediente(2, "cebolletas", false);
		aingredientes[3] = new Ingrediente(2, "pimientos rojos", true);
		aingredientes[4] = new Ingrediente(1, "pimiento verde pequeño", false);
		aingredientes[5] = new Ingrediente(1, "cabeza de ajo", false);
		aingredientes[6] = new Ingrediente(4, "pimiento choricero", false);
		aingredientes[7] = new Ingrediente(40, "pan de sopa", true);
		aingredientes[8] = new Ingrediente(1, "tomate", false);
		aingredientes[9] = new Ingrediente(1, "agua", false);
		aingredientes[10] = new Ingrediente(1, "copa de brandy", false);
		aingredientes[11] = new Ingrediente(1, "aceite de oliva", false);
		aingredientes[12] = new Ingrediente(1, "sal", false);
		aingredientes[13] = new Ingrediente(1, "pimienta", false);
		aingredientes[14] = new Ingrediente(1, "guindilla", false);
		aingredientes[15] = new Ingrediente(1, "perejil", false);

		testmarmi.setAingredientes(aingredientes);

		assertTrue(testmarmi.glutenFree());
	}

	@Test
	public void testGluten2() {
		Receta testmarmi = new Receta();

		Ingrediente aingredientes[] = new Ingrediente[16];

		aingredientes[0] = new Ingrediente(4, "patatas", false);
		aingredientes[1] = new Ingrediente(500, "bonito limpio", false);
		aingredientes[2] = new Ingrediente(2, "cebolletas", false);
		aingredientes[3] = new Ingrediente(2, "pimientos rojos", false);
		aingredientes[4] = new Ingrediente(1, "pimiento verde pequeño", false);
		aingredientes[5] = new Ingrediente(1, "cabeza de ajo", false);
		aingredientes[6] = new Ingrediente(4, "pimiento choricero", false);
		aingredientes[7] = new Ingrediente(40, "pan de sopa", false);
		aingredientes[8] = new Ingrediente(1, "tomate", false);
		aingredientes[9] = new Ingrediente(1, "agua", false);
		aingredientes[10] = new Ingrediente(1, "copa de brandy", false);
		aingredientes[11] = new Ingrediente(1, "aceite de oliva", false);
		aingredientes[12] = new Ingrediente(1, "sal", false);
		aingredientes[13] = new Ingrediente(1, "pimienta", false);
		aingredientes[14] = new Ingrediente(1, "guindilla", false);
		aingredientes[15] = new Ingrediente(1, "perejil", false);

		testmarmi.setAingredientes(aingredientes);

		assertTrue(!testmarmi.glutenFree());
	}

	@Test
	public void testGluten3() {
		Receta testmarmi = new Receta();

		Ingrediente aingredientes[] = new Ingrediente[16];

		aingredientes[0] = new Ingrediente(4, "patatas", false);
		aingredientes[1] = new Ingrediente(500, "bonito limpio", false);
		aingredientes[2] = new Ingrediente(2, "cebolletas", false);
		aingredientes[3] = new Ingrediente(2, "pimientos rojos", false);
		aingredientes[4] = new Ingrediente(1, "pimiento verde pequeño", false);
		aingredientes[5] = new Ingrediente(1, "cabeza de ajo", false);
		aingredientes[6] = new Ingrediente(4, "pimiento choricero", false);
		aingredientes[7] = null;
		aingredientes[8] = new Ingrediente(1, "tomate", false);
		aingredientes[9] = new Ingrediente(1, "agua", false);
		aingredientes[10] = new Ingrediente(1, "copa de brandy", false);
		aingredientes[11] = new Ingrediente(1, "aceite de oliva", false);
		aingredientes[12] = new Ingrediente(1, "sal", false);
		aingredientes[13] = new Ingrediente(1, "pimienta", false);
		aingredientes[14] = new Ingrediente(1, "guindilla", false);
		aingredientes[15] = new Ingrediente(1, "perejil", false);

		testmarmi.setAingredientes(aingredientes);

		assertTrue(!testmarmi.glutenFree());
	}

}
