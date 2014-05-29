package TriviaQuestions;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.TextArea;

import javax.swing.JRadioButton;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;

public class MovieTriviaQuestionPrompt extends TriviaQuestionPrompt {
	private JFrame pathFrame;
	private JLabel prompt;
	private JRadioButton option1, option2, option3, option4;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	public MovieTriviaQuestionPrompt() {

		prompt = new JLabel("New label");
		prompt.setBounds(48, 13, 335, 60);
		contentPane.add(prompt);
		
		option1 = new JRadioButton("New radio button");
		buttonGroup.add(option1);
		option1.setBounds(27, 94, 356, 25);
		contentPane.add(option1);
		
		option2 = new JRadioButton("New radio button");
		buttonGroup.add(option2);
		option2.setBounds(27, 124, 356, 25);
		contentPane.add(option2);
		
		option3 = new JRadioButton("New radio button");
		buttonGroup.add(option3);
		option3.setBounds(27, 154, 356, 25);
		contentPane.add(option3);
		
		option4 = new JRadioButton("New radio button");
		buttonGroup.add(option4);
		option4.setBounds(27, 184, 356, 25);
		contentPane.add(option4);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.setBounds(163, 249, 97, 25);
		contentPane.add(btnNewButton);
	}

	public void setPrompt(String prompt) {this.prompt.setText("<html>" + prompt + "</html>");}
	
	public void setRadioButtons(String[] answerSet) {
		option1.setText(answerSet[0]);
		option2.setText(answerSet[1]);
		option3.setText(answerSet[2]);
		option4.setText(answerSet[3]);
	}
	
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
