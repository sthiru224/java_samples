// Problem #2 from 2015 exam.
public class HiddenWord {
	  private String word;

	  public HiddenWord(String word){
	    this.word = word;
	  }
	
	  /*
	  public String getHint(String guess){
	    String hint = "";

	    for(int i = 0; i < word.length(); i++)
	    {
	      String guessLetter = guess.substring(i, i + 1);
	      if(word.substring(i, i + 1).equals(guessLetter))
	    	  		hint += guessLetter;
	      else if(word.indexOf(guessLetter) != -1)
	    	  		hint += "+";
	      else
	    	  		hint += "*";
	    }
	    return hint;
	  }

*/
	  public String getHint(String guess){
		    String returned = "";

		    for(int i = 0; i < word.length(); i++)
		    {
		       
		      if(word.indexOf(guess.charAt(i)) >= 0 ) {
			    	  	if(word.charAt(i) == guess.charAt(i)) {
			    	  		returned += word.charAt(i) ;
			    	  	} else {
			    	  		returned += "+" ;
			    	  	} 
		      } else {
		    	  			returned += "*" ;
		      }
		    }
		      return returned;
	
	  } 
	  public static void main(String[] args) {
		  
		  HiddenWord puzzle = new HiddenWord("HARPS");

		  System.out.println("Given Word is HARPS");
		  
		  System.out.println("   AAAAA ===> " + puzzle.getHint("AAAAA"));
		  System.out.println("   HELLO ===> " + puzzle.getHint("HELLO"));
		  System.out.println("   HEART ===> " + puzzle.getHint("HEART"));
		  System.out.println("   HARMS ===> " + puzzle.getHint("HARMS"));
		  System.out.println("   HARPS ===> " + puzzle.getHint("HARPS"));
		  System.out.println("   TESTING ===> " + puzzle.getHint("TESTING")); //  NG is ignored
	  }

}