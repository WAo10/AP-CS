//William Ao
//Date: 9/5
//Program: Takes user name and displays it

/* Variable List
scan - a scanner object to take the users name
name - full name of the user
firstspace - the index integer of the first space in the users full name
secondspace - the index integer which is taken from the substring of the full name
length - the length of the users full name
partname - the middle and last name of the user, taken from fullname
partlength - the length of substring partname
firstmid - the first name and middle inital of the user
last - the last name of the user
*/

import java.util.Scanner;
import java.text.*;//*is a wildcard, importing anything you use in program

public class nameprogram //must have a class that is the same name as the file name
{


public static void main (String[] args)	//must have main
{
	//instantiates a scanner, string, and int objects
	Scanner scan = new Scanner(System.in);
	int firstspace, secondspace, length, partlength;
	String name, partname, firstmid, last;

	System.out.println("Please enter your full name (First Middle Last)");
	name = scan.nextLine();

	//finds the first space character in the full name and takes length
	firstspace = name.indexOf(' ');
	length = name.length();

	//gets a substring of the full name that is just the middle and last name
	partname = name.substring(firstspace+1, length);
	//finds the space character in the substring of the full name
	secondspace = partname.indexOf(' ');

	//makes a substring that is the first name and middle inital of the user
	firstmid = name.substring(0, firstspace+2);

	//gets the length of the subtring of the name
	partlength = partname.length();

	//gets the last name by using the lenght and index of the second space
	last = partname.substring(secondspace+1, partlength);

	//prints name with correct formatting
	System.out.println(firstmid + ".");
	System.out.println(last);

}//end of main

}//end of class

/*
---First output----
Please enter your full name (First Middle Last)
Potato Man Cow
Potato M.
Cow
Press any key to continue . . .
---End first output---

---Second output----
Please enter your full name (First Middle Last)
Peter Jeet Davis
Peter J.
Davis
Press any key to continue . . .
---End second output---
*/


















