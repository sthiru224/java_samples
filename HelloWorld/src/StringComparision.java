
public class StringComparision {

	public static void main(String[] args) {
		String stringOne = "Test String";
		String stringTwo = stringOne + " ";
		boolean result = stringOne.equals(stringTwo);
		if(result) 
			System.out.println("Both Strings are same");
		else
			System.out.println("Strings are not same");
	}
	

}