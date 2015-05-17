package game.cli;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Background {
	
	private ImageIcon background;
	private int x;
	private int y;
	public JLabel imagem;
	
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
		imagem = new JLabel(background);
		imagem.setLayout(new GridLayout(0, 3, 0, 1));
	}
	
	// INCREMENTAR A POSIÇÃO DA IMAGEM DE FUNDO
	public void incrementar(){
		// mover a imagem
		x -= 5;		
	}
	
	public void draw(){
		
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