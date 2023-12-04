package Examen_04122023;

import java.util.Scanner;

public class Plantilla {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Empleado mario = new Empleado("Mario", "Serradilla", "Penido");
		Empleado dario = new Empleado("Dario", "Arroyo", "Vacas");
		Empleado angel = new Empleado("Angel", "Garcia", "Ojeda", "Progamador", "Contratado");
		int exit = 0;
		do {
			System.out.println("1. Ver lista de espera");
			System.out.println("2. Ver plantilla");
			System.out.println("3. Ver despidos");
			System.out.println("4. Ver rechazados");
			System.out.println("5. Cambiar puesto");
			System.out.println("6. Contratar");
			System.out.println("7. Despedir");
			System.out.println("8. Rechazar");
			System.out.println("9. Salir");
			System.out.println("");
			System.out.println("**Por favor escriba solo el numero de la opcion que quieras coger**");
			System.out.print("Que opcion vas a escoger: ");
			int op = sc.nextInt();
			sc.nextLine();
			/*Este sc.nextLine existe para que consuma la nueva línea después de leer el entero
			 ya que al no haber un ln en print, no hace el salto de linea y se queda en el buffer
			 para cuando el nuevo valor también cogera lo que pediste en el sc.nextInt.
			 */
			
			switch (op) {
				case 1:
					if(mario.getEstado() == "En espera") {
						System.out.println(mario);
					}
					if(dario.getEstado() == "En espera") {
						System.out.println(dario);
					}
					if(angel.getEstado() == "En espera") {
						System.out.println(angel);
					}
					
					System.out.println("Presiona Enter para continuar...");
					sc.nextLine();
					
					break;
				
				case 2:
					if(mario.getEstado() == "Contratado") {
						System.out.println(mario);
					}
					if(dario.getEstado() == "Contratado") {
						System.out.println(dario);
					}
					if(angel.getEstado() == "Contratado") {
						System.out.println(angel);
					}
					
					System.out.println("Presiona Enter para continuar...");
					sc.nextLine();
					
					break;
										
				case 3:
					if(mario.getEstado() == "Despedido") {
						System.out.println(mario);
					}
					if(dario.getEstado() == "Despedido") {
						System.out.println(dario);
					}
					if(angel.getEstado() == "Despedido") {
						System.out.println(angel);
					}
					
					System.out.println("Presiona Enter para continuar...");
					sc.nextLine();
					
					break;
									
				case 4:
					if(mario.getEstado() == "Rechazado") {
						System.out.println(mario);
					}
					if(dario.getEstado() == "Rechazado") {
						System.out.println(dario);
					}
					if(angel.getEstado() == "Rechazado") {
						System.out.println(angel);
					}
					
					System.out.println("Presiona Enter para continuar...");
					sc.nextLine();
					
					break;
					
				case 5:
					System.out.print("Pon el nombre de la persona que quieres cambiar el puesto: ");
					String nombreP = sc.nextLine();
					System.out.println("");
					System.out.print("Pon su primer apellido: ");
					String apellido1P = sc.nextLine();
					System.out.println("");
					System.out.print("Pon su segundo apellido: ");
					String apellido2P = sc.nextLine();
					
					if(mario.getNombre().equals(nombreP) && mario.getApellido1().equals(apellido1P) && mario.getApellido2().equals(apellido2P) && mario.getEstado() == "Contratado") {
						System.out.print("A que puesto le quieres cambiar?: ");
						String puesto = sc.nextLine();
						mario.setPuesto(puesto);
						break;
					}
					if(dario.getNombre().equals(nombreP) && dario.getApellido1().equals(apellido1P) && dario.getApellido2().equals(apellido2P) && dario.getEstado() == "Contratado") {
						System.out.print("A que puesto le quieres cambiar?: ");
						String puesto = sc.nextLine();
						dario.setPuesto(puesto);
						break;
					}
					if(angel.getNombre().equals(nombreP) && angel.getApellido1().equals(apellido1P) && angel.getApellido2().equals(apellido2P) && angel.getEstado() == "Contratado") {
						System.out.print("A que puesto le quieres cambiar?: ");
						String puesto = sc.nextLine();
						angel.setPuesto(puesto);
						break;
					}else{
						System.out.println("Has escrito mal el nombre o los apellidos");
						System.out.println("Presiona Enter para continuar...");
						sc.nextLine();
					}
					
					break;
					
				case 6:
					System.out.print("Pon el nombre de la persona que quieres contratar: ");
					String nombreC = sc.nextLine();
					System.out.println("");
					System.out.print("Pon su primer apellido: ");
					String apellido1C = sc.nextLine();
					System.out.println("");
					System.out.print("Pon su segundo apellido: ");
					String apellido2C = sc.nextLine();
					
					if(mario.getNombre().equals(nombreC) && mario.getApellido1().equals(apellido1C) && mario.getApellido2().equals(apellido2C) && mario.getEstado() == "En espera") {
						mario.contratar();
						System.out.println("");
						System.out.print("En que puesto lo vas a poner?: ");
						String puesto = sc.nextLine();
						mario.setPuesto(puesto);
						break;
					}
					if(dario.getNombre().equals(nombreC) && dario.getApellido1().equals(apellido1C) && dario.getApellido2().equals(apellido2C) && dario.getEstado() == "En espera") {
						dario.contratar();
						System.out.println("");
						System.out.print("En que puesto lo vas a poner?: ");
						String puesto = sc.nextLine();
						dario.setPuesto(puesto);
						break;
					}
					if(angel.getNombre().equals(nombreC) && angel.getApellido1().equals(apellido1C) && angel.getApellido2().equals(apellido2C) && angel.getEstado() == "En espera") {
						angel.contratar();
						System.out.println("");
						System.out.print("En que puesto lo vas a poner?: ");
						String puesto = sc.nextLine();
						angel.setPuesto(puesto);
						break;
					}else{
						System.out.println("Has escrito mal el nombre o los apellidos");
						System.out.println("Presiona Enter para continuar...");
						sc.nextLine();
					}
					
					break;
					
				case 7:
					System.out.print("Pon el nombre de la persona que quieres despedir: ");
					String nombreD = sc.nextLine();
					System.out.println("");
					System.out.print("Pon su primer apellido: ");
					String apellido1D = sc.nextLine();
					System.out.println("");
					System.out.print("Pon su segundo apellido: ");
					String apellido2D = sc.nextLine();
					
					if(mario.getNombre().equals(nombreD) && mario.getApellido1().equals(apellido1D) && mario.getApellido2().equals(apellido2D) && mario.getEstado() == "Contratado") {
						mario.despedir();
						break;
					}
					if(dario.getNombre().equals(nombreD) && dario.getApellido1().equals(apellido1D) && dario.getApellido2().equals(apellido2D) && dario.getEstado() == "Contratado") {
						dario.despedir();
						break;
					}
					if(angel.getNombre().equals(nombreD) && angel.getApellido1().equals(apellido1D) && angel.getApellido2().equals(apellido2D) && angel.getEstado() == "Contratado") {
						angel.despedir();
						break;
					}else{
						System.out.println("Has escrito mal el nombre o los apellidos");
						System.out.println("Presiona Enter para continuar...");
						sc.nextLine();
					}
					
					break;
					
				case 8:
					System.out.print("Pon el nombre de la persona que quieres rechazar: ");
					String nombreR = sc.nextLine();
					System.out.println("");
					System.out.print("Pon su primer apellido: ");
					String apellido1R = sc.nextLine();
					System.out.println("");
					System.out.print("Pon su segundo apellido: ");
					String apellido2R = sc.nextLine();
					
					if(mario.getNombre().equals(nombreR) && mario.getApellido1().equals(apellido1R) && mario.getApellido2().equals(apellido2R) && mario.getEstado() == "En espera") {
						mario.rechazar();
						break;
					}
					if(dario.getNombre().equals(nombreR) && dario.getApellido1().equals(apellido1R) && dario.getApellido2().equals(apellido2R) && dario.getEstado() == "En espera") {
						dario.rechazar();
						break;
					}
					if(angel.getNombre().equals(nombreR) && angel.getApellido1().equals(apellido1R) && angel.getApellido2().equals(apellido2R) && angel.getEstado() == "En espera") {
						angel.rechazar();
						break;
					}else{
						System.out.println("Has escrito mal el nombre o los apellidos");
						System.out.println("Presiona Enter para continuar...");
						sc.nextLine();
					}
					
					break;
					
				case 9:
					exit = 1;
					
			}
		}while(exit == 0);
	}

}