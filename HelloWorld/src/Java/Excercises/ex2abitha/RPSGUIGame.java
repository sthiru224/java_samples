import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class RPSGUIGame extends JFrame {

	// buttons for the user to enter their move
	private JButton rockButton, paperButton, scissorsButton;
	// labels to display the number of wins/losses/ties
	private JLabel statusC, statusU, statusT;
	// images and labels to display the computer and user's moves and the outcome of a match-up
	private ImageIcon rockImage, paperImage, scissorsImage;
	private JLabel compPlay, userPlay;
	private JLabel outcome;
	
	// the game object
	private RPSGame game;

	public RPSGUIGame() {

		// initializes the window
		super("Rock, Paper, Scissors, Go!");
		setSize(650, 600);
		Container contentPane = getContentPane();
		contentPane.setLayout(new BorderLayout());
		contentPane.setBackground(Color.black);
		setResizable(false);

		// creates the game object
		// 	NOTE: IF COMPLETING THE EXTRA CREDIT, YOU WILL NEED TO ADD A PARAMETER TO REPRESENT THE BET AMOUNT
		game = new RPSGame(0,0,0);


		// creates the labels for displaying the computer and user's move;
		// the images for the moves and the outcome of a match-up will be displayed
		// in a single panel
		rockImage = new ImageIcon("img/rock.jpg");
		paperImage = new ImageIcon("img/paper.jpg");
		scissorsImage = new ImageIcon("img/scissors.jpg");

		compPlay = new JLabel();
		compPlay.setVerticalTextPosition(SwingConstants.BOTTOM);
		compPlay.setHorizontalTextPosition(SwingConstants.CENTER);
		compPlay.setBorder(BorderFactory.createLineBorder(Color.black, 5));
		compPlay.setForeground(Color.cyan);
		compPlay.setFont(new Font("TimesRoman", Font.BOLD, 18));
		userPlay = new JLabel();
		userPlay.setVerticalTextPosition(SwingConstants.BOTTOM);
		userPlay.setHorizontalTextPosition(SwingConstants.CENTER);
		userPlay.setBorder(BorderFactory.createLineBorder(Color.black, 5));
		userPlay.setForeground(Color.cyan);
		userPlay.setFont(new Font("TimesRoman", Font.BOLD, 18));
	
		outcome = new JLabel();
		outcome.setHorizontalAlignment(SwingConstants.CENTER);
      outcome.setForeground(Color.pink);
		
		JPanel imageOutcomePanel = new JPanel();
		imageOutcomePanel.setBackground(Color.black);
		imageOutcomePanel.setLayout(new BorderLayout());
		imageOutcomePanel.add(compPlay, BorderLayout.WEST);
		imageOutcomePanel.add(userPlay, BorderLayout.EAST);
		imageOutcomePanel.add(outcome, BorderLayout.SOUTH);
		
		// creates the labels for the status of the game (number of wins, losses, and ties);
		// the status labels will be displayed in a single panel
		statusC = new JLabel("Computer Wins: " + game.getNumComputerWins());
		statusU = new JLabel("User Wins: " + game.getNumUserWins());
		statusT = new JLabel("Ties: " + game.getNumTies());

		statusC.setFont(new Font("Helvetica", Font.PLAIN, 20));
		statusU.setFont(new Font("Helvetica", Font.PLAIN, 20));
		statusT.setFont(new Font("Helvetica", Font.PLAIN, 20));
		outcome.setFont(new Font("Helvetica", Font.PLAIN, 20)); 

		statusC.setForeground(Color.white);
		statusU.setForeground(Color.white);
		statusT.setForeground(Color.white);
		JPanel statusPanel = new JPanel();
		statusPanel.setBackground(Color.black);
		statusPanel.add(statusC);
		statusPanel.add(statusU);
		statusPanel.add(statusT);

		// the play and status panels are nested in a single panel
		JPanel gamePanel = new JPanel();
		gamePanel.setPreferredSize(new Dimension(250, 250));
		gamePanel.setBackground(Color.black);
		gamePanel.add(imageOutcomePanel);
		gamePanel.add(statusPanel);
		
		// creates the buttons and displays them in a control panel;
		// one listener is used for all three buttons
		rockButton = new JButton("Play Rock");
		rockButton.addActionListener(new GameListener());
		paperButton = new JButton("Play Paper");
		paperButton.addActionListener(new GameListener());
		scissorsButton = new JButton("Play Scissors");
		scissorsButton.addActionListener(new GameListener());

		JPanel controlPanel = new JPanel();
		controlPanel.add(rockButton);
		controlPanel.add(paperButton);
		controlPanel.add(scissorsButton);
		controlPanel.setBackground(Color.black);

		// the gaming and control panel are added to the window
		contentPane.add(gamePanel, BorderLayout.CENTER);
		contentPane.add(controlPanel, BorderLayout.SOUTH);
		
		setVisible(true);
	}

	/* determines which button was clicked and updates the game accordingly */
	private class GameListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			
			System.out.println("Inside GameListener");
			if(event.getSource() == rockButton) {
			System.out.println("rockButton called me");
				userPlay.setIcon(rockImage);
				playAGame(game.ROCK);
		   }else if(event.getSource() == paperButton) {
			System.out.println("paperButton called me");
				userPlay.setIcon(paperImage);
				playAGame(game.PAPER);
            }
            else if(event.getSource() == scissorsButton){
			System.out.println("scissorsButton called me");
   				userPlay.setIcon(scissorsImage);
		       	playAGame(game.SCISSORS);
			}
		}
	}


	
	public void playAGame(int buttonClicked) {
		int choiceByTheComputer = game.generateComputerPlay();
		
		if (choiceByTheComputer==game.ROCK)
		{
			compPlay.setIcon(rockImage);
		}else if (choiceByTheComputer==game.PAPER){
			compPlay.setIcon(paperImage);
		}else if (choiceByTheComputer==game.SCISSORS){
			compPlay.setIcon(scissorsImage);
		}



		int result = game.findWinner(choiceByTheComputer,buttonClicked);

		if ( result == game.COMPUTERWINS ){
			statusC.setText("Computer Wins: " + game.getNumComputerWins());
			outcome.setText("You Lost!");
		} else if ( result == game.TIES ){
			statusT.setText("Ties: " + game.getNumTies());
			outcome.setText("Tie Game!");
		} else if ( result == game.USERWINS ){
        	statusU.setText("User Wins: " + game.getNumUserWins());
        	outcome.setText("You Won!");
		}
	}


	public static void main(String args[]) {
		// create an object of your class
		RPSGUIGame frame = new RPSGUIGame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}