package TriviaQuestions;

import java.util.Random;

public class MovieTriviaAnswerSet extends TriviaAnswerSet {
	private TriviaResponseHandler responseHandler = null;
	private String[] answerSet = new String[4];
	private String answer;
	
	MovieTriviaAnswerSet() {this.responseHandler = new MovieTriviaResponseHandler();}
	
	/*getters*/
	public TriviaResponseHandler getResponseHandler() {return responseHandler;}
	public String getAnswer() {return answer;}
	public String[] getAnswerSet() {return answerSet;}

	/*setters*/
	public void setResponseHandler(TriviaResponseHandler responseHandler) {this.responseHandler = responseHandler;}
	public void setAnswer(String answer) {this.answer = answer;}
	public void setAnswerSet(String[] ara) {
		int size = answerSet.length;
		if (ara.length != size)
			throw new IllegalArgumentException("String array must have length = " + size);
		for(int i = 0; i < size; i++) {
			this.answerSet[i] = ara[i];
		}
	}
	
	public boolean validateResponse(String response) {
		return true;
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

}
