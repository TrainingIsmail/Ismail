package maintest;

public class MissingNumberinArray {

	
	public static void main(String[] args) {
		int ar[] = {1,2,4,5,6,7};

	        for(int i = 0; i < (ar.length - 1); i++) {

	            int next = ar[i + 1];
	            int current = ar[i];
	            if((next - current) > 1) {
	                System.out.println("Missing Value : " + (current + 1));
	            }
	        }
	    }
	}


