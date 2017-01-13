package com.ipartek.formacion.hola.ejercicios;

import com.ipartek.formacion.hola.pojo.Libro;

public class TopVentasLibro {

	public static void main(String[] args) {

		Libro[] topVentas = { new Libro("El laberinto de los espiritus", "Carlos Ruiz Zafon", 933),
				new Libro("Todo esto te dare", "Dolores Redondo", 1221),
				new Libro("Falco", "Arturo Perez Reverte", 850),
				new Libro("Harry Potter y el legado maldito", "J.K.Rowling", 1500),
				new Libro("Animales fantasticos y donde encontrarlos", "J.K.Rowling", 1000),
				new Libro("Los herederos de la tierra", "Ildefonso Falcones", 940),
				new Libro("La chica del tren", "Paula Hawkins", 920), new Libro("Amor y asco", "@srtabebi", 850),
				new Libro("Los secretos que jamas te contaron", "Albert Espinosa", 850),
				new Libro("Manual para mujeres de la limpieza", "Lucia Berlin", 1600) };

		for (int i = 0; i < topVentas.length; i++) {
			System.out.println(topVentas[i].toString());
		}

	}
}
