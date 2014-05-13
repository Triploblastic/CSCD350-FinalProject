package GameEntities;

import Maze.MazeEnums.Direction;
import Maze.MazeEnums.RoomType;
import Maze.MazeNode;

public class DefaultMazeParser implements MazeParser {

	@Override
	public MazeNode parseMaze(RoomType[][] maze) {
		MazeNode result = new MazeNode();
		MazeNode current = result;
		MazeNode rowFirst = current;
		for (int x = 0; x < maze.length; x++) {
			for (int j = 0; j < maze[x].length; j++) {
				if(maze[x][j] == RoomType.START)
					result = current;
				current.setMazeRoom(MazeRoomFactory.getInstance().getMazeRoom(maze[x][j]));
				if(x < maze.length - 1){
					MazeNode node = new MazeNode();
					current.setNode(Direction.SOUTH, node);
					node.setNode(Direction.NORTH, current);
				}
				if(j < maze.length - 1){
					MazeNode node = new MazeNode();
					current.setNode(Direction.EAST, node);
					node.setNode(Direction.WEST, current);
				}
				current = current.getNode(Direction.EAST);
			}
			rowFirst = rowFirst.getNode(Direction.SOUTH);
			current = rowFirst;
		}
		return result;
	}

	
}
