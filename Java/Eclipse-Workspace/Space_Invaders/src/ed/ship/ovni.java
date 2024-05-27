package ed.ship;

public class ovni {

	private int row;
	private int col;
	private int resistance;
	private int points;
	
	public ovni() {
		this.resistance = 1;
		this.points = 25;
	}
	
	public ovni(int row, int col) {
		this.row = row;
		this.col = col;
		this.resistance = 1;
		this.points = 25;
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getCol() {
		return col;
	}

	public void setCol(int col) {
		this.col = col;
	}
	
	@Override
	public String toString() {
		return "O[" + this.resistance + "]";
	}

}
