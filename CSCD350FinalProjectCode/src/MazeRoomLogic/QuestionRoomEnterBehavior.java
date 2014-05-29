package MazeRoomLogic;

import java.util.Random;

import TriviaQuestions.*;

public class QuestionRoomEnterBehavior implements MazeRoomEnterBehavior {

	private static QuestionFactory questionFactory = new MovieTriviaQuestionFactory();
	
	//for now we are assuming that all questions are answered correctly
	@Override
	public boolean enter() {
		TriviaQuestion question = questionFactory.buildQuestion();
		question.displayPrompt();
		while(!question.isSubmitted()){
			//System.out.println(((MovieTriviaQuestion)question).getPrompt().getSelection());
		}
		return question.isCorrectAnswer();
	}

}
