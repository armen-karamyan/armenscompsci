/* 
    Lecture note example - If Statements
*/

    import java.util.Scanner;
class LectureIf{
    public static void main(String args[]) {
        // Your Code Goes here!
        Scanner sc = new Scanner(System.in);
        System.out.println("You walk down into a forest and are greeted with 3 paths");
        System.out.println("1. Path 1");
        System.out.println("2. Path 2");
        System.out.println("3. Path 3");
        
        int answer1 = sc.nextInt();
        
        if(answer1 == 1){
            System.out.println("You go down a poth through the forest, while your going down you see a pack of wolves who look hungry ");
            System.out.println("What do you do??");
            System.out.println("1. You let the wolves eat you");
            System.out.println("2. You pick up a rock and fight off the wolves");
            System.out.println("3. You run away");
        
            int ans = sc.nextInt();
            
        if(ans == 1){
            System.out.println("GGs");
            
        }
        if(ans == 2){
            System.out.println("You are succesfull in fighting off the wolves but are greatly injured");
            
        }
        
        if(ans == 3){
            System.out.println("You run away back home and eat icecream");
        }
            
            
            
        }
            
        else if(answer1 == 2){
            System.out.println("Path along a Rocky Coastline");
        }
        
        else if(answer1 == 3){
            System.out.println(" Path through a Deserted Urban Alley");
            
        }
        else if(answer1 != 1){
            
            System.out.println(" A pack of wolfs come and eat you");
            
        }
        
        
        
	}
}