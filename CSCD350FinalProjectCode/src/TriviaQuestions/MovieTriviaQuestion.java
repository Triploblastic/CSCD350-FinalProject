package TriviaQuestions;

import java.util.Random;

public class MovieTriviaQuestion extends TriviaQuestion {
	private MovieTriviaQuestionPrompt prompt;
	private MovieTriviaAnswerSet answerSet;
	
	public MovieTriviaQuestion() {
		this.prompt = new MovieTriviaQuestionPrompt();
		super.setTriviaQuestionPrompt(this.prompt);
		this.answerSet = new MovieTriviaAnswerSet();
		super.setTriviaAnswerSet(this.answerSet);
	}
	
	public MovieTriviaQuestionPrompt getPrompt() {return this.prompt;}
	public MovieTriviaAnswerSet getAnswerSet() {return this.answerSet;}

	public void setPrompt(MovieTriviaQuestionPrompt prompt) {this.prompt = prompt;}
	public void setAnswerSet(MovieTriviaAnswerSet answerSet) {this.answerSet = answerSet;}



	public void displayPrompt() {
		try {
			getPrompt().setVisible(true);
			System.out.println("end getPrompt(inner)");
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public boolean isSubmitted() {return prompt.isSubmitted();}
	
	public boolean isCorrectAnswer() {
		return answerSet.getAnswer().equals(prompt.getSelection());
	}
	
//	public String toString() {
//		String answerSet = "";
//		for(int i = 0; i < this.answersArray.length; i++)
//			answerSet += "\nanswerSet[" + (i) + "] : " + this.answersArray[i]; 
//		return super.toString() + answerSet; 
//	}
	
	
}
