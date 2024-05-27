package ed.command;

import ed.controller.Controller;

public class Command {

	public boolean execute(Controller controller) {

		String line[] = controller.getLine().toLowerCase().split(" +");

		// COMANDO MOVE
		if(line.length>2){
			if (line[0].equalsIgnoreCase("move") || line[0].equalsIgnoreCase("m")) {
				if (line[1].equalsIgnoreCase("right")
						|| line[1].equalsIgnoreCase("left")) {
					if (line[2].equalsIgnoreCase("1")
							|| line[2].equalsIgnoreCase("2")) {
						int num = Integer.parseInt(line[2]);
						if (num == 1 || num == 2)
							new Move(line[1], num, controller.getGame()); return true;
					} else
						System.out.println("Comando Incorrecto"); 
				} else
					System.out.println("Comando Incorrecto");
			}
		}
		
		// COMANDO SHOOT
		else if (line[0].equalsIgnoreCase("shoot")
				|| line[0].equalsIgnoreCase("s")) {
			new Shoot(controller.getGame()); return true;
		}

		// COMANDO SHOCKWAVE
		else if (line[0].equalsIgnoreCase("shockwave")
				|| line[0].equalsIgnoreCase("w")) {
			new Shockwave(controller.getGame()); return true;
		}

		// COMANDO RESET
		else if (line[0].equalsIgnoreCase("reset")
				|| line[0].equalsIgnoreCase("r")) {
			new Reset(controller.getGame()); return true;
		}

		// COMANDO NONE
		else if (line[0].equalsIgnoreCase("none")
				|| line[0].equalsIgnoreCase("n")
				|| line[0].equalsIgnoreCase("")) {
			new None(controller.getGame()); return true;
		}

		// COMANDO LIST
		else if (line[0].equalsIgnoreCase("list")
				|| line[0].equalsIgnoreCase("l")) {
			new List(controller.getGame()); return true;
		}

		// COMANDO EXIT
		else if (line[0].equalsIgnoreCase("exit")
				|| line[0].equalsIgnoreCase("e")) {
			new Exit(controller); return true;
		}

		// COMANDO HELP
		else if (line[0].equalsIgnoreCase("help")
				|| line[0].equalsIgnoreCase("h")) {
			new Help(); return false;
		}

		// ERROR!!
		else {
			System.err.println("  Error: Comando incorrecto mi niiiiiño!!");
			
		}
		return false;
	}

}
