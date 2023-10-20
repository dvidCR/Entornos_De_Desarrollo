/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;
import java.util.Scanner;

public class Ejercicio1 {


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

		System.out.println("Inserta el primer número");
		int n1 = s.nextInt();
		System.out.println("Inserta el segundo número");
		int n2 = s.nextInt();
		System.out.println("Inserta el tercer número");
		int n3 = s.nextInt();
                
                if (n1 <= n2 && n1 <= n3){
                    System.out.println("El menor es: " + n1);
                }
                if (n2 <= n1 && n2 <= n3){
                    System.out.println("El menor es: " + n2);
                }
                if (n3 <= n1 && n3 <= n2){
                    System.out.println("El menor es: " + n3);
                }
    }
    
}
