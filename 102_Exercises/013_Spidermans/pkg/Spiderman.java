package pkg;
import java.util.Scanner;
import java.util.Random;


public class Spiderman {
	String actor;		// What's the actors name?
	int age;			// What's the age of the actor?
	String villian;		// Who's the arch nemesis of this Spiderman?

	// Create constructors for each combination of actor/age/villain. Use the defaults above if not an input parameter.
	// Default constructor! 				Actor - Unknown, Age - 0, Villain - Unknown
	// String Actor constructor! 			Age - 0, Villain Unknown 
	// int Age constructor! 				Actor - Unknown, Villain Unknown
	// String Actor, int Age constructor! 	Villain Unknown
	// String Actor, int Age, String Villain constructor!		
	
	public Spiderman(){
		actor = "unkown";
		age = 0;
		villian = "unknown";
	}
	
		public Spiderman(String n){
		actor = n;
		age = 0;
		villian = "unknown";
	}
	
		public Spiderman( int a){
		actor = "unknown";
		age = a;
		villian = "unknown";
	}
	
		public Spiderman(String n, int a){
		actor = n;
		age = a;
		villian = "Unkown";
		
		
	}
		public Spiderman(String n, int b, String c){
		actor = n;
		age = b;
		villian = c;
	}
	
	
	
	
	
	// ---------------------------------------
	// Create accessor and mutator methods for actor, age, and villain (6 total methods)
	// Ex: getAge and setAge
	public void setVillian(String villian){
		this.villian = villian;
	}
	public void setActor(String actor) {
		this.actor = actor;
		
	}
	
	public void setAge(int age){
		this.age = age;
		
		
	}
	                  


	// ---------------------------------------
	public void fight(){
		System.out.println("Spidey shoots his web at " + villian);
	}

	public void printArt(){				// Prints out Spidey!
	System.out.println("           :              ");  
    System.out.println("           ;              ");   
    System.out.println("          :               ");   
    System.out.println("          ;               ");   
    System.out.println("         /                ");   
    System.out.println("       o/                 ");   
    System.out.println("     ._/\\___,             ");    
    System.out.println("         \\                ");   
    System.out.println("         /    			  "); 
	}
}
