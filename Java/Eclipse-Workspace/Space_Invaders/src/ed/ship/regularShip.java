package ed.ship;

public class regularShip {

	private int row;
	private int col;
	private int resistance;
	private int points;

	public regularShip() {
		this.resistance = 2;
		this.points = 5;
	}
	
	public regularShip(int row, int col) {
		this.row = row;
		this.col = col;
		this.resistance = 2;
		this.points = 5;
	}
	
	@Override
	public String toString() {
		return "R[" + this.resistance + "]";
	}
	
}
