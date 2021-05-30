package SnakeLadder;

public class Player {
	private String name;
	private static Die die;

	public Player(String name) {
		this.name = name;
		die = new Die();
	}

	/**
	 * This method plays out of the player's turn
	 * 
	 * @return The Number of spaces to moves on the board.
	 */
	public int takeTurn() {
		int roll = die.rollD6();
		System.out.println(name + " rolled " + roll + ".");
		return roll;
	}

	public String toString() {
		return name;
	}

}
