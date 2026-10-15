/*
 *	Author:  Dylan
 *  Date: 10/10/2023
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int number;

		while (true) {
			System.out.print("Enter a number between 1 and 1000 (0 to exit): ");
			number = sc.nextInt();

			if (number == 0) {
				break;
			}
			if (number > 1000) {
				System.out.println("Invalid input. Please enter a number between 1 and 1000.");
				continue;
			}

			System.out.println("You entered: " + number);
		}

		System.out.println("Exiting");
		sc.close();
	}
}
