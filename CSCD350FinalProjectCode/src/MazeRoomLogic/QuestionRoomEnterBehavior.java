package MazeRoomLogic;

import java.util.Random;

import TriviaQuestions.*;

public class QuestionRoomEnterBehavior implements MazeRoomEnterBehavior {

	private static MovieTriviaQuestionFactory questionFactory = new MovieTriviaQuestionFactory();
	
	//for now we are assuming that all questions are answered correctly
	@Override
	public boolean enter() {return true;
//		MovieTriviaQuestion question = questionFactory.buildQuestion();
//		question.displayPrompt();
//		int i = 0;
//		while(!question.isSubmitted()){
//			i--;
//			System.out.println(i++);
//		}
//		return question.isCorrectAnswer();
	}

}
