package com.ipartek.formacion.recetas.ejercicios.collection;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collections;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.ipartek.formacion.hola.pojo.Ingrediente;
import com.ipartek.formacion.hola.pojo.Receta;
import com.ipartek.formacion.hola.pojo.comparators.ComparatorRecetaNivelDificultad;

public class ComparacionesTest {
	
	ArrayList<Receta> recetas = new ArrayList<Receta>();
	
	Receta solomillo = new Receta("Solomillo");
	Receta marmitako = new Receta("Marmitako");
	Receta tortilla = new Receta("Tortilla");
	
	
	@Before
	public void setUp() throws Exception {
		solomillo.setDificultad(Receta.DIFICULTAD_MODERADA);
		marmitako.setDificultad(Receta.DIFICULTAD_DIFICIL);
		tortilla.setDificultad(Receta.DIFICULTAD_FACIL);
		
		marmitako.addIngrediente(new Ingrediente(4, "patatas", false));
		marmitako.addIngrediente(new Ingrediente(4, "patatas", false));
		marmitako.addIngrediente(new Ingrediente(4, "patatas", false));
		marmitako.addIngrediente(new Ingrediente(4, "patatas", false));
		marmitako.addIngrediente(new Ingrediente(4, "patatas", false));
		marmitako.addIngrediente(new Ingrediente(4, "patatas", false));
		marmitako.addIngrediente(new Ingrediente(4, "patatas", false));
		
		solomillo.addIngrediente(new Ingrediente(4, "carne", false));
		solomillo.addIngrediente(new Ingrediente(500, "ajo", false));
		
		tortilla.addIngrediente(new Ingrediente(4, "huevos", false));
		tortilla.addIngrediente(new Ingrediente(500, "patatas", false));
		tortilla.addIngrediente(new Ingrediente(4, "cebolla", false));
		tortilla.addIngrediente(new Ingrediente(500, "pimiento", false));
		

		recetas.add(solomillo);
		recetas.add(marmitako);
		recetas.add(tortilla);
	}
	
	@After
	public void tearDown() throws Exception {
		recetas=null;
	}

	@Test
	public void test() {
		//ordenamos alfabeticamente
		
		//ordenar
		Collections.sort(recetas);
		
		//comprobar
		assertEquals(marmitako, recetas.get(0));
		assertEquals(solomillo, recetas.get(1));
		assertEquals(tortilla, recetas.get(2));
		
		//al reves
		Collections.sort(recetas, Collections.reverseOrder());
		
		assertEquals(marmitako, recetas.get(2));
		assertEquals(solomillo, recetas.get(1));
		assertEquals(tortilla, recetas.get(0));
		
	}
	
	@Test
	public void testComparator(){
		//vamos a ordenar por nivel de dificultad
		
		final String MSG_ERROR_DIFICULTAD = "No ordena por nivel de dificultad";
		
		
		Collections.sort(recetas, new ComparatorRecetaNivelDificultad());
		
		assertEquals(tortilla, recetas.get(0));
		assertEquals(solomillo, recetas.get(1));
		assertEquals(marmitako, recetas.get(2));
	}
	
	@Test
	public void ComparatorIngredientes(){
		
		Collections.sort(recetas, new ComparatorCantidadIngredientes() );
		
		assertEquals("Error tortilla",tortilla, recetas.get(1));
		assertEquals("Error solomillo",solomillo, recetas.get(0));
		assertEquals("Error MARMITAKO",marmitako, recetas.get(2));
	}

}
