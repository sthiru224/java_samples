import java.util.InputMismatchException;
import java.util.Scanner;

class EvenFinder {
	public static void main(String args[]) {
		int x;
		Scanner in = new Scanner(System.in);
		System.out.println("Welcome! Please enter an even number.");
		while (true) {
							try {
									x = in.nextInt();
									if (x % 2 != 0) {
										System.out.println("What you entered was not an even number. Please enter an even number.");
									} else {
										System.out.println("Yay!! You entered an even number. Thank you!");
										return;
									}  
								} // try 
							catch (InputMismatchException ex) {
								System.out.println("Not a number! Please enter a  number.");
								in.next();
							} // catch 
		} //while 
	}

}