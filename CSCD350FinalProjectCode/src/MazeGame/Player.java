package MazeGame;

import java.awt.Image;

import javax.swing.ImageIcon;

import MazeRoomLogic.PlayerEffect;
import MazeRoomLogic.MazeEnums.Direction;
import MazeRoomLogic.MazeNode;

public class Player {
	
	private int tileX, tileY;
	private Image player;
	private MazeNode currentMazeNode;
	private Direction facingDirection;
	private int health;
	private int keys;
	private static Player Instance;
	private int points;
	
	//Initialization
	private Player(){
		facingDirection = Direction.SOUTH;
		health = 3;	
	}
	
	public static Player getInstance(){
		if(Instance == null)
			Instance = new Player();
		return Instance;
	}
	
	public void setStartLocation(int xStart, int yStart){
		this.tileX = xStart;
		this.tileY = yStart;
	}
	//End Initialization
	
	//Public Getters
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
	
	public int getPoints(){
		return points;
	}
	
	public int getKeys(){
		return keys;
	}
	
	public int getHealth(){
		return health;
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
	//End Public Getters
	
	//Public Setters
	public void setDirection(Direction direction){
		facingDirection = direction;
	}
	
	public void setCurrentMazeNode(MazeNode currentNode){
		currentMazeNode = currentNode;
	}
	//End Public Setters
	
	//Public Modification Behaviors
	public void move(int tx, int ty){
		this.tileX+=tx;
		this.tileY+=ty;
	}
	
	public void increaseHealth(){
		health = health < 3 ? health+1 : 3; 
	}
	
	public void decreaseHealth(){
		health = health > 0 ? health-1 : 0;
	}
	
	public void addKey(){
		keys++;
	}
	
	public void removeKey(){
		keys = keys > 0 ? keys-1 : 0;
	}
	
	public void addPoints(int amount){
		points += amount;
	}
	//End Public Modification Behaviors
	
}