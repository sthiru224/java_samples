import java.util.*;

// Problem #1a) from 2014 (1b uses lists)
public class StringReasoning {

	// Part (a) – scrambleWord

/*	
	public static String scrambleWord(String word)
	{
	  for(int i = 1; i < word.length(); i++) {
	    if( ("A".equals(word.substring(i-1, i)))  &&  ! ("A".equals(word.substring(i, i+1))))
		    { // Swap 
	    			// System.out.println(word + " : " + word.substring(0, i-1)  + " " +  word.substring(i, i+1)  + " " +  word.substring(i-1, i)  + " " +  word.substring(i+1));
		         word = word.substring(0, i-1) + word.substring(i, i+1) + word.substring(i-1, i) + word.substring(i+1);
		      i++;
		    }
	   }   
	   return word;
	}

*/	

	public static String scrambleWord(String word)
	{
		  if (word.indexOf("A")>=0) {
			for(int i = 0; i < word.length()-1; i++) {
						System.out.println("i = " + i );
						System.out.println("inside if " + word.substring(i, i+1));
					  if (word.substring(i, i+1).equals("A")) {
						  System.out.println(" I am here 1 " + i);
						  if (!word.substring(i+1,i+2).equals("A")) {
							  System.out.println(" I am here 2 ");
							  word = swap(i,i+1,word);
								System.out.println("inside if  ---" + word);
							  if (word.substring(i+1, i+2).equals("A")) {
								  i++;
							  }
						  }
						  
				      }
			  } // for
		}   
		
	   return word;
	}
	
	public static String swap (int x, int y, String word) {
		  System.out.println(" I am here in Swap " + x + " " + y);

		return(word.substring(0,x) +word.substring(y,y+1) + word.substring(x,x+1) + word.substring(y+1,word.length()));

	}
	
	
	//Part (b) – scrambleOrRemove
	
	public static void scrambleOrRemove(List<String> wordList)
	{
	  for(int i = wordList.size() - 1; i >= 0; i--)
	  {
	    String scrambled = scrambleWord(wordList.get(i));
	    if(wordList.get(i).equals(scrambled))
	      wordList.remove(i);
	    else
	      wordList.set(i, scrambled);
	  }
	}
	
	public static void main(String[] args) {
		System.out.println("--------------------Question 1 A -----------------------------");
		System.out.println(" Scrable of TAN is " + scrambleWord("TAN"));
		
		System.out.println("--------------------------------------------------");
		System.out.println(" Scrable of ABRACADABRA is " + scrambleWord("ABRACADABRA"));
		System.out.println("--------------------------------------------------");
		System.out.println(" Scrable of WHOA is " + scrambleWord("WHOA"));
		System.out.println("--------------------------------------------------");
		System.out.println(" Scrable of AARDVARK is " + scrambleWord("AARDVARK"));
		System.out.println("--------------------------------------------------");
		System.out.println(" Scrable of EGGS is " + scrambleWord("EGGS"));
		System.out.println("--------------------------------------------------");
		System.out.println(" Scrable of A is " + scrambleWord("A"));
		System.out.println("--------------------------------------------------");
		System.out.println(" Scrable of   is " + scrambleWord(" "));
		System.out.println("--------------------------------------------------");
		System.out.println("--------------------Question 1 B -----------------------------");
		
		List wordList = new ArrayList();
		wordList.add("TAN");
		wordList.add("ABRACADABRA");
		wordList.add("WHOA");
		wordList.add("APPLE");
		wordList.add("EGGS");
		System.out.println("---------------------Given List----------------------");
		for(int i = 0; i<=wordList.size() - 1; i++) {
			System.out.print( wordList.get(i) + " , " );
		}
		System.out.println("");
		System.out.println("--------------------------------------------------");

		scrambleOrRemove(wordList);
		System.out.println("---------------------Updated List----------------------");
		for(int i = 0; i<=wordList.size() - 1; i++) {
			System.out.print( wordList.get(i) + " , " );
		}
		System.out.println("");
		System.out.println("--------------------------------------------------");

	}
}
