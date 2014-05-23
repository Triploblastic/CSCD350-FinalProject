package TriviaQuestions;

public abstract class TriviaQuestion {
	String prompt = null;
	String answer = null;
	
	public TriviaQuestion() {/*throw exception?*/}
	
	/*getters*/
	public String getPrompt() {return this.prompt;}
	public String getAnswer() {return this.answer;}
	
	/*setters*/
	public void setPrompt(String s) {this.prompt = s;}
	public void setAnswer(String s) {this.answer = s;}
	
	public void displayPrompt() {System.out.println(this.prompt + "");}
	public void displayAnswerSet() {System.out.println(this.prompt + "");}
	
	public String toString() {
		return "Prompt:" + this.getPrompt() + "\nAnswer: " + this.getAnswer();
	}

}
