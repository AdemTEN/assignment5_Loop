package assignment5_loops;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");

		int number = scan.nextInt();
		int sum = 0;

		for (int i = 1; sum < 100; i++) {

			sum = sum + (number * 10);

		}

		System.out.println("The sum is:" + sum);

	}

}
