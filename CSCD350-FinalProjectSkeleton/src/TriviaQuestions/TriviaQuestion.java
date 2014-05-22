package TriviaQuestions;

public abstract class TriviaQuestion {
	//QuestionType type = null;
	String prompt = null;
	String answer = null;
	
	public TriviaQuestion() {/*throw exception*/}
	
//	public TriviaQuestion(QuestionType type) {
//		this.type = type;
//	}
	
	/*getters*/
	public String getPrompt() {return this.prompt;}
	public String getAnswer() {return this.answer;}
	
	/*setters*/
	public void setPrompt(String s) {this.prompt = s;}
	public void setAnswer(String s) {this.answer = s;}
	
	public String toString() {
		return "Prompt:" + this.getPrompt() + "\nAnswer: " + this.getAnswer();
	}

}
