package TriviaQuestions;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

/*builds empty JFrame*/
public abstract class TriviaQuestionPrompt extends JFrame {
	
	private JPanel contentPane;
	
	public TriviaQuestionPrompt() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 422, 338);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		
	}
	
	public JPanel getContentPane() {return this.contentPane;}
	
	public void displayPrompt() {
		try {this.contentPane.setVisible(true);} 
		catch (Exception e) {e.printStackTrace();}
	}


}
