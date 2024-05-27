package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import calculadora.Calculadora;

public class CalculadoraSinTest extends CalculadoraBaseTest {
	
	@Test
	public void sinAcierto() {
		double a = 12;
		double esperado = -0.5365729180004349;
		double resultado = Calculadora.opSin(a);
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void sinFallo() {
		double a = 12;
		double esperado = 15.6;
		double resultado = Calculadora.opSin(a);
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void sinRedondeo() {
		double a = 12;
		double esperado = -0.5;
		double resultado = Calculadora.opSin(a);
		assertEquals(esperado, resultado);
	}
	
}
