package ed.game;

import java.util.Random;

import ed.elementShips.Misile;
import ed.elementShips.Projectile;
import ed.elementShips.lists.DestroyerShipList;
import ed.elementShips.lists.ProjectileList;
import ed.elementShips.lists.RegularShipList;
import ed.level.Level;
import ed.ships.DamShip;
import ed.ships.DestroyerShip;
import ed.ships.Ovni;
import ed.ships.RegularShip;

public class Game {
	private final int MAX_ROW = 8;
	private final int MAX_COL = 9;

	private DamShip damShip;
	private RegularShip regularShip;
	private DestroyerShip destroyerShip;
	private Misile misile;
	private Ovni ovni;
	private DestroyerShipList destroyerShipList;
	private RegularShipList regularShipList;
	private ProjectileList proyectileList;
	private Level level;

	private Random random;
	private long seed;
	private boolean fin;
	private int contCicles;
	private int direction;
	private int directionOvni;
	private int points;
	private boolean shockWave;
	private int speed;

	
	public Game(Level level) {
		this.random = new Random();
		newGame(level);
	}

	public Game(Level level, long seed) {
		this.seed = seed;
		this.random = new Random();
		newGame(level);
	}

	public void newGame(Level level) {
		this.level = level;
		this.contCicles = 0;
		this.direction = -1; 
		this.directionOvni = -1; 
		this.shockWave = false;
		this.speed = 1;
		
		this.damShip = new DamShip(this);
		this.misile = null;
		this.ovni = null;

		this.regularShipList = new RegularShipList(this);
		this.destroyerShipList = new DestroyerShipList(this);
		this.proyectileList = new ProjectileList(this);
		
		this.regularShip = new RegularShip(this);
		this.destroyerShip = new DestroyerShip(this);
	}
	
	public void update() {
		moveMisile();
		moveProyectiles();
		moveAliens();
		moveOvni();
		computerAction();
		++this.contCicles;
	}
	
	private void moveMisile() {
		if(this.misile != null){
			misile.behavior();
			
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
			
			if(this.misile != null && this.misile.getRow()<0) 
				this.misile = null;
		}		
	}
	
	private void moveProyectiles() {
		if(this.proyectileList.isImpact(this.damShip.getRow(), this.damShip.getCol())){
			this.damShip.impact();
			if(this.damShip.getResistance() == 0){
				this.fin = true;
			}
		}
		if(this.misile != null)
			if(this.proyectileList.isImpact(this.misile.getRow(), this.misile.getCol())){
				this.misile = null;
		}
	}
	
	private void moveAliens() {
		if(this.speed == this.level.getSpeed()){
			this.regularShipList.sentido();
			this.regularShipList.move();
			if(this.misile != null){
				if(this.regularShipList.isImpactRegularShip(this.misile.getRow(), this.misile.getCol())){
					this.misile = null;
					if(this.regularShipList.isShipDead())
						this.points += this.regularShip.getPoints();
				}
			}
			
			this.destroyerShipList.move();
			if(this.misile != null){
				if(this.destroyerShipList.isImpactDestroyerShip(this.misile.getRow(), this.misile.getCol())){
					this.misile = null;
					if(this.destroyerShipList.isShipDead())
						this.points += destroyerShip.getPoints();
				}
			}
			this.speed = 1;
		}else
			this.speed++;	
		
	}
	
	private void moveOvni() {
		if(this.ovni != null){
			this.ovni.move();
		}
	}
	
	public void computerAction(){
		createOvni();
		this.destroyerShipList.throwBomb();;
	}
	
	private void createOvni() {
		double rand = this.random.nextDouble();
		double frecOvni = this.level.getOvni();
		if (rand < frecOvni && this.ovni == null){
			this.ovni = new Ovni(this);
		}
		
	}

	public void insertProjectile(Projectile proyectil) {
		this.proyectileList.insertar(proyectil);
	}
	
	public void shoot() {
		if(this.misile == null){
			this.misile=new Misile(this);
		}
	}

	public void reset() {
		if(this.seed == 123 )
			new Game(this.level, this.seed);
		else
			new Game(this.level);
	}

	public void shockWave() {
		if(this.shockWave){
			this.regularShipList.shockWaveImpact();
			this.destroyerShipList.shockWaveImpact();
		}
	}
	
	public void list() {
		int aux = (this.ovni==null)?1:0;
		String text = 
				"  [R]egular ship: Points: " +regularShip.getPoints()+ 
				"  - Harm: "+0+
				"  - Shield:" +regularShipList.getNumElems()+
				"\n  [D]estroyer ship: Points: "+destroyerShip.getPoints()+ 
				"  - Harm: "+destroyerShip.getLife()+
				"  - Shield:"+destroyerShipList.getNumShips()+ 
				"\n  [O]vni: Points: "+ovni.getPoints()+ 
				"  - Harm: "+0+
				"  - Shield: "+aux+
				"\n  ^__^: Harm: "+damShip.getLife()+ 
				"  - Shield: 3";
		System.out.println(text);
	}
	
	public boolean isFin() {
		//si no hay naves
		if(destroyerShipList.getNumShips() + regularShipList.getNumElems() == 0){
			System.out.println("Player wins");
			return true;
		//si ha muerto	
		}else if(damShip.getResistance() == 0){
			System.out.println("  Aliens win");
			this.fin = true;
			return true;
		//si no hay nave comunes ni destructoras	
		}else if(this.regularShipList.isFinish()){
			this.fin = true;
			return true;
		}else if(this.destroyerShipList.isFinish()){
			this.fin = true;
			return true;
		}
		return false;
	}
	
	public String characterAtToString(int row, int col) {
		if(this.regularShipList.isRegularShip(row, col)!=null)
			return this.regularShipList.isRegularShip(row, col);
		
		if(this.destroyerShipList.isDestroyerShip(row, col)!=null)
			return this.destroyerShipList.isDestroyerShip(row, col);
		
		else if (this.damShip.getRow()==row && this.damShip.getCol()==col && !this.fin)
			return this.damShip.toString(this.fin);
		else if (this.damShip.getRow()==row && this.damShip.getCol()==col && this.fin)
			return this.damShip.toString(this.fin);
		
		else if(this.ovni != null && this.ovni.getRow()==row && this.ovni.getCol()==col)
				return this.ovni.toString();
		
		else if(this.proyectileList.isProyectil(row, col)!=null)
			return this.proyectileList.isProyectil(row, col);
		
		else if (this.misile != null && this.misile.getRow()==row && this.misile.getCol()==col)
				return this.misile.toString();
		else 
			return "";
	}

	public DamShip getDamShip() {
		return damShip;
	}

	public void setDamShip(DamShip damShip) {
		this.damShip = damShip;
	}

	public RegularShip getRegularShip() {
		return regularShip;
	}

	public void setRegularShip(RegularShip regularShip) {
		this.regularShip = regularShip;
	}

	public DestroyerShip getDestroyerShip() {
		return destroyerShip;
	}

	public void setDestroyerShip(DestroyerShip destroyerShip) {
		this.destroyerShip = destroyerShip;
	}

	public Misile getMisile() {
		return misile;
	}

	public void setMisile(Misile misile) {
		this.misile = misile;
	}

	public Ovni getOvni() {
		return ovni;
	}

	public void setOvni(Ovni ovni) {
		this.ovni = ovni;
	}

	public DestroyerShipList getDestroyerShipList() {
		return destroyerShipList;
	}

	public void setDestroyerShipList(DestroyerShipList destroyerShipList) {
		this.destroyerShipList = destroyerShipList;
	}

	public RegularShipList getRegularShipList() {
		return regularShipList;
	}

	public void setRegularShipList(RegularShipList regularShipList) {
		this.regularShipList = regularShipList;
	}

	public ProjectileList getProyectileList() {
		return proyectileList;
	}

	public void setProyectileList(ProjectileList proyectileList) {
		this.proyectileList = proyectileList;
	}

	public Level getLevel() {
		return level;
	}

	public void setLevel(Level level) {
		this.level = level;
	}

	public Random getRandom() {
		return random;
	}

	public void setRandom(Random random) {
		this.random = random;
	}

	public long getSeed() {
		return seed;
	}

	public void setSeed(long seed) {
		this.seed = seed;
	}

	public int getContCicles() {
		return contCicles;
	}

	public void setContCicles(int contCicles) {
		this.contCicles = contCicles;
	}

	public int getDirection() {
		return direction;
	}

	public void setDirection(int direction) {
		this.direction = direction;
	}

	public int getDirectionOvni() {
		return directionOvni;
	}

	public void setDirectionOvni(int directionOvni) {
		this.directionOvni = directionOvni;
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

	public boolean isShockWave() {
		return shockWave;
	}

	public void setShockWave(boolean shockWave) {
		this.shockWave = shockWave;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getMAX_ROW() {
		return MAX_ROW;
	}

	public int getMAX_COL() {
		return MAX_COL;
	}

	public void setFin(boolean fin) {
		this.fin = fin;
	}

	@Override
	public String toString() {
		String aux = (this.shockWave)? "YES" : "NO";
		String text = "\n  Life: " + this.damShip.getLife() + "\n  Number of cycles: "
				+ this.contCicles + "\n  Points: " + this.points
				+ "\n  Remaining aliens: "
				+ (destroyerShipList.getNumShips() + regularShipList.getNumElems())
				+ "\n  shockWave: "+aux;
		GamePrinter printerTab = new GamePrinter(this, MAX_ROW, MAX_COL);
		return text + printerTab.toString();
	}
	
}
