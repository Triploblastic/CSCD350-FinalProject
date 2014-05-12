package Maze;

public class MazeNode {

	private MazeNode northNode, southNode, eastNode, westNode;
	private MazeRoom mazeRoom;
	
	public MazeNode movePleayer(MazeEnums.Direction direction) {
		return null;
	}
	
	public MazeNode getNode(MazeEnums.Direction direction){
		switch(direction){
		case NORTH:
			return northNode;
		case SOUTH:
			return southNode;
		case EAST:
			return eastNode;
		case WEST:
			return westNode;
		default:
			return this;
		}
	}
	public void setNode(MazeEnums.Direction direction, MazeNode node){
		switch(direction){
		case NORTH:
			northNode = node;
			break;
		case SOUTH:
			southNode = node;
			break;
		case EAST:
			eastNode = node;
			break;
		case WEST:
			westNode = node;
			break;
		}
	}
}
