package prueba_eclipse23102023;

import java.util.Scanner;

public class prueba1_eclipse23102023 {

	public static void main(String[] args) {
		/*Ejercicio 5
        Scanner sc = new Scanner(System.in);
            System.out.println("Inserta una letra");
            String letra = sc.nextLine();
            
            switch (letra) {
            	case "a":
            		System.out.println(7);
            		break;
            	case "b":
            		System.out.println(9);
            		break;
            	case "c":
            		System.out.println(101);
            		break;
            	defaults:
            		System.out.println("Ta mal");
            		break;
            }
            
        Ejercicio 6*/
		Scanner sc = new Scanner(System.in);
			int[] burbuja = {5,6,88,45,97,30,1};
			int contador = 0;
			int contador2 = 0;
			int aux = 0;
			for (contador = 0; contador < burbuja.length - 1; contador++) {
	            for (contador2 = 0; contador2 < burbuja.length - contador - 1; contador2++) {                                                              
	                if (burbuja[contador2 + 1] < burbuja[contador2]) {
	                    aux = burbuja[contador2 + 1];
	                    burbuja[contador2 + 1] = burbuja[contador2];
	                    burbuja[contador2] = aux;
	                }
	            }
			System.out.println(burbuja);
			}
		}
	}
