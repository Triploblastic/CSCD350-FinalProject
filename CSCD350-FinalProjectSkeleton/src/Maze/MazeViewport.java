package Maze;

import MazeRoomLogic.MazeNode;

public class MazeViewport {
	private MazeNode current;
	
	public MazeViewport(MazeNode startNode){
		this.current = startNode;
	}
	
	public MazeNode getCurrentLocation(){
		return current;
	}
	
	public void movePlayer(MazeEnums.Direction direction){
		current = current.movePlayer(direction);
	}
}
