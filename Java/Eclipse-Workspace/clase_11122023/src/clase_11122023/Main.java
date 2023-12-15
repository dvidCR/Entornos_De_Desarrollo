package clase_11122023;

public class Main {

	public static void main(String[] args) {
		//Vehiculos
		Vehiculo nuevo = new Vehiculo();
		Vehiculo cpNuevo = nuevo;
		Vehiculo nuevo1 = new Vehiculo("AXC4569", "verde");
		Vehiculo nuevo2 = new Vehiculo("amarillo");
		
		System.out.println(nuevo);
		System.out.println(nuevo.getColor());
		System.out.println(nuevo.getMatricula());
		nuevo.setColor("gris");
		System.out.println(nuevo);
		System.out.println(nuevo1);
		System.out.println(nuevo2);
		System.out.println(cpNuevo);
		
		//Creacion Coches
		
	}

}
