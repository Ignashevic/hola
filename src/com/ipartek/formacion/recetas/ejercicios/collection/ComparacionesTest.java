package com.ipartek.formacion.recetas.ejercicios.collection;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collections;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.ipartek.formacion.hola.pojo.Receta;

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

}
