package TriviaQuestions;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;

public class MovieTriviaQuestionPrompt extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JFrame pathFrame;
	private JLabel prompt;
	private JButton submit; 
	private JRadioButton option1, option2, option3, option4;
	private ActionListener radioListener = new RadioButtonListener();
	private ActionListener submitListener = new SubmitListener();
	private String selection = null;
	private boolean submitted = false;
	/**
	 * Create the frame.
	 */
	public MovieTriviaQuestionPrompt() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		prompt = new JLabel("New label");
		prompt.setBounds(44, 24, 345, 41);
		contentPane.add(prompt);
		
		option1 = new JRadioButton("New radio button");
		buttonGroup.add(option1);
		option1.setBounds(44, 72, 199, 23);
		contentPane.add(option1);
		
		option2 = new JRadioButton("New radio button");
		buttonGroup.add(option2);
		option2.setBounds(44, 98, 199, 23);
		contentPane.add(option2);
		
		option3 = new JRadioButton("New radio button");
		buttonGroup.add(option3);
		option3.setBounds(44, 122, 199, 23);
		contentPane.add(option3);
		
		option4 = new JRadioButton("New radio button");
		buttonGroup.add(option4);
		option4.setBounds(44, 148, 199, 23);
		contentPane.add(option4);
		
		submit = new JButton("Submit");
		submit.setBounds(154, 210, 89, 23);
		contentPane.add(submit);
	}

	/*getters*/
	public JRadioButton getOption1() {return this.option1;}
	public JRadioButton getOption2() {return this.option2;}
	public JRadioButton getOption3() {return this.option3;}
	public JRadioButton getOption4() {return this.option4;}
	public JButton getSubmit() {return this.submit;}
	
	/*setters*/
	public void setPrompt(String prompt) {this.prompt.setText("<html>" + prompt + "</html>");}
	public void setRadioButtons(String[] answerSet) {
		option1.setText(answerSet[0]);
		option2.setText(answerSet[1]);
		option3.setText(answerSet[2]);
		option4.setText(answerSet[3]);
	}
	
	public void displayPrompt() {
		try {this.setVisible(true);} 
		catch (Exception e) {e.printStackTrace();}
	}
	
	public String getSelection() {return this.selection;}
	

	public boolean isSubmitted() {return this.submitted;}
	
	class SubmitListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			submitted = true;
		}
	}
	
	class RadioButtonListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == option1) 
				selection = option1.getText();
			if (e.getSource() == option2) 
				selection = option2.getText();
			if (e.getSource() == option3) 
				selection = option3.getText();
			if (e.getSource() == option4) 
				selection = option4.getText();
			System.out.print(selection);
		}	
	}
}

