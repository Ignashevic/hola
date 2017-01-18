package com.ipartek.formacion.recetas.ejercicios.herencia;

import java.util.ArrayList;

public class ListaAnimalesTienda {

	public static void main(String[] args) {
		
		ArrayList<Vendible> aVender = new ArrayList();

		Burro amelio = new Burro("Amelio","burro español",20);
		Burro marco = new Burro("Marco","burro indigena",30);
		Pajaro sultan = new Pajaro(true,"buitre internacional",70);
		Pajaro scar = new Pajaro(false,"buitre indio",80);
	
		aVender.add(amelio);
		aVender.add(marco);
		aVender.add(sultan);
		aVender.add(scar);
		
		//mostrar por pantalla 
		System.out.println("--------------------------------------------");
		System.out.println("---------- Animaleria top Ignacio ----------");
		System.out.println("----- Listado de animales disponibles ------");
		System.out.println("--------------------------------------------");
		for(Vendible animal : aVender ){
			System.out.println("--------------------------------------------");
			if (animal instanceof Burro) {
				((Burro) animal).generarFactura();
			} else if (animal instanceof Pajaro) {
				((Pajaro) animal).generarFactura();
			}else{
				System.out.println("---- Que cojones has metido tio? ----" + animal.toString());
			}
		}
		System.out.println("--------------------------------------------");
		System.out.println("------------ Fin del Listado ---------------");
		System.out.println("--------------------------------------------");
	}
}
