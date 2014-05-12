package GameEntities;

import Maze.MazeNode;

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
		return mazeParser.parseMaze(mazeGenerator.createMaze(size));
	}
}
