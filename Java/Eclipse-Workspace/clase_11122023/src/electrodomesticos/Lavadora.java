package electrodomesticos;

public class Lavadora extends Electrodomesticos {
	private double carga;
	
	//private static final double CARGA = 5.0;
	
	Lavadora() {
		super();
		this.carga = 5;
	}
	
	Lavadora(double precioBase, double peso) {
		super(precioBase, peso);
		this.carga = 5;
	}
	
	Lavadora(double carga) {
		super();
		this.carga = carga;
	}
	
	Lavadora(Object cp) {
		super(cp);
		this.carga = ((Lavadora)cp).carga;
	}

	public double getCarga() {
		return carga;
	}
	
	@Override
	public double precioFinal() {
		if (carga >= 30) {
			return super.precioFinal() + 50.0;
		}
		return super.precioFinal();
	}
}