package ed.elementShips;

public class Proyectile {

	private int rows;
	private int cols;
	
	public Proyectile(int rows, int cols) {
		this.rows = rows;
		this.cols = cols;
	}
	
	public void behavior() {
		this.rows --;
	}
	
	@Override
	public String toString() {
		return ".";
	}
	
}
