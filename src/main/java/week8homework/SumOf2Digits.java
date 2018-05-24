package week8homework;

import java.util.Scanner;

//To find the sum of 2 digits
public class SumOf2Digits {
	//Main Method Program starts from here
	public static void main(String[] args)
	{
		//Get the value for number1
		System.out.print("Enter number1: ");
		Scanner scan=new Scanner(System.in);
		float number1=scan.nextFloat();
		//Get the value for number2
		System.out.print("Enter number2: ");
		Scanner scan2=new Scanner(System.in);
		float number2=scan2.nextFloat();
		//Add number1 and number 2 and print the sum of 2 digits
		float sum=number1+number2;
		System.out.println("Sum of 2 digits=" +sum);	
		scan.close();
		scan2.close();
	}	

}
