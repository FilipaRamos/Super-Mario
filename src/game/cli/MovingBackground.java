package game.cli;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;

public class MovingBackground {
	
	private Background image1;
	private Background image2;
	
	private ImageIcon back;

	MovingBackground(){
		image1 = new Background();
		image2 = new Background(image1.getWidth(), 0);
	}
	
	void moveBackground(){
		image1.incrementar();
		image2.incrementar();
	}
	
	
}
