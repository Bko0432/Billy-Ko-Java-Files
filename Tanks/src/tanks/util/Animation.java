package tanks.util;
import processing.core.*;

public class Animation {
 
	// Qualities
	PImage[] images;

	private int currentFrame;
	
	public Animation(PApplet app, String[] filePaths){
		
		// make our image array
		images = new PImage[filePaths.length];
		
		// load all of our image files into processing 
		for (int i = 0; i < filePaths.length; i++){
			images[i] = app.loadImage(filePaths[i]);
		}
		// get our starting frame number
		currentFrame = 0;
	}
	public PImage getCurrentImage(){
		return  images[currentFrame];
	}
	public PImage getNextImage(){
		currentFrame += 1;
		if(currentFrame >= images.length){
			currentFrame = 0;
		}
		return images[currentFrame];
	}
}
