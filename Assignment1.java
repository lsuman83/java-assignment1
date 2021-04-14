// Sean Bordelon
// COP 3330 ORO2
// Assignment1.java
// Program to read in an integer and decide whether it is odd or even

import java.util.Scanner; //Program uses java utility class Scanner

public class Assignment1 
{	// Class assigned Assignment1.java

	public static void main (String[] args) // beginning of method "main" body of program
	{
		// create Scanner to read input
		Scanner input = new Scanner(System.in);
		
		// Output statement to user and read in number
		System.out.print ("Enter a number to find out if it is even or odd: ");
		int number = input.nextInt();
		
		// Evaluate number entered as odd or even and output the answer
		if ((number % 2) == 0)
		{
			System.out.println ("\nYour number is in fact even!");
		}
		if ((number % 2) == 1)
		{
			System.out.println ("\nYour number is in fact odd!");
		}

		input.close();
	}
}
