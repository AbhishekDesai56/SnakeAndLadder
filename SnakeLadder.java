package SnakeLadder;


import java.util.*;

public class SnakeLadder {
	public static void main(String args[]) {
		System.out.println("Welcome to Snakes & Ladders");
		
		int numberOfPlayer = 1;
		
		List<Player> players = new ArrayList<Player>();
		for (int index= 0; index < numberOfPlayer; index++) {
			Player player = new Player("P" + index);
			players.add(player);
		}	
	}
}
