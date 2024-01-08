package clase_08012024;

public class Fracciones {
	private int num1_1;
	private int num2_1;
	private int num1_2;
	private int num2_2;
	
	public Fracciones(int num1, int num2, int num3, int num4) {
		this.num1_1 = num1;
		this.num2_1 = num2;
		this.num1_2 = num3;
		this.num2_2 = num4;
	}
	
	public String Suma() {
		int suma1 = num1_1 + num1_2;
		int suma2 = num2_1 + num2_2;
		return suma1 + "/" + suma2;
	}
	
	public String Resta() {
		int resta1 = num1_1 - num1_2;
		int resta2 = num2_1 - num2_2;
		return resta1 + "/" + resta2;
	}
	
	public String Multiplicacion() {
		int mul1 = num1_1 * num1_2;
		int mul2 = num2_1 * num2_2;
		return mul1 + "/" + mul2;
	}
	
	public String Division() {
		int div1 = num1_1 * num2_2;
		int div2 = num2_1 * num1_2;
		return div1 + "/" + div2;
	}
	
}
