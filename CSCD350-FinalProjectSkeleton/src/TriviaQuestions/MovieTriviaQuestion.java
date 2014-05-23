package TriviaQuestions;

import java.util.Random;

public class MovieTriviaQuestion extends TriviaQuestion {
	private String quote;
	private String answer;
	private String[] answerSet = new String[4];
	
	public MovieTriviaQuestion() {}

	/*getters*/
	@Override
	public String getPrompt() {return this.quote;}
	public String getQuote() {return this.quote;}
	@Override
	public String getAnswer() {return this.answer;}
	public String[] getAnswerSet() {
		int size = this.answerSet.length;
		String[] ara = new String[size];
		for(int i = 0; i < size; i++)
			ara[i] = this.answerSet[i];
		return ara;
	}
	
	/*setters*/
	@Override
	public void setPrompt(String s) {this.quote = s;}
	public void setQuote(String s) {this.quote = s;}
	@Override 
	public void setAnswer(String s) {this.answer = s;}
	public void setAnswerSet(String[] ara) {
		int size = answerSet.length;
		if (ara.length != size)
			throw new IllegalArgumentException("String array must have length = " + size);
		for(int i = 0; i < size; i++)
			this.answerSet[i] = ara[i];
	}

	public void shuffleAnswerSet() {
		int size = this.answerSet.length;
		Random random = new Random();
		String temp = "";
		for(int i = 0; i < size; i++) {
			int index = random.nextInt(size);
			temp = this.answerSet[i];
			this.answerSet[i] = this.answerSet[index];
			this.answerSet[index] = temp;
		}
	}
	
//	public void displayPrompt()
	
	public String toString() {
		String answerSet = "";
		for(int i = 0; i < this.answerSet.length; i++)
			answerSet += "\nanswerSet[" + (i) + "] : " + this.answerSet[i]; 
		return super.toString() + answerSet; 
	}
	
}
