package maintest;

public class IntersectionOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int Array1[] = {23, 36, 96, 78, 55};
		int Array2[] = {78, 45, 19, 73, 55};
		System.out.println("Intersection of the two arrays ::");

		for(int i = 0; i<Array1.length; i++ ) {
			for(int j = 0; j<Array2.length; j++) {
				if(Array1[i]==Array2[j]) {
					System.out.println(Array2[j]);
				}
			}
		}
	}
}

