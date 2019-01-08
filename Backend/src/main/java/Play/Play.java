package src.main.java.Play;

import java.util.Scanner;

import src.main.java.Model.Board;

public class Play {
	
	public static void main(String[] args) {
		int currentPlayer;
		int turn = -1;
		
		Board gameBoard = new Board();

		gameBoard.print();
		
		while(true) {
			
			turn++;
			currentPlayer = turn % 2 + 1;
			System.out.println("Player " + currentPlayer + "'s turn\n");
			Scanner reader = new Scanner(System.in);  // Reading from System.in
			System.out.println("Enter a row: ");
			int x = reader.nextInt(); // Scans the next token of the input as an int.
			System.out.println("Enter a column: ");
			int y = reader.nextInt(); // Scans the next token of the input as an int.
			
			System.out.println("piece added: " + x + "," + y);

		}
	}
}
