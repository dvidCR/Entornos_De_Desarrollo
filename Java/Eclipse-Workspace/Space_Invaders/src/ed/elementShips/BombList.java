package ed.elementShips;

public class BombList {
	
	private Proyectile[] proyectileList;
	
	public BombList() {
		
	}
	
	public BombList(Proyectile[] proyectileList) {
		this.proyectileList = proyectileList;
	}

	public boolean isImpact() {
		return false;
	}
}
