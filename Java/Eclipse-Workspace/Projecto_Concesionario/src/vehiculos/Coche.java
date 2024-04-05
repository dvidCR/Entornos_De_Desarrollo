package vehiculos;

public class Coche {
	
	private String color;
	private String clase;
	private int numPlazas;
	private int potencia;
	
	public Coche() {
		
	}
	
	public Coche(String color, String clase, int numPlazas, int potencia) {
		this.color = color;
		this.clase = clase;
		this.numPlazas = numPlazas;
		this.potencia = potencia;
	}

	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getClase() {
		return this.clase;
	}

	public void setClase(String clase) {
		this.clase = clase;
	}

	public int getNumPlazas() {
		return this.numPlazas;
	}

	public void setNumPlazas(int numPlazas) {
		this.numPlazas = numPlazas;
	}

	public int getPotencia() {
		return this.potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
	
	public boolean Estrellado() {
		return this.potencia > 200;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return 	"Atributos de coche1:\n color = " + this.color + "\n" +
				 " clase = " + this.clase + "\n" +
				 " numero de plazas = " + this.numPlazas + "\n" +
				 " potencia = " + this.potencia;
	}
	
}
