package ed.command;

import ed.game.Game;

public class Move {

	public Move(String address, int num, Game game) {
		game.getDamShip().behaivor(address, num);
	}

	public void toString(String string) {
		System.out.println(string);
	}

}
