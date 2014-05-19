package GameEntities;

import Maze.MazeEnums.RoomType;
import Maze.*;

public class MazeRoomFactory {

	private static MazeRoomFactory instance = null;
	
	private MazeRoomFactory(){
		
	}
	
	public static MazeRoomFactory getInstance(){
		if(instance == null){
			instance = new MazeRoomFactory();
		}
		return instance;
	}
	
	public MazeRoom getMazeRoom(RoomType roomType){
		MazeRoom result = new MazeRoom();
		result.setEnterBehavior(getBehavior(roomType));
		result.setItem(getItem());
		return result;
	}
	
	private Item getItem() {
		return new Item();
	}
	
	private MazeRoomEnterBehavior getBehavior(RoomType roomType){
		MazeRoomEnterBehavior enterBehavior;
		switch(roomType){
		case DOOR:
			enterBehavior = new DoorRoomEnterBehavior();
			break;
		case EXIT:
			enterBehavior = new ExitRoomEnterBehavior();
			break;
		case PATH:
			enterBehavior = new QuestionRoomEnterBehavior();
			break;
		case START:
			enterBehavior = new StartRoomEnterBehavior();
			break;
		case WALL:
			enterBehavior = new WallRoomEnterBehavior();
			break;
		default:
			enterBehavior = new WallRoomEnterBehavior();
		}
		return enterBehavior;
	}
}
