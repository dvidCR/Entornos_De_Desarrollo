package duplicatedCode;

/*
 * Supón que tienes múltiples métodos que calculan precios con descuentos e
 * impuestos en diferentes partes de tu aplicación. 
 * Refactoriza el código para eliminar la duplicación.
 */

public class PriceCalculator {
	/**
	 * 
	 * @param basePrice
	 * Es un double que guarda el precio base.
	 * @param discountRate
	 * Es un double que guarda el descuento.
	 * @param taxRate
	 * Es un double que guarda los tax.
	 * @return
	 * Devuelve el descuento en el precio final más los tax.
	 */
	public double calculatePrice(double basePrice, double discountRate, double taxRate) {
        double discount = basePrice * discountRate / 100;
        double discountedPrice = basePrice - discount;
        double tax = discountedPrice * taxRate / 100;
        return discountedPrice + tax;
    }
	
}
