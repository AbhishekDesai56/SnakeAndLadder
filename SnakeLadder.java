package SnakeLadder;

import java.util.*;

public class SnakeLadder {
	public static void main(String args[]) {
		System.out.println("Welcome to Snakes & Ladders");

		int numberOfPlayer = 2;

		List<Player> players = new ArrayList<Player>();
		for (int index = 0; index < numberOfPlayer; index++) {
			Player player = new Player("P" + index);
			players.add(player);
		}

		// Initialize the boards.
		Board board = new Board(players);

		// Loop until a player reaches the final spot.
		// Players take turns to roll the die and move on the board
		boolean done = false;
		int playerIndex = 0;
		int diceIterated = 0;
		while (!done) {
			// Player takes turn
			Player currPlayer = players.get(playerIndex);
			int roll = currPlayer.takeTurn();
			diceIterated++;
			// Update the board
			done = board.movePlayer(currPlayer, roll);

			// Print the board
			System.out.println(board);
			System.out.println("-----------------------\n");

			// If we're done, print end message.
			if (done) {
				System.out.println(
						"The number of times the dice was played: " + (diceIterated + board.isLadderTrueRollCount));
				System.out.println(currPlayer + " wins");
			}

			// Set up for next player
			playerIndex++;
			if (playerIndex == numberOfPlayer) {
				playerIndex = 0;
			}
		}
	}
}
