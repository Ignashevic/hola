package com.ipartek.formacion.hola.pojo;

import java.util.ArrayList;
import java.util.Comparator;

public class Receta implements Comparable<Receta> , Comparator<Receta> {

	public static final String DIFICULTAD_FACIL="Facil";
	public static final String DIFICULTAD_MODERADA="Moderada";
	public static final String DIFICULTAD_DIFICIL="Dificil";
	
	// declaracion atributos
	public final String IMG_DEFAULT = "http://ilsole.com.ar/wp-content/uploads/2016/07/Icon-Recipe.png";
	private String titulo;
	ArrayList<Ingrediente> aingredientes;
	private int tiempo;
	private String dificultad;
	private int comensales;
	private String descripcion;
	private String imagen;
	
	
	// constructor

	public String getImagen() {
		return IMG_DEFAULT;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public Receta() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Receta(String titulo) {
		super();
		this.titulo = titulo;
		this.imagen = IMG_DEFAULT;
		setAingredientes(null);
		this.tiempo = 0;
		this.dificultad = "facil";
		this.comensales = 0;
		this.descripcion = "Lorem Ipsun...";
	}

	public Receta(String titulo, ArrayList<Ingrediente> aingredientes, int tiempo, String dificultad, int comensales,
			String descripcion) {
		super();
		this.titulo = titulo;
		setAingredientes(aingredientes);
		this.tiempo = tiempo;
		this.imagen = IMG_DEFAULT;
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
		this.aingredientes = (aingredientes == null) ? new ArrayList<Ingrediente>() : aingredientes;
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

	/**
	 * comprueba si contiene el ingrediente pasado como parametro
	 * 
	 * @param ingrediente
	 *            {@code Ingrediente} a buscar
	 * @return true si cotiene el ingrediente</br>
	 *         falso en caso contrario
	 * 
	 */
	public boolean contiene(Ingrediente ingrediente) {
		boolean resul = false;
		if (ingrediente != null) {
			final String NOMBRE_INGREDIENTE_BUSCAR = ingrediente.getNombre();
			Ingrediente iterate = null;
			for (int i = 0; i < this.aingredientes.size(); i++) {
				iterate = this.aingredientes.get(i);
				if (NOMBRE_INGREDIENTE_BUSCAR.equalsIgnoreCase(iterate.getNombre())) {
					resul = true;
					break;
				}
			}
		}
		return resul;

	}

	/**
	 * TODO cuando sea null lanzar exception personalizada </br>
	 * Añadimos un nuevo {@code ingrediente} a la receta
	 * 
	 * @param ingrediente
	 *            si es null o hace nada
	 */
	public void addIngrediente(Ingrediente ingrediente) {
		if (ingrediente != null) {
			this.aingredientes.add(ingrediente);
		}
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
		boolean resul = false;
		if (ingrediente != null) {
			final String NOMBRE_INGREDIENTE_ELIMINAR = ingrediente.getNombre();
			Ingrediente iterateingredient = null;
			for (int i = 0; i < this.aingredientes.size(); i++) {
				iterateingredient = this.aingredientes.get(i);
				if (NOMBRE_INGREDIENTE_ELIMINAR.equalsIgnoreCase(iterateingredient.getNombre())) {
					this.aingredientes.remove(i);
					resul = true;
					break;
				}
			}
		}
		return resul;
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
				+ dificultad + ", comensales=" + comensales + ", descripcion=" + descripcion + ", imagen=" + imagen
				+ "]";
	}
	
	@Override
	public int compare(Receta o1, Receta o2) {
		int resul = -1;
		if(o1.getDificultad().equals(o2.getDificultad())){
			resul = 0;
		}
		return resul;
	}

	
	
	//comparar el objeto actual con el que se pasa por parametro y te lo ordena por titulo
	@Override
	public int compareTo(Receta o) {
		return this.getTitulo().compareTo(o.getTitulo());
	}
}
