//William Ao
//Date: 9/20/17
//Program: Solar System Switch

/* Variable List

*/

import java.util.Scanner;
import java.text.NumberFormat;
import java.text.DecimalFormat;
import java.text.*;//*is a wildcard, importing anything you use in program

public class solarsystem			//must have a class that is the same name as the file name
{


public static void main (String[] args)	// must have main
{
	Scanner scan = new Scanner(System.in);
	char answer;
	double weightnew, weight, me = 0.38, v = 0.91, ma = 0.38, j = 2.34, s = 0.93, u = 0.92, n = 1.12;

	System.out.println("How much do you weigh on earth?");
	weight = scan.nextDouble();

	System.out.println("What planet do you want to go to?");
	System.out.println("Mercury - M\nVenus - V\nMars - m\nJupiter - J\nSaturn - S\nUranus - U\nNeptune - N");

	answer = scan.next().charAt(0);

	switch(answer)
	{
		case'M':
		weightnew = weight*me;
		System.out.println("Your new weight: " + weightnew);
		break;

		case'V':
		weightnew = weight*v;
		System.out.println("Your new weight: " + weightnew);
		break;

		case'm':
		weightnew = weight*ma;
		System.out.println("Your new weight: " + weightnew);
		break;

		case'J':
		weightnew = weight*j;
		System.out.println("Your new weight: " + weightnew);
		break;

		case'S':
		weightnew = weight*s;
		System.out.println("Your new weight: " + weightnew);
		break;

		case'U':
		weightnew = weight*u;
		System.out.println("Your new weight: " + weightnew);
		break;

		case'N':
		weightnew = weight*n;
		System.out.println("Your new weight: " + weightnew);
		break;
	}




}//end of main



}//end of class



















