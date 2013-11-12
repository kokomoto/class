//This program allows a user to add, modify and search for student names and grades in a file. This is homework assignment #21. 
import java.util.*;
import java.io.*;

public class GradeChangeOkamoto {
	public static void main (String [] args) throws IOException {
		Scanner input = new Scanner (System.in);
		System.out.print("Please enter the name of a file: ");
		String filename = input.nextLine();

		File file = new File(filename);
		Scanner inputFile = new Scanner(file); 

		ArrayList <String> studentNames = new ArrayList<String>();
		ArrayList <Integer> studentGrades = new ArrayList <Integer>();
		
		while (inputFile.hasNextLine()) {
			String name = inputFile.nextLine();
			studentNames.add(name); 
			String grade = inputFile.nextLine();
			studentGrades.add(Integer.parseInt(grade)); 
		}
		inputFile.close();

		System.out.println("Please enter the first and last name of the student whose grade you'd like to change.");
		String inputName = input.nextLine(); 
		boolean match=false;
		
		for (int nameIndex = 0; nameIndex < studentNames.size(); nameIndex++) {  
   			
   			//If the name exists, ask for the new grade and enter it into the correct index
   			if (studentNames.get(nameIndex).equalsIgnoreCase(inputName)) {  
        		System.out.println("The grade for " +inputName+ " is " + studentGrades.get(nameIndex) + ". Enter the student's new grade.");
        		int newGrade = input.nextInt();
        		studentGrades.set(nameIndex, newGrade);
        		match = true;   
        	}      	
        }

        //If the name does not exist, enter it into a new index and ask for the grade. Enter the grade.
       	if (match == false) {
       		studentNames.add(inputName);
       		System.out.println("This name does not exist. We'll add it to the file. Please enter this student's grade.");
			int grade = input.nextInt();
			studentGrades.add(grade);
       	}
	}  
}