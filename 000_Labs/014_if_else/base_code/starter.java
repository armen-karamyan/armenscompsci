/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Guess a number any number in between 1 and 1000:");
		int num = sc.nextInt();
		int x = (int) (Math.random() * 1000) + 1;
		int num1 = x;
		if(num > num1){
			
			System.out.print(" You are less than the number keep trying");
		}
		
			
		
		
	
	}
}
