/** A class representing a clock that counts minutes and hours in a 24-hour format. It includes a field for hours and a field for minutes. 
*/
import java.util.*;
import java.text.DecimalFormat;

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
		plsWork.displayCountUp();
	}

	/** Default constructor sets the hours and minutes fields to zero. 
	*/
	public ClockOkamoto () {
		hours = 0;
		minutes = 0;
	}

	/** Sets the clock to a given time and performs input validation.
		@param hour Sets the hour for the clock.
		@param minute Sets the minute for the clock.	
		@return Returns false if the value for hour is greater than 24 and the value for minutes is greater than 60. Returns true if the user enters values less or equal to 24 and 60, respectively. 
	*/
	public boolean setTime (int hour, int minute) {
		if (hour > 24) {
			System.out.println ("Invalid hour.");
			return false;
		}
		if (minute > 60) {
			System.out.println ("Invalid minute.");
			return false;
		}
		hours = hour;
		minutes = minute;
		return true; 
	}

	/** Increments time.
		@param hours The hour for the clock.
		@param minutes The minutes of the clock. 
	*/
	public void tick() {
		minutes++;
		if (minutes > 59) {
			hours++;
			minutes = 0;
		}
		if (hours > 23) {
			hours = 0; 
		}
	}

	/** Pads an integer with zeros to display two digits. 
		@param num Accepts num as an integer, converts it into a string, and formats it adding zeros when appropriate.
		@return Returns a string. 
	*/
	private String padZero (int num) {
		DecimalFormat formatter = new DecimalFormat ("00");
		return formatter.format (num);
	}

	/** Calls the tick method to print the time until the end of the day and calls the get24HrTime method to display a 24-hour clock format. 
		@param 
		@param 
		@return Returns a string. 
	*/
	public void displayCountUp () {
		String time = "";
		while (hours > 0 || minutes > 0){
				tick();
				time = (padZero(hours) + ":" + padZero(minutes));
				System.out.println (time);
		}
	} 

} 