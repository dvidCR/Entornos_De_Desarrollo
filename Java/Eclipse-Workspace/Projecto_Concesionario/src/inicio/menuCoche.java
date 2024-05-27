package inicio;

import java.util.Scanner;
import vehiculos.Coche;

public class menuCoche {
	static Scanner sc = new Scanner(System.in);
	static Coche coche1 = new Coche("rojo", "Deportivo", 4, 100);
	
	public static void menu() {
		System.out.println(coche1 + "\n");
		System.out.println("Que le quieres cambiar a tu coche:\n"
				+ " 1. Color\n"
				+ " 2. Clase\n"
				+ " 3. Numero de Plazas\n"
				+ " 4. Potencia\n"
				+ " 5. Salir\n"
				+ " : ");
		
		int op = sc.nextInt();
		sc.nextLine();
		
		switch(op) {
			case 1:
				System.out.println("A que color lo quieres cambiar: ");
				String color = sc.nextLine();
				coche1.setColor(color);
				break;
			case 2:
				System.out.println("Que clase quieras que sea ahora tu coche: ");
				String clase = sc.nextLine();
				coche1.setClase(clase);
				break;
			case 3:
				System.out.println("Cuantas plazas quieres que tenga tu coche: ");
				int plazas = sc.nextInt();
				coche1.setNumPlazas(plazas);
				break;
			case 4:
				System.out.println("ADVERTENCIA\n"
						+ "Si le pones mucha potencia al coche se te puede ir mucho.");
				System.out.println("Cuanta potencia quieres que tenga ahora: ");
				int potencia = sc.nextInt();
				coche1.setPotencia(potencia);
				break;
			case 5:
				exit.exitMenu(false);
				break;
		}
	}
	
	public void salirConcesionario() {
			if(coche1.Estrellado()) {
				System.out.println("PAM!!!!!!!!!!\n"
						+ "No has salido ni del concesionario y ya te has estrellado.");
			} else {
				System.out.println("Tu coche recien comprado tiene las siguientes caracteristicas\n"
						+ coche1);
			}
	}
	
}
