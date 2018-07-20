package SharedCanvas;
import processing.core.PApplet;
import processing.net.*;
import processing.data.JSONObject;
import java.awt.Color;
public class SharedCanvasClient extends PApplet {

	Client client;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main("SharedCanvas.SharedCanvasClient");
	}

	public void settings(){
		size(500,500);
	}
	public void setup(){
		client = new Client(this, "127.0.0.1", 50000);
	}
	public void draw(){
		
	}
	public void mousePressed(){
		System.out.println("Mouse Clicked");
		
		Color red = new Color((int) random(255),(int) random (255), (int) random (255));
		// use a line to draw on the screen
		noStroke();
		fill(red.getRGB());
		ellipse(pmouseX, pmouseY, 15,15);
		
		// make a message and send to server
		JSONObject obj = new JSONObject();
		obj.setInt("x", mouseX);
		obj.setInt("y", mouseY);
		obj.setInt("color", red.getRGB());
		client.write(obj.toString());
	}
	}
