package maintest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> test = new ArrayList<String>();
		test.add("Mohamed");
		test.add("Akash");
		test.add("Pavithra");
		test.add("Anu");
		
	        //Ascending Order
	        Collections.sort(test);
	        System.out.println(test);
	        
	        //Descending  Order
	        Collections.reverse(test);
	        System.out.println(test);
	

	}

}
