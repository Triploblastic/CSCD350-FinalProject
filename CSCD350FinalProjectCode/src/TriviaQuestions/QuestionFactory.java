package TriviaQuestions;
import java.sql.*;

/*Parent class for the factories that access their respective 
 * databases to pull tuples & create TriviaQuestion objects.*/
public abstract class QuestionFactory {
//	private int buildLimit = 0;
//	private int questionsBuilt = 0;
	
	public TriviaQuestion buildQuestion() {
		return null;
	}
	

}
