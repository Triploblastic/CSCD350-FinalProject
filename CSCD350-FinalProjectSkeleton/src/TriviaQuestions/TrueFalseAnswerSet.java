package TriviaQuestions;

public class TrueFalseAnswerSet extends TriviaAnswerSet {

	public TrueFalseAnswerSet(){
		super.responseHandler = new TrueFalseResponseHandler();
	}
	@Override
	public void displayAnswers() {
		// TODO Auto-generated method stub

	}

}
