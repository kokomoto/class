//This program finds the largest of four numbers provided by a user. It is homework assignment #22.

import java.util.*;

public class MaxOkamoto {

	public static void main (String [] args){
		int num1, num2, num3, num4, maximum;

		Scanner input = new Scanner (System.in);
		System.out.println ("Please enter four numbers, separated by one space, and this program will return the largest of the four.");
		num1=input.nextInt();
		num2=input.nextInt();
		num3=input.nextInt();
		num4=input.nextInt();

		maximum = max (num1, num2, num3, num4);

		System.out.println ("The largest number is " + maximum);
	}

	public static int max (int num1, int num2){
		return (num1>num2? num1 : num2);
	}

	public static int max (int num1, int num2, int num3, int num4) {
		return max (max (num1,num2), max (num3, num4));
	}
}