package ed.command;

import ed.game.Game;

public class Reset {

	public Reset(Game game) {
		game.reset();
	}

	public void toString(String string) {
		System.out.println(string);
	}

}
