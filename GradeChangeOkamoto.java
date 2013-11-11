//This program allows a user to add, modify and search for student names and grades in a file. This is homework assignment #21. 
import java.util.*;
import java.io.*;
//import javax.swing.JFileChooser;

public class GradeChangeOkamoto {
	public static void main (String [] args) throws IOException {
		Scanner input = new Scanner (System.in);
		//String filename = null;
		System.out.print("Please enter the name of a file: ");
		String filename = input.nextLine();

/*
		JFileChooser chooser = new JFileChooser();
    	int returnVal = chooser.showOpenDialog(null);
    	if(returnVal == JFileChooser.APPROVE_OPTION) {
       		filename = chooser.getSelectedFile().getName();
    	} else {
    		System.out.print("You didn't pick a file.");
    		System.exit(0);
    	}
*/
		File file = new File(filename);
		Scanner inputFile = new Scanner(file); 

		ArrayList <String> studentName = new ArrayList<String>();
		ArrayList <Integer> studentGrade = new ArrayList <Integer>();
		
		while (inputFile.hasNextLine()) {
			String studentName = inputFile.nextLine();
			//System.out.println(name);
			studentName.add(name); 
			String studentGrade = inputFile.nextLine();
			studentGrade.add(Integer.parseInt(grade)); 
		}
		inputFile.close();

		System.out.println("Please enter the first and last name of the student whose grade you'd like to change.");
		String inputName = input.nextLine(); 
		
		for (int nameIndex = -1; nameIndex <= studentName.size(); i++) {  
   			
   			//If the name exists, ask for the new grade and enter it into the correct index
   			if (inputName.get(nameIndex).equalsIgnoreCase(studentName)) {  
        	System.out.println("Enter the student's new grade.");
        	int newGrade = input.nextInt();
        	studentGrade.add(nameIndex, newGrade);   
        	}

        	//If the name does not exist, enter it into a new index and ask for the grade. Enter the grade
        	else {
        	studentName.add(inputName);
        	studentName.get(nameIndex);
        	System.out.println("This name does not exist. We'll add it to the file. Please enter this student's grade.");
			int grade = input.nextInt();
			studentGrade.add(grade);
        	}
        }

		//if(Arrays.asList(studentName.contains(inputName))
			
			//else if 
			//ask for name
			// send it to an array
			//ask for grade
			//set it to that array's index


		//for (int nameIndex=-1; !inputName.equalsIgnoreCase(studentName); nameIndex++) {

	}  
}