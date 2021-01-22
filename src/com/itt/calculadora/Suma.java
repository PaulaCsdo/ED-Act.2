package com.itt.calculadora;

/**
 * La clase Suma contiene métodos para sumar distintos tipos de variables numéricas.  <br>
 * Todos los métodos de esta clase aceptan números negativos. <br>
 * <p>
 * Esta clase pertenece al paquete {@link com.itt.calculadora}, que reune varias clases para realizar distintas operaciones matemáticas.
 * 
 * @author Jana Montero Perales
 * @version 1.2
 * @since 17-01-2021
 * @see com.itt.calculadora 
 * 
 */
public final class Suma {
	
	/**
	 * Variable que contiene el valor acumulado de todas las sumas acumuladas realizadas.
	 */
	public static float suma_acumulada = 0.0F;
	
	private Suma() {
	}
	
	/**
	 * Función que suma dos números reales
	 * 
	 * @param oper1 Valor numérico real. Primer operando. 
	 * @param oper2 Valor numérico real. Segundo operando. 
	 * @return Devuelve el resultado de la suma oper1 + oper2. Valor numérico real.
	 * 
	 */
	public static float sumarReales(float oper1, float oper2) {
		return 0.0F;
	}
	
	/**
	 * Función que suma dos números enteros
	 * 
	 * @param oper1 Valor numérico entero. Primer operando. 
	 * @param oper2 Valor numérico entero. Segundo operando. 
	 * @return Devuelve el resultado de la suma oper1 + oper2. Valor numérico entero. 
	 * 
	 */
	public static int sumarEnteros(int oper1, int oper2) {
		return 0;
	}	
	
	/**
	 * Función que suma tres números reales
	 * 
	 * @param oper1 Valor numérico real. Primer operando. 
	 * @param oper2 Valor numérico real. Segundo operando. 
	 * @param oper3 Valor numérico real. Tercer operando.
	 * @return Devuelve el resultado de la suma oper1 + oper2 + oper3.
	 * 
	 */
	public static float sumarTres(float oper1, float oper2, float oper3) {
		return 0.0F;
	}
	
	/**
	 * Función que suma el número introducido como argumento a la variable estática suma_acumulada de la clase Suma. Por ejemplo:<br> 
	 * Si el valor de suma_acumulada cuando se llama al método es 100.0, y el argumento con el que se le llama es 5.0, el valor de suma_acumulada tras su ejecución será 100.0 <br>
	 * Este método no devuelve ningún valor.
	 * 
	 * @param num Valor numérico real. Este valor se sumará a la variable estática valor_acumulado. 
	 * 
	 * @see valor_acumulado
	 */
	public static void sumaAcumulada(float num) {
	}	
}
