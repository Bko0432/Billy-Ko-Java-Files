package SharedCanvas;
import processing.core.PApplet;
import processing.net.*;
import processing.data.JSONObject;
public class SharedCanvasServer extends PApplet{
	Server server;
	
	public final int SERVER_PORT = 50000;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main("SharedCanvas.SharedCanvasServer");
	}
	public void settings(){
	size(500,500);
}
	public void setup(){
		server = new Server(this, SERVER_PORT);
		System.out.println("Server Started at " + server.ip() + ":" + SERVER_PORT);
}
	public void draw(){
	Client client = server.available(); // get the next client in line
	if (client != null){
		String message = client.readString();
		System.out.println(message);
		
		// parse mouseX and mouseY from message
		try {
		JSONObject obj = parseJSONObject(message);
		int msgMouseX = obj.getInt("x");
		int msgMouseY = obj.getInt("y");
		int msgColor = obj.getInt("color");
		
		fill(msgColor);
		noStroke();
		ellipse(msgMouseX, msgMouseY, 15, 15);
	}
	catch (java.lang.RuntimeException ex){
		System.out.println("Oh no - weird message! Skipping");
	}
}
}
}