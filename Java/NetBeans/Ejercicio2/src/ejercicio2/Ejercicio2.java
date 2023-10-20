/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2;
import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

                System.out.println("Inserta una frase: ");
		String frase = sc.nextLine();
		System.out.println("Inserta una letra: ");
		char letra = sc.nextLine().charAt(0);
                int cont = 0;
                
                for(int i = 0; i < frase.length(); i++) {//i++ => i = i+1
                    if(frase.charAt(index: i) == letra){
                        cont = cont ++
                    }
                }
                System.out.println("Aparece un total de " + cont);
    }
    
}
