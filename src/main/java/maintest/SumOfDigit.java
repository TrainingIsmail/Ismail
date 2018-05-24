package maintest;

import java.util.Scanner;

public class SumOfDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("Enter  a number:"); 
		Scanner scan = new Scanner(System.in) ;
		int num = scan.nextInt() ;
		int sum = 0;
		while (num > 0) {
			sum = sum + num % 10;
			num = num / 10;
		}
		System.out.println("Sum of Digits is " + sum);

	}

}
