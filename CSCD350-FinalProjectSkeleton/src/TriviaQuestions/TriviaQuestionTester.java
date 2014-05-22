package TriviaQuestions;
//I made a change
public class TriviaQuestionTester {
	
	public static void maint(String[] args) {
	TriviaQuestion q1 = QuestionFactory.buildQuestion(QuestionType.MOVIE);
	System.out.print(q1.toString());
	}

}
