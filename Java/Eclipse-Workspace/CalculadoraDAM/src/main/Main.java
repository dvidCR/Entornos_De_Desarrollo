package main;

import java.util.Scanner;

import calculadora.Calculadora;

public class Main {
	
	/**
	 * 
	 * @param main
	 * Instanciamos el metodo Scanner
	 * @see Calculadora
	 * Inicializamos la clase Calculadora
	 * Llamamos al metodo menu de calculadora y le pasamos la instacia de Scanner
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calculadora calculadora = new Calculadora();
		calculadora.menu(sc);
	}

}
