/**
 * 
 */
package clase_27102023;
import java.util.Scanner;

/**
 * 
 */
public class clase_27102023 {

	public static void main(String[] args) {
		/*Ejercico 8
		Scanner sc = new Scanner(System.in);
			System.out.println("Escribe el numero de un mes: ");
			int mes = sc.nextInt();
			switch (mes) {
				case 1:
					System.out.println("El mes que has indicado tiene 31 dias y es mes de enero.");
					break;
				case 2:
					System.out.println("El mes que has indicado tiene 28 dias y es mes de febrero.");
					break;
				case 3:
					System.out.println("El mes que has indicado tiene 31 dias y es mes de marzo.");
					break;
				case 4:
					System.out.println("El mes que has indicado tiene 30 dias y es mes de abril.");
					break;
				case 5:
					System.out.println("El mes que has indicado tiene 31 dias y es mes de mayo.");
					break;
				case 6:
					System.out.println("El mes que has indicado tiene 30 dias y es mes de junio.");
					break;
				case 7:
					System.out.println("El mes que has indicado tiene 31 dias y es mes de julio.");
					break;
				case 8:
					System.out.println("El mes que has indicado tiene 30 dias y es mes de agosto.");
					break;
				case 9:
					System.out.println("El mes que has indicado tiene 31 dias y es mes de septiembre.");
					break;
				case 10:
					System.out.println("El mes que has indicado tiene 30 dias y es mes de octubre.");
					break;
				case 11:
					System.out.println("El mes que has indicado tiene 31 dias y es mes de noviembre.");
					break;
				case 12:
					System.out.println("El mes que has indicado tiene 30 dias y es mes de diciembre.");
					break;
				}
		Ejercicio 9
		Scanner sc = new Scanner(System.in);
		int number;
		int num[] = new int[10];
		int i = 0;
			do {
				System.out.println("Esccribe un número entero(para finalizar tienes que poner el -25)");
				number = sc.nextInt();
				num[i] = number;
				i++;
			} while (number != -25);
			System.out.println(num.toString());
		Ejercicio 9.2
		Scanner sc = new Scanner(System.in);
        int contador = 0;
        int input;
        do{
            System.out.print("inserta un numero: ");
            input = sc.nextInt();
            if(input<1){
                contador+=1;
            }
        }while(input != -25);
        System.out.print("has puesto "+contador+" ceros y negativos");
        Ejercicio 10*/
		Scanner sc = new Scanner(System.in);
			System.out.println("Inserta un número cualquiera: ");
			int numero = sc.nextInt();
			int aux = numero;
			int contador = 0;
			while (aux != 0) {
				aux = aux / 10;
				contador++;
			}
			System.out.println("El número tiene " + aux);
			aux = numero;
			int cifra;
			int invertido = 0;
			while (aux != 0) {
				cifra = aux % 10;
				invertido = cifra * (int)Math.pow(10, (contador -1));
				contador--;
				aux = aux / 10;
			}
			System.out.println(invertido);
	}

}
