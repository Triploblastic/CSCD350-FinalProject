package Maze;

import GameEntities.Player;

public class MazeRoom {
	private Item winItem;
	private MazeRoomEnterBehavior enterBehavior;
	
	public boolean enter() {
		if(enterBehavior.enter()){
			Player.getInstance().addItem(winItem);
			return true;
		}
		return false;
	}
	
	public void setEnterBehavior(MazeRoomEnterBehavior enterBehavior){
		this.enterBehavior = enterBehavior;
	}
	
	public void leave() {
		
	}
}
