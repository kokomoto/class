// A rigged guessing game that asks a user for a number between 1 and 10 and adds a random integer to it. This is assignment # 24.

import java.util.*; 
import javax.swing.JOptionPane;

public class YouLostOkamoto {

	public static void main (String [] args) {

		int fraudNum = createFradulentNumber ("Guess the correct integer between 1 and 10, and win a million dollars!");
		JOptionPane.showMessageDialog (null, "Sorry, the number is " + fraudNum + ". You don't win the million dollars.");
	}
	public static int createFradulentNumber (String message) {
		inputNumber = Integer.parseInt (JOptionPane.showInputDialog (message));
		Random rand = new Random ();
		randNum = rand.nextInt(11); 
		return (inputNumber % 2) + randNum;
	}

}