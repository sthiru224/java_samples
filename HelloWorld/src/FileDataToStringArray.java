import java.io.BufferedReader;
import java.io.FileReader;

public class FileDataToStringArray {
	public static void main(String[] args) {
		String[] arg= new String[50];
		String str;
		char chrs;
		try {
		    BufferedReader in = new BufferedReader(new FileReader("/Users/tsamband/Documents/Java/Begin/HelloWorld/src/data.txt"));
		    while ((str = in.readLine()) != null) {
			    	System.out.print(str);
				System.out.println(" Length of str : " + str.length());
		    		
		        int j=0;
		    		arg[j]="";

		    		for (int i = 0; i < str.length(); i++) {
	                chrs = str.charAt(i); 
		            if (((chrs==' ') | (chrs == '\n')) && (arg[j]!="")) { 
		            		j++; 
						arg[j]="";
		            }
		            if ((Character.isDigit(chrs) | chrs == '-')) arg[j] = arg[j]+chrs;		             
	            } // forloop
		    
		     for (int k=0;k<=j;k++) System.out.print(" arg["+k+"] = " + arg[k]);
		     System.out.println();
	    } // whileloop - for every line in the file
		    
	        in.close();
	        

	        
		}
		catch (Exception e) {
			System.err.println("Error: " + e.getMessage());
		}

	}
}
