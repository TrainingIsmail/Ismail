package week8homework;

//Print 1 to 10 without using Loops

public class Print1to10withoutUsingLoops {

//Main Method Program starts from here

	public static void main(String[] args)
	{
//Initialize the number to 1 as provided in the requirement
		int number=1;
//Call the Method 
		printNumber(number);
	}
//Method Defenition
	public static void printNumber(int num)
	{
//Check the condition if the number passed as argument is less than 10
		if(num<=10)
		{
//Print the value of num and leave a space
			System.out.print(num +" ");
//Increment the num value and pass as argument
			printNumber(num+1);
		}
	}
}
