package calculadora;

import java.util.Scanner;

public class Calculadora {
	
	public void menu(Scanner sc) {
		int op = 0;
		while(op != 5) {
			System.out.println(menuTxt());
			switch(sc.nextInt()) {
				case 1:
					System.out.println("Pon un numero: ");
					int abs = sc.nextInt();
					System.out.println(opAbs(abs));
					break;
				case 2:
					System.out.println("Pon un numero: ");
					int atan = sc.nextInt();
					System.out.println(opAtan(atan));
					break;
				case 3:
					System.out.println("Pon un numero: ");
					int sin = sc.nextInt();
					System.out.println(opSin(sin));
					break;
				case 4:
					System.out.println("Pon un numero: ");
					int cos = sc.nextInt();
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
