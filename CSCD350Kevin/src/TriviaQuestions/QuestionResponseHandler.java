package TriviaQuestions;

public abstract class QuestionResponseHandler {
	private String expectedResponse;
	
	public abstract boolean validateResponse(String response);
}
