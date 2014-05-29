package TriviaQuestions;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class QuestionResponseHandler {
	String answer = "";
	
	
	class SubmitListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("Submit button pressed!");
		}
		
	}
	
	class RadioButtonListener implements ActionListener {
		String currAnswer = "";
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("Radio button pressed!");
			//currAnswer = this.getText();
		}
		
	}
}
