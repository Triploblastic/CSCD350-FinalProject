package GameEntities;

import Maze.MazeEnums;
import MazeRoomLogic.MazeNode;

public interface MazeParser {
	public MazeNode parseMaze(MazeEnums.RoomType[][] maze);
}
