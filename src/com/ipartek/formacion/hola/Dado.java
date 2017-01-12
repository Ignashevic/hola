package com.ipartek.formacion.hola;

public class Dado {

	static String[] aAlumnos = { "Aaron", "Eneko", "Itsaso", "Ivan", "Guillermo", "Lozolla", "Josu", "Ignacio", "Gomez",
			"Nerea", "Nagore", "Garbiñe", "Egoitz", "Pavel", "Pérez" };

	public static void listar() {
		String alumno = "";
		for (int i = 0; i < aAlumnos.length; i++) {
			alumno = aAlumnos[i];
			System.out.println(i + " - " + alumno);
		}
	}

	public static void listarForEach() {
		for (String alumno : aAlumnos) {
			System.out.println(alumno);
		}
	}

	public static void main(String[] args) {

		// int numAleatorio = (int) (Math.random() * aAlumnos.length);
		int numAleatorio = Utilidades.getNumeroAleatorio(aAlumnos.length - 1);
		String afortunado = aAlumnos[numAleatorio];

		System.out.println("El/a afortunado es: " + afortunado);

		System.out.println("-------- listado -----------");
		listar();
		System.out.println("........ listado ...........");
		listarForEach();
	}

}
