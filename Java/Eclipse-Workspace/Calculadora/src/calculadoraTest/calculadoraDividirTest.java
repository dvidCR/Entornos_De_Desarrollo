package calculadoraTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import calculadora.Calculadora;

public class calculadoraDividirTest {

	@Test
	public void dividirTest() {
		double a = 6;
		double b = 3;
		double resultado = 2;
		double division = Calculadora.dividir(a, b);
		assertEquals(resultado, division);
	}
	
	@Test
	public void dividirCeroTest() {
		double a = 6;
		double b = 0;
		double resultado = 0;
		if (a == 0 || b == 0) Assert.fail("Zero division error");
		double division = Calculadora.dividir(a, b);
		assertEquals(resultado, division);
	}
	
}
