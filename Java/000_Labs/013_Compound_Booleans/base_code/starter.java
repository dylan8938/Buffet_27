/*
 *	Author: Dylan Glandian 
 *  Date: 9/25/26
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please insert 3 numbers");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		if(num1>num2 & num1>num3){
		System.out.println("num1 is the largest");
		}
		if(num2>num1 & num2>num3){
		System.out.println("num2 is the largest");
		}
		if(num3>num1 & num3>num2){
		System.out.println("num3 is the largest");
		}
			if(num1<num2 & num1<num3){
		System.out.println("num1 is the smallest");
		}
		if(num2<num1 & num2<num3){
		System.out.println("num2 is the smallest");
		}
		if(num3<num1 & num3<num2){
		System.out.println("num3 is the smallest");

		}
		
	}
}
