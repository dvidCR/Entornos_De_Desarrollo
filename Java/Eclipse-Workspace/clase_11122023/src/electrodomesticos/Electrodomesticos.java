package electrodomesticos;

public class Electrodomesticos {
	protected double precioBase;
	protected String color; //Aqui el String lo tengo que cambiar por COLOR
	protected String consumo;
	protected double peso;
	
	//private static final String COLOR = "BLANCO";
	//private static final char CONSUMOBASE = 'F';
	//private static final double PRECIO = 100;
	//private static final double PESO = 5;
	
	Electrodomesticos() {
		this.precioBase = 100;
		this.color = "blanco";
		this.consumo = "F";
		this.peso = 5;
	}
	
	Electrodomesticos(double precioBase, double peso) {
		this.precioBase = precioBase;
		this.peso = peso;
	}
	
	Electrodomesticos(double precioBase, String color, String consumo, double peso) {
		this.precioBase = precioBase;
		this.color = color;
		this.consumo = consumo;
		this.peso = peso;
	}
	
	Electrodomesticos(Object cp) {
		this.precioBase = ((Electrodomesticos)cp).precioBase;
		this.color = ((Electrodomesticos)cp).color;
		this.consumo = ((Electrodomesticos)cp).consumo;
		this.peso = ((Electrodomesticos)cp).peso;
	}
	
	public double getPrecioBase() {
		return this.precioBase;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public String getConsumo() {
		return this.consumo;
	}
	
	public double getPeso() {
		return this.peso;
	}
	
	public String comprobarConsumoEnergetico(String letra) {
		String energia[] = {"A", "B", "C", "D", "E", "F"};
		for (int cont = 0; cont < energia.length; cont++) {
			if (letra.equals(energia[cont])) {
				return letra;
			}
		}
		return "F";
	}
	
	public String comprobarColor(String color) {
		String colores[] = {"blanco", "negro", "rojo", "azul", "gris"};
		for (int cont = 0; cont < colores.length; cont++) {
			if (color.equals(colores[cont])) {
				return color;
			}
		}
		return "blanco";
	}
	
	public double precioFinal() {
		switch (this.consumo) {
			case "A":
				this.precioBase = precioBase + 100;
				break;
			
			case "B":
				this.precioBase = precioBase + 80;
				break;
				
			case "C":
				this.precioBase = precioBase + 60;
				break;
				
			case "D":
				this.precioBase = precioBase + 50;
				break;
				
			case "E":
				this.precioBase = precioBase + 30;
				break;
				
			case "F":
				this.precioBase = precioBase + 10;
				break;
		}
		
		if (this.peso >= 0 && this.peso <= 19) {
			this.precioBase = precioBase + 10;
		}
		
		if (this.peso >= 20 && this.peso <= 49) {
			this.precioBase = precioBase + 50;
		}
		
		if (this.peso >= 50 && this.peso <= 79) {
			this.precioBase = precioBase + 80;
		}
		
		if (this.peso >= 80) {
			this.precioBase = precioBase + 100;
		}
		
		return this.precioBase;
		
	}

	@Override
	public String toString() {
		return "Electrodomesticos [precioBase=" + precioBase + ", color=" + color + ", consumo=" + consumo + ", peso="
				+ peso + "]";
	}
	
}