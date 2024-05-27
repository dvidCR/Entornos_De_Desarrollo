package ed.elementShips.lists;

import ed.game.Game;
import ed.level.Level;
import ed.ships.RegularShip;

public class RegularShipList {

	private Game game;
	private RegularShip regularShipList[];

	private int direction;
	private boolean descend;
	private boolean shipDead;

	public RegularShipList(Game game) {
		this.game = game;
		this.direction = 1;
		this.descend = false;
		initializeLevel(game.getLevel());
	}

	public void initializeLevel(Level level) {
		int numRegularShip = this.game.getLevel().getRegularShips();

		switch (game.getLevel()) {
		case EASY:
			this.regularShipList = new RegularShip[numRegularShip];
			for (int i = 0; i < numRegularShip; i++) {
				this.regularShipList[i] = new RegularShip(game, 1, i + 3);
			}
			break;
		case HARD:
			regularShipList = new RegularShip[numRegularShip];
			for (int i = 0; i < numRegularShip; i++) {
				if (i <= 3)
					this.regularShipList[i] = new RegularShip(game, 1, i + 3);
				else
					this.regularShipList[i] = new RegularShip(game, 2, i - 1);
			}
			break;
		case INSANE:
			regularShipList = new RegularShip[numRegularShip];
			for (int i = 0; i < numRegularShip; i++) {
				if (i <= 3)
					this.regularShipList[i] = new RegularShip(game, 1, i + 3);
				else
					this.regularShipList[i] = new RegularShip(game, 2, i - 1);
			}
			break;

		default:
			break;
		}
	}

	// devuelve el numero de naves
	public int getNumElems() {
		int cont = 0;
		for (int i = 0; i < regularShipList.length; i++) {
			if (regularShipList[i] != null)
				++cont;
		}
		return cont;
	}

	public String isRegularShip(int row, int col) {
		for (int i = 0; i < regularShipList.length; i++) {
			if (this.regularShipList[i] != null 
					&& this.regularShipList[i].getRow() == row
					&& regularShipList[i].getCol() == col) {
				return regularShipList[i].toString();
			}
		}
		return null;
	}

	public boolean isImpactRegularShip(int row, int col) {
		this.shipDead = false;
		for (int i = 0; i < regularShipList.length; i++) {
			if (this.regularShipList[i] != null && this.regularShipList[i].getRow() == row
					&& this.regularShipList[i].getCol() == col) {
				regularShipList[i].impact();
				if (regularShipList[i].getResistence() == 0) {
					this.regularShipList[i] = null;
					this.shipDead = true;
				}
				return true;
			}
		}
		return false;
	}

	public void move() {
		// movemos las naves
		for (int i = 0; i < this.regularShipList.length; i++) {
			if (this.regularShipList[i] != null) {
				if (descend)
					this.regularShipList[i].down();
				else
					this.regularShipList[i].behavior(direction);
			}
		}
	}

	public void sentido() {
		this.descend = false;
		
		for (int i = 0; i < regularShipList.length; i++) {
			if (this.regularShipList[i] != null) {
				if ((this.regularShipList[i].getCol() + this.direction < 0
						|| this.regularShipList[i].getCol() + direction >= game.getMAX_COL()) && !this.descend)
					this.descend = true;
			}

		}
		// cambiamos el sentido
		if (this.descend)
			this.direction *= -1;
	}

	public boolean isBajarLinea() {
		return this.descend;
	}

	public boolean isFinish() {
		for (int i = 0; i < regularShipList.length; i++) {
			if (this.regularShipList[i] != null && this.regularShipList[i].getRow() == 7) {
				System.out.println("  Aliens win");
				return true;
			}
		}
		return false;
	}

	public void shockWaveImpact() {
		for (int i = 0; i < regularShipList.length; i++) {
			if (this.regularShipList[i] != null)
				this.regularShipList[i].impact();
		}
	}

	public RegularShip[] getRsList() {
		return regularShipList;
	}

	public boolean isShipDead() {
		return this.shipDead;
	}
}
