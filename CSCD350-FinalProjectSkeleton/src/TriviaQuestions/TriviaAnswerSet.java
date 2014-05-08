package TriviaQuestions;

public abstract class TriviaAnswerSet {
	protected QuestionResponseHandler responseHandler;
	
	public abstract void displayAnswers();
	public boolean validateResponse(String response){
		return responseHandler.validateResponse(response);
	}
}
