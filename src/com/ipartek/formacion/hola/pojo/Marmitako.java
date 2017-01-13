package com.ipartek.formacion.hola.pojo;

public class Marmitako {

	public static void main(String[] args) {
		Receta marmitako = new Receta();
		Ingrediente aingredientes[] = new Ingrediente[16];

		marmitako.setTitulo("Marmitako de karlos arguiñano");

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
