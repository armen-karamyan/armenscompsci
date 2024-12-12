package pkg;

public class Movie{
    String movieName;
    double rating;
    int numRating;
    int revenue;



    public Movie(){
        movieName = "Averngers";
        rating = 8.0;
        numRating = 33;
        revenue = 623357910;
    
        
    }
    
    public Movie(String name, double rat, int rating, int rev){
        movieName = name;
        this.rating = rat;
        numRating = rating;
        revenue = rev;
        
        
        
       
    }
    public void movieToString(){
         System.out.println("Movie: " + movieName);
        System.out.println("Rating: " + rating);
        System.out.println("Number of ratings: " + numRating);
        System.out.println("Revenue: " + revenue);
    }
    
    public String getMovieName(){
        return movieName;
          
          
    }
    
    public int getRevenue(){
        
        
         return revenue;

}
    public void addRating(double a){
        rating = rating * numRating;
        rating = rating + a;
        numRating = numRating + 1;
        rating = rating / numRating;
        
    }

}
