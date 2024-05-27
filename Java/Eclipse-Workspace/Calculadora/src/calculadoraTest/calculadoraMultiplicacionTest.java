package calculadoraTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import calculadora.Calculadora;

public class calculadoraMultiplicacionTest {

	@Test
	public void multiplicacionTest() {
		int a = 5;
		int b = 5;
		int resultado = 25;
		int multiplicacion = Calculadora.multiplicar(a, b);
		assertEquals(resultado, multiplicacion);
	}
	
}
