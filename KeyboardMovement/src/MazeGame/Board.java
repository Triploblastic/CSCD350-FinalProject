package MazeGame;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JPanel;
import javax.swing.Timer;

public class Board extends JPanel implements ActionListener{

	private Timer timer;
	
	private Map m;
	private Player p;
	
	public Board(){
		m=new Map();
		p=new Player();
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

		for(int i=0; i<14; i++){
			for(int j=0; j<14; j++){
				if(m.getMap(j, i).equals("g")){
					g.drawImage(m.getGrass(), j*32, i*32, null);
				}
				
				if(m.getMap(j, i).equals("w")){
					g.drawImage(m.getWall(), j*32, i*32, null);
				}
			}
		}
		
		g.drawImage(p.getPlayer(), p.getTileX()*32, p.getTileY()*32, null);
	}
	
	public class Al extends KeyAdapter{
		public void keyPressed(KeyEvent e){
			int keycode=e.getKeyCode();
			
			if(keycode==KeyEvent.VK_W){
				if(!m.getMap(p.getTileX(), p.getTileY()-1).equals("w"))
					p.move(0, -1);
			}
			if(keycode==KeyEvent.VK_S){
				if(!m.getMap(p.getTileX(), p.getTileY()+1).equals("w"))
					p.move(0, 1);
			}
			if(keycode==KeyEvent.VK_A){
				if(!m.getMap(p.getTileX()-1, p.getTileY()).equals("w"))
					p.move(-1, 0);
			}
			if(keycode==KeyEvent.VK_D){
				if(!m.getMap(p.getTileX()+1, p.getTileY()).equals("w"))
					p.move(1, 0);				
			}			
		}
		
		public void keyReleased(KeyEvent e){
			
		}
		
		public void keyTyped(KeyEvent e){
			
		}
	}
}
