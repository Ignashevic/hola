package com.ipartek.formacion.recetas.ejercicios.herencia;

public class VehiculoDiesel extends Vehiculo {

	private final int MIN_CAPACIDAD_COMBUSTIBLE = 95;

	private int capacidadCombustible;

	public VehiculoDiesel() {
		super();
		this.capacidadCombustible = MIN_CAPACIDAD_COMBUSTIBLE;
	}

	public VehiculoDiesel(String modelo) {
		super(modelo);
		this.capacidadCombustible = MIN_CAPACIDAD_COMBUSTIBLE;
	}

	public int getCapacidadCombustible() {
		return capacidadCombustible;
	}

	public void setCapacidadCombustible(int capacidadCombustible) {
		this.capacidadCombustible = capacidadCombustible;
	}

	@Override
	public String toString() {
		return super.toString() + " capacidadCombustible=" + capacidadCombustible;
	}

}
