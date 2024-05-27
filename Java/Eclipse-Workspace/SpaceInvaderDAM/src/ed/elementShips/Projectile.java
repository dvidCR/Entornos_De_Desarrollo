package ed.elementShips;

public class Projectile {

	private int row;
	private int col;

	public Projectile() {
	}

	public Projectile(int row, int col) {
		this.row = row;
		this.col = col;
	}

	public void behavior() {
		this.row++;
	}

	public int getRow() {
		return row;
	}

	public int getCol() {
		return col;
	}

	@Override
	public String toString() {
		return "*";
	}
}
