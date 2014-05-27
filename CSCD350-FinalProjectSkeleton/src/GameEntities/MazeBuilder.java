package GameEntities;

import MazeRoomLogic.MazeNode;

public class MazeBuilder {
	private MazeGenerator mazeGenerator;
	private MazeParser mazeParser;
	
	public MazeBuilder withMazeGenerator(MazeGenerator generator){
		mazeGenerator = generator;
		return this;
	}
	
	public MazeBuilder withMazeParser(MazeParser parser){
		mazeParser = parser;
		return this;
	}
	
	public MazeNode buildMaze(int size){
		if (size % 2 ==0)
			throw new IllegalArgumentException("The maze must be an odd size");
		return mazeParser.parseMaze(mazeGenerator.createMaze(size));
	}
}
