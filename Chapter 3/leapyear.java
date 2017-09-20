//William Ao
//Date: 9/18/17
//Program: Leap Year Tester

/* Variable List

*/

import java.util.Scanner;
import java.text.NumberFormat;
import java.text.DecimalFormat;
import java.text.*;//*is a wildcard, importing anything you use in program

public class leapyear			//must have a class that is the same name as the file name
{


public static void main (String[] args)	// must have main
{
	//initializing variables and scanner object
	Scanner scan = new Scanner(System.in);
	int year;

	System.out.println("Enter a year: ");
	year = scan.nextInt();

	//checks if value is under 1582, produces error message if it is
	if (year<=1582)
	{
		System.out.println("Error, invalid year. Please enter a value greater than 1582.");
	}
	//if the year is evenly divisible by 4, but not 100
	//OR
	//if the year is evenly divisible by 400
	//then it is a leap year
	else if ((!(year%100==0) && year%4==0) || year%400==0)
	{
		System.out.println("It is a leap year");
	}
	//anything else isn't a leap year
	else
	{
		System.out.println("It is not a leap year");
	}




}//end of main



}//end of class



















