package ed.elementShips.lists;

import ed.elementShips.Projectile;
import ed.game.Game;

public class ProjectileList {

	private Projectile proyList[];
	Game game;

	public ProjectileList(Game game) {
		this.game = game;
		this.proyList = new Projectile[game.getDestroyerShipList().getNumShips()];
	}

	public int getNumElems() {
		int cont = 0;
		for (int i = 0; i < 8; i++) {
			if (proyList[i] != null)
				++cont;
		}
		return cont;
	}

	public boolean isImpactProyectil(int row, int col) {
		for (int i = 0; i < proyList.length; i++) {
			if (this.proyList[i] != null && proyList[i].getRow() == row && proyList[i].getCol() == col) {
				proyList[i] = null;
				return true;
			}
		}
		return false;
	}

	public boolean isImpact(int row, int col) {
		boolean impacto = false;
		for (int i = 0; i < proyList.length; i++) {
			if (this.proyList[i] != null) {
				if (this.proyList[i].getRow() >= game.getMAX_ROW()) {
					this.proyList[i] = null;
				} else {
					this.proyList[i].behavior();
					if (proyList[i].getRow() == row && proyList[i].getCol() == col) {
						proyList[i] = null;
						impacto = true;
					}
				}
			}
		}
		if (impacto)
			return true;
		else
			return false;
	}

	public int getSize() {
		return proyList.length;
	}

	public void insertar(Projectile proyectil) {
		boolean insert = false;
		for (int i = 0; i < proyList.length; i++) {
			if (this.proyList[i] == null && !insert) {
				this.proyList[i] = proyectil;
				insert = true;
			}
		}
	}

	public String isProyectil(int row, int col) {
		for (int i = 0; i < this.proyList.length; i++) {
			if (this.proyList[i] != null) {
				if (this.proyList[i].getRow() == row && this.proyList[i].getCol() == col)
					return this.proyList[i].toString();
			}
		}
		return null;
	}

}
