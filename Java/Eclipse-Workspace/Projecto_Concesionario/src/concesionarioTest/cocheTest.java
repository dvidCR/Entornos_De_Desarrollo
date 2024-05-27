package concesionarioTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import vehiculos.Coche;

public class cocheTest extends concesionarioBaseTest {
	Coche coche = new Coche();
	
	@Test
	public void cambioColor() {
		String color = "verde";
		coche.setColor("verde");
		assertEquals(color, coche.getColor());
	}
	
	@Test
	public void potencia() {
		int potencia = 10;
		coche.setPotencia(10);
		if(potencia > 200 || coche.Estrellado()) Assert.fail("Potencia maxima superada (300)");
		assertEquals(potencia, coche.getPotencia());
	}
	
	@Test
	public void potenciaFallo() {
		int potencia = 10;
		coche.setPotencia(301);
		if(potencia > 200 || coche.Estrellado()) Assert.fail("Potencia maxima superada (300)");
		assertEquals(potencia, coche.getPotencia());
	}
	
	@Test
	public void clase() {
		String clase = "deportivo";
		coche.setClase("deportivo");
		assertEquals(clase, coche.getClase());
	}
	
	@Test
	public void numPlazas() {
		int numPlazas = 5;
		coche.setNumPlazas(5);
		assertEquals(numPlazas, coche.getNumPlazas());
	}
	
}
