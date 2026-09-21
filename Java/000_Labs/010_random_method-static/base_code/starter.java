/*
 *	Author:  Dylan Glandian
 *  Date: 9/18/26
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		System.out.println("Enter 2 numbers to create a range for your random number.");
		System.out.print("Please enter an integer");

		Scanner sc = new Scanner(system.in);
		int small = sc.nextInt();

		System.out.print("Please enetr a 2nd integer (larger than first):");
		int large + sc.nextInt();

		System.out.println("Your range is " + small + "to" + large);
		int num1 + (int)(Math.random()*(large-small)+small);
		int num2 + (int)(Math.random()*(large-small)+small);
		int num3 + (int)(Math.random()*(large-small)+small);
		int num4 + (int)(Math.random()*(large-small)+small);
		int num5 + (int)(Math.random()*(large-small)+small);
		System.out.println(num1 + "," + num2 + "," + num3 + "," + num4 + "," + num5);
		 )
	}
}
