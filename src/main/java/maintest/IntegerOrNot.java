package maintest;

import java.util.Scanner;

public class IntegerOrNot {

	static boolean numberOrNot(String input)
	{
		try
		{
			Integer.parseInt(input);
		}
		catch(NumberFormatException ex)
		{
			return false;
		}
		return true;
	}

	 public static void main(String[] args)
	    {
	        System.out.println("Enter a number");
	 
	        Scanner sc = new Scanner(System.in);
	 
	        String input = sc.next();
	 
	        if(IntegerOrNot.numberOrNot(input))
	        {
	            System.out.println("You have Entered a Number");
	        }
	        else
	        {
	            System.out.println("You have not Entered a Number");
	        }
	    }


}