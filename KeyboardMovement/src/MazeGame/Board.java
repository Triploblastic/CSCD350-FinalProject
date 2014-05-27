package MazeGame;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JPanel;
import javax.swing.Timer;

import MazeGeneration.RoomType;

public class Board extends JPanel implements ActionListener{

	private Timer timer;
	
	private Map m;
	private Player p;
	//private MazeNode currentRoom;
	
	public Board(){
		m=new Map();
		p=new Player(m.getStartY(),m.getStartX());
		addKeyListener(new Al());
		setFocusable(true);
		timer = new Timer(25, this);
		this.timer.start();
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		repaint();
		
	}

	public void paint(Graphics g){
		super.paint(g);

		for(int i=0; i<m.MAZE_SIZE; i++){
			for(int j=0; j<m.MAZE_SIZE; j++){
				if(m.getMap(j, i).equals(RoomType.PATH)){
					g.drawImage(m.getRoomImage(), j*32, i*32, null);
				}
				
				if(m.getMap(j, i).equals(RoomType.WALL)){
					g.drawImage(m.getWallImage(), j*32, i*32, null);
				}
			}
		}
		
		g.drawImage(p.getPlayerImage(), p.getTileX()*32, p.getTileY()*32, null);
	}
	
	//This is where we merge our room behavior code.
	public class Al extends KeyAdapter{
		public void keyPressed(KeyEvent e){
			int keycode=e.getKeyCode();
			
			if(keycode==KeyEvent.VK_W){
				if(!m.getMap(p.getTileX(), p.getTileY()-1).equals(RoomType.WALL))
					p.move(0, -1);
			}
			if(keycode==KeyEvent.VK_S){
				if(!m.getMap(p.getTileX(), p.getTileY()+1).equals(RoomType.WALL))
					p.move(0, 1);
			}
			if(keycode==KeyEvent.VK_A){
				if(!m.getMap(p.getTileX()-1, p.getTileY()).equals(RoomType.WALL))
					p.move(-1, 0);
			}
			if(keycode==KeyEvent.VK_D){
				if(!m.getMap(p.getTileX()+1, p.getTileY()).equals(RoomType.WALL))
					p.move(1, 0);				
			}			
		}
		
		public void keyReleased(KeyEvent e){
			
		}
		
		public void keyTyped(KeyEvent e){
			
		}
	}
}
