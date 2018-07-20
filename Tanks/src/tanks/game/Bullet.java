package tanks.game;
import processing.core.*;
public class Bullet {
	public PApplet app;
	public float x;
	public float y;
	public float direction;
	
	public final float SPEED = 7;
	public final float BULLET_WIDTH = 4;
	public final float BULLET_HEIGHT = 7;
	
	public Bullet(PApplet pApp, float x, float y, float direction ){
		this.x = x;
		this.y = y;
		this.direction = direction;
		this.app = pApp;
	}
	public void move(){

		this.x += SPEED*Math.cos(app.radians( 90 - this.direction));
		this.y -= (float) (SPEED*Math.sin(app.radians( 90 - this.direction)));
	}
	public void draw(){
		app.ellipseMode(app.CENTER);
		app.ellipse(x, y, this.BULLET_WIDTH, this.BULLET_HEIGHT);
	}
	public boolean isOutsideFrame(){
		if(this.x < 0 || this.x > app.width){
			return true;
		}
		else if (this.y < 0 || this.y > app.height){
			return true;
		}else{
			return false;
		}
	}
}
