package jrJava.alienInvader;


public class RealNastyAlien extends CloakAlien {

	public RealNastyAlien(int x, int xSpeed){
		super(x, xSpeed);
	}
	

	public void launchMissile(){
		MissileManager.add( new Missile(x, y+Missile.HEIGHT, 2*vy) );
		MissileManager.add( new Missile(x-WIDTH/8, y+Missile.HEIGHT, 2*vy) );
		MissileManager.add( new Missile(x+WIDTH/8, y+Missile.HEIGHT, 2*vy) );
		MissileManager.add( new Missile(x-WIDTH/4, y+Missile.HEIGHT, 2*vy) );
		MissileManager.add( new Missile(x+WIDTH/4, y+Missile.HEIGHT, 2*vy) );
	}
	
	
	public void move(Ship ship){
		x = (int)(0.94*x + 0.06*ship.getX());
		y += vy;

		if(ship.isHit(this)){
			collidedWithShip = true;
		}

		if(y<cloakCompleteY){
			if(Math.random()>0.97) launchMissile();
		}
		else if(y>cloakStopY){
			if(Math.random()>0.94) launchMissile();
		}
	}
	
}











