package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import calculadora.Calculadora;

public class CalculadoraAbsTest extends CalculadoraBaseTest {
	
	@Test
	public void absAcierto() {
		double a = 5;
		int esperado = 5;
		int resultado = Calculadora.opAbs(a);
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void absFallo() {
		int a = 5;
		int esperado = 15;
		int resultado = Calculadora.opAbs(a);
		assertEquals(esperado, resultado);
	}

}
