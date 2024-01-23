package electrodomesticos;

public class Television extends Electrodomesticos{
	private int resolucion;
	private boolean TDT;
	
	Television(double precioBase, String color, String consumo, double peso) {
		super(precioBase, color, consumo, peso);
		this.resolucion = 20;
		this.TDT = false;
	}
	
	Television(double precioBase, String color, String consumo, double peso, double precio, int kilos) {
		super(precioBase = precio, color, consumo, peso = kilos);
		this.resolucion = 20;
		this.TDT = false;
	}
	
	Television(int resolucion, boolean TDT, double precioBase, String color, String consumo, double peso) {
		super(precioBase, color, consumo, peso);
		this.resolucion = resolucion;
		this.TDT = TDT;
	}

	public int getResolucion() {
		return resolucion;
	}

	public boolean isTDT() {
		return TDT;
	}
	
	@Override
	public double precioFinal() {
		if (resolucion >= 40) {
			return super.precioFinal() + ((40/100) * 40);
		}
		
		if (TDT == true) {
			return super.precioFinal() + 50;
		}
		
		return super.precioFinal();
	}
	
}
