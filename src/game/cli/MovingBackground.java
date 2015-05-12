package game.cli;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class MovingBackground {
	
	private ImageIcon background;
	private int x;
	private int y;
	
	// CONSTRUTOR SEM ARGUMENTOS
	public MovingBackground(){
		x = 0;
		y = 0;
	}
	
	// CONSTRUTOR
	public MovingBackground(int x_position, int y_position){
		x = x_position;
		y = y_position;
		
		background = new ImageIcon("C:/Users/Filipa/workspace/Super-Mario/resources/background.png");
	}
	
	public void draw(){
		x -= 5;
		
		if (x <= -1*getWidth()){
			x = x + getWidth() * 2;
		}
			
	}
	
	// DEVOLVER A POSIÇÃO DO X
	public int getX(){
		return x;
	}
	
	// DEVOLVER A POSIÇÃO DO Y
	public int getY(){
		return y;
	}
	
	// DEVOLVER O COMPRIMENTO DA IMAGEM
	public int getWidth(){
		return background.getIconWidth();
	}
	
	
	
	
}
