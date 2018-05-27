package maintest;

import java.util.Arrays;

public class EqualityOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = {1,2,3,4,5,6};
		int[] array1 = {1,2,3,4,5,6};
		int[] array2 = {1,2,3,4};

		if(Arrays.equals(array, array1))
		{
			System.out.println("Array equal to Array1");
		}
		else if(Arrays.equals(array1, array2)) {
			System.out.println("Array1 equal to Array2");
		}

		else if (Arrays.equals(array2, array)) {
			System.out.println("Array2 equal to Array");
		}
	}

}
