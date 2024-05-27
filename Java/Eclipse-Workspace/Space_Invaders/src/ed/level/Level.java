package ed.level;

public enum Level {
	EASY(4, 2, 0.1, 3, 0.5), HARD(8, 2, 0.3, 2, 0.2), INSANE(8, 4, 0.5, 1, 0.1);
	
	private final int regularShip;
	private final int destroyerShip;
	private final double shootRate;
	private final int velocity;
	private final double ovni;
	
	private Level(int regularShip, int destroyerShip, double frShoot, int velocity, double ovni) {
		this.regularShip = regularShip;
		this.destroyerShip = destroyerShip;
		this.shootRate = frShoot;
		this.velocity = velocity;
		this.ovni = ovni;
	}

	public int getRegularShip() {
		return regularShip;
	}

	public int getDestroyerShip() {
		return destroyerShip;
	}

	public double getshootRate() {
		return shootRate;
	}

	public int getVelocity() {
		return velocity;
	}

	public double getOvni() {
		return ovni;
	}
	
}
