package cociente;
/**
 * 
 * La clase cociente contiene m�todos para dividir dos operadores, 
 * realizar la inversi�n de un n�mero, as� como la raiz cuadrada.
 * 
 * Esta clase pertenece al paquete {@link com.itt.calculadora}, 
 * reune varias clases para realizar distintas operaciones matem�ticas
 * @author Ixchel L�pez Alegre
 * @since 18/01/2021
 * @version 1.0
 * @see com.itt.calculadora
 */


public final class Cociente {
	
	private Cociente() {
		
	}
	
/**
 * Funci�n que realiza la divisi�n de dos n�meros reales.
 * 
 * @param oper1 Representa el primer operador de la divisi�n 
 * 
 * @param oper2 Representa el segundo operador, el dividendo
 * 
 * @return Devuelve el valor de la divisi�n entre los dos operadores.
 * 
 * 
 * Casos especiales:
 * 	Si el segundo operador, es igual a 0, el resultado ser� NaN, POSITIVE_INFINITY o NEGATIVE_INFINITY.
 * 	Si el ambos operadores son cero, el resultado sera NaN.
 * 
 *
 */
	public static float dividirReales (float oper1, float oper2) {
		return 0.0F ;
	}
	
/**
 * Este m�todo implementar� la divisi�n de dos n�meros enteros. 
 * 
 * @param oper1 Representa el primer operador de la divisi�n 
 * 
 * @param oper2 Representa el segundo operador, el dividendo
 *
 * @return El resultado ser� la divisi�n entre oper1 y oper2.
 * 
 * @throws ArithmeticException Si el dividendo es igual a 0.
 * 
 * Casos especiales:
 *  Si el segundo operador es igual a cero, el resultado ser� NaN.
 *
 */
	public int dividirEnteros (int oper1,int oper2) {
		return 0F;
	}	
	
/**
 *  Este m�todo implementar� la inversi�n de un n�mero entero.
 *  
 *  @param oper1 Representa el n�mero que vas a invertir
 *  
 *  @return El resultado ser� la inversi�n del n�mero.
 *  
 *  Ejemplo: si se introduce el valor 345, el m�todo devolver� 543.
 * 
 */
	public int invertirNum (int oper1) {

		return 0;
	}
	
/**
 * Este m�todo implemetar� la raiz cuadrada de un n�mero.
 * 
 * @param oper1 Representa el n�mero cuya ra�z cuadrada se va a calcular.
 * 
 * @return Resultado de la raiz cuadrada del par�metro uno.
 * 
 * Casos especiales:
 *  Si el operando es 0 el resultado es el mismo al operando.
 *  Si el operando es NaN o menos de 0, el resultado es NaN. 
 *  Si el argumento es infinito positivo, el resultado ser� infinito positivo.
 */
	public double raizCuadrada (double oper1) {
		 return 0.0F;
	}
}
