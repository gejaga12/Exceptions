package com.empresa;

public class AppPrincipal {

	public static int numerador = 10;
	public static Integer denominador = null;
	public static float division;

	public static void main(String[] args) {
		// 1)
		System.out.println("Inicion de la App");
		System.out.println("Antes de la division");

		try {
			// instrucciones a ejecutar , propensas a lanzar errores!
			division = numerador / denominador; // no se puede dividir por cero en R
		} catch (ArithmeticException e) {
			// instrucciones a ejecutar si se produce una exception
			division = 0; // si hay una excepcion doy valor cero al atributop division
			// obtenemos info del error sucedido
			System.out.println("messsage : " + e.getMessage());
			System.out.println("c : " + e.getCause());

		} catch (NullPointerException e) {
			division = 1; // si hay una excepcion por intentar dividir por un null doy valor 1 al
							// atributo division
			System.out.println("messsage : " + e.getMessage());
			System.out.println("c : " + e.getCause());

		} finally {
			// instrucciones que se ejecutan , tanto si si hay como sino hay excepciones
			// 3)
			System.out.println("Division : " + division);
			System.out.println("Despues de hacer la division ,Fin de la app ");

		}

	}

}
