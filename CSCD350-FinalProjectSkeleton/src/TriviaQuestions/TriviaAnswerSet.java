package TriviaQuestions;

public abstract class TriviaAnswerSet {
	private TriviaResponseHandler responseHandler = null;
	
	TriviaAnswerSet() {}
	
	public boolean validateResponse(String response) {
		return true;
	}

	public String getAnswer() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
