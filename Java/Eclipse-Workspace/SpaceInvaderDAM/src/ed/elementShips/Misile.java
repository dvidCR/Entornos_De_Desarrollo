package ed.elementShips;

import ed.game.Game;

public class Misile {

	private int row;
	private int col;

	public Misile(Game game) {
		this.row = game.getDamShip().getRow();
		this.col = game.getDamShip().getCol();
	}
	
	public void behavior() {
			this.row--;
	}

	public int getCol() {
		return col;
	}

	public void setCol(int col) {
		this.col = col;
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	@Override
	public String toString() {
		return "oo";
	}
}
