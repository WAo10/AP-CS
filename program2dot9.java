//William Ao
//Date: 8/30/17
//Name: William Ao
//Program: Finds circle area and circumference given radius

/* Variable List
radius - given radius of circle from user
area - area of the circle using the given radius
circumference - circmuference of the circle given radius
*/

import java.util.Scanner;
import java.text.NumberFormat;
import java.text.DecimalFormat;
import java.text.*;//*is a wildcard, importing anything you use in program

public class program2dot9 //must have a class that is the same name as the file name
{


public static void main (String[] args)	// a main
{
	Scanner scan = new Scanner(System.in); // new scanner
	double radius, area, circumference; // creating double objects
	DecimalFormat fmt4dec = new DecimalFormat("0.####"); // creating decimal formatting object

	System.out.println("Please enter the radius of the circle"); // gets radius from user
	radius = scan.nextDouble();

	// calculates area and circumference
	area = Math.PI*Math.pow(radius, 2);
	circumference = 2*Math.PI*radius;

	System.out.println("Area: " + fmt4dec.format(area)); // prints area and circumference
	System.out.println("Circumference: " + fmt4dec.format(circumference));

}//end of main



}//end of class firstprog



















