package clase_11122023;

public class Coche extends Vehiculo {
	private int numPuertas;
	
	public Coche(String matricula, String color) {
		super(matricula, color);
		this.numPuertas = 4;
	}
	
	public Coche(String matricula, String color, int puertas) {
		super(matricula, color);
		this.numPuertas = puertas;
	}
	
	public Coche(Coche cp) {
		this.numPuertas = cp.numPuertas;
	}
	
	public int getPuertas() {
		return numPuertas;
	}
	
	public void setPuertas(int puertas) {
		this.numPuertas = puertas;
	}

	@Override
	public String toString() {
		return "Coche [numPuertas=" + numPuertas + "]";
	}
	
}
