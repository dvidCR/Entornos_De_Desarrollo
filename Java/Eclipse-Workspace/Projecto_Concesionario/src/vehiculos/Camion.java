package vehiculos;

public class Camion extends Vehiculo{
	
	private String color;
	private String modelo;
	private int numPlazas;
	private double peso;
	
	public Camion() {
		
	}
	
	public Camion(String color, String modelo, int numPlazas, double peso) {
		this.color = color;
		this.modelo = modelo;
		this.numPlazas = numPlazas;
		this.peso = peso;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getNumPlazas() {
		return numPlazas;
	}

	public void setNumPlazas(int numPlazas) {
		this.numPlazas = numPlazas;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	@Override
	public String toString() {
		return "Atributos de camion:\n color = " + this.color + "\n" +
				 " modelo = " + this.modelo + "\n" +
				 " numero de plazas = " + this.numPlazas + "\n" +
				 " peso = " + this.peso;
	}
}
