/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
			Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number to create a range for ur two numbers: ");
        int num = sc.nextInt();
        	Scanner n = new Scanner(System.in);
        	System.out.println("Please enter a new number that is bigger than the one u put before: ");
        int num1 = n.nextInt();
        System.out.println("Your range is " + num + " to " + num1);
       System.out.print( (int)(Math.random()*(num1 - num) )+ num);
	}
}
