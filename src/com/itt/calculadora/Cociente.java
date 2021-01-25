package cociente;
/**
 * 
 * La clase cociente contiene métodos para dividir dos operadores, 
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
 * Función que realiza la división de dos números reales.
 * 
 * @param oper1 Representa el primer operador de la división 
 * 
 * @param oper2 Representa el segundo operador, el dividendo
 * 
 * @return Devuelve el valor de la división entre los dos operadores.
 * 
 * 
 * Casos especiales:
 * 	Si el segundo operador, es igual a 0, el resultado será NaN, POSITIVE_INFINITY o NEGATIVE_INFINITY.
 * 	Si el ambos operadores son cero, el resultado sera NaN.
 * 
 *
 */
	public static float dividirReales (float oper1, float oper2) {
		return 0.0F ;
	}
	
/**
 * Este método implementará la división de dos números enteros. 
 * 
 * @param oper1 Representa el primer operador de la división 
 * 
 * @param oper2 Representa el segundo operador, el dividendo
 *
 * @return El resultado será la división entre oper1 y oper2.
 * 
 * @throws ArithmeticException Si el dividendo es igual a 0.
 * 
 * Casos especiales:
 *  Si el segundo operador es igual a cero, el resultado será NaN.
 *
 */
	public int dividirEnteros (int oper1,int oper2) {
		return 0F;
	}	
	
/**
 *  Este método implementará la inversión de un número entero.
 *  
 *  @param oper1 Representa el número que vas a invertir
 *  
 *  @return El resultado será la inversión del número.
 *  
 *  Ejemplo: si se introduce el valor 345, el método devolverá 543.
 * 
 */
	public int invertirNum (int oper1) {

		return 0;
	}
	
/**
 * Este método implemetará la raiz cuadrada de un número.
 * 
 * @param oper1 Representa el número cuya raíz cuadrada se va a calcular.
 * 
 * @return Resultado de la raiz cuadrada del parámetro uno.
 * 
 * Casos especiales:
 *  Si el operando es 0 el resultado es el mismo al operando.
 *  Si el operando es NaN o menos de 0, el resultado es NaN. 
 *  Si el argumento es infinito positivo, el resultado será infinito positivo.
 */
	public double raizCuadrada (double oper1) {
		 return 0.0F;
	}
}
