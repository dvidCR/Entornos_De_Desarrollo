package ed.elementShips;

import ed.game.Game;
import ed.ship.destroyerShip;

public class DestroyerShipList {
	
	private destroyerShip[] destroyerShipList;
	
	public DestroyerShipList() {
		
	}
	
	public DestroyerShipList(destroyerShip[] destroyerShipList) {
		
	}
	
	public void numShips(Game game) {
		int numShip = game.getLevel().getDestroyerShip();
		switch(game.getLevel()) {
			case EASY: 
				this.destroyerShipList = new destroyerShip[numShip];
				for(int i = 0; i < numShip; i++) {
					this.destroyerShipList[i] = new destroyerShip();
				}
				break;
			case HARD:
				this.destroyerShipList = new destroyerShip[numShip];
				for(int i = 0; i < numShip; i++) {
					this.destroyerShipList[i] = new destroyerShip();
				}
				break;			
			case INSANE:
				this.destroyerShipList = new destroyerShip[numShip];
				for(int i = 0; i < numShip; i++) {
					this.destroyerShipList[i] = new destroyerShip();
				}
				break;
		}
	}

	public boolean isImpactDestroyerShip(int row, int col) {
		return false;
	}
	
	
}
