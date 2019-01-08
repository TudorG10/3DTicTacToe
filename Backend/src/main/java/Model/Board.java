package src.main.java.Model;

public class Board {

	private int[][][] gameBoard;
	private int[][] availableSpot;

	public int[][][] getGameBoard() {
		return gameBoard;
	}	
	public void setGameBoard(int x, int y, int z, int player) {
		 gameBoard[x][y][z] = player;
	}

	public int getAvailableSpot(int x, int y) {
		return availableSpot[x][y];
	}

	public void setAvailableSpot(int x, int y) {
		this.availableSpot[x][y] = this.availableSpot[x][y] += 1;
	}


	public Board() {
		this.gameBoard = new int[3][3][3];
		this.availableSpot = new int[3][3];

	}

	public void print(){
		for(int k = 0; k < 3; k++) {
			System.out.println(" "+k+" | 0 | 1 | 2 |");
			System.out.println("---+---+---+---+");
			for (int i = 0; i < 3; i++){
				System.out.print( " " + i + " |");
				for (int j = 0; j < 3; j++){
					if (gameBoard[j][i][k] == 0){
						System.out.print("   |");
					}
					else{
						System.out.print(" "+ gameBoard[j][i][k]+" |");
					}
				}
				System.out.println("\n---+---+---+---+");
			}
			System.out.println();
		}
	}

}
