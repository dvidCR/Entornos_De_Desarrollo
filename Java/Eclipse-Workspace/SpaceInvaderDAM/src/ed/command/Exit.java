package ed.command;

import ed.controller.Controller;

public class Exit {
	
	public Exit(Controller controller) {
		toString("Game Over");
	}
	
	public void toString(String text) {
		System.out.println(text);
	}
	
}
