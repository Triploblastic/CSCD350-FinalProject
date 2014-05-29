package TriviaQuestions;
import java.sql.*;

/*Sets MovieTriviaQuestion prompt, answer & answerSet*/
public class MovieTriviaQuestionFactory extends QuestionFactory {
	private MovieTriviaDatabaseManager dbManager = new MovieTriviaDatabaseManager();
//	private int buildLimit = 0;
//	private int questionsBuilt = 0;
//	
	public MovieTriviaQuestionFactory() {
		try {
			dbManager.connectToDatabase();
			//buildLimit = dbManager.getTupleCount();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public TriviaQuestion buildQuestion() {
		
//		if (questionsBuilt >= buildLimit)
//			throw new BuildLimitExceededException();
//		else questionsBuilt++;
		
		MovieTriviaQuestion q = new MovieTriviaQuestion();
		MovieTriviaAnswerSet a = (MovieTriviaAnswerSet) q.getAnswerSet();
		MovieTriviaQuestionPrompt p = (MovieTriviaQuestionPrompt)q.getPrompt();
		
		try {
			//System.out.println("connection successful");
			ResultSet rs = dbManager.getRandomTuple();
			//System.out.println("query successful");
			a.setAnswer(rs.getString(3));
			System.out.println("setAnswer()");
			setAnswerSet(a, rs);
			System.out.println("setAnswerSet()");
			p.setPrompt(rs.getString(2));
			System.out.println("setPrompt()");
			p.setRadioButtons(a.getAnswerSet());
			System.out.println("setRadioButtons()");
			//((MovieTriviaResponseHandler)a.getResponseHandler()).setResponseHandlerButtons(p);
			System.out.println("setResponseHandlerButtons()");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return q;	
	}
	
	/*creates randomly ordered answerSet from what the data base query returned*/
	private static void setAnswerSet(MovieTriviaAnswerSet a, ResultSet rs) throws Exception {
		String[] answerSet = new String[4];
		for(int i = 0; i < 4; i++)
			answerSet[i] = rs.getString(i+3);
		System.out.println("starting to setAnswerset");
		a.setAnswerSet(answerSet);
		System.out.println("setAnswerSet(inner)");
		a.shuffleAnswerSet();
	}
	
}
