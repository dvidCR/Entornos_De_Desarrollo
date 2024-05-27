package ed.controller;

import java.util.Scanner;

import ed.command.Command;
import ed.game.Game;

public class Controller {

	private static Scanner in = new Scanner(System.in);
	Game game;
	Command command = new Command();
	
	private String line;

	public Controller(Game game) {
		this.game = game;
	}

	public void run() {

		while (!game.isFin()) {
			printState();
			System.out.print("  Command > ");
			this.line = in.nextLine();

			if (this.line == null) {
				System.out.println("Error: Ejecucion incorrecta del comando");
			} else {
				if(command.execute(this))
					game.update();
			}
		}
		//pintamos el tablero cuando finaliza
		printState();
	}

	public String getLine() {
		return line;
	}
	
	public Game getGame() {
		return game;
	}

	public void printState() {
		System.out.println(this.game.toString());
	}

}
