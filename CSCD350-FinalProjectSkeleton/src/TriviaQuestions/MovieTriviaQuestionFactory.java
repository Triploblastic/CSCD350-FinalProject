package TriviaQuestions;
import java.sql.*;

/*Connects to MovieQuoteTrivia.db.
 *Sets MovieTriviaQuestion prompt, answer & wrongAnswers
 */
class MovieTriviaQuestionFactory {
	
	private static int id = 0; //primary key for MovieQuoteTrivia.db
	private static Connection c;
	private static Statement s;
	private static ResultSet rs; //static?
	
	public static TriviaQuestion buildQuestion() {
		TriviaQuestion q = new MovieTriviaQuestion();
		try {
		connectToDatabase();
		System.out.println("connection successful");
		retrieveResultSet();
		System.out.println("query successful");
		q.setPrompt(rs.getString(2));
		q.setAnswer(rs.getString(3));
		setWrongAnswers(q);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return q;	
	}
	
	private static void connectToDatabase() throws Exception {
		Class.forName("org.sqlite.JDBC");
		c = DriverManager.getConnection("jdbc:sqlite:MovieQuoteTrivia.db");
		s = c.createStatement();
		System.out.println("Connection successfull");		
	}
	
	private static void retrieveResultSet() throws Exception {
		id++;
		String sql = "SELECT * FROM MovieTrivia WHERE id = " + id;
		rs = s.executeQuery(sql);
	}
	
	private static void setWrongAnswers(TriviaQuestion q) throws Exception {
		String[] wrongAnswers = new String[3];
		for(int i = 0; i < 3; i++)
			wrongAnswers[i] = rs.getString(i+4);
		((MovieTriviaQuestion)q).setWrongAnswers(wrongAnswers);
	}

	
	
}
