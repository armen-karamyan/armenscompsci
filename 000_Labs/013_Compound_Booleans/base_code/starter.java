/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
			Scanner sc = new Scanner(System.in);
		System.out.print("Please enter one number: "); 
		int num = sc.nextInt();
		System.out.print("Enter another number: ");
		int num1 = sc.nextInt();
		System.out.println("Please enter one more number");
		int num2 = sc.nextInt();
		if((num>num1) && (num>num2)){
			System.out.println("Ur first number is greater than all the rest");
		}
		if((num1> num) && (num1>num2)){
				System.out.print("Ur second number is greater than the other numbers");
			}
			
		if((num2>num1) && (num2> num)){
			System.out.print("Ur 3rd number is greater than the rest");
		}
		
			
			
		}
	}	

