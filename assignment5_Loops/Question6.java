package assignment5_loops;

public class Question6 {

	public static void main(String[] args) {

		int n = 10;
		int x = 0;
		int y = 1;
		int z = 0;
		
		for (int i=1 ; i <=n ; i++ ) {
			z = x + y;
			x = y;
			y = z;
			System.out.print(z+ ", ");
		}

	}

}
