package TriviaQuestions;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.LayoutManager;

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
import javax.swing.JDialog;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;

public class MovieTriviaQuestionPrompt extends JDialog {
	protected JPanel contentPane;
	private JLabel quote;
	private JButton submit; 
	private JRadioButton option1, option2, option3, option4;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private ActionListener radioListener = new RadioButtonListener();
	private ActionListener submitListener = new SubmitListener();
	private String selection = null;
	private boolean submitted = false;
	

	public MovieTriviaQuestionPrompt() {
		setDefaultCloseOperation(JDialog.HIDE_ON_CLOSE);
		setBounds(100, 100, 450, 368);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		add(contentPane);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setFocusable(true);
		
		quote = new JLabel("New label");
		quote.setBounds(48, 13, 335, 60);
		contentPane.add(quote);
		
		option1 = new JRadioButton("New radio button");
		buttonGroup.add(option1);
		option1.setBounds(27, 94, 356, 25);
		option1.addActionListener(radioListener);
		contentPane.add(option1);
		
		option2 = new JRadioButton("New radio button");
		buttonGroup.add(option2);
		option2.setBounds(27, 124, 356, 25);
		option2.addActionListener(radioListener);
		contentPane.add(option2);
		
		option3 = new JRadioButton("New radio button");
		buttonGroup.add(option3);
		option3.setBounds(27, 154, 356, 25);
		option3.addActionListener(radioListener);
		contentPane.add(option3);
		
		option4 = new JRadioButton("New radio button");
		buttonGroup.add(option4);
		option4.setBounds(27, 184, 356, 25);
		option4.addActionListener(radioListener);
		contentPane.add(option4);
		
		submit = new JButton("Submit");
		submit.setBounds(163, 249, 97, 25);
		submit.addActionListener(submitListener);
		contentPane.add(submit);
	}

	/*getters*/
	public JButton getSubmit() {return this.submit;}
	
	/*setters*/
	public void setPrompt(String prompt) {
		this.quote.setText("<html>" + prompt + "</html>");}
	public void setRadioButtons(String[] answerSet) {
		option1.setText(answerSet[0]);
		option2.setText(answerSet[1]);
		option3.setText(answerSet[2]);
		option4.setText(answerSet[3]);
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
