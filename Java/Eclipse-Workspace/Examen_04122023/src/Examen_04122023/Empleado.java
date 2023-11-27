package Examen_04122023;

public class Empleado {
	
	private String nombre;
	private String apellido1;
	private String apellido2;
	private String puesto;
	private String estado;
	
	
	public Empleado(String nombre, String apellido1, String apellido2, String puesto, String estado) {
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.puesto = puesto;
		this.estado = estado;
	}
	
	public Empleado(String nombre, String apellido1, String apellido2) {
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.puesto = "";
		this.estado = "En espera";
	}
	
	public Empleado(String nombre, String apellido1, String apellido2, String puesto) {
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.puesto = puesto;
		this.estado = "Contratado";
	}
	
	public Empleado(Empleado cop) {
		this.nombre = cop.nombre;
		this.apellido1 = cop.apellido1;
		this.apellido2 = cop.apellido2;
		this.puesto = cop.puesto;
		this.estado = cop.estado;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellido1() {
		return apellido1;
	}
	
	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}
	
	public String getApellido2() {
		return apellido2;
	}
	
	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}
	
	public String getPuesto() {
		return puesto;
	}
	
	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}
	
	public String getEstado() {
		return estado;
	}
	
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
	public void contratar() {
		setEstado("Contratado");
	}
	
	public void despedir() {
		setEstado("Despedido");
	}
	
	public void rechazar() {
		setEstado("Rechazado");
	}
	
	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2=" + apellido2 + ", puesto="
				+ puesto + ", estado=" + estado + "]";
	}

	
}