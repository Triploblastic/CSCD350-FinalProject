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
	private boolean submitAnswer = false;
	
	public TriviaQuestionPrompt() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 368);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	}
	

	/*getters*/
	public JPanel getContentPane() {return contentPane;}
	public JFrame getFrame() {return frame;}
	public String getSelection() {return selection;}

	/*setters*/
	public void setContentPane(JPanel contentPane) {this.contentPane = contentPane;}
	public void setFrame(JFrame frame) {this.frame = frame;}
	public void setSelection(String selection) {this.selection = selection;}
	public void setSubmitAnswer(boolean submitAnswer) {this.submitAnswer = submitAnswer;}

	public void displayPrompt() {
		try {this.frame.setVisible(true);} 
		catch (Exception e) {e.printStackTrace();}
	}
	
	public boolean answerSubmitted() {return this.submitAnswer;}


}
