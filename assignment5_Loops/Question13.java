package assignment5_loops;

public class Question13 {

	public static void main(String[] args) {

		int rows = 8;
		int columns = 8;
		String w = " W ";
		String b = " B ";

		for (int i = 1; i <= rows; i++) {

			for (int j = 1; j <= columns / 2; j++) {

				if (i % 2 == 0) {
					System.out.print(b + w);
				} else {
					System.out.print(w + b);
				}

			}
			System.out.println();
		}
	}

}
