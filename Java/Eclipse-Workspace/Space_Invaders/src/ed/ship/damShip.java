package ed.ship;

import ed.game.Game;

public class damShip {
	
	private boolean moveLeft;
	private boolean moveRigth;
	private int row;
	private int col;
	private int life;
	private int damage;
	private boolean shockWave;
	
	public damShip(Game game) {
		this.row = 7;
		this.col = 4;
		this.life = 3;
		this.damage = 1;
		this.shockWave = false;
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
		// TODO Auto-generated method stub
		return "^__^";
	}

	public boolean isImpactdamShip(int row, int col) {
		if(this.getRow() == row && this.getCol() == col) {
			this.life --;
			return true;
		}
		return false;
	}

	public boolean isShipDead() {
		if(this.life == 0) {
			return true;
		}
		return false;
	}
	
}
