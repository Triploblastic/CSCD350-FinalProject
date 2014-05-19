package Maze;

import GameEntities.MazeParser;
import Maze.MazeEnums.RoomType;

public class FakeMazeParser implements MazeParser {

	@Override
	public MazeNode parseMaze(RoomType[][] maze) {
		return new MazeNode();
	}

}
