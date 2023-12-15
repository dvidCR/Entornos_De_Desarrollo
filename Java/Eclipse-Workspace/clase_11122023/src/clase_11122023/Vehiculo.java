package clase_11122023;

public class Vehiculo {
	private String matricula;
	private String color;
	
	protected Vehiculo() {
		this.matricula = "ABC1234";
		this.color = "rojo";
	}
	
	protected Vehiculo(String matricula, String color) {
		this.matricula = matricula;
		this.color = color;
	}
	
	protected Vehiculo(String color) {
		this.matricula = "ABC1234";
		this.color = color;
	}
	
	protected Vehiculo(Vehiculo cp) {
		this.matricula = cp.matricula;
		this.color = cp.color;
	}
	
	protected String getMatricula() {
		return matricula;
	}
	
	protected void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	protected String getColor() {
		return color;
	}
	
	protected void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Vehiculo [matricula=" + matricula + ", color=" + color + "]";
	}
	
		
}
