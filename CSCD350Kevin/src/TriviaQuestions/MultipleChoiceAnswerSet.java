package TriviaQuestions;

public class MultipleChoiceAnswerSet extends TriviaAnswerSet {

	public MultipleChoiceAnswerSet(){
		super.responseHandler = new MultipleChoiceResponseHandler();
	}
	@Override
	public void displayAnswers() {
		// TODO Auto-generated method stub

	}

}
