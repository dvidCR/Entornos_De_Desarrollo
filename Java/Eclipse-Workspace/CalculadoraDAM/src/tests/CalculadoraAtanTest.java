package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import calculadora.Calculadora;

public class CalculadoraAtanTest extends CalculadoraBaseTest {

	@Test
	public void atanAcierto() {
		double a = 78;
		double esperado = 1.557976516321996;
		double resultado = Calculadora.opAtan(a);
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void atanFallo() {
		double a = 78;
		double esperado = 0;
		double resultado = Calculadora.opAtan(a);
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void atanRedondeoAlta() {
		double a = 78;
		double esperado = 1.6;
		double resultado = Calculadora.opAtan(a);
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void atanRedondeoBaja() {
		double a = 78;
		double esperado = 1.5;
		double resultado = Calculadora.opAtan(a);
		assertEquals(esperado, resultado);
	}
	
}
