package maintest;

import java.util.Scanner;

public class MatrixTwoXThree {
public static void main(String args[])
{
	int matrix[][];
	int row;
	int col;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number of rows");
	row=sc.nextInt();
	System.out.println("Enter number of columns");
	col=sc.nextInt();
	matrix=new int[row][col];
	System.out.println("Enter data");
	for(int i=0;i<row;i++)
	{
		for(int j=0;j<col;j++)
		{
			matrix[i][j]=sc.nextInt();
		}
		
	}
	
	System.out.println("The matrix is");
	for(int i=0;i<row;i++)
	{
		for(int j=0;j<col;j++)
		{
		System.out.print("\t" + matrix[i][j]);	
		}
		System.out.println();
	}
	
}
}
