/**
 * Each WordWithCount will represent a token (String) found in a text file
 * not necessarily English or a word... and the frequency that the token has
 * appeared in the text (or texts, really). 
 * 
 * A WordWithCount needs a way to give us its token and frequency.  We should 
 * be able to increase its frequency (in the event that we find a subsequent occurrence
 * of the token).  We need an appropriate toString method.  We need an appropriate 
 * compareTo method.
 * 
 * @author RHanson
 *
 */

public class WordWithCount implements Comparable<WordWithCount>{

	/*
	 * Add private data here.  What does our WordWithCount need to know about
	 * itself and keep track of throughout its existence?
	 * Fill in the WordWithCount class.  
	 * 		Add in the private data 
	 * 		Add in the accessor methods
	 * 		Write the compareTo method.  
	 * 		Add in ability to compare using different criteria (alpha, frequency or length)
T	 * 		Test the WordWithCount class as you are developing it.
	 */
	
	private String word;
	private int count;
	
	/**
	 * Constructor for WordWithCount probably only needs one argument.
	 * It could make sense to write a second constructor for this class.
	 * @param args
	 */
	
	public WordWithCount(String word) {
		this.word = word;
		this.count = 1;
	}



	public String getWord() {
		return(this.word);
	}
	
	public int getCount() {
		return(this.count);
	}
	
	/**
	 * Like all other compareTo methods, this returns positive int if this
	 * WordWithCount is larger than the specified (input) WordWithCount.
	 * 
	 * This really can get more complicated, though.  Do I always want to 
	 * compare myself alphabetically?  There may be some times when I want 
	 * to compare myself by frequency, or by length of token...  How could 
	 * we accomplish this different behavior?
	 * 
	 */
	 @Override
	public int compareTo(WordWithCount other) {
		System.out.println("I am here....");
		return(this.word.compareTo(other.word));
		
	}
	 
	 public int compareTo(WordWithCount other, int compareBy) {

		 switch(compareBy){  // compare alphabetically
		 	case 1: {
		 		 System.out.println("In compareTo " +  this.word.compareTo(other.word));
		 		 if (this.word.compareTo(other.word) > 0) return(1);
		 		 else if (this.word.compareTo(other.word) < 0) return(-1);
		 		 else return(0);
			 }  
		 	case 2: {  // sort by frequency 
		 		 if (this.count > other.count) return(1);
		 		 else if (this.count < other.count) return(-1);
		 		 else return(0);
			 }
		 	case 3: {  // sort by length 
		 		 if (this.word.length() > other.word.length()) return(1);
		 		 else if (this.word.length() < other.word.length()) return(-1);
		 		 else return(0);
		 	}
		 	default: return(99);
		 	
		 } // switch
		 
			
	}
	 
	 
	
	public static void main(String[] args) {
		
		int methodOfSorting = Integer.parseInt(args[0]);
		// test the constructors and accessors and modifiers
		// make a couple of WordWithCount Objects
		
		WordWithCount w1 = new WordWithCount("One");
		WordWithCount w2 = new WordWithCount("Two");
		WordWithCount w3 = new WordWithCount("Three");
		WordWithCount w4 = new WordWithCount("Three");
		WordWithCount w5 = new WordWithCount("lengthy");
		
		
		// test the accessors

		System.out.println("w1.word = " + w1.getWord() + " w1.count = " +w2.getCount());
		System.out.println("w2.word = " + w2.getWord() + " w2.count = " +w2.getCount());
		System.out.println("w3.word = " + w3.getWord() + " w3.count = " +w4.getCount());
		System.out.println("w4.word = " + w4.getWord() + " w4.count = " +w4.getCount());
		System.out.println("w5.word = " + w5.getWord() + " w5.count = " +w5.getCount());

		// test the compareTo (possibly using different criteria to base the 
		// comparison on)

		System.out.println("Compare alphabetically  : w1.compareTo(w2,1) = " + w1.compareTo(w2,1));
		System.out.println("Compare by frequency    : w1.compareTo(w2,2) = " + w1.compareTo(w2,2));
		System.out.println("Compare by length       : w1.compareTo(w2,3) = " + w1.compareTo(w2,3));
		System.out.println("Compare by length       : w1.compareTo(w2,methodOfSorting) = " + w1.compareTo(w2,methodOfSorting));
		
		System.out.println("Compare alphabetically  : w2.compareTo(w3,1) = " + w2.compareTo(w3,1));
		System.out.println("Compare by frequency    : w2.compareTo(w3,2) = " + w2.compareTo(w3,2));
		System.out.println("Compare by length       : w2.compareTo(w3,3) = " + w2.compareTo(w3,3));
		System.out.println("Compare by length       : w2.compareTo(w3,methodOfSorting) = " + w2.compareTo(w3,methodOfSorting));

		System.out.println("Compare alphabetically  : w3.compareTo(w4,1) = " + w3.compareTo(w4,1));
		System.out.println("Compare by frequency    : w3.compareTo(w4,2) = " + w3.compareTo(w4,2));
		System.out.println("Compare by length       : w3.compareTo(w4,3) = " + w3.compareTo(w4,3));
		System.out.println("Compare by length       : w3.compareTo(w4,methodOfSorting) = " + w3.compareTo(w4,methodOfSorting));

		System.out.println("Compare alphabetically  : w5.compareTo(w4,1) = " + w5.compareTo(w4,1));
		System.out.println("Compare by frequency    : w5.compareTo(w4,2) = " + w5.compareTo(w4,2));
		System.out.println("Compare by length       : w5.compareTo(w4,3) = " + w5.compareTo(w4,3));
		System.out.println("Compare by length       : w5.compareTo(w4,methodOfSorting) = " + w5.compareTo(w4,methodOfSorting));
		
		
	}


}
