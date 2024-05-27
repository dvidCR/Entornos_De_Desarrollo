package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import calculadora.Calculadora;

public class CalculadoraCosTest extends CalculadoraBaseTest {

	@Test
	public void cosAcierto() {
		double a = 78;
		double esperado = -0.8578030932449878;
		double resultado = Calculadora.opCos(a);
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void cosFallo() {
		double a = 78;
		double esperado = -1;
		double resultado = Calculadora.opCos(a);
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void cosRedondeoAlta() {
		double a = 78;
		double esperado = -0.9;
		double resultado = Calculadora.opCos(a);
		assertEquals(esperado, resultado);
	}
		
	@Test
	public void cosRedondeoBaja() {
		double a = 78;
		double esperado = -0.8;
		double resultado = Calculadora.opCos(a);
		assertEquals(esperado, resultado);
	}
	
}
