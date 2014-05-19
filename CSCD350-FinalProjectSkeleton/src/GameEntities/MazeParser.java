package GameEntities;

import Maze.MazeEnums;
import Maze.MazeNode;

public interface MazeParser {
	public MazeNode parseMaze(MazeEnums.RoomType[][] maze);
}
