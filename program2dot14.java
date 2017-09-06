//William Ao
//Date: 8/31/17
//Program: This program will create a random phone number

/* Variable List
fourdig - four digit decimal format object
threedig - three digit decimal format object
Randall - random number generator object
scan - scanner object (for user input)
num1, num2 - random numbers that are integers between 0-8 (Random class)
num3 - random number that is an integer between 0-8 (Math class)
group2 - second group of numbers in phone #, an integer under 743 (Math class)
group3 - last group of four numbers in the phone # (Random class)
*/

import java.util.Scanner;
import java.util.Random;
import java.text.DecimalFormat;
import java.text.*;//*is a wildcard, importing anything you use in program

public class program2dot14			//must have a class that is the same name as the file name
{


public static void main (String[] args)	// must have main
{

	//creates decimalformat objects for 3 and 4 decimal place formatting
	DecimalFormat fourdig = new DecimalFormat("0000");
	DecimalFormat threedig = new DecimalFormat ("000");

	//instantiates random number generator
	Random Randall = new Random();

	//instantiates scanner and integer objects
	Scanner scan = new Scanner(System.in);
	int num1, num2, num3, group2, group3;

	//generates first 3 numbers individually, which each have to be under 8
	num1=Randall.nextInt(8);
	num2=Randall.nextInt(8);
	num3=(int)(Math.random() * 7 + 1);

	//generates next 3 numbers, which have to be under 743
	group2=(int)(Math.random()* 743 + 1);

	//generates next 4 numbers
	group3=Randall.nextInt(10000);

	String num1Str = Integer.toString(num1); String num2Str = Integer.toString(num2); String num3Str = Integer.toString(num3);

	System.out.println(num1Str+num2Str+num3Str+" - "+threedig.format(group2)+" - "+fourdig.format(group3));

}//end of main

}//end of class

/*
--Output 1--
544 - 357 - 4645
Press any key to continue . . .
--End output 1--

--Output 2--
225 - 054 - 2077
Press any key to continue . . .
--End output 2--
*/