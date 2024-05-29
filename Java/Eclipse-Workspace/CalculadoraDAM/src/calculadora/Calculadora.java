package calculadora;

import java.util.Scanner;

public class Calculadora {
	
	/**
	 * 
	 * @param menu
	 * Pilla por parametros la instancia de Scanner
	 * Esta en un constante bucle llamando al método menuTxt para mostrarnos las opciones disponibles
	 * Dependiendo de la opción llamamos al resto de metodos para hacer las operaciones
	 * 
	 * @param menuTxt
	 * Devuelve el menú
	 * 
	 * @param opAbs
	 * Devuelve el resultado de la operacion Abs
	 * 
	 * @param opAtan
	 * Devuelve el resultado de la operacion Atan
	 * 
	 * @param opSin
	 * Devuelve el resultado de la operacion Sin
	 * 
	 * @param opCos
	 * Devuelve el resultado de la operacion Cos
	 */
	
	public void menu(Scanner sc) {
		int op = 0;
		while(op != 5) {
			System.out.println(menuTxt());
			switch(sc.nextInt()) {
				case 1:
					System.out.println("Pon un numero: ");
					double abs = sc.nextDouble();
					System.out.println(opAbs(abs));
					break;
				case 2:
					System.out.println("Pon un numero: ");
					double atan = sc.nextDouble();
					System.out.println(opAtan(atan));
					break;
				case 3:
					System.out.println("Pon un numero: ");
					double sin = sc.nextDouble();
					System.out.println(opSin(sin));
					break;
				case 4:
					System.out.println("Pon un numero: ");
					double cos = sc.nextDouble();
					System.out.println(opCos(cos));
					break;
				case 5:
					op = 5;
					break;
			}
		}
			
	}
	
	private String menuTxt() {
		return "\n ---------------"
				+ "\n CALCULADORA"
				+ "\n ---------------"
				+ "\n 1. abs"
				+ "\n 2. atan"
				+ "\n 3. sin"
				+ "\n 4. cos"
				+ "\n 5. salir"
				+ "\n ---------------"
				+ "\n:";
	}
	
	public static int opAbs(double num) {
		return (int) Math.abs(num);
	}
	
	public static double opAtan(double num) {
		return Math.atan(num);
	}
	
	public static double opSin(double num) {
		return Math.sin(num);
	}
	
	public static double opCos(double num) {
		return Math.cos(num);
	}
}
