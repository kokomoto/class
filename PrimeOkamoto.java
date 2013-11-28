/** This program asks for n and provides the nth prime number. This is assignment #23.
*/

import javax.swing.JOptionPane;

public class PrimeOkamoto {

	/** Asks the user for a number and displays the nth prime number
	*/
	public static void main (String [] args) {

		int inputNumber;
		inputNumber = getInputNumber ("Please enter a positive integer and I'll retrieve the corresponding prime number.");
		JOptionPane.showMessageDialog (null, "The corresponding prime number for a position of " + inputNumber + " is " + getNthPrimeNumber (inputNumber) + ".");
	}

	/** Check if a number is prime.
		@param number Determines whether an integer is a prime number. 
		@return False if it is not a prime number or true if it is a prime number. 
	*/
	public static boolean isPrime (int number) {
		int counter = 2;
		// Each pair of factors for a non-prime # will be on opposite sides of its square root.
		while (counter <= Math.sqrt(number)) { 
			if (number % counter == 0) {
				//It's not a prime because counter is a factor.
				return false;
			}
			counter++;
		}
		return true; 
	}

	/** Iterate over all numbers to return the nth prime number.
			@param n The position of the prime number to compute.   
			@return The prime number in the nth position.
	*/
	public static int getNthPrimeNumber (int n) {
		//Candidate is potentially a prime number. Position tracks the position of the candidate in the sequence of prime #s.
		int candidate = 2, position = 1;
		while (position < n) {
			//Keep looking for more prime numbers.
			candidate++; 
			if (isPrime(candidate)) {
				//We found another prime number!!
				position++; 
			}
		}
		return candidate;	
	}

	/** Displays a message to the user and accepts an integer as input. 
	@ param message The message to be displayed. 
	@return returns the number that the user provides.
	*/
	public static int getInputNumber (String message) {
		return Integer.parseInt (JOptionPane.showInputDialog(message));
	}

}