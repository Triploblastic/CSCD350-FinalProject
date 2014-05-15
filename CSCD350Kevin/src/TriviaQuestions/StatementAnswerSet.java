package TriviaQuestions;

public class StatementAnswerSet extends TriviaAnswerSet {

	public StatementAnswerSet(){
		super.responseHandler = new StatementResponseHandler();
	}
	
	@Override
	public void displayAnswers() {
		// TODO Auto-generated method stub

	}

}
