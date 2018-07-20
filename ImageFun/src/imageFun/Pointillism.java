package imageFun;

import processing.core.PApplet;
import processing.core.PImage;

public class Pointillism extends PApplet {

	PImage mouse;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main("imageFun.Pointillism");
	}

	public void settings() {
		mouse = loadImage("mouse.jpg");
		size(mouse.width, mouse.height);
	}

	public void setup() {
		//image(mouse, 0, 0);
	}

	public void draw() {
		// random location to draw dot
		int randX = (int) random(mouse.width);
		int randY = (int) random(mouse.height);
		int randX2 = (int) random(mouse.width);
		int randY2 = (int) random(mouse.height);
		int loc = mouse.width * randY + randX;
		
		// get color at random location
		int color = mouse.pixels[loc];
		int color2 = mouse.pixels[loc];
		
		// get RGB values
		int redChannel = (color & 0x00FF0000) >> 16;
		int blueChannel = (color & 0x0000FF00) >> 8;
		int greenChannel = (color & 0x0000000FF) >> 0;
		int redChannel2 = (color & 0x00FF0000) >> 16;
		int blueChannel2 = (color & 0x0000FF00) >> 8;
		int greenChannel2 = (color & 0x0000000FF) >> 0;
		// draw dot at random location
		fill(redChannel, blueChannel, greenChannel);
		noStroke();
		ellipse(randX,randY,5,5);
		
		fill(redChannel2, blueChannel2, greenChannel2);
		ellipse(randX2, randY2, 5,5);
	}
}
