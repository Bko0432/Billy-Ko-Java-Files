package tanks.game;
import processing.core.*;
import java.util.*;
public class Main extends PApplet {

	Tank tank;
	ArrayList<Bullet> bullets;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main("tanks.game.Main");
		
	}
	public void settings(){
		size(800,600);
	}
	public void setup(){
		tank = new Tank(this, width / 2, height / 2);
		bullets = new ArrayList<Bullet>();
	}
	public void draw(){
		// clear the frame 
		background(20, 200, 180);
		
		// draw + move our tank
		tank.move();
		tank.draw();
		
	for(Bullet b : bullets){
		b.move();
		b.draw();
	}
		}
	public void keyPressed(){
		// shoot bullets if space bar pressed 
		if (key == ' '){
			Bullet bullet = new Bullet(this, tank.x, tank.y, tank.direction);
			bullets.add(bullet);
		}
	}
	public void cleanUpFrame(){
		ArrayList<Bullet> bulletsToRemove = new ArrayList<Bullet>();
		
		for(Bullet b : bullets){
			if(b.isOutsideFrame()){
				bulletsToRemove.add(b);				
			}
		}
		for (Bullet b : bulletsToRemove){
			bullets.remove(b);
		}
	}
	}

