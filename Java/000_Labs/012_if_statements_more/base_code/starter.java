/*
 *	Author:  dylan glandian
 *  Date: 9/24/26
*/

import java.util.Scanner;

	class starter {
		public static void main(String args[]) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Type in two numbers");
		int num1 = sc.nextInt(); 
		int num2 = sc.nextInt();
		boolean a = num1 == num2;
		boolean b = num1 != num2;
		if(a){
			System.out.println("num1 is the same as num2");
		}
		if(b){
			System.out.println("num1 is different than num2");
		}
		
	}
}
