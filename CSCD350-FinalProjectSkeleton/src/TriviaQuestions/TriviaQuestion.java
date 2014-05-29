package TriviaQuestions;

import javax.swing.JFrame;

public class TriviaQuestion {
	private TriviaAnswerSet answerSet = null;
	private TriviaQuestionPrompt prompt = null;
	
	public TriviaQuestion() {}
	
	/*getters*/
	public TriviaQuestionPrompt getPrompt() {return this.prompt;}
	public TriviaAnswerSet getAnswerSet() {return this.answerSet;}
	
	/*setters*/
	public void setTriviaQuestionPrompt(TriviaQuestionPrompt p) {this.prompt = p;}
	public void setTriviaAnswerSet(TriviaAnswerSet a) {this.answerSet = a;}
	
	public boolean submitResponse() {return true;}
	
	public void displayPrompt() {prompt.displayPrompt();}
	
	public String toString() {
		return "Prompt:" + this.getPrompt().toString() + "\nAnswer Set: " + this.answerSet.toString() + "\nAnswer: " +this.answerSet.getAnswer();
	}

}
