package ed.ships;

import ed.game.Game;

public class RegularShip {
	private int row;
	private int col;
	private int resistance;
	private int points;
	Game game;

	public RegularShip(Game game) {
		this.resistance = 2;
		this.points = 5;
		this.game = game;
	}
	
	public RegularShip(Game game, int row, int col) {
		this.resistance = 2;
		this.points = 5;
		this.game = game;
		this.row = row;
		this.col = col;
	}
	
	public void behavior(int sentido) {
		this.col += sentido;
	}

	public void impact() {
		this.resistance--;
	}
		
	public void down() {
		this.row++;		
	}
	
	public int getResistence() {
		return this.resistance;
	}
	
	public int getPoints() {
		return this.points;
	}
	
	public int getRow() {
		return this.row;
	}

	public int getCol() {
		return this.col;
	}

	@Override
	public String toString() {
		return "C[" + this.resistance + "]";
	}
}
