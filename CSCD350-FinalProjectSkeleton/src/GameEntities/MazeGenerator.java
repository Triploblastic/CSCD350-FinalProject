package GameEntities;

import Maze.*;

public interface MazeGenerator {
	public MazeEnums.RoomType[][] createMaze(int size);
}
