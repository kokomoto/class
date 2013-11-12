//This program is HW assignment #20. It selects a random joke from a file. These jokes are from the New York Times (http://nyti.ms/vaqkb)
import java.io.*;
import java.util.*;

public class RandomJokesOkamoto {
	public static void main (String [] args) throws IOException{
		File openFile = new File ("C:\\Users\\kokamoto\\Desktop\\NewYorkJokes.txt");
		Scanner inputFile = new Scanner (openFile);

		ArrayList <String> jokeLines = new ArrayList <String>();

		Random randJokeLine = new Random();
		
		//String line = inputFile.nextLine();
		while (inputFile.hasNextLine()) {
			jokeLines.add(inputFile.nextLine()); 
		}
		inputFile.close();
		System.out.println("There are " +jokeLines.size()+ " hilarious jokes about New York City in this file. Let me select one for you.");
			
		int randJoke = randJokeLine.nextInt(jokeLines.size());
		System.out.println(jokeLines.get(randJoke));
	}
}
