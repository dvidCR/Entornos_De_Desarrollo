package inicio;


import java.util.Scanner;
//import vehiculos.Camion;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Que quieres modificar\n"
				+ " 1. Coche\n"
				+ " 2. Moto\n"
				+ " : ");
		int vehiculo = sc.nextInt();
		
		boolean seguir = exit.exitMenu(true);
		
		 while(seguir) {
			if(vehiculo == 1) {
				menuCoche.menu();
			} else if (vehiculo == 2) {
				menuMoto.menu();
			}
		}
		 sc.close();
		
//		Camion camion1 = new Camion("Gris", "Volvo Gama FH", 2, 1500);
//		System.out.println(camion1);
//		
//		camion1.setPeso(3500);
//		System.out.println(camion1);
	}

}
