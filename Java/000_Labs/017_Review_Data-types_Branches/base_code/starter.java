/*
 *	Author: Dylan Glandian
 *  Date: 10/6/26
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = input.nextLine();
		System.out.println("What is your title?");
		String title = input.nextLine();
		System.out.println("Would you like to be a Wizard, Warrior, or Rogue?");
		String choice = input.nextLine();
		if (choice.equalsIgnoreCase("Wizard")) {
			System.out.println("You chose Wizard.");
		} else if (choice.equalsIgnoreCase("Warrior")) {
			System.out.println("You chose Warrior.");
		} else if (choice.equalsIgnoreCase("Rogue")) {
			System.out.println("You chose Rogue.");
		} else {
			System.out.println("Invalid choice.");
		}
		System.out.println("You have 20 skill points to spend in the following: Strength, Dexterity, Intelligence, and Charisma. Spend them wisely.");
		int skillPoints = 20;
		System.out.print("Strength (1-10): ");
		int strength = input.nextInt();
		while (strength < 0 || strength > 10 || strength > skillPoints) {
			System.out.println("Invalid input. Please enter a number between 1 and 10.");
			strength = input.nextInt();
		}
		skillPoints -= strength;
		System.out.println("Skill Points Remaining: " + skillPoints);
		System.out.print("Dexterity (1-10): ");
		int dexterity = input.nextInt();
		while (dexterity < 0 || dexterity > 10 || dexterity > skillPoints) {
		System.out.println("Invalid input. Please enter a number between 1 and 10.");
		dexterity = input.nextInt();	
		}
		skillPoints -= dexterity;
		System.out.println("Skill Points Remaining: " + skillPoints);
		System.out.print("Intelligence (1-10): ");
		int intelligence = input.nextInt();
		while (intelligence < 0 || intelligence > 10 || intelligence > skillPoints){
		System.out.println("Invalid input. Please enter a number between 1 and 10.");
		intelligence = input.nextInt();
		}
		skillPoints -= intelligence;
		System.out.println( "Skill Points Remaining: " + skillPoints);
		System.out.print("Charisma (1-10): ");
		int charisma = input.nextInt();
		while (charisma < 0 || charisma > 10 || charisma > skillPoints){
		System.out.println("Invalid input. Please enter a number between 1 and 10.");
		charisma = input.nextInt();
		}
		skillPoints -= charisma;
		System.out.println( "You have: " + skillPoints + " skill points for next time.");
		System.out.println("-------------------------------------------------------");
		System.out.println("You are " + name + " the " + title + " of CVHS.");
		System.out.println("You're a " + choice + " with the following stats:");
		System.out.println("Strength: " + strength);
		System.out.println("Dexterity: " + dexterity);
		System.out.println("Intelligence: " + intelligence);
		System.out.println("Charisma: " + charisma);
		System.out.println("Good luck on your quest " + name + "!");
		

		
	}
}
