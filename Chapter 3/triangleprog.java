//William Ao
//Date:
//Program:

/* Variable List

*/

import java.util.Scanner;
import java.text.NumberFormat;
import java.text.DecimalFormat;
import java.text.*;//*is a wildcard, importing anything you use in program

public class triangleprog			//must have a class that is the same name as the file name
{


public static void main (String[] args)	// must have main
{
	Scanner scan = new Scanner(System.in);
	char answer;

	System.out.println("Sides or angles? (s or a): ");
	answer = scan.next().charAt(0);

	switch (answer)
	{
		case'S':
		case's':

		double s1, s2, s3, hyp;
		System.out.println("Please enter the sides: ");
		s1 = scan.nextDouble();
		s2 = scan.nextDouble();
		s3 = scan.nextDouble();

		if (s1>s2 && s1>s3)
		{
			hyp=s1;
		}

		else if (s2>s3)
		{
			hyp=s2;
		}

		else
		{
			hyp=s3;
		}

		if ((s1+s2<=hyp || s1+s3<=hyp)||(s2+s3<=hyp))
		{
			System.out.println("Error, invalid side lengths");
		}

		else if (s1==s2 && s2==s3)
		{
			System.out.println("Equilateral triangle");
		}

		else if ((s1==s2 || s2==s3 || s1==s3))
		{
			System.out.println("Isosceles triangle");
			if ((Math.pow(s1, 2)+Math.pow(s2, 2))==Math.pow(hyp, 2))
			{
				System.out.println("Also, right triangle");
			}
		}
		else
		{
			System.out.println("Scalene triangle");
			if ((Math.pow(s1, 2)+Math.pow(s2, 2))==Math.pow(hyp, 2))
			{
							System.out.println("Also, right triangle");
			}
		}

		break;

		case'A':
		case'a':

		double a1, a2, a3;
		System.out.println("Please enter the angles: ");
		a1 = scan.nextDouble();
		a2 = scan.nextDouble();
		a3 = scan.nextDouble();

		if (!((a1+a2+a3)==180))
		{
			System.out.println("Error, invalid angles");
		}

		else if (a1==a2 && a2==a3)
		{
			System.out.println("Equilateral triangle");
		}

		else if (a1==a2 || a1==a3 || a2==a3)
		{
			System.out.println("Isosceles triangle");
			if (a1==90 || a2==90 || a3==90)
			{
				System.out.println("Also, right triangle");
			}
		}

		else
		{
			System.out.println("Scalene triangle");
			if (a1==90 || a2==90 || a3==90)
			{
							System.out.println("Also, right triangle");
			}
		}

		break;
	}


}//end of main



}//end of class



















