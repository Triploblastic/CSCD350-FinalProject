package TriviaQuestions;

import javax.swing.JFrame;

public class TriviaQuestion {
	private TriviaAnswerSet answerSet = null;
	private MovieTriviaQuestionPrompt prompt = null;
	
	public TriviaQuestion() {}
	
	/*getters*/
	public MovieTriviaQuestionPrompt getPrompt() {return this.prompt;}
	public TriviaAnswerSet getAnswerSet() {return this.answerSet;}
	
	/*setters*/
	public void setTriviaQuestionPrompt(MovieTriviaQuestionPrompt p) {this.prompt = p;}
	public void setTriviaAnswerSet(TriviaAnswerSet a) {this.answerSet = a;}
	
	public boolean isCorrectAnswer() {return true;}
	public boolean isSubmitted() {return prompt.isSubmitted();}
	
	public void displayPrompt() {prompt.displayPrompt();}
	
	public String toString() {
		return "Prompt:" + this.getPrompt().toString() + "\nAnswer Set: " + this.answerSet.toString() + "\nAnswer: " +this.answerSet.getAnswer();
	}

}
