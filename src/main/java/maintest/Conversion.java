package maintest;

public class Conversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Convert String to Integer
		String number = "10";
		int parseInt = Integer.parseInt(number);			
		System.out.println(parseInt);
		
		//Convert Integer to String
		int number1 = 7823;
		StringBuffer sb = new StringBuffer();
		sb.append(number1);
		String string = sb.toString();
		System.out.println(string);
		
		
	}

}
