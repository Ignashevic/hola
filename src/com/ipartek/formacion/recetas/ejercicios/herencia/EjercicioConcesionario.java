package com.ipartek.formacion.recetas.ejercicios.herencia;

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

		System.out.println(Prius.toString());
		System.out.println(Ibiza.toString());
		System.out.println(Fordfi.toString());
		System.out.println(Tesla.toString());
		System.out.println(Xsara.toString());
		System.out.println(Astra.toString());

	}
}
