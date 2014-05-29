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
	private JPanel contentPane;
	private JLabel prompt;
	private JRadioButton option1, option2, option3, option4;

	public MovieTriviaQuestionPrompt() {
		this.contentPane = (JPanel) super.getContentPane();
		
		/*creating radio buttons*/
		option1 = new JRadioButton();
		option1.setBounds(12, 75, 236, 25);
		contentPane.add(option1);
		//option1.addActionListener(new RadioButtonListener());
		
		option2 = new JRadioButton();
		option2.setBounds(12, 116, 220, 25);
		contentPane.add(option2);
		//option2.addActionListener(new RadioButtonListener());
		
		option3 = new JRadioButton();
		option3.setBounds(12, 159, 220, 25);
		contentPane.add(option3);
		//option3.addActionListener(new RadioButtonListener());
		
		option4 = new JRadioButton();
		option4.setBounds(12, 200, 220, 25);
		contentPane.add(option4);
		//option4.addActionListener(new RadioButtonListener());
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(151, 234, 97, 25);
		contentPane.add(btnSubmit);
		//btnSubmit.addActionListener(new SubmitListener());
		
		/*grouping radio buttons*/
		ButtonGroup radioButtons = new ButtonGroup();
		radioButtons.add(option1); radioButtons.add(option2);
		radioButtons.add(option3); radioButtons.add(option4);
		
		/*creating quote prompt*/
		prompt = new JLabel("<html>" +"put quote here" + "</html>");
		prompt.setBounds(12, 13, 380, 54);
		contentPane.add(prompt);
	}

	public void setPrompt(String prompt) {this.prompt.setText(prompt);}
	
	public void setRadioButtons(String[] answerSet) {
		option1.setText(answerSet[0]);
		option2.setText(answerSet[1]);
		option3.setText(answerSet[2]);
		option4.setText(answerSet[3]);
	}
//	class SubmitListener implements ActionListener {
//
//		@Override
//		public void actionPerformed(ActionEvent e) {
//			System.out.println("Submit button pressed!");
//		}
//		
//	}
//	
//	class RadioButtonListener implements ActionListener {
//		String currAnswer = "";
//		@Override
//		public void actionPerformed(ActionEvent e) {
//			System.out.println("Radio button pressed!");
//			//currAnswer = this.getText();
//		}
//		
//	}
}
