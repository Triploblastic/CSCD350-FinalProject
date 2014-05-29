package TriviaQuestions;

public class BuildLimitExceededException extends Exception {
	
	public BuildLimitExceededException() {}
	
	public String toString() {
		return "Max number of questions built.";
	}
	
}
