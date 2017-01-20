package com.ipartek.formacion.recetas.ejercicios.collection;

import java.util.Comparator;

import com.ipartek.formacion.hola.pojo.Receta;

public class ComparatorCantidadIngredientes implements Comparator<Receta> {

	@Override
	public int compare(Receta o1, Receta o2) {
		return o1.getAingredientes().size() - o2.getAingredientes().size();
	}
}
