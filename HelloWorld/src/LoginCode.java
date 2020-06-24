import java.util.Scanner;
public class LoginCode {
	    public static void main(String[] args) {
	        // Create a Scanner object
	        try {
	        		Scanner s = new Scanner(System.in);
	        		
	            System.out.print("Enter User ID: ");
	            String login = s.next();
	            
	            System.out.print("Enter Passcode: ");
	            int passcode = s.nextInt();
	            
	            System.out.println(" Login : " + login + " Passcode : " + passcode);
	            
	            if(login.compareTo("swetha")==0 && passcode == 9090) {
	            		System.out.println("Login Success");
	            }
	            else {
            			System.out.println("Login Failed");
	            }
	            s.close();
	        } catch (Exception e) {
	            e.printStackTrace(System.err);
	        }
	    }
}