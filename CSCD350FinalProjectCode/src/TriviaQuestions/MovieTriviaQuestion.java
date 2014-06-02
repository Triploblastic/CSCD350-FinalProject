package TriviaQuestions;

import java.util.Random;

public class MovieTriviaQuestion {
	private MovieTriviaQuestionPrompt prompt = null;
	private MovieTriviaAnswerSet answerSet = null;
	
	public MovieTriviaQuestion() {
		this.prompt = new MovieTriviaQuestionPrompt();
		this.answerSet = new MovieTriviaAnswerSet();
	}
	
	public MovieTriviaQuestionPrompt getPrompt() {return this.prompt;}
	public MovieTriviaAnswerSet getAnswerSet() {return this.answerSet;}

	public void setPrompt(MovieTriviaQuestionPrompt prompt) {this.prompt = prompt;}
	public void setAnswerSet(MovieTriviaAnswerSet answerSet) {this.answerSet = answerSet;}

	public void displayPrompt() {
		try {
			prompt.setAlwaysOnTop(true);
			prompt.setVisible(true);
		} 
		catch (Exception e) {e.printStackTrace();}
	}
	
	public boolean isSubmitted() {return prompt.isSubmitted();}

	public boolean isCorrectAnswer() {
		return answerSet.getAnswer().equals(prompt.getSelection());
	}
	
}
