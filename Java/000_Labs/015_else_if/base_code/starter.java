/*
 *	Author: Dylan Glandian
 *  Date: 10/2/26
*/

import java.util.Scanner;
import java.util.Random;

	class starter {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int number = (int)(Math.random() * 1000) + 1;
		System.out.println("Guess a number between 1 and 1000");
		int guess = input.nextInt();
		if (guess == number){
			System.out.println("Correct");
		} else if(guess > number){
			System.out.println("Lower");
		}

		else {
			System.out.println("Higher");
		}
		System.out.println("The number was:" + number);
		
		
	}
}
