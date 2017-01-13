package com.ipartek.formacion.hola.ejercicios;

import java.util.ArrayList;

import com.ipartek.formacion.hola.pojo.Ingrediente;
import com.ipartek.formacion.hola.pojo.Receta;

public class Marmitako {

	public static void main(String[] args) {
		Receta marmitako = new Receta();
		// Ingrediente aingredientes[] = new Ingrediente[16];
		ArrayList<Ingrediente> aingredientes = new ArrayList<Ingrediente>();

		marmitako.setTitulo("Marmitako de karlos arguiñano");

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

		marmitako.setAingredientes(aingredientes);
		marmitako.setTiempo(60);
		marmitako.setDificultad("facil");
		marmitako.setComensales(6);
		marmitako.setDescripcion("Plato de marmitako de karlos arguiñano, rico rico, sano sano.");

		System.out.println(marmitako.toString());

		if (marmitako.glutenFree()) {
			System.out.println("No es gluten free");
		} else {
			System.out.println("Es gluten free");
		}
	}
}
