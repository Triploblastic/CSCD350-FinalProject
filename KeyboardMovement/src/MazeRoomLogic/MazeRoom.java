package MazeRoomLogic;

import MazeGame.Player;

public class MazeRoom {
	private Item winItem;
	private MazeRoomEnterBehavior enterBehavior;


	public boolean enter() {
		if(enterBehavior.enter()){
			return true;
		}
		return false;
	}

	public void setItem(Item item){
		winItem = item;
	}


	public void leave() {


	}

	public MazeRoomEnterBehavior getEnterBehavior(){
		return this.enterBehavior;
	}
	
	public void setEnterBehavior(MazeRoomEnterBehavior enterBehavior){
		this.enterBehavior=enterBehavior;
	}
}

