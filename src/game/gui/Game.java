package game.gui;



import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.print.DocFlavor.URL;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import sun.audio.*;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Game extends JPanel{
	
	public  JFrame painel;
	
	
	public JLabel img;
	
	ImageIcon icon = new ImageIcon("../Super-Mario/resources/gif1.gif");
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Game window = new Game();
					
					
					window.painel.setVisible(true);
					
				
					
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public Game() throws IOException {
		inicia();
	}
	public void inicia()
	{
		painel = new JFrame();
		img = new JLabel(icon);
		painel.getContentPane().add(img);
		painel.setSize(new Dimension(620,620));
		painel.setTitle("Mario Adventure");
	}

}
