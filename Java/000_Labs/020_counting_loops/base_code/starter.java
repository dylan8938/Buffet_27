/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your name:");
		String name = scanner.nextLine();
		System.out.println("How many times would you like to print out your name?");
		int count = scanner.nextInt();
		int x = 0;
		while (x < count) {
			System.out.println(name);
			x++;
		}
	}
}

