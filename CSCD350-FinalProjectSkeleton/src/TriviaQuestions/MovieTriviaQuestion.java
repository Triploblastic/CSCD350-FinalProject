package TriviaQuestions;

public class MovieTriviaQuestion extends TriviaQuestion {
//	private String wrong1;
//	private String wrong2;
//	private String wrong3;
	private String quote;
	private String answer;
	private String[] wrongAnswers = new String[3];
	
	public MovieTriviaQuestion() {
		
	}

	public String[] getWrongAnswers() {
		return this.wrongAnswers;
	}
	
	public void setWrongAnswers(String[] ara) {
		if (wrongAnswers.length != ara.length)
			throw new IllegalArgumentException("String array must have length = " + this.wrongAnswers.length);
		for(int i = 0; i < wrongAnswers.length; i++)
			this.wrongAnswers[i] = ara[i];
			
	}
	
	public String toString() {
		String wrongAnswers = "";
		for(int i = 0; i < this.wrongAnswers.length; i++)
			wrongAnswers += "\nWrong Answer " + (i+1) + ": " + this.wrongAnswers[i]; 
		return super.toString() + wrongAnswers; 
	}
	
	

}
