package MazeRoomLogic;

import MazeGame.Player;

public class IncreaseHealthEffect implements PlayerEffect {

	@Override
	public void ApplyEffect() {
		Player.getInstance().increaseHealth();
	}

}
