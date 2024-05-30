package longMethod;

import java.util.List;

/*
 * Tienes un método que procesa una lista de órdenes de compra. 
 * Este método calcula el total de cada orden, aplica descuentos si el cliente es frecuente,
 *  calcula los impuestos y luego imprime los detalles de la orden. 
 * El método actual es muy largo y realiza múltiples tareas. 
 * Refactoriza este método dividiéndolo en métodos más pequeños y específicos 
 * que se encarguen de calcular el total, aplicar descuentos, calcular impuestos e 
 * imprimir los detalles de la orden.
 */

/**
 * @see Ejercicio2
 * Procesa las ordenes.
 * 
 * @param procesarOrdenes
 * Muestra por pantalla el resultado del resto de metodos.
 * 
 * @param aplicarDescuento
 * Utilizando la calse orden y la lista ordenes, junto con la clase Item, aplican 
 * el descuento.
 * 
 * @param total
 * Saca el total de las ordenes.
 * 
 * @param impuestos
 * Saca el totla de los impuestos.
 * 
 * @see Orden
 * Saca los items de la lista Items y mira cual es el más frecuente.
 * 
 * @param getItems
 * En si el metodo es una lista de Items el cual se encarga de mostrar unicamente
 * lo que contiene, pero devuelve un null.
 * 
 * @param isClienteFrecuente
 * Comprueba que cliente es el más frecuente, pero devuelve un false.
 * 
 * @see Item
 * Saca el precio y la cantidad de los Items.
 * 
 * @param getPrecio
 * Devuelve el precio de los items.
 * 
 * @param getCantidad
 * Devuelve la cantidad de items que hay.
 */

public class Ejercicio2 {
	
	private Orden orden = new Orden();
	private double total;
	
	public void procesarOrdenes(List<Orden> ordenes) {
	    
        // Aplicar descuentos
        
        // Calcular impuestos
        
        // Imprimir orden
        System.out.println("Orden ID: " + orden.getItems());
        System.out.println("Total: " + total(ordenes));
        System.out.println("Impuestos: " + impuestos(ordenes));
	}
	
	public double aplicarDescuento(List<Orden> ordenes) {
		for (Orden orden : ordenes) {
	        for (Item item : orden.getItems()) {
	            total += item.getPrecio() * item.getCantidad();
	        }
		}
		return total;
	}
		
	public double total(List<Orden> ordenes) {
		if (orden.isClienteFrecuente()) {
            total *= 0.9;
        }
		return total;
	}
	
	public double impuestos(List<Orden> ordenes) {
		double impuestos = total * 0.18;
        total += impuestos;
        return total;
	}

}

class Orden {

	public Item[] getItems() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean isClienteFrecuente() {
		// TODO Auto-generated method stub
		return false;
	}
	
}

class Item {

	public int getPrecio() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getCantidad() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
