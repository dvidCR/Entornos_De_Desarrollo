package inicio;

import java.util.Scanner;

import vehiculos.Moto;

public class menuMoto {
	static Scanner sc = new Scanner(System.in);
	static Moto moto1 = new Moto("veis", 20, 0, 110);
	
	public static void menu() {
		System.out.println(moto1 + "\n");
		System.out.println("Que le quieres cambiar a tu moto:\n"
				+ " 1. Color\n"
				+ " 2. Tanque\n"
				+ " 3. Gasolina con la que viene\n"
				+ " 4. Potencia\n"
				+ " 5. Salir\n"
				+ " : ");
		
		int op = sc.nextInt();
		sc.nextLine();
		
		switch(op) {
		case 1:
			System.out.println("A que color lo quieres cambiar: ");
			String color = sc.nextLine();
			moto1.setColor(color);
			break;
		case 2:
			System.out.println("De cuanto quieres el tanque: ");
			double tanque = sc.nextDouble();
			moto1.setTanque(tanque);
			break;
		case 3:
			System.out.println("Con cuanta gasolina quieres que venga: ");
			double gasolina = sc.nextDouble();
			if (moto1.comprobarRepostaje(gasolina)) {
				moto1.setGasolina(gasolina);
			} else {
				System.out.println("Estas piedendo mas gasolina de la que tiene el tanque.\n"
						+ "Si quieres poner esa cantidad de gasolina tienes que aumentar la capacidad del tanque.");
			}
			break;
		case 4:
			System.out.println("ADVERTENCIA\n"
					+ "Si le pones mucha potencia al coche se te puede ir mucho.");
			System.out.println("Cuanta potencia quieres que tenga ahora: ");
			int potencia = sc.nextInt();
			moto1.setPotencia(potencia);
			break;
		case 5:
			exit.exitMenu(false);
			break;
		}
		
	}
	
	public void salirConcesionario() {
		System.out.println("¿Quieres conducir la moto?(s/n):");
		String usar = sc.nextLine();
		if(usar.equals("s")) {
			boolean conducir = true;
			do {
				System.out.println(moto1 + "\n");
				System.out.println("Que quieres hacer\n"
						+ " 1. Conducir\n"
						+ " 2. Repostar\n"
						+ " 3. Irse para casa\n"
						+ " : ");
				int op = sc.nextInt();
				sc.nextLine();
				
				switch (op) {
					case 1:
						if(moto1.comprobarCombustible()) {
							System.out.println("¿Cuantos kilometros quieres conducior?: ");
							double kilometros = sc.nextDouble();
							System.out.println("En este viaje has consumido "+ moto1.Consumo(kilometros));
						} else {
							System.out.println("No tienes combustible");
						}
						break;
					case 2:
						System.out.println("¿Cuantos litros de gasolina quieres respotar?: ");
						double litros = sc.nextDouble();
						if (moto1.comprobarRepostaje(litros)) {
							moto1.setGasolina(litros);
						} else {
							System.out.println("Estas hechando mas gasolina que la cantidad de litros que entran en el tanque.");
						}
						break;
					case 3:
						System.out.println("Esperemos que hayas tenido un buen viaje");
						sc.close();
						conducir = false;
						exit.exitMenu(false);
						break;
				}
			} while(conducir);
		}
	}
	
	public static boolean exit(boolean seguir) {
		return seguir;
	}
	
}
