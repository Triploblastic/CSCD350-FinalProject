package GameEntities;

import java.util.ArrayList;
import java.util.List;

import Maze.Item;

/* This class is a singleton, meaning, there can only be one instnace of it per game
 * The instance is obtained by calling Player.getInstance()
 * This allows for a univeral access point to the player object
 */

public class Player {
	private int health;
	private List<Item> items;
	
	private static Player playerInstance;
	
	private static final int StartHealth = 3;
	
	
	private Player(int startHealth) {
		health = startHealth;
		items = new ArrayList<Item>();
	}
	
	public static Player getInstance(){
		if(playerInstance == null){
			playerInstance = new Player(StartHealth);
		}
		return playerInstance;
	}
	
	public int getHealth(){
		return health;
	}
	
	public void augmentHealth(int amount){
		//TODO: 
	}
	
	public void useItem(int index){
		//TODO: Make this work? maybe change signature
	}
	
	public void addItem(Item item){
		//TODO: Add items
	}
	
}
