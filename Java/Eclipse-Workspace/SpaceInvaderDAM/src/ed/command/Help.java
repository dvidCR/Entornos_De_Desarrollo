package ed.command;

public class Help {
	Exit exit;
	List list;
	Move move;
	None none;
	Reset reset;
	Shockwave shockwave;
	Shoot shoot;
	
	String text;
	
	public Help() {
		
//		this.move.toString("move <left|right><1|2>: Moves UCM-Ship to the indicated direction.");
//		this.shoot.toString("shoot: UCM-Ship launches a missile.");
//		this.shockwave.toString("shockWave: UCM-Ship releases a shock wave.");
//		this.list.toString("list: Prints the list of available ships.");
//		this.reset.toString("reset: Starts a new game.");
//		toString("help: Prints this help message.");
//		this.exit.toString("exit: Terminates the program.");
//		this.none.toString("[none]: Skips one cycle.");
		
		//
		this.text = "  move <left|right><1|2>: Moves UCM-Ship to the indicated direction.\n"+
		"  shoot: UCM-Ship launches a missile.\n"+
		"  shockWave: UCM-Ship releases a shock wave.\n"+
		"  list: Prints the list of available ships.\n"+
		"  reset: Starts a new game.\n"+
		"  help: Prints this help message.\n"+
		"  exit: Terminates the program.\n"+
		"  [none]: Skips one cycle.\n";
		
		toString(text);
	}

	private void toString(String string) {
		System.out.println(string);
	}
}
