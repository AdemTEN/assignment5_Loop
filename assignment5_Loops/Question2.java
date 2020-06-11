package assignment5_loops;

public class Question2 {

	public static void main(String[] args) {

		for (int oddNumbers = 3; oddNumbers < 130; oddNumbers++) {

			if (oddNumbers % 2 != 0) {

				System.out.print(oddNumbers + " ");
			}
		}

	}

}
