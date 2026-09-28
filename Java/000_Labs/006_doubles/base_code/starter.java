/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a fahrenheit temperature: ");
		double fahrenheit = sc.nextDouble();
		double celsius = (fahrenheit - 32) * 5.0/9.0;
		System.out.println("Celsius temperature:" + celsius);
		
	}
}
