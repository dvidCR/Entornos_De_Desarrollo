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
		Coche cocheNuevo1 = new Coche("PCZI5878", "rojo", 2);
		Coche cocheNuevo2 = new Coche("PCZI5879", "verde");
		
		System.out.println(cocheNuevo1);
		cocheNuevo1.setPuertas(3);
		System.out.println(cocheNuevo1.getPuertas());
		System.out.println(cocheNuevo2);
		
		//Creacion Camion
		Camion camionNuevo1 = new Camion("QWER1234", "blanco", "750T");
		Camion camionNuevo2 = new Camion("QWER1234", "naranja");
		Camion camionNuevo2_2 = new Camion(camionNuevo2);
		
		System.out.println(camionNuevo2);
		camionNuevo2.setCarga("5kg");
		System.out.println(camionNuevo2.getCarga());
		System.out.println(camionNuevo2_2);
		camionNuevo1.setMatricula("QWER1564");
		System.out.println(camionNuevo1.getMatricula());
		
		//Creacion Moto
		Moto motoNueva1 = new Moto("WEWER0999", "negro");
		Moto motoNueva2 = new Moto("WERTO1023", "naranja", "225cc");
				
		System.out.println(motoNueva1);
		motoNueva1.setColor("rosa");
		System.out.println(motoNueva1.getColor());
		System.out.println(motoNueva2.getMatricula());
	}

}
