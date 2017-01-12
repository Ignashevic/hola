package com.ipartek.formacion.hola.ejercicios;

public class CalcularVueltas {

	public static void main(String[] args) {

		// declaracion de variables
		float compra = 1326.24f; // 1326,24€
		float pago = 4 * 500; // 2000€
		float cambio = pago - compra;

		// resultado por pantalla
		System.out.println("--------------Resultado------------");

		System.out.println("Pago: " + compra + " € ");
		System.out.println("Las vueltas: " + (pago - compra) + " € ");

		calculadora(cambio);

	}

	/**
	 * funcion para realizar el calculo
	 * 
	 */
	public static void calculadora(float cambio) {

		// array que contiene los diferentes tipos de cambio
		float[] aBilletes = { 50, 20, 10, 5, 2, 1, 0.50f, 0.20f, 0.10f, 0.05f, 0.02f, 0.01f };

		// declaracion de variables
		float resto = cambio;

		int variante = 4;
		int variante2 = 6;
		String tipo = "";
		int billete = 0;
		String valor = "";

		// recorremos el array
		for (int i = 0; i < aBilletes.length; i++) {

			// utilizamos variantes para jugar con las posiciones del array y
			// conseguir que salga correctamente
			if (variante > i) {
				tipo = "Billetes";
			} else {
				tipo = "Monedas";
			}

			if (variante2 > i) {
				billete = (int) (aBilletes[i]);
				valor = "euros";

			} else {
				billete = Math.round(aBilletes[i] * 100);
				valor = "centimos";
			}

			// ultimo syso para mostrar por pantalla los diferentes billetes a
			// devolver
			System.out.println("En " + (int) (resto / aBilletes[i]) + " " + tipo + " de " + billete + " " + valor);
			resto = (resto % aBilletes[i]);
		}
	}

}
