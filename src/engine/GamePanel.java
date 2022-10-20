package engine;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

import start.Hero;

public class GamePanel extends JPanel implements Runnable{
	
	public final static int pixelSize = 40;
	final int horizontalPixels =20;
	final int verticalPixals =20;
	final int screenWidth = pixelSize*horizontalPixels;
	final int screenHeight = pixelSize*verticalPixals;
	
	Thread thread;
	Controller Control= new Controller();
	Hero player1 = new Hero(this,Control);
	
	public GamePanel() {
		this.setPreferredSize(new Dimension(screenWidth,screenHeight));
		this.setBackground(Color.black);
		this.setDoubleBuffered(true); // draw in the background / better performance / not necessary
		this.addKeyListener(Control);
		this.setFocusable(true);// wait for key 
	}
	
	public void startThread() {      // Create a thread that would be executed in every 1/60s
		thread = new Thread(this);   // should be added to class variables ? 
		thread.start();
	}
	
	public void run() {
		long interval=1000/60; // FPS
		long passTime =0;
		long oldTime = System.currentTimeMillis();
		long currentTime;
		
		while (thread != null){	
			currentTime = System.currentTimeMillis();
			passTime = currentTime - oldTime;
			if (passTime > interval ) {  //><
			update();
			
			repaint();
			oldTime = System.currentTimeMillis();
			}
		}
	}
	public void update() {
		player1.Mouvement();
		//System.out.println(player1.positionX);
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D)g;
		
		player1.draw(g2);
		g2.dispose();
		
	}
	
	
	
}
