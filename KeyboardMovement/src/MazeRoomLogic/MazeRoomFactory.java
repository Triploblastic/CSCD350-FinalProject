package MazeRoomLogic;


import java.util.Random;

import MazeRoomLogic.DoorRoomEnterBehavior;
import MazeRoomLogic.ExitRoomEnterBehavior;
import MazeRoomLogic.MazeEnums.RoomType;
import MazeRoomLogic.MazeRoom;
import MazeRoomLogic.MazeRoomEnterBehavior;
import MazeRoomLogic.QuestionRoomEnterBehavior;
import MazeRoomLogic.StartRoomEnterBehavior;
import MazeRoomLogic.WallRoomEnterBehavior;

public class MazeRoomFactory {

	private static MazeRoomFactory instance = null;
	private static Random rand = new Random();
	
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
		result.setWinItem(getWinEffect(roomType));
		result.setLoseItem(getLoseEffect(roomType));
		return result;
	}
	
	private PlayerEffect getWinEffect(RoomType roomType) {
		PlayerEffect effect;
		switch(roomType){
		case DOOR:
			break;
		case EXIT:
			break;
		case PATH:
			if(rand.nextInt(100) < 30)
			break;
		case START:
			break;
		case WALL:
			break;
		default:
			break;
		
		}
		return effect;
	}
	
	private PlayerEffect getLoseEffect(RoomType roomType) {
		PlayerEffect effect;
		switch(roomType){
		case DOOR:
			break;
		case EXIT:
			break;
		case PATH:
			break;
		case START:
			break;
		case WALL:
			break;
		default:
			break;
		
		}
		return effect;
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
