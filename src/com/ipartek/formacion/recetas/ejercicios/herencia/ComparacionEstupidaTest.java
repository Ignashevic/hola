package com.ipartek.formacion.recetas.ejercicios.herencia;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collections;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.ipartek.formacion.recetas.ejercicios.collection.ComparatorRecetaNivelDificultad;

public class ComparacionEstupidaTest {
	
	ArrayList<IEstupida> estupidez = new ArrayList<IEstupida>();
	
	Vehiculo v1 = new Vehiculo();
	Vehiculo v2 = new Vehiculo();
	
	Pajaro p1 = new Pajaro();
	Pajaro p2 = new Pajaro();
	

	@Before
	public void setUp() throws Exception {
		v1.setModelo("Seat");
		v1.setPotencia(500);
		v2.setModelo("Ford KA");
		v2.setPotencia(100);
		p1.setNumHuevosSemana(2);
		p1.setRaza("Kiwi");
		p2.setNumHuevosSemana(700);
		p2.setRaza("Gallina");
		
		estupidez.add(v1);
		estupidez.add(v2);
		estupidez.add(p1);
		estupidez.add(p2);
		
	}

	@After
	public void tearDown() throws Exception {
		estupidez = null;
	}

	@Test
	public void testCompararVehiculosPajaros() {
		Collections.sort(estupidez, new ComparatorHuevosPotencia());
		
		assertEquals(v1, estupidez.get(2));
		assertEquals(v2, estupidez.get(1));
		assertEquals(p1, estupidez.get(0));
		assertEquals(p2, estupidez.get(3));
		
		System.out.println(estupidez);
	
	}

}
