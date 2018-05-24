package week8homework;

public class ReverseStringPreserveSpace {
	
	public static void main(String[] args) 
	{ 
		reverses("India is my country"); 
	} 
	static void reverses(String str) { 
		char inputArray[] = str.toCharArray(); 
		int length = inputArray.length;
		System.out.println(inputArray);
		
		for (int i=length-1;i>=0;i--)
		{
			System.out.print(inputArray[i]);
		}	
	}
}
