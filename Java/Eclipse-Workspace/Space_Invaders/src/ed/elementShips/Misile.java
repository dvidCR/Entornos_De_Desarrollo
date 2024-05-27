package ed.elementShips;

public class Misile {
	
	private int rows;
	private int cols;
	
	public Misile(int rows, int cols) {
		this.rows = rows;
		this.cols = cols;
	}
	
	public void behavior() {
		this.rows --;
	}
	
	public int getRow() {
		return rows;
	}

	public void setRow(int rows) {
		this.rows = rows;
	}

	public int getCol() {
		return cols;
	}

	public void setCol(int cols) {
		this.cols = cols;
	}

	@Override
	public String toString() {
		return "oo";
	}
}
