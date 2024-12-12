/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		
		int a = 13 - 6 * 11;
		int a1 = 30 % 7 * (-2);
		int aResult = Math.max(a, a1);
		System.out.println(aResult);
		
		double b = 3 * 8 + 31 % 7;
		double bResult = Math.sqrt(b);
		System.out.println(bResult);
		
		double c = 37 / 3;
		double c1 = 35 % 21;
		double cAnswer = Math.pow(c, c1);
		System.out.println(cAnswer);
		
		double d =  2;
		double d1 = 14%3;
		double d2 = 2*6;
		double d3 = Math.pow(d, d1);
		double d4 = Math.sqrt(d2);
		double d5 = Math.max(d3, d4);
		System.out.println(d5);
	}
}
