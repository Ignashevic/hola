package com.ipartek.formacion.recetas.ejercicios.herencia;

import java.util.ArrayList;

/**
 * Listar todos los vehiculos del concesionario
 * 
 * @author Curso
 *
 */

public class EjercicioConcesionario {

	public static void main(String[] args) {

		// crear vehiculos
		Vehiculo Prius = new Vehiculo("Prius");
		Vehiculo Ibiza = new Vehiculo("Ibiza");
		Vehiculo Fordfi = new Vehiculo("Ford Fiesta");
		VehiculoElectrico Tesla = new VehiculoElectrico("Tesla");
		VehiculoDiesel Xsara = new VehiculoDiesel("Xsara");
		VehiculoDiesel Astra = new VehiculoDiesel("Astra");

		// plazas
		Prius.setPlazas(5);
		Ibiza.setPlazas(5);
		Fordfi.setPlazas(4);
		Tesla.setPlazas(5);
		Xsara.setPlazas(5);
		Astra.setPlazas(5);

		// dimensiones
		Prius.setDimensiones(0);
		Ibiza.setDimensiones(0);
		Fordfi.setDimensiones(0);
		Tesla.setDimensiones(0);
		Xsara.setDimensiones(0);
		Astra.setDimensiones(0);

		// potencia
		Prius.setPotencia(300);
		Ibiza.setPotencia(500);
		Fordfi.setPotencia(100);
		Tesla.setPotencia(150);
		Xsara.setPotencia(100);
		Astra.setPotencia(120);

		// capacidad bateria
		Tesla.setCapacidadBaterias(500);

		// capacidad combustible
		Xsara.setCapacidadCombustible(95);
		Astra.setCapacidadCombustible(98);

		// arraylist de vehiculos para mostrar sin tanto syso
		ArrayList<Vehiculo> stock = new ArrayList<Vehiculo>();
		stock.add(Prius);
		stock.add(Ibiza);
		stock.add(Fordfi);
		stock.add(Tesla);
		stock.add(Xsara);
		stock.add(Astra);

		// mostrar por pantalla
		for (Vehiculo vehiculo : stock) {
			System.out.println("--------------------------------------------");
			System.out.println("---- " + vehiculo.getModelo());
			System.out.println("--------------------------------------------");
			System.out.println("Plazas: " + vehiculo.getPlazas());
			System.out.println("Potencia: " + vehiculo.getPotencia());
			if (vehiculo instanceof VehiculoElectrico) {
				System.out.println("Capacidad Bateria: " + ((VehiculoElectrico) vehiculo).getCapacidadBaterias());
			} else if (vehiculo instanceof VehiculoDiesel) {
				System.out.println("Capacidad combustible: " + ((VehiculoDiesel) vehiculo).getCapacidadCombustible());
			}
		}

	}
}
