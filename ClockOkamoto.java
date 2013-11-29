/** A class representing a clock that counts minutes and hours in a 24-hour format.
*/
import java.util.*;

public class ClockOkamoto {
	private int hours;
	private int minutes;


	/** Uses the methods, below, and asks a user to set the time and then ticks until the end of the day.
	*/
	public static void main (String [] args)  {
		int hours, minutes;
		Scanner input = new Scanner (System.in);
		ClockOkamoto plsWork = new ClockOkamoto ();
		do {
			System.out.println("Set the hour for the clock in 24-hour format.");
			hours = input.nextInt (); 
			System.out.println("Set the minute for the clock.");
			minutes = input.nextInt (); 
		} while (!plsWork.setTime(hours, minutes));

	}

	/** Default constructor
	*/
	public ClockOkamoto () {
		hours = 0;
		minutes = 0;
	}

	/** Sets the clock to a given time.
	*/
	public boolean setTime (int hour, int minute) {
		if (hour > 23) {
			System.out.println ("Invalid hour.");
			return false;
		}
		if (minute > 59) {
			System.out.println ("Invalid minute.");
			return false;
		}
		hours = hour;
		minutes = minute;
		return true; 
	}

	public String get24HrTime (int hours, int minute) {
		return "";
	}

	/** Increments time
	*/
	public void tick(int hours, int minutes) {
		//for ()
	}

	/** Uses the tick method to print the time until the end of the day. 
	*/
	//public int 

} 