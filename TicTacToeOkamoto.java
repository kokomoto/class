/**Plays Tic Tac Toe with a user.
*/ 
import java.util.*;

public class TicTacToeOkamoto { 
	
	public static void main (String [] args) {
		char [][] boxes = new char [4] [4];
			for (int row = 0; row <4; row++) {
				for (int col = 0; col<4; col++) {
				boxes[row][col]=' ';
				}
			}
			boxes [0][1] = '1';
			boxes [0][2] = '2';
			boxes [0][3] = '3';
			boxes [1][0] = '1';
			boxes [2][0] = '2';
			boxes [3][0] = '3';

		printGrid(boxes);
		while (true) {
			nextUserMove(boxes);
			if (isWinner (boxes, 'o')) {
				System.out.println ("You win!");
				break;
			}
			if (isGameOver (boxes)) {
				System.out.println ("Game over.");
				break;
			}
			printGrid(boxes);

			playComputer(boxes);
			if (isWinner (boxes,'x')) {
				System.out.println ("The computer wins!");
				break;
			}
			if (isGameOver (boxes)) {
				System.out.println ("Game over.");
				break;
			}
			printGrid(boxes);
		}

	}

// A method that prints grid coordinates 

	public static void printGrid (char [][] boxes) {
		for (int row = 0; row <4; row++) {
			for (int col = 0; col<4; col++) {		
				System.out.print(boxes[row][col]);
			}
			System.out.println();
		}		
	} 


// assign user's next move to a cell, calls the validation method and the win-check method 
	public static void nextUserMove(char [][] boxes) {
		Scanner input = new Scanner (System.in);
		int row, column;
		do {
			System.out.println("Enter the coordinates for the box you want to put an O in." +  
				"Please enter the row number first followed by a space then the column number");
			row = input.nextInt();
			column = input.nextInt();
		} while (!isValidMove (boxes, row, column));
		boxes [row][column] = 'o';
	}

// the computer plays its turn, randomly, calls the validation method and the win-check method
	public static void playComputer (char [][] boxes) {
		Random rand = new Random ();
		int row, column;
		do {
			row = rand.nextInt(3) + 1;
			column = rand.nextInt(3) +1;
		} while (!isValidMove (boxes, row, column));
		boxes [row][column] = 'x';
	}

	public static boolean isGameOver (char [][] boxes) {
		for (int row = 1; row <4; row++) {
			for (int col = 0; col<4; col++) {
				if (boxes[row][col] == ' ') {
					return false;
				}
			} 
		}
		return true;
	}

// Validation method(s) that make(s) a user or the computer enter a move to an empty cell. 
	public static boolean isValidMove (char [][] boxes, int row, int column) {
		return boxes [row][column] == ' ';
	}

	public static boolean isWinner (char [][] boxes, char letter) {
		if (boxes [1][1] == letter && boxes [1][2] == letter && boxes [1][3] == letter) {
			return true;
		}
		else if (boxes [2][1] == letter && boxes [2][2] == letter && boxes [2][3] == letter) {
			return true;
		}
		else if (boxes [3][1] == letter && boxes [3][2] == letter && boxes [3][3] == letter) {
			return true;
		}
		else if (boxes[1][1] == letter && boxes [2][1] == letter && boxes [3][1] == letter) {
			return true;
		}
		else if (boxes [1][2] == letter && boxes [2][2] == letter && boxes [3][2] == letter) {
			return true;
		}
		else if (boxes [1][3] == letter && boxes [2][3] == letter && boxes [3][3] == letter) {
			return true;
		}
		else if (boxes [1][1] == letter && boxes [2][2] == letter && boxes [3][3] == letter) {
			return true;
		}
		else if (boxes [3][1] == letter && boxes [2][2] == letter && boxes [1][3] == letter) {
			return true;
		}
		else {
			return false; 
		}
	}
}