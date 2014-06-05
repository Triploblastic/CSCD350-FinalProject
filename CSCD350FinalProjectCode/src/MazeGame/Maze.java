package MazeGame;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class Maze {
	public static JFrame mainWindow;
	private JPanel boardContent;
	private static Maze instance;
	
	public static void main(String[] args) {
		new Maze();
	}
	
	public static Maze getInstance(){
		if (instance == null){
			instance = new Maze();
		}
		return instance;
	}
	
	public void setBoardContent(){
		mainWindow.setContentPane(boardContent);
		mainWindow.repaint();
	}
	
	private Maze(){
		/*SwingUtilities.invokeLater(new Runnable(){
			public void run(){*/
				
				boardContent = new Board();
				
				mainWindow = new JFrame();
				mainWindow.setTitle("Trivia Maze Game");
				mainWindow.add(boardContent);
				mainWindow.setSize((int)((Map.MAZE_SIZE+.3)*32), (Map.MAZE_SIZE+3)*32);
				mainWindow.setResizable(false);
				mainWindow.setLocationRelativeTo(null);		
				mainWindow.setVisible(true);
				mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			/*}
		});*/
		//t.setPriority(Thread.MAX_PRIORITY);
		
	}
}
