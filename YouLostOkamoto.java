// A rigged guessing game that asks a user for a number between 1 and 10 and adds a random integer to it. This is assignment # 24.

import java.util.*; 
import javax.swing.JOptionPane;

public class YouLostOkamoto {

	public static void main (String [] args) {

		int inputNum = Integer.parseInt (JOptionPane.showInputDialog ("Guess an integer between 1 and 10."));
		int fraudNum = createFradulentNumber (inputNum);
		JOptionPane.showMessageDialog (null, "Sorry, the number is " + fraudNum + ".");
	}

	public static int createFradulentNumber (int inputNumber) {
		int randNum;
		Random rand = new Random ();
		randNum = rand.nextInt(11); 
		return ((inputNumber + randNum) % 10) +1; 
	
		/* The user cannot know for certain that this program is rigged, but after several attempts at guessing the user might suspect that it is (based on probability)
		*/
	}

}