import java.io.File;
import java.util.Scanner;

public class FileProcessor  {

	WordWithCountList list = new WordWithCountList();
	Scanner fileScanner;
	String filename, str;
	
	public static void main(String[] args) {
		new FileProcessor().start();

	}

	private void start() {

	   try {

			// prompt the user for the file to process.  This will be the contents
			// of a novel (text file).
			promptAndOpenFile();
			
			// The file will be scanned (using a scanner) inputting one token at a time
			// cleaning and standardizing the token, then adding the token to our 
			// WordWithCountList. 
			
			// we will use fileScanner methods hasNext() which tells us if there is more 
			// to be scanned from the file, and the    next() method which returns the latest
			// token and advances the file pointer.
			
	        System.out.println("From start() method : Current novel file with path:"+filename);
	        
	        fileScanner = new Scanner(new File(filename));
	        while (fileScanner.hasNext()){
	           str = fileScanner.nextLine();
	           System.out.println(str);
	           
	          // WordWithCount w1 = new WordWithCount(str);
	           
	        }
	           
	}
		catch (Exception e) {
		System.err.println("Error: " + e.toString());
		}

		//After the file is done being processed, the results 
		// will be displayed.  This will include displaying the words alphabetically, 
		// or by frequency or by length (depending on the user's choice).
		
		
	}
	
	/**
	 * Prompts the user for a file to be processed.  JFileChooser Objects are 
	 * GREAT for this!!  
	 * 
	 * After prompting for the file, this method assigns the class variable
	 * fileScanner to a new Scanner that points to the desired file.
	 */
	private void promptAndOpenFile() {
		// TODO Auto-generated method stub
	
    try {
		fileScanner = new Scanner(System.in);
		System.out.print("Enter filename:");
		filename = fileScanner.nextLine();
		
		// String currentDir = new java.io.File( "." ).getCanonicalPath();
		
       // System.out.println("Current dir:"+currentDir);
        
       //  filename = currentDir + "/data/" + filename;
		
		filename = "/Users/tsamband/Documents/Java/Begin/WordFrequencyProject/data/" + filename;
        
        System.out.println("Current novel file with path:"+filename);
  	        
		}
		catch (Exception e) {
			System.err.println("Error: " + e.getMessage());
		}

		
	}

	/**
	 * This method lowercases the String.  
	 * This method cleans off any characters from the front and back of the 
	 * specified String.   Example:  if s = "Happy,", "happy" is returned
	 * @param s  The String to be standardized.  
	 * @return  the standardized String
	 */
	private String standardize(String s) {
		String result = "";
		result = s.toLowerCase();
		return result;
	}

}
