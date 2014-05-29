package TriviaQuestions;

import java.util.Random;

public class MovieTriviaQuestion extends TriviaQuestion {
	//private String quote;
	//private String answer;
	//private String[] answersArray = new String[4];
//	private MovieTriviaQuestionPrompt prompt = null;
//	private MovieTriviaAnswerSet answerSet = null;
	
	public MovieTriviaQuestion() {
		super.setTriviaQuestionPrompt(new MovieTriviaQuestionPrompt());
		super.setTriviaAnswerSet(new MovieTriviaAnswerSet());
	}

	/*getters*/
	@Override
	//public MovieTriviaQuestionPrompt getPrompt() {return this.prompt;}
	
//	public String getQuote() {return this.quote;}
//	@Override
//	public String getAnswer() {return this.answer;}
//	public String[] getAnswerArray() {
//		int size = this.answersArray.length;
//		String[] ara = new String[size];
//		for(int i = 0; i < size; i++)
//			ara[i] = this.answersArray[i];
//		return ara;
//	}
	
	/*setters*/
	//@Override
	//public void setPromptString() {prompt = new Prompt(this);}
	//public void setQuote(String s) {this.quote = s;}
	//@Override 
//	public void setAnswer(String s) {this.answer = s;}
//	public void setAnswerSet(String[] ara) {
//		int size = answersArray.length;
//		if (ara.length != size)
//			throw new IllegalArgumentException("String array must have length = " + size);
//		for(int i = 0; i < size; i++)
//			this.answersArray[i] = ara[i];
//	}

//	public void shuffleAnswerSet() {
//		int size = this.answersArray.length;
//		Random random = new Random();
//		String temp = "";
//		for(int i = 0; i < size; i++) {
//			int index = random.nextInt(size);
//			temp = this.answersArray[i];
//			this.answersArray[i] = this.answersArray[index];
//			this.answersArray[index] = temp;
//		}
//	}
	
//	public void displayPrompt()
	
//	public String toString() {
//		String answerSet = "";
//		for(int i = 0; i < this.answersArray.length; i++)
//			answerSet += "\nanswerSet[" + (i) + "] : " + this.answersArray[i]; 
//		return super.toString() + answerSet; 
//	}

	
	public void displayPrompt() {
		try {getPrompt().setVisible(true);} 
		catch (Exception e) {e.printStackTrace();}
	}
	
//	public boolean submitResponse(String response) {
//		answerSet = new TriviaAnswerSet();
//		return answerSet.validateResponse(response);
//	}
	
	
}
