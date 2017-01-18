package com.ipartek.formacion.recetas.ejercicios.herencia;

import java.io.Serializable;

/**
 * Las interfaces nunca pueden tener codigo implementado<br>
 * Pueden existir interfaces vacias @see java.io.Serializable<br>
 * Soportan Herencia multiple, al contrario que las clases<br>
 * Pueden contener variables, pero seran finales.<br>
 *
 */
public interface Conducible extends Serializable, Cloneable {

	final String DERECHA = "Gira derecha!";
	final String IZQUIERDA = "Gira izquierda!";

	String arrancar();

	String detener();

	String girar(String direccion);

}
