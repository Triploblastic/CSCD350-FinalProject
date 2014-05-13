package GameEntities;

import Maze.MazeEnums.RoomType;
import Maze.MazeNode;

public class FakeMazeParser implements MazeParser {

	@Override
	public MazeNode parseMaze(RoomType[][] maze) {
		MazeNode result = new MazeNode();
		for (int x = 0; x < maze.length; x++) {
			for (int j = 0; j < maze[x].length; j++) {
				
			}
		}
		return new MazeNode();
	}

	
}
