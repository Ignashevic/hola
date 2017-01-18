package com.ipartek.formacion.recetas.ejercicios.herencia;

public class VehiculoElectrico extends Vehiculo {

	private final float MIN_CAPACIDAD_BATERIA = 100;

	private float capacidadBaterias;

	public VehiculoElectrico() {
		super();
		this.capacidadBaterias = MIN_CAPACIDAD_BATERIA;
	}

	public VehiculoElectrico(String modelo) {
		super(modelo);
		this.capacidadBaterias = MIN_CAPACIDAD_BATERIA;
	}

	public float getCapacidadBaterias() {
		return capacidadBaterias;
	}

	public void setCapacidadBaterias(float capacidadBaterias) {
		this.capacidadBaterias = capacidadBaterias;
	}

	public void arrancar() {
		System.out.println("Pzzzzzzzttttt");
	}

	@Override
	public String toString() {
		return super.toString() + " capacidadBaterias=" + capacidadBaterias;
	}

}
