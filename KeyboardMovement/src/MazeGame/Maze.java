package MazeGame;

import javax.swing.JFrame;

public class Maze {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Maze();
	}
	
	public Maze(){
		JFrame frame = new JFrame();
		frame.setTitle("Maze Game");
		frame.add(new Board());
		frame.setSize(464, 484);
		frame.setLocationRelativeTo(null);		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
