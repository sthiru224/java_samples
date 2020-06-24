import java.io.BufferedReader;
import java.io.FileReader;

public class GetDataFromFile {
	public static void main(String[] args) {
		String str;
		try {
		    BufferedReader inputFile = new BufferedReader(new FileReader("/Users/tsamband/Documents/Java/Begin/HelloWorld/src/data.txt"));
		  
		    
		   while ( (str = inputFile.readLine()) != null) {
			    	System.out.print(str);
				System.out.println(" Length of str : " + str.length());
					
		    } // whileloop 
		    inputFile.close();
		} //try 
		catch (java.io.FileNotFoundException e) {
			System.out.println("Error1: " + e.toString());
		}
		catch (java.io.IOException e) {
			System.out.println("Error2: " + e.toString());
		}
		catch(Exception e) {
			System.out.println("Error3: " + e.toString());			
		}

	}
}
