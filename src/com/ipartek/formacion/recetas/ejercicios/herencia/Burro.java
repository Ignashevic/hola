package com.ipartek.formacion.recetas.ejercicios.herencia;

import java.util.ArrayList;

import com.ipartek.formacion.hola.pojo.Ingrediente;

public class Burro extends Animal implements Conducible, Cocinable, Vendible {

	// variables
	private String nombre;

	public Burro(String nombre) {
		super();
		this.nombre = nombre;
	}

	public Burro() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Burro(String nombre, String raza, int precio) {
		super(raza, precio);
		// TODO Auto-generated constructor stub
		this.nombre = nombre;
	}

	// getter settters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	// otros metodos
	@Override
	public String arrancar() {
		return "Arre burro!";

	}

	@Override
	public String detener() {
		return "SOOOOO";

	}

	@Override
	public String girar(String direccion) {
		return direccion;
	}

	// toString
	@Override
	public String toString() {
		return "Burro [nombre=" + nombre + "]";
	}

	@Override
	public ArrayList<Ingrediente> getIngredientes() {
		return new ArrayList<Ingrediente>();
	}

	@Override
	public String getDescripcionReceta() {
		return "Salpimentar y a la cazuela";
	}

	@Override
	public void generarFactura() {
		System.out.println("Raza : " + this.getRaza());
		System.out.println("Precio : " + this.getPrecio());
		System.out.println("Nombre : " + this.getNombre());
		System.out.println("Receta para cocinarlo : " + this.getDescripcionReceta());
		System.out.println("Para arrancar : " + this.arrancar());
		System.out.println("Para parar : " + this.detener());
		System.out.println("Para girar a la derecha : " + this.girar(DERECHA));
		System.out.println("Para girar a la izquierda : " + this.girar(IZQUIERDA));
		
	}

}
