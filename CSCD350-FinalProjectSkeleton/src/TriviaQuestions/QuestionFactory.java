package TriviaQuestions;
import java.sql.*;

/*Parent class for the factories that access their respective 
 * databases to pull tuples & create TriviaQuestion objects.*/
public interface QuestionFactory {
	
	public TriviaQuestion buildQuestion() throws BuildLimitExceededException;
	
	public class BuildLimitExceededException extends Exception {
		
		public BuildLimitExceededException() {}
		
		public String toString() {
			return "Max number of questions built.";
		}
		
	}

}
