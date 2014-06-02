package MazeRoomLogic;

import java.util.Random;

import javax.swing.SwingUtilities;

import MazeGame.Maze;
import TriviaQuestions.*;

public class QuestionRoomEnterBehavior implements MazeRoomEnterBehavior {

	private static MovieTriviaQuestionFactory questionFactory = new MovieTriviaQuestionFactory();
	public static boolean isCorrect;
	//for now we are assuming that all questions are answered correctly
	@Override
	public boolean enter() {

			Thread t = new Thread(new Runnable(){
				public void run(){
					try {
						SwingUtilities.invokeLater(new Runnable(){
							@Override
							public void run() {

								MovieTriviaQuestion question = questionFactory.buildQuestion();
								question.displayPrompt();
								int i = 0;
								while(!question.isSubmitted()){
									/*i--;
									System.out.println(i++);*/
								}
								isCorrect = question.isCorrectAnswer();
							}
						});
					}catch (Exception e){
						System.out.println("Something broke:\n" + e.getMessage());
					}
				}
			
				});
		
			t.start();
		/*t.setPriority(Thread.MAX_PRIORITY);
		t.start();*//*
		while(isCorrect == null);*/
/*		try{
			t.join();
		} catch (InterruptedException e){
			
		}*/
		return isCorrect;
	}

}
