package TriviaQuestions;

public abstract class TriviaAnswerSet {
	private QuestionResponseHandler responseHandler = null;
	
	TriviaAnswerSet() {
		responseHandler = new QuestionResponseHandler();
	}
	
	public boolean validateResponse(String response) {
		return true;
	}

	public String getAnswer() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
