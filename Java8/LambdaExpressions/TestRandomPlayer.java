package LambdaExpressions;

import java.util.Random;

public class TestRandomPlayer {
	static String[] games = { "COD", "Prince Of Persia", "GTA-V5", "Valorant", "FIFA 22", "Fortnite" };
	static String[] tracks = { "Believer", "Cradles", "Taki Taki", "Sorry", "Let Me Love You" };

	public static void main(String[] args) {

		RandomPlayer player = new RandomPlayer();

		Random random = new Random();

		Runnable gameRunner = () -> {

			try {
				player.playGame(games[random.nextInt(games.length)]);
			} catch (Exception e) {
				e.getMessage();
			}
		};

		Runnable musicPlayer = () -> {
			try {
				player.playMusic(tracks[random.nextInt(tracks.length)]);
			} catch (Exception e) {
				e.getMessage();
			}
		};

		Thread game = new Thread(gameRunner);
		Thread music = new Thread(musicPlayer);

		game.start();
		music.start();

	}
}