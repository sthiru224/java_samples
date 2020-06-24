 import java.util.Random; 

public class RPSGame {

	// instance variables
	private int numComputerWins;
	private int numUserWins;
	private int numTies;
	
	public static final int COMPUTERWINS = 0;
	public static final int USERWINS = 1;
	public static final int TIES = 2;

	public static final int ROCK=1;
	public static final int PAPER=0;
	public static final int SCISSORS=2;
	


	public int userMove;
	public int computerMove;
	
	//constructor 
	public RPSGame(int thenumComputerWins,int theNumUserWins,int theNumTies) {
		numComputerWins = thenumComputerWins;
		numUserWins = theNumUserWins;
		numTies = theNumTies;
	}
	

	//getter and setters 
	public int getNumComputerWins(){
		return numComputerWins; 
	}
	public int getNumUserWins(){
		return numUserWins;
	}
	public int getNumTies() {
		return numTies;
	}
	public void setnumComputerWins (int theNewnumComputerWins) {
		numComputerWins = theNewnumComputerWins;
	}
	public void setNumUserWins (int theNewNumUserWins) {
		numUserWins = theNewNumUserWins;
	}
	public void setNumTies (int theNewNumTies) {
		numTies = theNewNumTies;
	}
	
	public int generateComputerPlay () {
		Random rn = new Random();
		int answer = rn.nextInt(3);
		computerMove = answer;
		return computerMove;
	}



	
	public int findWinner(int computerMove, int userMove ){
		if (computerMove==userMove){
			this.numTies ++;
			return(TIES);
		}
		else if (computerMove==ROCK && userMove==PAPER){
			this.numUserWins ++;
			return(USERWINS);
		}
		else if (computerMove==PAPER && userMove==ROCK){
			this.numComputerWins ++;
			return(COMPUTERWINS);
		}
		else if (computerMove==PAPER && userMove==SCISSORS){
			this.numUserWins ++;
			return(USERWINS);
		}
		else if (computerMove==SCISSORS && userMove==PAPER){
			this.numComputerWins ++;
			return(COMPUTERWINS);
		}
		else if (computerMove==ROCK && userMove==SCISSORS){
			this.numComputerWins ++;
			return(COMPUTERWINS);
		}
		else if (computerMove==SCISSORS && userMove==ROCK){
			this.numUserWins ++;
			return(USERWINS);
		}
		return(999);
	}
}


