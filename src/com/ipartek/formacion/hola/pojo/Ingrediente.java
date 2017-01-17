package com.ipartek.formacion.hola.pojo;

public class Ingrediente {

	// declaracion de atributos
	private int cantidad;
	private String nombre;
	private boolean gluten;

	// constructor

	public Ingrediente(int cantidad, String nombre, boolean gluten) {
		super();
		this.cantidad = cantidad;
		this.nombre = nombre;
		this.gluten = gluten;
	}
	// getter y setters

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean isGluten() {
		return gluten;
	}

	public void setGluten(boolean gluten) {
		this.gluten = gluten;
	}

	// otros metodos
	@Override
	public String toString() {
		return "Ingrediente: " + cantidad + ", " + nombre + " , " + gluten;
	}

}
