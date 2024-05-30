package longMethod;

import java.util.List;

/*
 * Tienes un método que calcula y muestra varias estadísticas 
 * (suma, promedio, máximo y mínimo) de una lista de números enteros. 
 * El método actual es muy largo y realiza múltiples tareas. 
 * Refactoriza este método dividiéndolo en métodos más pequeños y específicos 
 * que se encarguen de calcular la suma, el promedio, el máximo y el mínimo, 
 * y de mostrar los resultados.
 */

/**
 * @param calcularEstadisticas
 * Muestra por pantalla el resultado de los demas metodos.
 * 
 * @param Suma
 * Suma los nuemros de la lista más un numero que le pasemos y lo devuelve.
 * 
 * @param Max
 * Compara los valores de la lista uno por uno con el valor que le hemos pasado y 
 * muestra el mayor.
 * 
 * @param Min
 * Compara los valores de la lista uno por uno con el valor que le hemos pasado y 
 * muestra el menos.
 * 
 * @param Promedio
 * Saca el promedio de los valores de la lista junto con el valor que le hemos pasado.
 * 
 */

public class Ejercicio1 {
	public void calcularEstadisticas(List<Integer> numeros) {
	    System.out.println("Suma: " + Suma(0,  numeros));
	    System.out.println("Promedio: " + Promedio(Suma(0, numeros), numeros));
	    System.out.println("Máximo: " + Max(numeros, Integer.MIN_VALUE));
	    System.out.println("Mínimo: " + Min(numeros, Integer.MAX_VALUE));
	}
	
	public int Suma(int sum, List<Integer> numeros) {
		for (int num : numeros) {
            sum += num;
        }
		return sum;
	}
	
	public int Max(List<Integer> numeros, int max) {
		for (int num : numeros) {
            if (num > max) {
                max = num;
            }
        }
		return max;
	}
	
	public int Min(List<Integer> numeros, int min) {
		for (int num : numeros) {
            if (num < min) {
                min = num;
            }
        }
		return min;
	}
	
	public double Promedio(int sum, List<Integer> numeros) {
		return (double) sum / numeros.size();
	}

}
