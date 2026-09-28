/*
 *	Author: Dylan Glandian
 *  Date: 9/22/26
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		int red = (int)(Math.random() * 256);
        int green = (int)(Math.random() * 256);
        int blue = (int)(Math.random() * 256);
        int dylan = (int)(Math.random() * 128);
        int java = (int)(Math.random() * 128);
        int color = (int)(Math.random() * 128);
        int starter = (int)(Math.random() *128 +128);
        int colour = (int)(Math.random() * 128 + 128);
        int apple = (int)(Math.random () * 128 + 128);

		 getColor(red,green,blue); 

         getColor(255-red,255-green ,255-blue );
         getColor(blue, red, green);
         getColor(green, blue, red);
         getColor(dylan, java, color);
         getColor(starter,colour,apple);
	}

	public static void getColor(int red, int green, int blue){
        String startColor = "\u001B[48;2;" + red + ";" + green + ";" + blue + "m";
        String resetColor = "\u001B[0m";
        String swatch = startColor + "                    " + resetColor;
        System.out.println(swatch);
        
        
    }
}
