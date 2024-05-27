package ed.ships;

import ed.game.Game;

public class Ovni {
	
	private Game game;
	
	private int row;
	private int col;
	private int resistance;
	private int points;
	private boolean cambio;

	public Ovni(Game game) {
		this.game = game;
		this.row = 0;
		this.col = game.getMAX_COL()-1;
		this.resistance = 1;
		this.points = 25;
	}

	public int getRow() {
		return this.row;
	}

	public int getCol() {
		return this.col;
	}

	public void move() {
		
		if(!this.cambio && (this.col - 1 >= 0)){
			this.col--;
		}else if(this.col + 1 < this.game.getMAX_COL()){
			this.col++;
			this.cambio = true;
		}
		else{
			this.cambio = false;
		}
	}
	
	public int getResistence(){
		return this.resistance;
	}
	
	public int getPoints() {
		return this.points;
	}
	
	public void impact() {
		this.resistance--;
	}
	
	@Override
	public String toString() {
		return "O[" + this.resistance + "]";
	}
}
