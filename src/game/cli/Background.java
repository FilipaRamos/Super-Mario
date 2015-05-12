package game.cli;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class Background {
	
	private ImageIcon background;
	private int x;
	private int y;
	
	// CONSTRUTOR SEM ARGUMENTOS
	public Background(){
		x = 0;
		y = 0;
	}
	
	// CONSTRUTOR
	public Background(int x_position, int y_position){
		x = x_position;
		y = y_position;
		
		background = new ImageIcon("C:/Users/Filipa/workspace/Super-Mario/resources/background.png");
	}
	
	// DESENHAR A IMAGEM DE FUNDO
	public void draw(){
		// mover a imagem
		x -= 5;
		// verificar se a imagem saiu do ecr�
		if (x <= -1*getWidth()){
			// ajustar se sair
			x += getWidth() * 2;
		}
			
	}
	
	// DEVOLVER A POSI��O DO X
	public int getX(){
		return x;
	}
	
	// DEVOLVER A POSI��O DO Y
	public int getY(){
		return y;
	}
	
	// DEVOLVER O COMPRIMENTO DA IMAGEM
	public int getWidth(){
		return background.getIconWidth();
	}
	
	
}