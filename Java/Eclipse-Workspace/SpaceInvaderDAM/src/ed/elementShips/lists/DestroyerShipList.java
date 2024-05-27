package ed.elementShips.lists;

import ed.game.Game;
import ed.level.Level;
import ed.ships.DestroyerShip;

public class DestroyerShipList {

	private DestroyerShip destroyerShipList[];
	private int direction;
	private boolean shipDead;
	Game game;

	public DestroyerShipList(Game game) {
		this.direction = 1;
		this.game = game;
		initializeLevel(this.game.getLevel());
	}

	public void initializeLevel(Level level) {

		int numDestroyerShip = level.getDestroyerShips();

		switch (level) {
		case EASY:
			this.destroyerShipList = new DestroyerShip[numDestroyerShip];
			for (int i = 0; i < numDestroyerShip; i++) {
				this.destroyerShipList[i] = new DestroyerShip(game, 2, i + 4);
			}
			break;
		case HARD:
			this.destroyerShipList = new DestroyerShip[numDestroyerShip];
			for (int i = 0; i < numDestroyerShip; i++) {
				destroyerShipList[i] = new DestroyerShip(game, 3, i + 4);
			}
			break;
		case INSANE:
			destroyerShipList = new DestroyerShip[numDestroyerShip];
			for (int i = 0; i < numDestroyerShip; i++) {
				destroyerShipList[i] = new DestroyerShip(game, 3, i + 3);
			}
			break;

		default:
			break;
		}
	}

	public int getNumShips() {
		int cont = 0;
		for (int i = 0; i < destroyerShipList.length; i++) {
			if (destroyerShipList[i] != null)
				++cont;
		}
		return cont;
	}

	public String isDestroyerShip(int row, int col) {
		for (int i = 0; i < destroyerShipList.length; i++) {
			if (destroyerShipList[i] != null) {
				if (destroyerShipList[i].getRow() == row && destroyerShipList[i].getCol() == col)
					return destroyerShipList[i].toString();
			}
		}
		return null;
	}

	public boolean isImpactDestroyerShip(int row, int col) {
		this.shipDead = false;
		for (int i = 0; i < destroyerShipList.length; i++) {
			if (destroyerShipList[i] != null) {
				if (destroyerShipList[i].getRow() == row && destroyerShipList[i].getCol() == col) {
					destroyerShipList[i].impact();
					if (destroyerShipList[i].getResistence() == 0) {
						this.destroyerShipList[i] = null;
						this.shipDead = true;
					}
					return true;
				}
			}
		}
		return false;
	}

	public void move() {
		for (int i = 0; i < this.destroyerShipList.length; i++) {
			if (destroyerShipList[i] != null) {
				if (this.game.getRegularShipList().isBajarLinea())
					this.destroyerShipList[i].down();
				else
					this.destroyerShipList[i].behavior(direction);
			}
		}
	}

	public void direction() {
		if (this.game.getRegularShipList().isBajarLinea())
			this.direction *= -1;
	}

	public boolean isFinish() {
		for (int i = 0; i < destroyerShipList.length; i++) {
			if (this.destroyerShipList[i] != null) {
				if (destroyerShipList[i].getRow() == 7) {
					System.out.println("  Aliens win");
					return true;
				}
			}
		}
		return false;
	}

	public void shockWaveImpact() {
		for (int i = 0; i < this.destroyerShipList.length; i++) {
			if (this.destroyerShipList[i] != null)
				this.destroyerShipList[i].impact();
		}
	}

	public DestroyerShip[] getDsList() {
		return this.destroyerShipList;
	}

	public boolean isShipDead() {
		return this.shipDead;
	}

	public void throwBomb() {
		for (int i = 0; i < this.destroyerShipList.length; i++) {
			if (this.destroyerShipList[i] != null)
				this.destroyerShipList[i].throwBomb();
		}
	}

}
