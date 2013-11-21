//This program asks for and provides the nth prime number. This is assignment #23.

import javax.swing.JOptionPane;

public class PrimeOkamoto {

	public static void main (String [] args) {

		int inputNumber;
		inputNumber = getInputNumber ("Please enter a number and I'll retrieve the corresponding prime number.");
		JOptionPane.showMessageDialog (null, getNthPrimeNumber (inputNumber));
	}

	// Check if a number is prime.
	public static boolean isPrime (int number) {
		int counter = 2;
		while (counter <= Math.sqrt(number)) { //Each pair of factors for a non-prime # will be on opposite sides of its square root. 
			if (number % counter == 0) {
				// It's not a prime because counter is a factor.
				return false;
			}
			counter++;
		}
		return true; 
	}

	// Iterate over all numbers to return the nth prime number.
	public static int getNthPrimeNumber (int n) {
		// Candidate is potentially a prime number. Position tracks the position of the candidate in the sequence of prime #s.
		int candidate = 0, position = 0;
		while (position < n) {
			candidate++; //Keep looking for more prime numbers.
			if (isPrime(candidate)) {
				position++; //We found another prime number!
			}
		}
		return candidate;	
	}

	// Interacts with the user.
	public static int getInputNumber (String message) {
		return Integer.parseInt (JOptionPane.showInputDialog(message));
	}

}