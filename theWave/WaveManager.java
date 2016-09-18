package theWave;

import java.awt.Color;

import resources.DrawingBoard;
import resources.Timer;

public class WaveManager {

	private Particle[] wave;
	int direction = 1;

	public WaveManager(int numOfWaves, int x, int y){
		wave = new Particle[numOfWaves];
		for(int i=0;i<wave.length;i++){
			if(y<Coordinator.screenHeight){
				y += 50;
			}
			else if(y>=Coordinator.screenHeight-150){
				y = 50;
				x += 50;
			}
			wave[i] = new Particle(x, y, Color.red);
			
		}
	}
	public boolean checkCollisionDown(){
		if(wave[wave.length-1].getY()>=Coordinator.screenHeight-50) return true;
		return false;
	}
	public boolean checkCollisionUp(){
		if(wave[0].getY()<=50) return true;
		return false;
	}
	public void draw(DrawingBoard board){
		for(int i=0;i<wave.length;i++){
			wave[i].draw(board);
		}
	}
	public void move(){
		if( direction == 1 ) {
			for(int i=0;i<wave.length;i++){
				if(checkCollisionDown()==true) direction = 0;  
				if(checkCollisionUp()==true) { direction = 1;} 
				if(direction==1) wave[i].moveDown();
				else if(direction==0) {
					wave[i].moveUp();
				}
			}
		} 
		else {
			for(int i=wave.length-1;i>=0;i--){
				if(checkCollisionDown()==true) direction = 0;  
				if(checkCollisionUp()==true) { direction = 1;} 
				if(direction==1) wave[i].moveDown();
				else if(direction==0) {
					wave[i].moveUp();
				}
			}
		}
	}

}








