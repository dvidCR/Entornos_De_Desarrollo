package inicio;


import java.util.Scanner;
//import vehiculos.Camion;
import vehiculos.Coche;
import vehiculos.Moto;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Coche coche1 = new Coche("rojo", "Deportivo", 4, 100);
		Moto moto1 = new Moto("veis", 20, 0, 110);
		System.out.println("Que quieres modificar\n"
				+ " 1. Coche\n"
				+ " 2. Moto\n"
				+ " : ");
		int vehiculo = sc.nextInt();
		
		boolean seguir = true;
		boolean conducir = true;
		
		do {
			if(vehiculo == 1) {
				System.out.println(coche1 + "\n");
				System.out.println("Que le quieres cambiar a tu coche:\n"
						+ " 1. Color\n"
						+ " 2. Clase\n"
						+ " 3. Numero de Plazas\n"
						+ " 4. Potencia\n"
						+ " 5. Salir\n"
						+ " : ");
			} else if (vehiculo == 2) {
				System.out.println(moto1 + "\n");
				System.out.println("Que le quieres cambiar a tu moto:\n"
						+ " 1. Color\n"
						+ " 2. Tanque\n"
						+ " 3. Gasolina con la que viene\n"
						+ " 4. Potencia\n"
						+ " 5. Salir\n"
						+ " : ");
			}
			int op = sc.nextInt();
			sc.nextLine();
			
			switch(op) {
				case 1:
					System.out.println("A que color lo quieres cambiar: ");
					String color = sc.nextLine();
					
					if (vehiculo == 1) {
						coche1.setColor(color);
					} else if (vehiculo == 2) {
						moto1.setColor(color);
					}
					
					break;
				case 2:
					if (vehiculo == 1) {
						System.out.println("Que clase quieras que sea ahora tu coche: ");
						String clase = sc.nextLine();
						coche1.setClase(clase);
					} else if (vehiculo == 2) {
						System.out.println("De cuanto quieres el tanque: ");
						double tanque = sc.nextDouble();
						moto1.setTanque(tanque);
					}
					
					break;
				case 3:
					if (vehiculo == 1) {
						System.out.println("Cuantas plazas quieres que tenga tu coche: ");
						int plazas = sc.nextInt();
						coche1.setNumPlazas(plazas);
					} else if (vehiculo == 2) {
						System.out.println("Con cuanta gasolina quieres que venga: ");
						double gasolina = sc.nextDouble();
						if (moto1.comprobarRepostaje(gasolina)) {
							moto1.setGasolina(gasolina);
						} else {
							System.out.println("Estas piedendo mas gasolina de la que tiene el tanque.\n"
									+ "Si quieres poner esa cantidad de gasolina tienes que aumentar la capacidad del tanque.");
						}
					}
					
					break;
				case 4:
					System.out.println("ADVERTENCIA\n"
							+ "Si le pones mucha potencia al coche se te puede ir mucho.");
					System.out.println("Cuanta potencia quieres que tenga ahora: ");
					int potencia = sc.nextInt();
					
					if (vehiculo == 1) {
						coche1.setPotencia(potencia);
					} else if (vehiculo == 2) {
						moto1.setPotencia(potencia);
					}
					
					break;
				case 5:
					seguir = false;
					break;
			}
		} while(seguir);
		
		if(vehiculo == 1) {
			if(coche1.Estrellado()) {
				System.out.println("PAM!!!!!!!!!!\n"
						+ "No has salido ni del concesionario y ya te has estrellado.");
			} else {
				System.out.println("Tu coche recien comprado tiene las siguientes caracteristicas\n"
						+ coche1);
			}
		} else if(vehiculo == 2) {
			System.out.println("¿Quieres conducir la moto?(s/n):");
			String usar = sc.nextLine();
			if(usar.equals("s")) {
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
								double kilometros = sc.nextInt();
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
							break;
					}
				} while(conducir);
			}
		}
		
//		Camion camion1 = new Camion("Gris", "Volvo Gama FH", 2, 1500);
//		System.out.println(camion1);
//		
//		camion1.setPeso(3500);
//		System.out.println(camion1);
	}

}
