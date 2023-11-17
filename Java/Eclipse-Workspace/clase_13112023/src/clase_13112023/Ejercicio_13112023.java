/**
 * 
 */
package clase_13112023;

/**
 * 
 */
public class Ejercicio_13112023 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int aux = 4;
		int aux2 = 5;
		for(int i = 0; i < 7 ; i ++) {
			if(i < 4) {
				aux--;
				aux2++;
			}else{
				aux++;
				aux2--;
			}
			for(int j = 0; j < 10; j++) {
				if(j < aux || j > aux2) {
					System.out.print(" ");
				}else{
					System.out.print("+");
				}
			}
			System.out.println();
		}
	}
}