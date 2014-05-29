package MazeRoomLogic;

import java.util.Random;

import MazeGame.Player;

public class GrantPointsEffect implements PlayerEffect {

	@Override
	public void ApplyEffect() {
		Random rand = new Random();
		
		Player.getInstance().addPoints(rand.nextInt(50) + 100);
	}

}
