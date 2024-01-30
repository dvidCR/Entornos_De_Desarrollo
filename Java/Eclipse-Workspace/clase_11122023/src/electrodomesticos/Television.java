package electrodomesticos;

public class Television extends Electrodomesticos{
	private int resolucion;
	private boolean tdt;
	//private static final int RESOLUCION = 20;
	//private static final boolean TDT = false;
	
	Television() {
		super();
		this.resolucion = 20;
		this.tdt = false;
	}
	
	Television(double precioBase,double peso) {
		super(precioBase, peso);
		this.resolucion = 20;
		this.tdt = false;
	}
	
	Television(int resolucion, boolean tdt) {
		super();
		this.resolucion = resolucion;
		this.tdt = tdt;
	}

	public int getResolucion() {
		return resolucion;
	}

	public boolean getTDT() {
		return tdt;
	}
	
	@Override
	public double precioFinal() {
		if (resolucion >= 40) {
			return super.precioFinal() + ((40/100) * 40);
		}
		
		if (tdt == true) {
			return super.precioFinal() + 50;
		}
		
		return super.precioFinal();
	}
	
}
