package assignment5_loops;

public class Question8 {

	public static void main(String[] args) {

		final int upperBound = 100;
		
		int sum = 0;

		int i = 1;
		while (i <= upperBound) {
		
			sum += i;
			
			System.out.print(i + "+");
			
			i++;

		}
		
		System.out.println("=" + sum);
	}

}
