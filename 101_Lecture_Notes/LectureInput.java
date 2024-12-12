/* 
    Lecture note example - Input and Scanner
*/

import java.util.Scanner;
class LectureInput{
    public static void main(String args[]) {
        
        // Your Code Goes here!
        
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your name");
        String num = sc.nextLine();
        System.out.print("The next 5 numbers are: ")
        
        
        System.out.println( );
        
        System.out.println("Please enter a number");
        int bob = sc.nextInt();
        sc.nextLine();
        System.out.println("Please enter anothernumber");
        int somethingElse = sc.nextInt();
        sc.nextLine();
        
        System.out.println(" The sum of these numbers are:" + (bob + somethingElse));
        
        System.out.println("What is your favorite food?");
        String food = sc.nextLine();
        
	}
}