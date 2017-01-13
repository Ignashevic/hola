package com.ipartek.formacion.hola.pojo;

import java.util.ArrayList;

public class Receta {

	// declaracion atributos
	private String titulo;
	ArrayList<Ingrediente> aingredientes;
	private int tiempo;
	private String dificultad;
	private int comensales;
	private String descripcion;

	// constructor

	public Receta() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Receta(String titulo, ArrayList<Ingrediente> aingredientes, int tiempo, String dificultad, int comensales,
			String descripcion) {
		super();
		this.titulo = titulo;
		this.aingredientes = aingredientes;
		this.tiempo = tiempo;
		this.dificultad = dificultad;
		this.comensales = comensales;
		this.descripcion = descripcion;
	}

	// getters y setters
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public ArrayList<Ingrediente> getAingredientes() {
		return aingredientes;
	}

	public void setAingredientes(ArrayList<Ingrediente> aingredientes) {
		this.aingredientes = aingredientes;
	}

	public int getTiempo() {
		return tiempo;
	}

	public void setTiempo(int tiempo) {
		this.tiempo = tiempo;
	}

	public String getDificultad() {
		return dificultad;
	}

	public void setDificultad(String dificultad) {
		this.dificultad = dificultad;
	}

	public int getComensales() {
		return comensales;
	}

	public void setComensales(int comensales) {
		this.comensales = comensales;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	// otros metodos

	public void addIngrediente(Ingrediente ingrediente) {

	}

	/**
	 * Elimina el primer ingrediente que encuentre con el mismo
	 * <code>nombre</code> CaseInsesitive
	 * 
	 * @param ingrediente
	 *            ingrediente a eliminar
	 * @return true si eliminar ingrediente false en caso contrario
	 */
	public boolean removeIngrediente(Ingrediente ingrediente) {
		return true;
	}

	public boolean glutenFree() {

		for (int i = 0; i < this.aingredientes.size(); i++) {
			if (aingredientes.get(i).isGluten()) {
				return true;
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return "Receta [titulo=" + titulo + ", aingredientes=" + aingredientes + ", tiempo=" + tiempo + ", dificultad="
				+ dificultad + ", comensales=" + comensales + ", descripcion=" + descripcion + "]";
	}

}
