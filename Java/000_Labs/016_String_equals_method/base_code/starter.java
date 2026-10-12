/*
 *	Author:  dylan
 *  Date: 10/6/26
*/

import java.util.Scanner;
import java.util.Random;

public class starter {
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Would you like to be a Wizard, Warrior, or Rogue?");
		String choice = input.nextLine();

		if (choice.equalsIgnoreCase("Wizard")) {
			System.out.println("You chose Wizard.");
		} else if (choice.equalsIgnoreCase("Warrior")) {
			System.out.println("You chose Warrior.");
		} else if (choice.equalsIgnoreCase("Rogue")) {
			System.out.println("You chose Rogue.");
		} else {
			System.out.println("You did not choose a valid option. Run the program again.");
		}
}
 }