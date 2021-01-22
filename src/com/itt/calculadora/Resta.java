package com.itt.calculadora;

/**
 * La clase Resta contiene métodos para restar distintos tipos de variables numéricas.  <br>
 * Casos especiales:
 * El resultado de una resta en la que el segundo operando es negativo será una suma. 
 * <p>
 * Esta clase pertenece al paquete {@link com.itt.calculadora}, que reune varias clases para realizar distintas operaciones matemáticas.
 * 
 * @author Paula Casado García
 * @version 1.0
 * @since 17-01-2021
 * @see com.itt.calculadora 
 * 
 */
public class Resta {

	private Resta () {
		
	}
	
	/**
	 * Variable que contiene el valor acumulado de todas las restas realizadas con valor acumulado
	 */
	public static float valor_acumulado = 0.0F;	
	
	/**
	 * Este método resta dos números reales y devuelve el resultado.
	 * 
	 * @param oper1 representa el primer operando. Es un número real (double).
	 * @param oper2 representa el segundo operando. Es un número real (double).
	 * 
	 * @return resultado de restar oper2 a oper1. Es un número real (double).
	 * 
	 * En el caso de que el primer operando sea un número positivo, y el segundo operando, un número negativo, la operación será una suma: 
	 * @see Suma
	 */
	public static double restaReales (double oper1, double oper2){
		return 0.0;
	}
	
	
	/**
	 * Este método resta dos números enteros y devuelve el resultado.
	 * 
	 * @param oper1 representa el primer operando. Es un número entero (int).
	 * @param oper2 representa el segundo operando. Es un número entero (int).
	 * 
	 * @return resultado de restar oper2 a oper1. Es un número entero (int).
	 */
	public static int restaEnteros (int oper1, int oper2){
		return 0;
	}
	
	/**
	 * Este método resta tres números reales y devuelve el resultado.
	 * 
	 * @param oper1 representa el primer operando. Es un número real (double).
	 * @param oper2 representa el segundo operando. Es un número real (double).
	 * @param oper3 representa el tercer operando. Es un número real (double).
	 * 
	 * @return resultado de restar los tres números. Es un número real (double).
	 */
	public static double restaTres (double oper1, double oper2, double oper3){
		return 0.0;
	}
	
	
	/**
	 * Este método acumula el resultado.
	 * Para ello, se resta el valor introducido al último resultado de la resta.
	 * Por ejemplo:<br> resultado acumulado=0; <br> Si el oper1 vale 5, el valor del resultado acumulado será: 0-5= <b>-5</b>
	 * 
	 * @param oper1 representa el operando. Es un número real (double).
	 * 
	 * Este método no devuelve un resultado, sino que queda guardado en la clase.
	 */
	public static void restaAcumulada (double oper1){
	}

}
