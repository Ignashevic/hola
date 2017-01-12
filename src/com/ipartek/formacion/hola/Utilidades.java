package com.ipartek.formacion.hola;

/**
 * Clase {@code Utilidades} con metodos estaticos y comunes </br>
 * Por ejemplo: generar numeros aleatorios, validaciones...
 * 
 * @author Curso
 *
 */

public class Utilidades {

	/**
	 * Generar numero {@code int} aleatorio desde 0 hasta <b>maximoValor</b>
	 * 
	 * @param maximoValor
	 *            numero aleatorio maximos que puede generar, incluido este.
	 * @return numero entero aleatorio
	 */
	static public int getNumeroAleatorio(int maximoValor) {

		int aleatorio = (int) (Math.random() * maximoValor);
		return aleatorio;
	}

	/**
	 * Suma rara que se inventa el jefe, no me digas para que
	 * 
	 * @param num1
	 *            entero a sumar
	 * @param num2
	 *            entero a sumar
	 * @returnsuma de los dos paraetros, pero: </br>
	 *             si cualquiera de los dos es negativo return 0. </br>
	 *             si la suma es superior a 100 return 0.
	 */
	static public int sumaTonta(int num1, int num2) {
		int resultado = -1;

		if (num1 < 0 || num2 < 0 || (num1 + num2) > 100) {
			resultado = 0;
		} else {
			resultado = num1 + num2;
		}

		return resultado;
	}
}
