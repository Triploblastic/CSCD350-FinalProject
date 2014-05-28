package MazeGame;

import java.awt.Image;

import javax.swing.ImageIcon;

import MazeRoomLogic.Item;
import MazeRoomLogic.MazeEnums.Direction;
import MazeRoomLogic.MazeNode;

public class Player {
	
	private int x, y, tileX, tileY;
	private Image player;
	private MazeNode currentMazeNode;
	private Direction facingDirection;
	private int health;
	
	public Player(int xStart, int yStart){
		facingDirection = Direction.SOUTH;
		health = 3;
//		this.x=32;
//		this.y=32;
		
		this.tileX=xStart;
		this.tileY=yStart;
	}
	
	public Image getPlayerImage(){
		StringBuilder playerImg;
		switch(facingDirection){
		case EAST:
			playerImg = new StringBuilder("playerEast");
			break;
		case NORTH:
			playerImg = new StringBuilder("playerNorth");
			break;
		case SOUTH:
			playerImg = new StringBuilder("playerSouth");
			break;
		case WEST:
			playerImg = new StringBuilder("playerWest");
			break;
		default:
			playerImg = new StringBuilder("playerSouth");
			break;
		}
		//String healthMod = "";
		String healthMod = health <= 3 && health >= 0 ? Integer.toString(health) : "3";
		playerImg.append(healthMod + ".png");
		
		ImageIcon img = new ImageIcon(playerImg.toString());
		this.player=img.getImage();
		return this.player;
	}
	
	public void move(int tx, int ty){
		this.tileX+=tx;
		this.tileY+=ty;
	}
	
	public void addItem(Item item){
		
	}
	
	public void loseHealth(){
		health = health-1 >= 0 ? health-1 : 0;
	}
	
	public void gainHealth(){
		health = health + 1 <= 3 ? health +1 : 3;
	}
	
	public int getHealth(){
		return health;
	}
	
	public void setDirection(Direction direction){
		facingDirection = direction;
	}
	
	public void setCurrentMazeNode(MazeNode currentNode){
		currentMazeNode = currentNode;
	}
	
	public MazeNode getCurrentMazeNode(){
		return currentMazeNode;
	}
	
	public int getTileX(){
		return this.tileX;
	}
	
	public int getTileY(){
		return this.tileY;
	}
}
