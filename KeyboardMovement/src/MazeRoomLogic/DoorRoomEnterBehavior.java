package MazeRoomLogic;

public class DoorRoomEnterBehavior implements MazeRoomEnterBehavior {

	//assume that all doors are unlocked right now
	@Override
	public boolean enter() {
		return true;
	}

}
