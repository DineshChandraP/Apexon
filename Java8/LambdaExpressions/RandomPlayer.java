package LambdaExpressions;

import java.util.Random;

public class RandomPlayer {

	public void playGame(String gameName) throws InterruptedException {

		System.out.println(gameName + " Game started");
		Thread.sleep(100);
		System.out.println(gameName + " Game ended");
	}

	public void playMusic(String musicName) throws InterruptedException {

		System.out.println(musicName + " Music started");
		Thread.sleep(100);
		System.out.println(musicName + " Music ended");
	}
}


