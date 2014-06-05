package MazeGame;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class Maze {
	public static JFrame mainWindow;
	
	public static void main(String[] args) {
		new Maze();
	}
	
	public Maze(){
		/*SwingUtilities.invokeLater(new Runnable(){
			public void run(){*/
				
		
				mainWindow = new JFrame();
				mainWindow.setTitle("Trivia Maze Game");
				mainWindow.add(new Board());
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
