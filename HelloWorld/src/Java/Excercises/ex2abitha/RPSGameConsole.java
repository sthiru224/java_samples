import java.util.Scanner;

public class RPSGameConsole {
	
	public static void main(String args[]) {

		// Declare variables to accept the User's & Computer's Choices
		int choiceByTheUser, choiceByTheComputer;
		// Declare variables to prompt  the User to stop or continue the game and to count the moves 
		int  stopTheGame = 0, totalMoves = 0; 

		// Create an instance of  RPSGame Class with the intial values or the number of wins as zeros.
		RPSGame demoRPSGame = new RPSGame(0,0,0);
		// Welcome message 
		System.out.println("RPS Game Welcomes You!!!");
		// Create an instance of the input scanner class 
		Scanner myScanner = new Scanner(System.in);

		// Check if the user wants to terminate the loop..if not keep continuing 
		while (stopTheGame != 3) {
			System.out.println("Enter Your Choice : [Paper : 0 | Rock : 1 |  Scissors : 2] : ");
			// Get the user's choice
			choiceByTheUser = myScanner.nextInt();
		
			// Loop until the user enters  one of the three valid values 0,1,or 2
			while (choiceByTheUser != 0 && choiceByTheUser != 1 && choiceByTheUser != 2)
			{
				System.out.println("Enter a valid Choice : [Paper : 0 | Rock : 1 |  Scissors : 2] : ");
				choiceByTheUser = myScanner.nextInt();
			}
			
			//Once the user enter a valid value - let the computer generate its choice 
			choiceByTheComputer = demoRPSGame.generateComputerPlay();
			// Increment totalMove by one to keep track of the number of totol move
			totalMoves++;
			// Find who is the winner - Computer or the user and print Noumber of wins
			demoRPSGame.findWinner(choiceByTheComputer,choiceByTheUser);
			System.out.print("Move number : " + totalMoves + " Number of Wins by Computer : " + demoRPSGame.getNumComputerWins() + " : ");
			System.out.print("Number of Wins by You      : " + demoRPSGame.getNumUserWins() + " : ");
			System.out.println("Number of Ties             : " + demoRPSGame.getNumTies() + " : ");

			// Check if the user is interested in countinuing the game or not
			System.out.println("Enter 1 if you want exit .... : ");
			stopTheGame = myScanner.nextInt();

		}
		System.out.println("Thank You for playing RPS Game !!!");
		System.out.println("               ------- Abitha  !!!");
	}
}
