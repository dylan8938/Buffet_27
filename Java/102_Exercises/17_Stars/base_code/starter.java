/*
 *	Author: Dylan Glandian
 *  Date:10/21/26
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter a width:");
		int w = sc.nextInt();
		System.out.print("Please enter a height:");
		int h = sc.nextInt();
		int count2 = 0;
		while (count2 < h) {
			int count = 0;
			// PRINTS ONE LINE
			while (count < w){
				System.out.print("*");
				count ++;
			}
			System.out.println();
			count2 ++;
		}
}
}\