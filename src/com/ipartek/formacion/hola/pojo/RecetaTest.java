package com.ipartek.formacion.hola.pojo;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Test;

public class RecetaTest {

	@Test
	public void testGluten() {

		Receta testmarmi = new Receta();

		ArrayList<Ingrediente> aingredientes = new ArrayList<Ingrediente>();

		aingredientes.add(new Ingrediente(4, "patatas", false));
		aingredientes.add(new Ingrediente(500, "bonito limpio", false));
		aingredientes.add(new Ingrediente(2, "cebolletas", false));
		aingredientes.add(new Ingrediente(2, "pimientos rojos", false));
		aingredientes.add(new Ingrediente(1, "pimiento verde pequeño", false));
		aingredientes.add(new Ingrediente(1, "cabeza de ajo", false));
		aingredientes.add(new Ingrediente(4, "pimiento choricero", false));
		aingredientes.add(new Ingrediente(40, "pan de sopa", false));
		aingredientes.add(new Ingrediente(1, "tomate", false));
		aingredientes.add(new Ingrediente(1, "agua", false));
		aingredientes.add(new Ingrediente(1, "copa de brandy", false));
		aingredientes.add(new Ingrediente(1, "aceite de oliva", false));
		aingredientes.add(new Ingrediente(1, "sal", false));
		aingredientes.add(new Ingrediente(1, "pimienta", false));
		aingredientes.add(new Ingrediente(1, "guindilla", false));
		aingredientes.add(new Ingrediente(1, "perejil", false));

		testmarmi.setAingredientes(aingredientes);

		assertFalse(testmarmi.glutenFree());
	}

	@Test
	public void testGluten2() {
		Receta testmarmi = new Receta();

		ArrayList<Ingrediente> aingredientes = new ArrayList<Ingrediente>();

		aingredientes.add(new Ingrediente(4, "patatas", false));
		aingredientes.add(new Ingrediente(500, "bonito limpio", false));
		aingredientes.add(new Ingrediente(2, "cebolletas", false));
		aingredientes.add(new Ingrediente(2, "pimientos rojos", false));
		aingredientes.add(new Ingrediente(1, "pimiento verde pequeño", false));
		aingredientes.add(new Ingrediente(1, "cabeza de ajo", false));
		aingredientes.add(new Ingrediente(4, "pimiento choricero", false));
		aingredientes.add(new Ingrediente(40, "pan de sopa", false));
		aingredientes.add(new Ingrediente(1, "tomate", false));
		aingredientes.add(new Ingrediente(1, "agua", false));
		aingredientes.add(new Ingrediente(1, "copa de brandy", false));
		aingredientes.add(new Ingrediente(1, "aceite de oliva", false));
		aingredientes.add(new Ingrediente(1, "sal", false));
		aingredientes.add(new Ingrediente(1, "pimienta", false));
		aingredientes.add(new Ingrediente(1, "guindilla", false));
		aingredientes.add(new Ingrediente(1, "perejil", false));

		testmarmi.setAingredientes(aingredientes);

		assertTrue(!testmarmi.glutenFree());
	}

	@Test
	public void testGluten3() {
		Receta testmarmi = new Receta();

		ArrayList<Ingrediente> aingredientes = new ArrayList<Ingrediente>();

		aingredientes.add(new Ingrediente(4, "patatas", false));
		aingredientes.add(new Ingrediente(500, "bonito limpio", false));
		aingredientes.add(new Ingrediente(2, "cebolletas", false));
		aingredientes.add(new Ingrediente(2, "pimientos rojos", false));
		aingredientes.add(new Ingrediente(1, "pimiento verde pequeño", false));
		aingredientes.add(new Ingrediente(1, "cabeza de ajo", false));
		aingredientes.add(new Ingrediente(4, "pimiento choricero", false));
		aingredientes.add(new Ingrediente(40, "pan de sopa", false));
		aingredientes.add(new Ingrediente(1, "tomate", false));
		aingredientes.add(new Ingrediente(1, "agua", false));
		aingredientes.add(new Ingrediente(1, "copa de brandy", false));
		aingredientes.add(new Ingrediente(1, "aceite de oliva", false));
		aingredientes.add(new Ingrediente(1, "sal", false));
		aingredientes.add(new Ingrediente(1, "pimienta", false));
		aingredientes.add(new Ingrediente(1, "guindilla", false));
		aingredientes.add(new Ingrediente(1, "perejil", false));

		testmarmi.setAingredientes(aingredientes);

		assertTrue(!testmarmi.glutenFree());
	}

}
