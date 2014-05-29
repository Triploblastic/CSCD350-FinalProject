package MazeRoomLogic;

import java.util.Random;

public class QuestionRoomEnterBehavior implements MazeRoomEnterBehavior {

	//for now we are assuming that all questions are answered correctly
	@Override
	public boolean enter() {
		// TODO Auto-generated method stub
		Random rand = new Random();
		return rand.nextInt(100) < 80;
	}

}
