package com.itt.calculadora;
/**
 * 
 * La clase Producto contiene métodos para multiplicar dos o tres operadores y calcular la potencia de un número.
 * <p>
 * Esta clase pertenece al paquete {@link com.itt.calculadora}, que reune varias clases para realizar distintas operaciones matemáticas.
 * 
 * @author Pilar Navío Colón
 * @since 17/01/2021
 * @version 1.1
 * @see com.itt.calculadora
 *
 */

public final class Producto {
	
	private Producto() {
	}
	
	/**
	 * Método que multiplica dos números reales
	 * 
	 * @param oper1 Valor numérico de tipo float. Primer operador.
	 * 
	 * @param oper2 Valor numérico de tipo float. Segundo operador.
	 * 
	 * @return producto Valor numérico de tipo float. Resultado de la multiplicación de oper1 y oper2.
	 * 	
	 */
	public static float producto_2reales (float oper1, float oper2){
		return 0.0F;
	}
	
	
	/**
	 * Método que multiplica dos números enteros
	 * 
	 * @param oper1 Valor numérico entero. Primer operador.
	 * 
	 * @param oper2 Valor numérico entero. Segundo operador.
	 * 
	 * @return producto Valor numérico entero. Resultado de la multiplicación de oper1 y oper2.
	 * 	
	 */
	public static int producto_2enteros (int oper1, int oper2){
		return 0;
	}
	
	
	/**
	 * Método que multiplica tres números reales
	 * 
	 * @param oper1 Valor numérico de tipo float. Primer operador.
	 * 
	 * @param oper2 Valor numérico de tipo float. Segundo operador.
	 * 
	 * @param oper3 Valor numérico de tipo float. Tercer operador.
	 * 
	 * @return producto Valor numérico de tipo float. Resultado de la multiplicación de oper1, oper2 y oper3.
	 * 	
	 */
	public static float producto_3reales (float oper1, float oper2, float oper3){
		return 0.00F;
	}
	
	
	/**
	 * Método que devuelve la potencia de un número
	 * 
	 * @param base Valor numérico entero. Número que se multiplica varias veces.
	 * 
	 * La base no puede ser 0.
	 * 
	 * @param exp Valor numérico entero. Exponente: Número de veces que se multiplica la base. Si el exponente es 0, el resultado será 1.
	 * 
	 * @return Valor numérico de tipo long. Resultado de multiplicar base tantas veces como se indique en exp.<br>
	 * 			Por ejemplo: int base=5, int exp=4 <br>
	 * 			El resultado será el producto de: 5*5*5*5
	 */
	public static long potencia (int base, int exp){
		return 0;
	}
}
