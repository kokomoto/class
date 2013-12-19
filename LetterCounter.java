// Ch. 4 p. 267  challenge exercises 5 & 6

import java.io.*;
import java.util.*;

public class LetterCounter {
	public static void main (String [] args) throws IOException {
		System.out.println ("Enter a letter");
		String inputLetter = input.nextLine();
		char letter = inputLetter.charAt(0);
		File read = new File ("okamoto.txt");
		Scanner reader = new Scanner (read);
		while (reader.hasNext()) {
			getCharCount (reader.nextLine(), letter);
		}
		System.out.println (letterNum);

	}
	public static int getCharCount (String name, char letter) {
		int nameLength = name.length();
		String inputLetter = input.nextLine();
		char letter = inputLetter.charAt(0);
		int letterNum=0;
		for (int counter = 0; counter < nameLength; counter++) {
			if (letter == name.charAt(counter)) {
				letterNum++;
			}
		return letterNum;
	}
}

/*
public static void main (String [] args) {
		Scanner input = new Scanner (System.in);
		System.out.println ("Enter a name");
		String name = input.nextLine();
		int nameLength = name.length();
		System.out.println ("Enter a letter");
		String inputLetter = input.nextLine();
		char letter = inputLetter.charAt(0);
		int letterNum=0;
		for (int counter = 0; counter < nameLength; counter++) {
			if (letter == name.charAt(counter)) {
				letterNum++;
			}
		}
		System.out.println (name + "contains " + letterNum + letter + "s");
*/