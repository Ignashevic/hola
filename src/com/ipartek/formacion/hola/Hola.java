package com.ipartek.formacion.hola;

import com.ipartek.formacion.hola.pojo.Libro;

/**
 * Clase que divide numeros aleatorios en par o impar
 * 
 * @author curso
 *
 */

public class Hola {

	/**
	 * metodo main para ejecutar la clase
	 * 
	 * @param args
	 *            []String
	 */

	public static void main(String[] args) {

		// operador ternario
		// asignar un valor a una variable en funcin a una condicion
		// ( condicion ) ? true : false
		int edad = (3 > 100) ? 18 : 34;

		// declaracion variables
		int iEntera;
		boolean bBooleana;

		float fdineroCuenta = 10.23f; // 10,23 €
		float fdineroCuenta2 = (float) 10.23; // 10,23 €

		char caracter = 'p';
		String cadena = "dobles";

		/*
		 * Guardamos en varibale el numero aleatorio y lo encapsulamos para
		 * evitar los decimales
		 */
		int aleatorio = (int) (Math.random() * 20);
		System.out.println(aleatorio);

		// If que nos dice si el numero es par o impar
		if (aleatorio % 2 == 0) {
			System.out.println("El numero es par");
		} else {
			System.out.println("El numero es impar");
		}

		// instanciar un objeto de la clase libro

		// Libro de Java
		Libro librojava = new Libro();
		librojava.numeropaginas = 320;
		librojava.nombre = "Java 7";
		librojava.autor = "Roberto Montero Miguel";
		librojava.escribir(50);
		System.out.println(librojava.describete());

		// Libro de PHP
		Libro librophp = new Libro();
		librophp.numeropaginas = 725;
		librophp.nombre = "PHP y MySQL";
		librophp.autor = "Mi primo";
		librophp.escribir(200);

		System.out.println(librophp.describete());

	}
}