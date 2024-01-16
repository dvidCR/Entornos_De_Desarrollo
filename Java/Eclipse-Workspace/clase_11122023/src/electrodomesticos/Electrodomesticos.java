package electrodomesticos;

public class Electrodomesticos {
	private int precioBase;
	private String color;
	private String consumo;
	private String peso;
	
	Electrodomesticos() {
		this.precioBase = 100;
		this.color = "blanco";
		this.consumo = "F";
		this.peso = "5 kg";
	}
	
	Electrodomesticos(int precioBase, String peso) {
		this.precioBase = precioBase;
		this.peso = peso;
	}
	
	Electrodomesticos(int precioBase, String color, String consumo, String peso) {
		this.precioBase = precioBase;
		this.color = color;
		this.consumo = consumo;
		this.peso = peso;
	}
	
	Electrodomesticos(Electrodomesticos cp) {
		this.precioBase = cp.precioBase;
		this.color = cp.color;
		this.consumo = cp.consumo;
		this.peso = cp.peso;
	}
	
	public int getPrecioBase() {
		return this.precioBase;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public String getConsumo() {
		return this.consumo;
	}
	
	public String getPeso() {
		return this.peso;
	}
	
	public String comprobarConsumoEnergetico(String letra) {
		String consumo[] = {"A", "B", "C", "D", "E", "F"};
		if (letra == consumo[0]) {
			return letra;
		} else {
			return "F";
		}
	}
	
}
