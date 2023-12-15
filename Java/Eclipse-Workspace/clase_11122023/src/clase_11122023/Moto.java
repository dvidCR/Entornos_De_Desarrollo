package clase_11122023;

public class Moto extends Vehiculo {
	private String cilindrada;
	
	public Moto(String matricula, String color) {
		super(matricula, color);
		this.cilindrada = "124cc";
	}
	
	public Moto(String matricula, String color, String cilindrada) {
		super(matricula, color);
		this.cilindrada = cilindrada;
	}
	
	public Moto(Moto cp) {
		this.cilindrada = cp.cilindrada;
	}
	
	public String getCilindrada() {
		return cilindrada;
	}
	
	public void setCilindrada(String cilindrada) {
		this.cilindrada = cilindrada;
	}

	@Override
	public String toString() {
		return "Moto [cilindrada=" + cilindrada + "]";
	}
	
}
