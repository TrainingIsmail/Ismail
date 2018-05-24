package maintest;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class OccurenceInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] array = {"1","2","1","1", "1"};
		List<String> asList = Arrays.asList(array);
		for (String string1 : array) {
			int frequency = Collections.frequency(asList, string1);
			System.out.println(string1+" "+frequency);
			
		}
		}
		
	}
	

