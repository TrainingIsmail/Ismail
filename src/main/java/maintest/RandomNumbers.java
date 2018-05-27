package maintest;

import java.util.Random;
import java.util.Scanner;

public class RandomNumbers {
	
	public static void main(String[] args) {
		
		// To get the number from the user
		System.out.print("Enter  a number:"); 
		Scanner scan = new Scanner(System.in) ;
		int random = scan.nextInt() ;
		
		//method to generate the random no
		Random rand = new Random();
		int nextInt = rand.nextInt(random);
		System.out.println("Random no is " +  nextInt );
	}

}
