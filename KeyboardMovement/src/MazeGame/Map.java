package MazeGame;

import java.awt.Image;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.ImageIcon;

public class Map {

	private Scanner fin;
	private String fileName="map.txt";
	private String Map[]=new String[14];
	private Image grass, wall;
	
	public Map(){
		
		ImageIcon img=new ImageIcon("grass.png");
		grass=img.getImage();
		
		img=new ImageIcon("wall.png");
		wall=img.getImage();
		
		openFile();
		readFile();
		closeFile();
	}
	
	public Image getGrass(){
		return grass;
	}
	
	public Image getWall(){
		return wall;
	}

	private void closeFile() {
		fin.close();
	}
	
	public String getMap(int x, int y){
		return Map[y].substring(x, x+1);
	}

	private void readFile() {
		while(fin.hasNext()){
			for(int i=0; i<14; i++){
				Map[i]=fin.next();
			}
		}
	}

	private void openFile() {
		try {
			fin = new Scanner(new File(fileName));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
