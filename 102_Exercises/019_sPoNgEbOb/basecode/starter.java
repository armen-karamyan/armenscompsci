/*
	Author:
	Date:
*/
import java.util.*;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a word/phrase");
		String sentence = sc.nextLine();
		while(true){
			if(sentence.indexOf(" ") == -1){
				System.out.print(spongeCase(sentence) + " ");
				break;
			}
			int space = sentence.indexOf(" ");
			String word = sentence.substring(0,space);
			System.out.print(spongeCase(word) + " ");
			
			sentence = sentence.substring(space+1);
			
		}
			
		/*
		String f;
		String c;
		String d;
		String l;
		String o;
		String s;
		String t;
		String w;
		String y;
		String i;
		
		 f = x.substring(0,1);
		 f = f.toLowerCase();
		 System.out.print(f);
		 c= x.substring(1,2);
		 c= c.toUpperCase();
		 System.out.print(c);
		 d = x.substring(2,3);
		 d = d.toLowerCase();
		 System.out.print(d);
		 l = x.substring(3,4);
		 l = l.toUpperCase();
		 System.out.print(l);
		 o = x.substring(4,5);
		 o = o.toLowerCase();
		 System.out.print(o);
		  s = x.substring(5,6);
		 s = s.toLowerCase();
		 System.out.print(s);
		  t = x.substring(6,7);
		 t = t.toUpperCase();
		 System.out.print(t);
		  w = x.substring(7,8);
		 w = w.toLowerCase();
		 System.out.print(w);
		  y = x.substring(8,9);
		 y = y.toUpperCase();
		 System.out.print(y);
		  i = x.substring(9,10);
		 i = i.toLowerCase();
		 System.out.print(i);
		
		*/
	
		
		
	
	}


	public static String spongeCase(String word){
		
		String result = " ";
		for(int i = 0; i < word.length(); i++){
			String letter = word.substring(i, i+1);
			
			if(i%2 == 0){
			letter =	letter.toLowerCase();
				
			}
			
			else{
			letter =	letter.toUpperCase();
			}
			result = result + letter;
			System.out.print(result);
			
		}
	return result;
}

}
