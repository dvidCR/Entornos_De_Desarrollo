package ed.ships;

import ed.game.Game;

public class DamShip {

	private Game game;

	private int row;
	private int col;
	private int life;
	private int resistance;

	public DamShip() {
	}

	public DamShip(Game game) {
		this.row = 7;
		this.col = 4;
		this.life = 3;
		this.resistance = 3;
		this.game = game;
	}
	
	public void behaivor(String direction, int numSquares) {
		if(direction.equals("right") && this.col+numSquares < 9) {
			this.col += numSquares;
		} else if(direction.equals("left") && this.col-numSquares >= 0) {
			this.col -= numSquares;
		}
	}
	
	public void impact() {
		this.resistance--;
	}
	
	public int getRow() {
		return row;
	}

	public int getCol() {
		return col;
	}

	public int getLife() {
		return life;
	}

	public int getResistance() {
		return resistance;
	}

	public String toString(boolean gameOver) {
		if(!gameOver)
			return "^__^";
		else 
			return "!xx!";
	}
	
}
