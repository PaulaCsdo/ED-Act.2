package com.itt.calculadora;
/**
 * 
 * La clase Cociente contiene métodos para dividir dos operadores, 
 * realizar la inversión de un número, así como la raiz cuadrada.
 * 
 * Esta clase pertenece al paquete {@link com.itt.calculadora}, 
 * reune varias clases para realizar distintas operaciones matemáticas
 * @author Ixchel López Alegre
 * @since 18/01/2021
 * @version 1.0
 * @see com.itt.calculadora
 */


public final class Cociente {
	
	private Cociente() {
		
	}
	
/**
 * Este método implementará la división de dos números reales. Si
 * el segundo operando es igual a 0, la operación será nula.
 * 
 * @param oper1 Representa el primer operador de la división 
 * 
 * @param oper2 Representa el segundo operador, el dividendo
 * 
 * @return El resultado será la división entre num1 y num2.
 * 
 
 */
	public static float cocienteReales (float oper1, float oper2) {
		return 0.0F ;
	}
	
/**
 * Este método implementará la división de dos números enteros. Si
 * el segundo operando es igual a 0, la operación será nula.
 * 
 * @param oper1 Representa el primer operador de la división 
 * 
 * @param oper2 Representa el segundo operador, el dividendo
 *
 * @return El resultado será la división entre num1 y num2.
 * 
 *
 */
	public int cocienteEnteros (int oper1,int oper2) {
		return 0;
	}	
	
/**
 *  Este método implementará la inversión de un número entero.
 *  
 *  @param oper1 Representa el número que vas a invertir
 *  
 *  @return El resultado será la inversión del número.
 * 
 */
	public int invertirNum (int oper1) {

		/*int inverso = 0, cifra = 0;
		while (num1!=0) {
			cifra= num1 % 10;
			inverso = (inverso * 10) + cifra;
			num1 /= 10;
		}
		return inverso;
		*/
		return 0;
	}
	
/**
 * Este método implemetará la raiz cuadrada de un número.
 * 
 * @param oper1 Representa el número cuya raíz cuadrada se va a calcular.
 * 
 * @return Resultado de la raiz cuadrada del parámetro uno.
 */
	public double raizCuadrada (float oper1) {
		 return 0.0F;
	}
}
