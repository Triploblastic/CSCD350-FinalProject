package TriviaQuestions;

import javax.swing.ButtonGroup;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

/*builds empty JFrame*/
public abstract class TriviaQuestionPrompt extends JFrame {
	protected JPanel contentPane;
	private JFrame frame;
	private String selection = null;
	private boolean submitted = false;
	
	public TriviaQuestionPrompt() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 368);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	}
	
	public void displayPrompt() {
		try {this.frame.setVisible(true);} 
		catch (Exception e) {e.printStackTrace();}
	}
	
	public boolean isSubmitted() {return this.submitted;}


}
