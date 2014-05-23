package TriviaQuestions;
import java.sql.*;

/*Sets MovieTriviaQuestion prompt, answer & answerSet*/
public class MovieTriviaQuestionFactory implements QuestionFactory {
	private MovieTriviaDatabaseManager dbManager = new MovieTriviaDatabaseManager();
	private int buildLimit = 0;
	private int questionsBuilt = 0;
	
	public MovieTriviaQuestionFactory() {
		try {
			dbManager.connectToDatabase();
			buildLimit = dbManager.getTupleCount();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public TriviaQuestion buildQuestion() throws BuildLimitExceededException {
		questionsBuilt++;
		if (questionsBuilt > buildLimit)
			throw new BuildLimitExceededException();
		MovieTriviaQuestion q = new MovieTriviaQuestion();
		try {
		//System.out.println("connection successful");
		ResultSet rs = dbManager.getRandomTuple();
		//System.out.println("query successful");
		q.setPrompt(rs.getString(2));
		q.setAnswer(rs.getString(3));
		setAnswerSet(q, rs);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return q;	
	}
	
	/*creates randomly ordered answerSet from what the data base query returned*/
	private static void setAnswerSet(MovieTriviaQuestion q, ResultSet rs) throws Exception {
		String[] answerSet = new String[4];
		//answerSet[0] = q.getAnswer();
		for(int i = 0; i < 4; i++)
			answerSet[i] = rs.getString(i+3);
		q.setAnswerSet(answerSet);
		q.shuffleAnswerSet();
	}
	
}
