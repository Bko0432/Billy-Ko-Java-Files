package tanks.game;
import processing.core.*;
import tanks.util.Animation;
public class Tank {
public PApplet app;
// Tank qualities
	
// position
public float x;
public float y;
public float direction; // angle in degrees from due north
// speed
public float speed = 10;

// health
public int health;
public final  int maxHealth = 100;

private Animation tankAnimation;

public Tank(PApplet app, float x, float y){
	
	// define position
	this.app = app;
	this.x = x;
	this.y = y;
	
	// define direction (starts at due north)
	this.direction = 0;
	this.health = this.maxHealth;
	// make our tank animation
	String[] filePaths = { 
			"Assets/green_tank/green_tank_1.png",
			"Assets/green_tank/green_tank_2.png",
			"Assets/green_tank/green_tank_3.png",
			"Assets/green_tank/green_tank_4.png",
			"Assets/green_tank/green_tank_5.png",
			"Assets/green_tank/green_tank_6.png",
			"Assets/green_tank/green_tank_7.png",
			"Assets/green_tank/green_tank_8.png"
	};
	this.tankAnimation = new Animation(this.app, filePaths);
}
public void move(){
	app.pushMatrix();
	app.translate(this.x, this.y);
	app.rotate(app.radians(this.direction));
	// move forward and backward
	if (app.keyPressed && app.keyCode == app.UP && this.y > 0){
		this.x += speed*Math.cos(app.radians( 90 - this.direction));
		this.y -= speed*Math.sin(app.radians( 90 - this.direction));
		app.image(tankAnimation.getNextImage(), 0, 0);
		System.out.println("UP");
	}
	else if (app.keyPressed && app.keyCode == app.DOWN && this.y < app.height){
		this.x -= speed*Math.cos(app.radians( 90 - this.direction));
		this.y += speed*Math.sin(app.radians( 90 - this.direction));
		app.image(tankAnimation.getNextImage(), 0, 0);
		System.out.println("DOWN");
	}
	else if(app.keyPressed && app.keyCode == app.LEFT){
		this.direction = this.direction -= 3;
		System.out.println("LEFT");
	}
	else if (app.keyPressed && app.keyCode == app.RIGHT){
		this.direction = this.direction += 3;
		System.out.println("RIGHT");
	}
	else if (app.keyPressed && app.key == ' '){
		
	}
	app.popMatrix();
}
public void draw(){
	
	app.pushMatrix();
	app.translate(this.x, this.y);
	app.rotate(app.radians(this.direction));
	app.imageMode(app.CENTER);
	app.image(tankAnimation.getCurrentImage(), 0, 0);
	app.popMatrix();
}
	}

