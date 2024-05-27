package vehiculos;

public class Moto extends Vehiculo{
	private String color;
	private double tanque;
	private double gasolina;
	private int potencia;
	private static double CIEN_KM = 100;
	
	public Moto() {
		
	}
	
	public Moto(String color, double tanque, double gasolina, int potencia) {
		this.color = color;
		this.tanque = tanque;
		this.gasolina = gasolina;
		this.potencia = potencia;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getTanque() {
		return tanque;
	}

	public void setTanque(double tanque) {
		this.tanque = tanque;
	}
	
	public double getGasolina() {
		return gasolina;
	}

	public void setGasolina(double gasolina) {
		this.gasolina = gasolina;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
	
	public double Consumo(double kilometros) {
		double consumo = (this.gasolina / kilometros) * Moto.CIEN_KM;
		this.gasolina = this.gasolina - consumo;
		return consumo;
	}
	
	public boolean comprobarRepostaje(double litros) {
		if(litros > this.tanque) {
			return false;
		} else {
			return true;
		}
	}
	
	public boolean comprobarCombustible() {
		if(this.gasolina < 0) {
			return false;
		} else {
			return true;
		}
	}
	
	@Override
	public String toString() {
		return "Atributos de moto:\n color = " + this.color + "\n" +
				 " tanque = " + this.tanque + "\n" +
				 " litros en el tanque = " + this.gasolina + "\n" +
				 " potencia = " + this.potencia;
	}
}
