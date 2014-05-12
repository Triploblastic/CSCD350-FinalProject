package GameEntities;

import Maze.MazeEnums;
import Maze.MazeEnums.RoomType;

public class FakeMazeGenerator implements MazeGenerator {

	@Override
	public MazeEnums.RoomType[][] createMaze(int size) {
		return new MazeEnums.RoomType[][]{{RoomType.WALL,RoomType.WALL,RoomType.WALL,RoomType.WALL,RoomType.WALL,RoomType.WALL},
											{RoomType.WALL,RoomType.START,RoomType.PATH,RoomType.DOOR,RoomType.EXIT,RoomType.WALL},
											{RoomType.WALL,RoomType.WALL,RoomType.WALL,RoomType.WALL,RoomType.WALL,RoomType.WALL}};
		}
}
