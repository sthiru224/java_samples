
/**
 * SciFiName gathers input from a user to generate a custom name that
 * sounds like it could be used in a science fiction book or movie.
 * 
 * @author ckinnard
 * @version 3/4/16
 */

public class SciFiName   
{
	
	private class MakeName {
		
		  public String getSciFiFirstName(String fName, String lName){
			  return(fName.substring(0,3).concat(lName.substring(0,2)));
			  }
		  
		  public String getSciFiLastName(String cName, String sName){
			  return(cName.substring(0,2).concat(sName.substring(0,3)));
			  }	  
		  
		  public String getSciFiPlaceOfOrigin(String rName1, String rName2){
			  
			  int k1 = (int)Math.random()*rName1.length();
			  int k2 = (int)Math.random()*rName2.length();
			  
			  String relFname1 =  rName1.substring(k1, rName1.length());
			  String relFname2 =  rName1.substring(k2, rName2.length());
			  return(relFname1.concat(relFname2));
			  }	  
    }
	   
	   
    /**
     * All input that you provide should be at least three letters long
     * or the program may crash (but feel free to test this!)
     * 
     * For best results, user lowercase letters and do not use spaces in your input
     */
    public static void main(String[] args)
    {
        System.out.println("If you provide me some information I will provide a Science Fiction name for you.");
        System.out.println("Please have all responses  be at least three characters long.");
        System.out.println("For best results, user lowercase letters with no spaces.\n");

        // notice this meth0d (print) does not print a newline
        System.out.print("Enter your first name: ");
        String firstName = UserInput.getString();
        System.out.print("Enter your last name: ");
        String lastName = UserInput.getString();
        System.out.print("Enter the city where you or one of your parents were born: ");
        String city = UserInput.getString();
        System.out.print("Enter the name of your grammar school: ");
        String school = UserInput.getString();
        System.out.print("Enter the first name of a sibling or other relative: ");
        String relativeName1 = UserInput.getString();
        System.out.print("Enter the first name of a second sibling or relative: ");
        String relativeName2 = UserInput.getString();

        // generate a sciFi name
        MakeName maker = new MakeName();
        
        // give the MakeName the info it needs to give us the sci fy name.  
        // How much info does it need? Hint, look at the unused variables from above.
        
        // Then, catch the answer and display it.
        // ultimately we would like to randomly print out responses that include the info returned from the MakeName

     
        
        System.out.println("Hi there!  I see your name is ");
        System.out.println("No way, you are from ");
        
        int diceRoll = (int) (Math.random()*11)+2;
        System.out.println(" diceRoll "  + diceRoll);
        
        diceRoll = (int) (Math.random()*6)+1;
        System.out.println(" diceRoll "  + diceRoll);
        
        diceRoll += (int) (Math.random()*6)+1;
        System.out.println(" diceRoll "  + diceRoll);
        
    }
}
