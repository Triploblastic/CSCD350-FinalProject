package MazeRoomLogic;

import MazeGame.Player;

public class GrantKeyEffect implements PlayerEffect {

	@Override
	public void ApplyEffect() {
		Player.getInstance().addKey();
	}

}
