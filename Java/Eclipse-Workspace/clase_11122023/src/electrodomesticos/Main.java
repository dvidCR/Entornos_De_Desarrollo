package electrodomesticos;

public class Main {

	public static Electrodomesticos array[] = new Electrodomesticos[10];
	
	public static void main(String[] args) {

		array[0] = new Television();
		System.out.println(array[0]);
		
		array[1] = new Lavadora();
		System.out.println(array[1]);
	}

}
