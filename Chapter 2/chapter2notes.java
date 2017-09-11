//William Ao
//NOTES


import java.util.Scanner;
import java.text.NumberFormat;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.text.*;//*is a wildcard, importing anything you use in program

public class chapter2notes			//must have a class that is the same name as the file name
{


public static void main (String[] args)	// must have main
{

	//STRING STUFF

	String word = new String("Peet Jeet");
	String word1 = word;
	//strings are immutable
	word1 = "Peet Jeet"; //reassigning the variable changes the memory address
	String word2 = new String("Peet Jeet");

	//.equals() compares the value of the object
	System.out.println(".equals(): " + word.equals(word2));
	System.out.println("== " + (word == word1));
	//== compares the memory values of each object to see if they are the SAME object
	//== works with primitive data types
	//System.out.println("== " + (word == word2));

	//OTHER STRING STUFF

	String word3 = new String("Waleed");
	String name = new String("Ardvind L Mohan");
	String lname = "Whitlock", fname = "Andrew", mname;

	fname = "First"; //string is special define like primitive data

	System.out.println(fname.length());
	System.out.println(name.replace('a', '*'));
	System.out.println(fname.compareTo(name));

	//OTHER STUFF

	int x = 9;
	int id = 789;
	double num =5, num1 = 23.89765, num2 = 3.4;
	char letter = 'd';
	boolean choice;

	Integer number = new Integer(47);
	number = id; //autoboxing
	System.out.println(number);

	System.out.println(Integer.MAX_VALUE);
	System.out.println(Integer.parseInt("56") + 1);
	System.out.println("56"+1);

	//Using primitive data raises an error, must use an object
	//ArrayList<int> grades = new ArrayList<int>();
	ArrayList<Integer> grades = new ArrayList<Integer>();


}//end of main

}//end of class firstprog



















