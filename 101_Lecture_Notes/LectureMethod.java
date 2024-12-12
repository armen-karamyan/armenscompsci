/* 
    Lecture note example - Methods
*/

class LectureMethod{
    public static void main(String args[]) {
        
        printAnimal();
        greetings("John");
        double num = raise(100000, 15);
        System.out.println(num);
        num = raise(num, 15);
        System.out.print(num);
        
        
        // Your Code Goes here!
	}
	
	public static void greetings(String name){
	    System.out.println("wsp " + name);
	    
	}
	
	
	
	public static double raise(double salary, int percent) {
	    double amount = salary + (salary * (percent/100.0));
	    return amount;
	}
	    
	    
	
	public static void printAnimal(){
	    System.out.println(" /\\ /\\ ");
        System.out.println("((ovo))");
        System.out.println("():::()");
        System.out.println("  VVV");

	}
}