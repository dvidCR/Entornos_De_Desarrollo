package clase_11122023;

public class Camion extends Vehiculo {
	private String cargaMax;
	
	public Camion(String matricula, String color) {
		super(matricula, color);
		this.cargaMax = "15T";
	}
	
	public Camion(String matricula, String color, String cargaMax) {
		super(matricula, color);
		this.cargaMax = cargaMax;
	}
	
	public Camion(Camion cp) {
		this.cargaMax = cp.cargaMax;
	}
	
	public String getCarga() {
		return cargaMax;
	}
	
	public void setCarga(String cargaMax) {
		this.cargaMax = cargaMax;
	}

	@Override
	public String toString() {
		return "Camion [cargaMax=" + cargaMax + "]";
	}
	
}
