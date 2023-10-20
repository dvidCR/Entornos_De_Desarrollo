/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase_20102023;
import java.util.Scanner;

public class Clase_20102023 {

    
    public static void main(String[] args) {
        /*Ejercicio 1
        Scanner sc = new Scanner(System.in);
            System.out.println("Introduce un número: ");
            int n1 = sc.nextInt();
            System.out.println("Introduce otro número: ");
            int n2 = sc.nextInt();
            System.out.println("Introduce uno más: ");
            int n3 = sc.nextInt();
            
            if(n1 < n2){
                System.out.println(n1);
            } else if(n2 < n3) {
                System.out.println(n2);
            } else {
                System.out.println(n3);
            }
        Ejercicio 3
        Scanner sc = new Scanner(System.in);
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            String operacion = sc.nextLine();
            switch(operacion){
                case "1", "suma" -> {
                    System.out.println("Primer numero: ");
                    int n1 = sc.nextInt();
                    System.out.println("Segundo numero: ");
                    int n2 = sc.nextInt();
                    int suma = n1 + n2;
                    System.out.println(n1 + "+" + n2 + "=" + suma);
                }
                case "2", "resta" -> {
                    System.out.println("Primer numero: ");
                    int num1 = sc.nextInt();
                    System.out.println("Segundo numero: ");
                    int num2 = sc.nextInt();
                    int resta = num1 - num2;
                    System.out.println(num1 + "-" + num2 + "=" + resta);
                }
            }
        Ejercicio 4
        Scanner sc = new Scanner(System.in);
            int contador = 0;
            String usuario = "David";
            String contrasena = "abcd1234";
            while(contador < 3){
                System.out.println("Introduzca el nombre de usuario: ");
                String nombre = sc.nextLine();
                System.out.println("Introduzca la contraseña: ");
                String password = sc.nextLine();
                if(nombre.equals(usuario)){
                    if(contrasena.equals(password)){
                        System.out.println("Bienvenido" + usuario);
                        break;
                    } else {
                        System.out.println("Contraseña Incorrecta");
                        contador++;
                    }
                } else {
                    System.out.println("Nombre de Usuario Incorrecto");
                    contador++;
                }     
            }
            if(contador == 3){
                System.out.println("Muchos intentos fallidos, Equipo bloqueado");
            }
        Ejercicio 5
        Scanner sc = new Scanner(System.in);
            System.out.println("Inserta una letra");
            String letra = sc.nextLine();
            if(letra.equals("a")){
                System.out.println(7);
            }
            if(letra.equals("b")){
                System.out.println(9);
            }
            if(letra.equals("c")){
                System.out.println(101);
            } else {
                System.out.println("Te has equivocado de letra");
            }
        Ejercicio 7*/
        Scanner sc = new Scanner(System.in);
            System.out.println("Pon cualquier hora: ");
            int H = sc.nextInt();
            System.out.println("Pon cualquier minuto: ");
            int M = sc.nextInt();
            System.out.println("Pon cualquier segundo: ");
            int S = sc.nextInt();
            if(H < 25){
                if(M < 60){
                    if(S < 60){
                        System.out.println(H + ":" + M + ":"+ S + " " + "Es una hora valida");
                    } else {
                        System.out.println("No es un segundo valido");
                    }
                } else {
                    System.out.println("No es una minuto valido");
                }
            } else {
                System.out.println("No es una hora valida");
            }
  
    }
    
}
