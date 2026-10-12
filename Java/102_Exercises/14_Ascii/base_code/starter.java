/*
 *	Author: Dylan
 *  Date: 10/1/26
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		System.out.println("Welcome to the Ascii Museum");
		System.out.println("Please select what exibit you'd like to view");
		System.out.println("1.Vehicles");
		System.out.println("2.Music");
		System.out.println("3.Animals");

		Scanner sc = new Scanner(System.in);
		String exhibit = sc.nextLine();
		if(exhibit.equals("Vehicles")){
			
			System.out.println("Vehicles Exhibit:");
			System.out.println("Please select a category");
			System.out.println("1.Helicopter");
			System.out.println("2.Motorcycle");
			String piece = sc.nextLine();

			if(piece.equals("Helicopter")){
			System.out.println("   -----|-----");
			System.out.println("*>=====[_]L)");
			System.out.println("      -'-`-");
			}
			if(piece.equals("Motorcycle")){
			System.out.println("   _");
			System.out.println("D/_");
			System.out.println("/(_`._,-.");
			System.out.println("(o) `--'(o)");
			System.out.println("______________");
			}
		}
		else if(exhibit.equals("Music")){
		System.out.println("Music Exhibit");
		System.out.println("Please select a category");
		System.out.println("1.Drums");
		System.out.println("2.Trumpet");
		String piece = sc.nextLine();
		if(piece.equals("Drums")){
		System.out.println("======o     o======");
		System.out.println("     ___________");
		System.out.println("    |___________|");
		System.out.println("    |\\  /\\  /\\|");
		System.out.println("    |_\\//__\\//__|");
		System.out.println("    |___________|");
		}
		if(piece.equals("Trumpet")){
		System.out.println("___________/|");
		System.out.println("(__|||__)  \\|");
		}	

		}
		else if(exhibit.equals("Animals")){
		System.out.println("Animals.");
		System.out.println("Please select a category");
		System.out.println("1.Duck");
		System.out.println("2.Fish");
		String piece = sc.nextLine();
		if(piece.equals("Duck")){
		System.out.println("  __");
		System.out.println("<(o )___");
		System.out.println("( ._> /");
		System.out.println("`---'");
		}
		if(piece.equals("Fish")){
		System.out.println("   ._  _");
		System.out.println(".-*'`    `*-.._.-'/");
		System.out.println("< * ))     ,       (");
		System.out.println("`*-._`._(__.--*`.\\");
		
		}

		}
		else{
		System.out.print("You didn't choose a piece, you exit the exhibit");
		}




		
	}
}
