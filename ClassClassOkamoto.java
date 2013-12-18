/*A class that represents a college class with class name, section, number of students, etc.
*/ 
import java.io.*;
import java.util.*;

public class ClassClassOkamoto {
	private String className;
	private int section;
	private int numStudents;
	private int maxGrade;
	private int avgGrade;
	private int lowestGrade;
	private int numA;
	private int numB;
	private int numC;
	private int numD;
	private int numF;

	public String getClassName () {
		return className;
	}

	public int getSection () {
		return section;
	}

	public int getNumStudents () {
		return numStudents;
	}

	public int getMaxGrade () {
		return maxGrade;
	}

	public int getAvgGrade () {
		return avgGrade;
	}

	public int getLowestGrade () {
		return lowestGrade;
	}

	public int getNumA () {
		return numA;
	}

	public int getNumB () {
		return numB;
	}

	public int getNumC () {
		return numC;
	}

	public int getNumD () {
		return numD;
	}

	public int getNumF () {
		return numF;
	}
	// mutator methods for all fields
	public void setClassName (String name) {
		className = name;
	}

	public void setSection (int sect) {
		section = sect;
	}

	public void setNumStudents (int students) {
		numStudents = students;
	}
	// need to call method that reads from file, and call max max method
	public void setMaxGrade (int mGr) {
		maxGrade = mGr;
	}
	// call read file method
	public void setAvgGrade (int avgGr) {
		avgGrade = avgGr;
	}
	// call read file method and use a modified max max method
	public void setLowestGrade (int lowGr) {
		lowestGrade = lowGr;
	}

	public void setNumA (int numberAs) {
		numA = numberAs;
	}

	public void setNumB (int numberBs) {
		numB = numberBs;
	}

	public void setNumC (int numberCs) {
		numC = numberCs;
	}

	public void setNumD (int numberDs) {
		numD = numberDs;
	}

	public void getNumF (int numberFs) {
		numF = numberFs;
	}

	// A method that returns the # of students below/above a letter grade
	// But if this is a letter grade of B, are you returning the number below or above??
	public int calcBelowGrade (char letterGrade) {
		if (letterGrade =='a'|| letterGrade == 'A') {
			return numB + numC + numD + numE + numF;
		}
		else if (letterGrade == 'b' || letterGrade == 'B') {
			return numC + numD + numE + numF;
		}
		else if (letterGrade == 'c' || letterGrade == 'C') {
			return numD + numE + numF;
		}
		else if (letterGrade == 'd' || letterGrade 'D') {
			return numE + numF;
		}
		else if (letterGrade == 'e' || letterGrade == 'E') {
			return numF;
		}
		else if (letterGrade == 'f' || letterGrade == 'F'){
			return 0;
		}
		else {
			return -1;
		}

	}

	// A method that returns the % of students with A, B, C..


	// A toString method that converts all the info in the class to a string
	public String toString() {
		String str = 	"Class name: " + className + 
						"\n Section: " + section +
						"\n Number of students: " + numStudents +
						"\n Maximum grade: " + maxGrade +
						"\n Average grade: " + avgGrade +
						"\n Lowest grade: " + lowestGrade +
						"\n Number of As: " + numA +
						"\n Number of Bs: " + numB +
						"\n Number of Cs: " + numC +
						"\n Number of Ds: " + numD +
						"\n Number of Fs: " + numF; 
		return str;
	}

	// a method that saves all the info to a file
	//what info would this be? grades 
	public void writeFile (String outputFileName, int grade) throws IOException {
		FileWriter write = new FileWriter (outputFileName, true);
		PrintWriter printer = new PrintWriter (write);
			printer.println (grade);
		printer.close();
	}


	// A method that reads all the info from a file (File and Scanner classes)
	// ???? add anything else e.g. saving data to a variable???? 
	public void readFile (String inputFileName) throws IOException {
		File reader = new File (inputFileName);
		Scanner read = new Scanner (reader);
		while (read.hasNext()) {
		}
		read.close();
	}
}