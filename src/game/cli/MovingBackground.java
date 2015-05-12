package game.cli;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class MovingBackground {
	
	private BufferedImage background;
	private int x;
	private int y;
	
	public MovingBackground(){
		x = 0;
		y = 0;
	}
	
	public MovingBackground(int x_position, int y_position){
		x = x_position;
		y = y_position;
		
		// TENTAR LER A IMAGEM DO BACKGROUND
		try {
			background = ImageIO.read(new File("background.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public int getX(){
		return x;
	}
	
	public int getY(){
		return y;
	}
	
	
	
}
