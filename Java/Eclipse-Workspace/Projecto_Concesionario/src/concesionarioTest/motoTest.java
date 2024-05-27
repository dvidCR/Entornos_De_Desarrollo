package concesionarioTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import vehiculos.Moto;

public class motoTest extends concesionarioBaseTest {
	
	Moto moto = new Moto();
	
	@Test
	public void color() {
		String color = "rojo";
		moto.setColor("rojo");
		assertEquals(color, moto.getColor());
	}
	
	@Test
	public void tanque() {
		double tanque = 30;
		moto.setTanque(30);
		assertEquals(tanque, moto.getTanque());
	}
	
	@Test
	public void gasolina() {
		Moto motoGasolina = new Moto("rojo", 30, 0, 20);
		double gasolina = 15;
		motoGasolina.setGasolina(15);
		if(motoGasolina.comprobarRepostaje(motoGasolina.getGasolina())) Assert.fail("La gasolina introducida es mayor a lo que soporta el tanque");
		assertEquals(gasolina, motoGasolina.getGasolina());
	}
	
	@Test
	public void gasolinaFallo() {
		double gasolina = 15;
		moto.setGasolina(50);
		moto.setTanque(30);
		if(moto.comprobarRepostaje(moto.getGasolina())) Assert.fail("La gasolina introducida es mayor a lo que soporta el tanque");
		assertEquals(gasolina, moto.getGasolina());
	}
	
	@Test
	public void repostaje() {
		double gasolina = 15;
		moto.setGasolina(15);
		moto.setTanque(30);
		if(moto.comprobarCombustible()) Assert.fail("No trates de repostar y no hechar nada");
		if(moto.comprobarRepostaje(moto.getGasolina())) Assert.fail("La gasolina introducida es mayor a lo que soporta el tanque");
		assertEquals(gasolina, moto.getGasolina());
	}
	
	@Test
	public void repostajeFallo() {
		double gasolina = 0;
		moto.setGasolina(0);
		moto.setTanque(30);
		if(moto.comprobarCombustible()) Assert.fail("No trates de repostar y no hechar nada");
		if(moto.comprobarRepostaje(moto.getGasolina())) Assert.fail("La gasolina introducida es mayor a lo que soporta el tanque");
		assertEquals(gasolina, moto.getGasolina());
	}
	
	@Test
	public void potencia() {
		int potencia = 10;
		moto.setPotencia(10);
		if(potencia > 300 || moto.getPotencia() > 300) Assert.fail("Potencia maxima superada (300)");
		assertEquals(potencia, moto.getPotencia());
	}
	
	@Test
	public void potenciaFallo() {
		int potencia = 10;
		moto.setPotencia(301);
		if(potencia > 300 || moto.getPotencia() > 300) Assert.fail("Potencia maxima superada (300)");
		assertEquals(potencia, moto.getPotencia());
	}

	@Test
	public void consumo() {
		Moto motoConsumo = new Moto("rojo", 30, 30, 20);
		double consumoTotal = 15;
		double kilometros = 200;
		assertEquals(consumoTotal, motoConsumo.Consumo(kilometros));
	}
	
}
