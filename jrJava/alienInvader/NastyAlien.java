package jrJava.alienInvader;

public class NastyAlien extends MultiShootAlien {

	
	public NastyAlien(int x, int xSpeed){
		super(x, xSpeed);
	}
	

	public void move(Ship ship){
		x = (int)(0.97*x + 0.03*ship.getX());
		y += vy;

		// check collision with the Ship.
		if(ship.isHit(this)){
			// play the explosion sound.
			// draw the explosion image.
			collidedWithShip = true;
			// Coordinator.gameOver = true; // call it the gameOver.
		}

		// Randomly, fires missiles.
		if(Math.random()>0.97) launchMissile();

	}
	
}
