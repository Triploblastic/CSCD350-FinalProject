package Maze;

import GameEntities.MazeParser;
import Maze.MazeEnums.RoomType;
import MazeRoomLogic.MazeNode;

public class FakeMazeParser implements MazeParser {

	@Override
	public MazeNode parseMaze(RoomType[][] maze) {
		return new MazeNode();
	}

}
