package MazeRoomLogic;

import MazeGame.Player;

public class MazeRoom {
	private PlayerEffect winItem;
	private PlayerEffect loseItem;
	private MazeRoomEnterBehavior enterBehavior;
	private boolean isEntered;

	public boolean enter() {
		if(enterBehavior.enter()){
			winItem.ApplyEffect();
			isEntered = true;
			return true;
		}
		loseItem.ApplyEffect();
		return false;
	}

	public void setWinItem(PlayerEffect item){
		winItem = item;
	}
	
	public void setLoseItem(PlayerEffect item){
		loseItem = item;
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

