package main;

import java.util.Scanner;

import calculadora.Calculadora;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calculadora calculadora = new Calculadora();
		calculadora.menu(sc);
	}

}
