package MazeGame;

import java.awt.Image;

import javax.swing.ImageIcon;

import MazeRoomLogic.Item;
import MazeRoomLogic.MazeNode;

public class Player {
	
	private int x, y, tileX, tileY;
	private Image player;
	private MazeNode currentMazeNode;
	
	public Player(int xStart, int yStart){
		ImageIcon img=new ImageIcon("player.png");
		this.player=img.getImage();
		
//		this.x=32;
//		this.y=32;
		
		this.tileX=xStart;
		this.tileY=yStart;
	}
	
	public Image getPlayerImage(){
		return this.player;
	}
	
	public void move(int tx, int ty){
//		this.x+=dx;
//		this.y+=dy;
		this.tileX+=tx;
		this.tileY+=ty;
		
		
	}
	
	public void addItem(Item item){
		
	}
	
	public void setCurrentMazeNode(MazeNode currentNode){
		currentMazeNode = currentNode;
	}
	
	public MazeNode getCurrentMazeNode(){
		return currentMazeNode;
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
