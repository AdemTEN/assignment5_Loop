package assignment5_loops;

public class Question9 {

	public static void main(String[] args) {

		int endNumber = 14;
		int i = 1;
		boolean comma = true;

		while (i <= endNumber) {

			if (i % 2 != 0) {

				if (comma) {
					System.out.print("");
				} else {
					System.out.print(", ");
				}

				System.out.print(i);

				comma = false;

			}

			i++;
		}

	}
}
