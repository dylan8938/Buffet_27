/*
    Lecture note example - Input!!
*/
import java.util.Scanner;
import java.util.Scanner;

class LectureInput{
    public static void main(String args[]) {
       System.out.println("Welcome to Dylan's wingstop!");
        System.out.println("Here's our menu");
        System.out.println("1.Lemon pepper wings 5 pc -");
        double item1Price = 8.50;
        System.out.println(item1Price);
        System.out.println("2.Spicy boneless wings 6 pc -");
        double item2Price = 7.50;
        System.out.println(item2Price);
        System.out.println("3.Chili cheese fries -");
        double item3Price = 5.75;
        System.out.println(item3Price);

        System.out.println("How many lemon pepper wing plates would you like?");
        Scanner sc = new Scanner(System.in);
        int item1Quant = sc.nextInt();
        System.out.println("Item 1 Total is: " +(item1Price*item1Quant));
	}
}
