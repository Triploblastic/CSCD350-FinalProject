package MazeGame;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JPanel;
import javax.swing.Timer;

import MazeRoomLogic.MazeEnums.Direction;
import MazeRoomLogic.MazeNode;

public class Board extends JPanel implements ActionListener{

	private Timer timer;
	
	private Map m;
	private Player p;
	//private MazeNode currentRoom;
	
	public Board(){
		m=new Map();
		p=Player.getInstance();
		p.setStartLocation(m.getStartY(),m.getStartX());
		
		addKeyListener(new Al());
		setFocusable(true);
		//timer = new Timer(25, this);
		//this.timer.start();
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		repaint();
		
	}

	@Override
	public void paint(Graphics g){
		super.paint(g);

		for(int i=0; i<m.MAZE_SIZE; i++){
			for(int j=0; j<m.MAZE_SIZE; j++){
				if(m.getMapTileType(j, i).equals(MazeRoomLogic.MazeEnums.RoomType.PATH)){
					g.drawImage(m.getRoomImage(), j*32, i*32, null);
				}
				
				if(m.getMapTileType(j, i).equals(MazeRoomLogic.MazeEnums.RoomType.WALL)){
					g.drawImage(m.getWallImage(), j*32, i*32, null);
				}
				
				if(m.getMapTileType(j, i).equals(MazeRoomLogic.MazeEnums.RoomType.DOOR)){
					g.drawImage(m.getDoorImage(), j*32, i*32, null);
				}
				
				if(m.getMapTileType(j, i).equals(MazeRoomLogic.MazeEnums.RoomType.EXIT)){
					g.drawImage(m.getExitImage(), j*32, i*32, null);
				}
				
				if(m.getMapTileType(j, i).equals(MazeRoomLogic.MazeEnums.RoomType.START)){
					g.drawImage(m.getStartImage(), j*32, i*32, null);
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
				p.setDirection(Direction.NORTH);
				if(m.tryMovePlayer(Direction.NORTH))
					p.move(0, -1);
			}
			if(keycode==KeyEvent.VK_S){
				p.setDirection(Direction.SOUTH);
				if(m.tryMovePlayer(Direction.SOUTH))
					p.move(0, 1);
			}
			if(keycode==KeyEvent.VK_A){
				p.setDirection(Direction.WEST);
				if(m.tryMovePlayer(Direction.WEST))
					p.move(-1, 0);
			}
			if(keycode==KeyEvent.VK_D){
				p.setDirection(Direction.EAST);
				if(m.tryMovePlayer(Direction.EAST))
					p.move(1, 0);				
			}
			actionPerformed(null);
		}
		
		public void keyReleased(KeyEvent e){
			
		}
		
		public void keyTyped(KeyEvent e){
			
		}
	}
}
