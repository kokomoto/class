//This program includes a method that returns a String representing an isoscele triangle with an altitude of n. 

import java.util.*;

public class IsoscelesOkamoto {

	public static void main (String [] args) {
		Scanner input = new Scanner (System.in);
		System.out.println ("Enter a whole positive number and I'll draw an isosceles triangle of that altitude.");
		int n = input.nextInt ();
 		System.out.println (getIsosceles (n-1));
	}

	public static String getIsosceles (int n) {
		String triangle = "";
		triangle += drawFirstStarInRow (n, 0) + "\n";
		for (int row = 1; row < n; row++) {
			triangle += drawFirstStarInRow (n, row) + drawLastStarInRow (row) + "\n";
		}
		triangle += drawLastRow (n);
		return triangle;
	}

	public static String drawFirstStarInRow(int triangleHeight, int rowPosition) {
		String outerSpaces = "";
		for (int space = 0; space < triangleHeight - rowPosition; space++) {
			outerSpaces += " ";	
		}
		return outerSpaces + "*";
	}

	public static String drawLastStarInRow(int rowPosition) {
		String innerSpaces = "";
		for (int space = 0; space < 2*rowPosition -1; space++) {
			innerSpaces+=" ";
		}
		return innerSpaces + "*";
	}

	public static String drawLastRow (int rowPosition) {
		String lastRow = "";
		for (int counter = 0; counter <= 2*rowPosition; counter++)
			lastRow += "*";
		return lastRow;
	}
}