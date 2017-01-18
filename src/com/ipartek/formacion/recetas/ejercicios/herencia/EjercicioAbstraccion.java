package com.ipartek.formacion.recetas.ejercicios.herencia;

/**
 * Comprobar que solo podemos hacer ojetos de las clases que no sean abstractas.<br>
 * @author Curso
 *
 */
public class EjercicioAbstraccion {

	public static void main(String[] args) {
		
		//ObjetoGrafico og = new ObjetoGrafico(0,0);
		
		Linea linea = new Linea(0 , 0);
		
		//clase anonima 
		Circulo c = new Circulo(5,5){

			@Override
			public void dibujar() {
				System.out.println("Dibujando Circlo");
				
			}
			
		};
		
		CirculoNoAbstracto cno = new CirculoNoAbstracto(0, 0);
		
		
	}

}
