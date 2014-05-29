package GameEntities;

import Maze.MazeEnums.Direction;
import Maze.MazeNode;
import Maze.MazeViewport;
//import TriviaQuestions.QuestionFactory;
import TriviaQuestions.*;

public class TestClient {
	static MazeBuilder builder;
	
	public static void main(String[] args){
//		builder = new MazeBuilder();
//		MazeNode startNode = builder.withMazeGenerator(new FakeMazeGenerator()).withMazeParser(new DefaultMazeParser()).buildMaze(3);
//		
//		MazeViewport view = new MazeViewport(startNode);
//		
//		view.getCurrentLocation();
//		
//		view.movePlayer(Direction.NORTH);
//		view.movePlayer(Direction.SOUTH);
//		view.movePlayer(Direction.EAST);
//		view.movePlayer(Direction.EAST);
//		view.movePlayer(Direction.EAST);
//		view.movePlayer(Direction.EAST);
//		int x =0;
		QuestionFactory factory = new MovieTriviaQuestionFactory();
		TriviaQuestion q = null;
		try {
			for (int i = 0; i < 1; i++) {
				q = factory.buildQuestion();
				//System.out.println(q.toString());
				q.displayPrompt();
				while(!q.getPrompt().answerSubmitted()) {System.out.println(q.getPrompt().getSelection());}
				System.out.println("The answer selected is :" + q.submitResponse());
			}
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		
		
	}
}
