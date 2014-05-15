package Maze;

public class MazeNode {

	private MazeNode northNode, southNode, eastNode, westNode;
	private MazeRoom mazeRoom;
	
	public MazeNode movePlayer(MazeEnums.Direction direction) {
		switch(direction){
		case EAST:
			if(eastNode.enter())
				return eastNode;
		case NORTH:
			if(northNode.enter())
				return northNode;
		case SOUTH:
			if(southNode.enter())
				return southNode;
		case WEST:
			if(westNode.enter())
				return westNode;
		default:
			return this;
		}
		
	}

	private boolean enter() {
		if(this.mazeRoom.enter())
			return true;
		
		return false;
	}
}
