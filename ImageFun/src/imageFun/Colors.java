package imageFun;
import processing.core.PApplet;
import processing.core.PImage;
public class Colors extends PApplet {
PImage mouse;
PImage Corgi;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	PApplet.main("imageFun.Colors");
		
	}
public void settings(){
	size(800, 600);
}
public void setup(){
	mouse = loadImage("mouse.jpg");
	Corgi = loadImage("Pembroke_Welsh_Corgi_SERP.jpg");
	mouse.resize(450, 650);
	Corgi.resize(450, 650);
	System.out.println(Corgi);
	System.out.println(mouse);
	for (int i = 0; i < mouse.pixels.length; i++ ){
		// bitmask - ONLY TO KEEP GREEN D:
		mouse.pixels[i] = mouse.pixels[i] & 0xFF00;
		Corgi.pixels[i] = Corgi.pixels[i] & 0xFFFF0000;
	}
	}

public void draw(){
	background(255);
	image(mouse, 0, 0);
	image(Corgi, Corgi.width, 0);

}
}
