package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import calculadora.Calculadora;

public class CalculadoraAbsTest extends CalculadoraBaseTest {
	
	@Test
	public void absAcierto() {
		double a = 5;
		double esperado = 5;
		double resultado = Calculadora.opAbs(a);
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void absFallo() {
		double a = 5;
		double esperado = 15;
		double resultado = Calculadora.opAbs(a);
		assertEquals(esperado, resultado);
	}

}
