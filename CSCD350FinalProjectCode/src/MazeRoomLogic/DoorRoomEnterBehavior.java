package MazeRoomLogic;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import MazeGame.Maze;

public class DoorRoomEnterBehavior implements MazeRoomEnterBehavior {

	ImageIcon keyIco = new ImageIcon("key.png");
	//assume that all doors are unlocked right now
	@Override
	public boolean enter() {
		Object[] options = new Object[]{"Yes","No"};
		int n = JOptionPane.showOptionDialog(Maze.mainWindow, "Would you like to use a key to open this door?", "Open Door?", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, keyIco, options, options[1]);
		
		return n == 0;
	}

}
