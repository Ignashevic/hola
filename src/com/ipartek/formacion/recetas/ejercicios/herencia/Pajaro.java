package com.ipartek.formacion.recetas.ejercicios.herencia;

public class Pajaro extends Animal implements Volador, Vendible {

	boolean volar = false;

	public Pajaro(boolean volar) {
		super();
		this.volar = volar;
	}

	public Pajaro() {
		super();
	}

	public Pajaro(boolean volar, String raza, int precio) {
		super(raza, precio);
		this.volar = volar;
	}

	public boolean isVolar() {
		return volar;
	}

	public void setVolar(boolean volar) {
		this.volar = volar;
	}

	@Override
	public String despegar() {
		return "Adelante! Vuela!";
	}

	@Override
	public String aterrizar() {
		return "Venga pa abajo ya coñe";
	}

	@Override
	public void generarFactura() {
		System.out.println("Raza : " + this.getRaza());
		System.out.println("Precio : " + this.getPrecio());
		System.out.println("Volador : " + this.isVolar());
		System.out.println("Para despegar : " + this.despegar());
		System.out.println("Para aterrizar : " + this.aterrizar());
		
	}

}
