package game;

import java.util.*;

class Game {
	public static void main(String[] args) {
		System.out.println("Shall we play a game?");
		System.out.println("Press 1 for string reverser.");
		System.out.println("Press 2 for number adder.");
		System.out.println("Press 3 for prime number finder: \n");
		Scanner input = new Scanner(System.in);
		int i = input.nextInt();
		
		System.out.println(i);
	}
}