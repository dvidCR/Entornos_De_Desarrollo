package ed.main;

import ed.controller.Controller;
import ed.game.Game;
import ed.level.Level;

public class Main {

	public static void main(String[] args) {

		Game game = null;

		if (args.length == 0 || args.length > 2) {
			System.out.println("No metiste bien los argumentos artista!");			
		}
		else {
			if (args.length == 1)
				game = new Game(Level.valueOf(args[0]));
			else
				game = new Game(Level.valueOf(args[0]), Integer.parseInt(args[1]));
			
			Controller controller = new Controller(game);
			controller.run();
		}

	}

}
