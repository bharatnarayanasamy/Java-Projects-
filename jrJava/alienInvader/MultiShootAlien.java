package jrJava.alienInvader;


public class MultiShootAlien extends SimpleAlien {

	
	public MultiShootAlien(int x, int xSpeed){
		super(x, xSpeed);
	}
	
	
	public void launchMissile(){
		MissileManager.add( new Missile(x, y+Missile.HEIGHT, 2*vy) );
		MissileManager.add( new Missile(x-WIDTH/8, y+Missile.HEIGHT, 2*vy) );
		MissileManager.add( new Missile(x+WIDTH/8, y+Missile.HEIGHT, 2*vy) );
		MissileManager.add( new Missile(x-WIDTH/4, y+Missile.HEIGHT, 2*vy) );
		MissileManager.add( new Missile(x+WIDTH/4, y+Missile.HEIGHT, 2*vy) );
	}
	
}
