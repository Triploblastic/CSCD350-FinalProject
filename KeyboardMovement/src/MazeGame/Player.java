package MazeGame;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Player {
	
	private int x, y, tileX, tileY;
	private Image player;
	
	public Player(){
		ImageIcon img=new ImageIcon("player.png");
		this.player=img.getImage();
		
//		this.x=32;
//		this.y=32;
		
		this.tileX=1;
		this.tileY=1;
	}
	
	public Image getPlayer(){
		return this.player;
	}
	
	public void move(int tx, int ty){
//		this.x+=dx;
//		this.y+=dy;
		
		this.tileX+=tx;
		this.tileY+=ty;
	}
	
//	public int getX(){
//		return this.x;
//	}
//	
//	public int getY(){
//		return this.y;
//	}
	
	public int getTileX(){
		return this.tileX;
	}
	
	public int getTileY(){
		return this.tileY;
	}
}
