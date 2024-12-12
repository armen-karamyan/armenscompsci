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
		System.out.print("Please enter one number");
		
		int ans = sc.nextInt();
		
		System.out.print("Please enter another number ");
		
		int ans1 = sc.nextInt();
		
		if(ans == ans1){
			System.out.print("WOAHH THERE THE SAME NUMBER!! Did u do that on purpose??");
		
		}
		else if(ans != ans1) 
			System.out.print("Welp just as i thought there different numbers");
	}
}
