package ed.game;

import java.util.Random;
import ed.level.Level;
import ed.ship.*;
import ed.elementShips.*;

public class Game {

	final int MAX_ROWS = 7;
	static final int MAX_COLS = 8;
	
	private damShip damShip;
	private destroyerShip destroyerShip;
	private regularShip regularShip;
	private ovni ovni;
	private BombList bombList;
	private DestroyerShipList destroyerShipList;
	private Misile misile;
	private Proyectile proyectile;
	private RegularShipList regularShipList;
	
	private long seed;
	private Random rand;
	private Level level;
	private int points;
	
	public Game(Level level) {
		this.level = level;
		newGame(level);
	}
	
	public Game(Level level, long seed) {
		this.level = level;
		this.seed = seed;
		this.points = 0;
		this.rand = new Random();
		newGame(level);
	}
	
	public void newGame(Level level) {
		this.damShip = new damShip(null);
		this.destroyerShip = new destroyerShip(null);
		this.regularShip = new regularShip(1, 1);
		this.ovni = new ovni();
		this.bombList = new BombList();
		this.destroyerShipList = new DestroyerShipList();
		this.misile = new Misile(1, 1);
		this.proyectile = new Proyectile(1, 1);
		this.regularShipList = new RegularShipList();
		this.points = 0;
		
	}
	
	public String characterAtToString(int row, int col) {

		if(this.regularShip(row, col)!=null)
			return this.regularShip(row, col);
		
		if(this.destroyerShip(row, col)!=null)
			return this.destroyerShip(row, col);
		
		else if (this.damShip.getRow()==row && this.damShip.getCol()==col && !this.fin)
			return this.damShip.toString(this.fin);
		else if (this.damShip.getRow()==row && this.damShip.getCol()==col && this.fin)
			return this.damShip.toString(this.fin);
		
		else if(this.ovni != null && this.ovni.getRow()==row && this.ovni.getCol()==col)
				return this.ovni.toString();
		
		else if(this.bombList.Proyectil(row, col)!=null)
			return this.bombList.Proyectil(row, col);
		
		else if (this.misile != null && this.misile.getRow()==row && this.misile.getCol()==col)
				return this.misile.toString();
		else 
			return "";
	}
	
	public void update() {
		moveMisil();
	}
	
	public void moveMisil() {
		if(this.misile != null) {
			this.misile.behavior();
			if(regularShipList.isImpactRegularShip(misile.getRow(), misile.getCol())){
				this.misile = null;
				if(this.regularShipList.isShipDead())
					this.points += this.regularShip.getPoints();
			}
				
			
			if(this.misile != null&&destroyerShipList.isImpactDestroyerShip(misile.getRow(), misile.getCol())){
				this.misile = null;
				if(this.destroyerShipList.isShipDead())
					this.points += this.destroyerShip.getPoints();
			}
			
			
		    if(this.misile != null&&proyectileList.isImpactProyectil(misile.getRow(), misile.getCol()))
		    	this.misile = null;
		    
			if(this.ovni != null && this.misile != null){
				if(this.ovni.getRow()==this.misile.getRow() && this.ovni.getCol()==this.misile.getCol()){
					this.ovni.impact();
					if (this.ovni.getResistence() == 0){
						this.shockWave = true;
						this.misile = null;
						this.points += this.ovni.getPoints();
						this.ovni = null;
					}
				}
			}
			
			if(this.misile != null && this.misile.getRow()==0) 
				this.misile = null;
		}
	}
	
	public void moveProyectile() {
		if(this.bombList.isImpact()) {
			this.proyectile.behavior();
			if(damShip.isImpactdamShip(misile.getRow(), misile.getCol())){
				this.proyectile = null;
				if(this.damShip.isShipDead())
					lose();
			}
		}
	}
	
	public void pathMisil() {
		
	}
	
	public Level getLevel() {
		return this.level;
	}
	
	public Random getRand() {
		return this.rand;
	}
	
	public void lose() {
		
	}
	
}
