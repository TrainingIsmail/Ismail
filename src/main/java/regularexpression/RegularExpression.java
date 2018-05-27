package regularexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String patt ="\\w+\\W+\\w+\\W\\w+\\W\\w+";
		String str = "mohamed..ismail@capgemini.com";

		/*String patt ="\\w{5}\\d{4}\\w{1}";
		String str = "BMSPM2676K";*/

		Pattern p = Pattern.compile(patt); 
		Matcher m= p.matcher(str);
		System.out.println(m.matches());


	}

}
