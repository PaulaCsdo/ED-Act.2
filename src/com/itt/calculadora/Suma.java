package com.itt.calculadora;

/**
 * La clase suma contiene métodos para sumar distintos tipos de variables numéricas.  <br>
 * Todos los métodos de esta clase aceptan números negativos. <br>
 * Casos especiales:
 * <li>El resultado de una suma en la que al menos uno de los números es negativo será una resta. El mismo resultado se puede obtener llamando al método equivalente de la clase {@link Resta}.</li>
 * <p>
 * Esta clase pertenece al paquete {@link com.itt.calculadora}, que reune varias clases para realizar distintas operaciones matemáticas.
 * 
 * @author Jana Montero Perales
 * @version 1.0
 * @since 17-01-2021
 * @see com.itt.calculadora 
 * 
 */
public final class Suma {
	
	/**
	 * Variable que contiene el valor acumulado de todas las sumas realizadas con valor acumulado
	 */
	public static float valor_acumulado = 0.0F;
	
	private Suma() {
	}
	
	/**
	 * Función que suma dos números reales
	 * 
	 * @param oper1 Valor numérico real. Primer operando. 
	 * @param oper2 Valor numérico real. Segundo operando. 
	 * @return suma Valor numérico real. Resultado de la suma de oper1 y oper2.
	 * 
	 */
	public static float sumar_reales(float oper1, float oper2) {
		return 0.0F;
	}
	
	/**
	 * Función que suma dos números enteros
	 * 
	 * @param oper1 Valor numérico entero. Primer operando. 
	 * @param oper2 Valor numérico entero. Segundo operando. 
	 * @return suma Valor numérico entero. Resultado de la suma de oper1 y oper2.
	 * 
	 */
	public static int sumar_enteros(int oper1, int oper2) {
		return 0;
	}	
	
	/**
	 * Función que suma tres números reales
	 * 
	 * @param oper1 Valor numérico real. Primer operando. 
	 * @param oper2 Valor numérico real. Segundo operando. 
	 * @param oper3 Valor numérico real. Tercer operando.
	 * @return suma Valor numérico real. Resultado de la suma de oper1, oper2 y oper3.
	 * 
	 */
	public static float sumar_reales(float oper1, float oper2, float oper3) {
		return 0.0F;
	}
	
	/**
	 * Función que suma el número introducido como argumento a la variable estática valor_acumulado. Este método no devuelve ningún valor
	 * 
	 * @param num Valor numérico real. Este valor se sumará a la variable estática valor_acumulado. 
	 * 
	 * @see valor_acumulado
	 */
	public static void sumar_acum(float num) {
	}	
}
