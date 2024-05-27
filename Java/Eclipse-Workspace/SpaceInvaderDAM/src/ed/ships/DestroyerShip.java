package ed.ships;

import java.util.Random;

import ed.elementShips.Projectile;
import ed.game.Game;

public class DestroyerShip {
	private int row;
	private int col;
	private int resistance;
	private int life;
	private int points;
	private Game game;
	
	public DestroyerShip(Game game) {
		this.resistance = 3;
		this.life = 1;
		this.points = 10;
		this.game=game;
	}
	
	public DestroyerShip(Game game, int row, int col) {
		this.row = row;
		this.col = col;
		this.resistance = 3;
		this.life = 1;
		this.points = 10;
		this.game=game;
	}

	public void behavior(int sentido) {
		this.col += sentido;
	}
	
	public void throwBomb(){
		Random r = game.getRandom();
		Projectile proyectile; 
		if (r.nextDouble() < game.getLevel().getShootRate()){
			//creo una bomba y se la paso a game, diciendo que la añada
			proyectile = new Projectile(this.row, this.col);
			game.insertProjectile(proyectile);
		} 
	}

	public boolean resistencia() {
		if (this.resistance > 0)
			this.resistance--;
		return this.resistance == 0;
	}

	public int getRow() {
		return this.row;
	}

	public int getCol() {
		return this.col;
	}

	public void move(int sentido) {
		this.col += sentido;
	}

	public void down() {
		this.row++;
	}

	public void impact() {
		this.resistance--;
	}

	public int getResistence() {
		return this.resistance;
	}
	
	public int getPoints() {
		return this.points;
	}
	
	public int getLife() {
		return life;
	}
	
	@Override
	public String toString() {
		return "D[" + this.resistance + "]";
	}
}
