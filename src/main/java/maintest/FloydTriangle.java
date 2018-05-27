package maintest;

import java.util.Scanner;

public class FloydTriangle {

	public static void main(String[] args) {
		System.out.println("Enter the number of rows: ");
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
        int j;
        int k = 1;
		for (int i=1;i<=a;i++){
			for(j=1;j<=i;j++){
				System.out.print(k+" ");
				k++;
			}
			
			System.out.print("\n");
		
		}
	}

}
