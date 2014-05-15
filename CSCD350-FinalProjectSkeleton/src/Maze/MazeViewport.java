package Maze;

public class MazeViewport {
	private MazeNode current;
	
	public MazeViewport(MazeNode startLocation){
		current = startLocation;
	}
	
	public MazeNode getCurrentLocation(){
		return current;
	}
	
	public void movePlayer(MazeEnums.Direction direction){
		current = current.movePlayer(direction);
	}
}
