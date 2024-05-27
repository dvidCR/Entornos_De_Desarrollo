package ed.command;

import ed.game.Game;

public class List {

	public List(Game game) {
		game.list();
	}

	public void toString(String string) {
		System.out.println(string);		
	}

}
