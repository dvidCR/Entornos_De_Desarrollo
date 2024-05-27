package ed.ship;

import java.util.Random;

import ed.elementShips.Proyectile;
import ed.game.Game;

public class destroyerShip {

	private int row;
	private int col;
	private int resistance;
	private int points;
	private int damage;
	private int direction;
	private Game game;

	public destroyerShip() {

	}

	public destroyerShip(Game game) {
		this.game = game;
		this.points = 10;
		this.resistance = 1;
		this.damage = 1;
		this.direction = 1;
	}

	public destroyerShip(Game game, int row, int col) {
		this.game = game;
		this.row = row;
		this.col = col;
		this.points = 10;
		this.resistance = 1;
		this.damage = 1;
		this.direction = 1;
	}

	public void stats(Game game) {

	}
	
	public void move(int direction) {
		this.col+=direction;
	}
	
	public void down() {
		this.row++;
	}
	
	public void impact() {
		this.resistance--;
	}
	
	public boolean alive() {
		if(this.resistance <= 0) {
			return false;
		} else {
			return true;
		}
	}
	
	public void shootProyectile() {
		Random rand = game.getRand();
		Proyectile proyectile;
		if(rand.nextDouble() < game.getLevel().getshootRate()) {
			proyectile = new Proyectile(this.row, this.col);
		}
	}

	@Override
	public String toString() {
		return "D[" + this.resistance + "]";
	}

}
