package src.main.java.Model;

public class Board {
	
	private int[][][] gameBoard;
	private int[][] availableSpot;

	public int[][][] getGameBoard() {
		return gameBoard;
	}

	public int getAvailableSpot(int x, int y) {
		return availableSpot[y][x];
	}

	public void setAvailableSpot(int x, int y) {
		this.availableSpot[y][x] = this.availableSpot[y][x] += 1;
	}


	public Board() {
		int[][][] gameBoard = new int[3][3][3];
		int[][] availableSpot = new int[3][3];

	}

}
