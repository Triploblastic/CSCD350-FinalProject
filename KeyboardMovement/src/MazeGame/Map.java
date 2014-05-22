package MazeGame;

import java.awt.Image;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.ImageIcon;

import MazeGeneration.EnumMaze;
import MazeGeneration.RoomType;

public class Map {

	private Scanner fin;
	private String fileName="map.txt";
	//private String Map[]=new String[14];
	private RoomType[][] Map = new RoomType[MAZE_SIZE][MAZE_SIZE];
	private EnumMaze mazeGen;
	private Image room, wall;
	public static final int MAZE_SIZE = 15;
	
	
	public Map(){
		
		ImageIcon img=new ImageIcon("grass.png");
		room=img.getImage();
		
		img=new ImageIcon("wall.png");
		wall=img.getImage();
		
		
		
		mazeGen = new EnumMaze(MAZE_SIZE);
		Map = mazeGen.getMaze();
		
		/*
		openFile();
		readFile();
		closeFile();
		*/
	}
	
	public Image getRoomImage(){
		return room;
	}
	
	public Image getWallImage(){
		return wall;
	}
	
	public int getStartX(){
		return mazeGen.getStart()[0];
	}
	
	public int getStartY(){
		return mazeGen.getStart()[1];
	}
	
	public RoomType getMap(int x, int y){
		return Map[y][x];
	}

	/*
	private void readFile() {
		while(fin.hasNext()){
			for(int i=0; i<MAZE_SIZE; i++){
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
	
	private void closeFile() {
		fin.close();
	}
	*/
}
