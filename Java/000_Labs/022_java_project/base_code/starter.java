/*
 *	Author: Dylan Glandian
 *  Date: 10/22/26
 * 	Collaborator(s): 
*/

import java.util.Scanner;
class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int totalMoney = 100;
		// Print the rules ONCE here
		System.out.println("Slot Machine Rules:");
		System.out.println("1. Each player starts with $100");
		System.out.println("2. Input a wager less than your total amount of money.");
		System.out.println("3. The slot machine will roll 3 numbers from 1 to 10");
		System.out.println("a. If two numbers match, you double your money.");
		System.out.println("b. If three numbers match, you triple your money.");
		System.out.println("c. If none match, you lose your money.");
		System.out.println("-----------------------------------------------------------");
		while (totalMoney > 0) {
		System.out.println("Would you like to play the slots? (Yes/ yes/Y/y)");
		String play = sc.nextLine();
		if (play.equalsIgnoreCase("yes") || play.equalsIgnoreCase("y")) {
			System.out.println("Great!! Let's play!");
			System.out.print("You have $" + totalMoney + ". How much would you like to wager: ");
			int wager = sc.nextInt();
			sc.nextLine();
			if (wager <= 0 || wager > totalMoney) {
				System.out.println("Wager must be greater than $0 and less than or equal to your total amount.");
				continue;
			}
			totalMoney -= wager;
			System.out.println("You have $" + totalMoney + " remaining.");
			int roll1 = (int) (Math.random() * 10) + 1;
			int roll2 = (int) (Math.random() * 10) + 1;
			int roll3 = (int) (Math.random() * 10) + 1;
			System.out.println("Your rolls are:");
			System.out.println("-------------");
			System.out.println("| " + roll1 + " | " + roll2 + " | " + roll3 + " |");
			System.out.println("-------------");
			if (roll1 == roll2 && roll2 == roll3) {
				totalMoney += wager * 3;
				System.out.println("Congratulations! You tripled your money!");
			} else if (roll1 == roll2 || roll2 == roll3 || roll1 == roll3) {
				totalMoney += wager * 2;
				System.out.println("Congratulations! You doubled your money!");
			} else {
				System.out.println("Sorry, you lost your money.");
			}
			System.out.println("You now have $" + totalMoney);
			
		} 
			if (totalMoney <= 0) {
				System.out.println("You have run out of money. Thanks for coming! Come back soon!");
				break;
			}
			else {
			System.out.println("Sad to see you go. You still have $" + totalMoney + " left. Come again soon! Thanks!");
			break;
		}
	}
	sc.close();
	}
}

