package clase_08012024;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String exit = "n";
		
		do {
		
			System.out.println("Pon el valor de las fracciones ==  num1 / num2    num3 / num4");
			System.out.print("num1: ");
			int num1 = sc.nextInt();
			System.out.print("num2: ");
			int num2 = sc.nextInt();
			System.out.print("num3: ");
			int num3 = sc.nextInt();
			System.out.print("num4: ");
			int num4 = sc.nextInt();
			
			Fracciones fraccion = new Fracciones(num1, num2, num3, num4);
			
			System.out.println("¿Que quieres hacer?:");
			System.out.println("1. Sumar");
			System.out.println("2. Restar");
			System.out.println("3. Multiplicar");
			System.out.println("4. Dividir");
			System.out.print(": ");
			
			int op = sc.nextInt();
			sc.nextLine();
			
			switch (op) {
				case 1:
					System.out.println(fraccion.Suma());
					break;
					
				case 2:
					System.out.println(fraccion.Resta());
					break;
					
				case 3:
					System.out.println(fraccion.Multiplicacion());
					break;
					
				case 4:
					System.out.println(fraccion.Division());
					break;
			}
			
			System.out.print("¿Quieres salir?(y/n): ");
			exit = sc.nextLine();
		
		}while(exit.equals("n"));
	}

}