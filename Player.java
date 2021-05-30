package SnakeLadder;

public class Player {
	private String name;
	private static Die die;
	
	public Player(String name) {
		die = new Die();
		this.name = name;
	}
	
}
