//William Ao
//Date: 8/30/17
//Program: This program will take an amount of coins from the user
//and print it as dollars with correct formatting

/* Variable List
quarters - number of quarters from user
dimes - number of dimes from user
nickels - number of nickels from user
pennies - number of pennies from user
total - the total value of money from other coin values
*/

import java.util.Scanner;
import java.text.NumberFormat;

public class program2dot12
{  // class

	public static void main (String[] args)
	{ // main

		// intializing double objects
		double quarters,dimes,nickels,pennies,total;
		// creates numberformat and scanner objects
		NumberFormat money = NumberFormat.getCurrencyInstance();
		Scanner scan = new Scanner(System.in);

		// user input
		System.out.println("Please enter the number of quarters");
		quarters = scan.nextDouble();

		System.out.println("Please enter the number of dimes");
		dimes = scan.nextDouble();

		System.out.println("Please enter the number of nickels");
		nickels = scan.nextDouble();

		System.out.println("Please enter the number of pennies");
		pennies = scan.nextDouble();

		//calculates total given coins from user
		total = quarters*.25 + dimes*.10 + nickels*.05 + pennies*.01;

		//prints total money with currency format
		System.out.println("You have "+ money.format(total)+". Congrats. You did it.");

	}//end of class firstprog

}

















