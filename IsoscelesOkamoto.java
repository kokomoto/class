//This program includes a method that returns a String representing an isoscele triangle with an altitude of n. This is assignment #25.

import java.util.*;

public class IsoscelesOkamoto {

	// Interacts with the user; asks for n, altitude and displays the triangle. 
	public static void main (String [] args) {
		Scanner input = new Scanner (System.in);
		System.out.println ("Enter a whole positive number and I'll draw an isosceles triangle of that altitude.");
		int n = input.nextInt ();
 		System.out.println (getIsosceles (n-1)); // -1 because we treat the last line differently.
	}

	public static String getIsosceles (int n) {
		String triangle = drawFirstStarInRow (n, 0) + "\n"; // Start at the top, row 0
		for (int row = 1; row < n; row++) {
			triangle += drawFirstStarInRow (n, row) + drawLastStarInRow (row) + "\n"; //Add side stars
		}
		triangle += drawLastRow (n);
		return triangle;
	}

	public static String drawFirstStarInRow(int triangleHeight, int rowPosition) {
		String outerSpaces = "";
		// Add (n - row) spaces on the left of the triangle.
		for (int space = 0; space < triangleHeight - rowPosition; space++) {
			outerSpaces += " ";	
		}
		return outerSpaces + "*";
	}

	public static String drawLastStarInRow(int rowPosition) {
		String innerSpaces = "";
		/* 2*rowPosition -1 is the width of the triangle. The width of an isosceles triangle is twice its height. And -1 to not count the central column twice. 
		*/
		for (int space = 0; space < 2*rowPosition - 1; space++) {
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