package Maze;

public class MazeRoom {
	private Item winItem;
	private MazeRoomEnterBehavior enterBehavior;
	
	public boolean enter() {
		return this.enterBehavior.enter();
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

