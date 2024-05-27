package calculadoraTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import calculadora.Calculadora;

public class calculadoraSumaTest extends CalculadoraBaseTest {
	
	@Test
	public void testSuma() {
		int a = 1;
		int b = 2;
		int resultado = 3;
		int suma = Calculadora.sumar(a, b);
		assertEquals(resultado, suma);
	}

}
