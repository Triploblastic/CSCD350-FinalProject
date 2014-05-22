package TriviaQuestions;
import java.sql.*;

/*Parent class for the factories that access their respective 
 * databases to pull tuples & create TriviaQuestion objects.*/
public class QuestionFactory {
	
	public static TriviaQuestion buildQuestion(QuestionType type) {
		TriviaQuestion q = null;
		
		switch (type) {
		case MOVIE :
			q = MovieTriviaQuestionFactory.buildQuestion();
			break;
		}
		
		return q;
	}
	


}
