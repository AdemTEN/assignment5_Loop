package assignment5_loops;

public class Question11 {

	public static void main(String[] args) {
		int rows = 4;
		for (int i = 0; i < rows; i++) {

			for (int j = 0; j <=i ; j++) {

				System.out.print(" ");
			}
			
			for (int k = rows-i ; k >= 1; k--) {

				System.out.print(k + " ");

			}
			System.out.println();
		}

	}
}
