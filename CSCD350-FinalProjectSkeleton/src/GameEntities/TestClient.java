package GameEntities;

import Maze.MazeEnums.Direction;
import MazeRoomLogic.MazeNode;
import Maze.MazeViewport;

public class TestClient {
	static MazeBuilder builder;
	
	public static void main(String[] args){
		builder = new MazeBuilder();
		MazeNode startNode = builder.withMazeGenerator(new FakeMazeGenerator()).withMazeParser(new DefaultMazeParser()).buildMaze(3);
		
		MazeViewport view = new MazeViewport(startNode);
		
		view.getCurrentLocation();
		
		view.movePlayer(Direction.NORTH);
		view.movePlayer(Direction.SOUTH);
		view.movePlayer(Direction.EAST);
		view.movePlayer(Direction.EAST);
		view.movePlayer(Direction.EAST);
		view.movePlayer(Direction.EAST);
		int x =0;
	}
}
