package uoa.assignment1.game;

import java.util.Scanner;

public class RunGame {   

	private static boolean gameOver = false;

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int height = Integer.parseInt(args[0]);
        int width = Integer.parseInt(args[1]);
        Game game = new Game(height, width);
        game.getMap();
        int round = 0;
		
        while (!gameOver) {
            System.out.println("Round " + round);
            round++;
            String nextInput = input.nextLine();
            game.nextRound(nextInput);

			//complete the code
		}
	}
}
