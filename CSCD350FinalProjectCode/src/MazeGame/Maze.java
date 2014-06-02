package MazeGame;

import javax.swing.JFrame;

public class Maze {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Maze();
	}
	
	public Maze(){
		Thread t = new Thread(new Runnable(){
			public void run(){
				JFrame frame = new JFrame();
				frame.setTitle("Trivia Maze Game");
				frame.add(new Board());
				frame.setSize((int)((Map.MAZE_SIZE+.5)*32), (Map.MAZE_SIZE+1)*32);
				frame.setLocationRelativeTo(null);		
				frame.setVisible(true);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			}
		});
		//t.setPriority(Thread.MAX_PRIORITY);
		t.start();
	}
}
