package com.ipartek.formacion.hola.pojo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class RecetaTest {

	public static Receta tortillaPatatas = null;;
	public static Ingrediente huevos = new Ingrediente(12, "huevos", true);
	public static Ingrediente cebolla = new Ingrediente(1, "cebolla", true);
	public static Ingrediente patatas = new Ingrediente(4, "patatas", true);

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {

	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {

	}

	@Before
	public void setUp() throws Exception {
		tortillaPatatas = new Receta("tortilla de patatas", null, 0, null, 0, null);
		tortillaPatatas.addIngrediente(huevos);
		tortillaPatatas.addIngrediente(cebolla);
		tortillaPatatas.addIngrediente(patatas);

	}

	@After
	public void tearDown() throws Exception {

	}

	@Test
	public void testAddIngrediente() {
		Receta r = new Receta("Tortilla de patatas", null, 0, null, 0, null);
		int numero = r.getAingredientes().size();
		assertEquals("No deben existir ingredientes", 0, numero);

		r.addIngrediente(null);
		numero = r.getAingredientes().size();
		assertEquals("No deben existir ingredientes", 0, numero);

		r.addIngrediente(new Ingrediente(0, "", true));
		numero = r.getAingredientes().size();
		assertEquals(1, numero);
	}

	@Test
	public void testRemoveIngrediente() {
		Receta r = new Receta("Tortilla de patatas", null, 0, null, 0, null);
		assertFalse(r.removeIngrediente(null));

		tortillaPatatas.addIngrediente(huevos);

		huevos.setNombre("HueVos");
		tortillaPatatas.removeIngrediente(huevos);

		ArrayList<Ingrediente> ingredientes = tortillaPatatas.getAingredientes();
		assertEquals(3, tortillaPatatas.getAingredientes().size());

		// TODO comprobar que sean huevo cebolla y patatas

		assertTrue(tortillaPatatas.contiene(huevos));
		assertTrue(tortillaPatatas.contiene(cebolla));
		assertTrue(tortillaPatatas.contiene(patatas));
		assertFalse(tortillaPatatas.contiene(null));
		assertFalse(tortillaPatatas.contiene(new Ingrediente(2, "Salmonela", true)));

	}

	@Test
	public void testConstrutor() {
		Receta r = new Receta("Tortilla de patatas", null, 0, null, 0, null);
		assertNotNull("Deberia estar inicializado a new", r.getAingredientes());
	}

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

		assertTrue(!testmarmi.glutenFree());
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
		aingredientes.add(new Ingrediente(1, "cabeza de ajo", true));
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

		assertTrue(testmarmi.glutenFree());
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
