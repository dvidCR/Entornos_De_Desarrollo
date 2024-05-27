package calculadoraTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import calculadora.Calculadora;

public class calculadoraRestaTest extends CalculadoraBaseTest {

	
	@Test
	public void testResta() {
		int a = 1;
		int b = 2;
		int resultado = -1;
		int resta = Calculadora.restar(a, b);
		assertEquals(resultado, resta);
	}
	
}
