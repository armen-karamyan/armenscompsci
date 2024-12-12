/*
 *	Author:
 *  Date:
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	int [] arr = new int [1001];
	for(int i = 0; i <1001; i= i + 1){
		arr[i] = (i+1)*3;
		System.out.println("Index: " + i + " "+  "Value: " +arr[i]);
	}
	
		int [] arr2 = new int[1001];
	for(int x = 0; x < 1001; x = x +1){
		arr2[x] = 1000 - x;
		System.out.println("Index: "+ x + "Value: " +arr2[x]);
	
	}

}

}