package ed.level;

public enum Level {
	EASY(4, 2, 0.1, 3, 0.5), HARD(8, 2, 0.3, 2, 0.2), INSANE(8, 4, 0.5, 1, 0.1);

	private final int regularShips;
	private final int destroyerShips;
	private final double shootRate;
	private final int speed;
	private final double ovni;

	private Level(int commonShips, int destrutors, double shootRate, int speed, double ufo) {
		this.regularShips = commonShips;
		this.destroyerShips = destrutors;
		this.shootRate = shootRate;
		this.speed = speed;
		this.ovni = ufo;
	}

	public int getRegularShips() {
		return regularShips;
	}

	public int getDestroyerShips() {
		return destroyerShips;
	}

	public double getShootRate() {
		return shootRate;
	}

	public int getSpeed() {
		return speed;
	}

	public double getOvni() {
		return ovni;
	}

}
