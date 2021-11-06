package uoa.assignment1.game;

import uoa.assignment1.game.Game;

public class RunGame {

	private static boolean gameOver = false;
    public Game game;

	public static void main(String[] args) {
        int height = Integer.parseInt(args[0]);
        int width = Integer.parseInt(args[1]);
        Game game = new Game(height, width);
        game.getMap();
		
        while (!gameOver) {
			//complete the code
		}
	}

}
