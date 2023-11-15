package clase_13112023;


public class Rectangulo {
	private int alto;
	private int ancho;
	
	public Rectangulo(int alto, int ancho) {
	    this.alto = alto;
	    this.ancho = ancho;
	}
	
	// Get
	public int getAlto() {
	    return alto;
	}
	// Set
	public void setAncho(int ancho) {
	    this.ancho = ancho;
	}
	
	// Otro método
	public int calcularArea() {
	    return this.alto * this.ancho;
	}
	
	public static void main(String[] args) {
	    Rectangulo r = new Rectangulo(3, 4);
	    
	    r.setAncho(3);
	
	    System.out.println("Alto: " + r.getAlto());
	
	}
}