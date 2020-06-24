import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;
import javax.swing.*;

public class RPSGameGUI extends JFrame {
	
	private JButton rockBtn, paperBtn, scissorsBtn;
	private ImageIcon rockImg, paperImg, scissorsImg;

	private JLabel computerMove, userMove, results;
	private JLabel winsByComputer, winsByUser, NoOfTies;
	private RPSGame demoRPSGameGUI;

	public RPSGameGUI() {
		super("Rock, Paper, Scissors, Go!");
		setSize(600, 460);
		Container contentPane = getContentPane();
		contentPane.setLayout(new BorderLayout());
		contentPane.setBackground(Color.black);
		setResizable(false);
		demoRPSGameGUI = new RPSGame(0,0,0);

		rockImg = new ImageIcon("img/rock.jpg");
		paperImg = new ImageIcon("img/paper.jpg");
		scissorsImg = new ImageIcon("img/scissors.jpg");

		computerMove = new JLabel();
		computerMove.setVerticalTextPosition(SwingConstants.BOTTOM);
		computerMove.setHorizontalTextPosition(SwingConstants.CENTER);
		computerMove.setBorder(BorderFactory.createLineBorder(Color.RED, 5));
		computerMove.setForeground(Color.cyan);
		computerMove.setText("Computer\'s move");

		userMove = new JLabel();
		userMove.setVerticalTextPosition(SwingConstants.BOTTOM);
		userMove.setHorizontalTextPosition(SwingConstants.CENTER);
		userMove.setBorder(BorderFactory.createLineBorder(Color.YELLOW, 5));
		userMove.setForeground(Color.cyan);
		userMove.setText("User\'s move");
		
		results = new JLabel();
		results.setHorizontalTextPosition(SwingConstants.CENTER);
		results.setForeground(Color.pink);
		
		JPanel imageOutcomePanel = new JPanel();
		imageOutcomePanel.setBackground(Color.BLUE);
		imageOutcomePanel.setLayout(new BorderLayout());
		imageOutcomePanel.add(computerMove, BorderLayout.EAST);
		imageOutcomePanel.add(userMove, BorderLayout.WEST);
		imageOutcomePanel.add(results, BorderLayout.SOUTH);
		
		
		winsByComputer = new JLabel("Computer Wins:" + demoRPSGameGUI.getLoses());
		winsByUser = new JLabel("  User Wins:" + demoRPSGameGUI.getWins());
		NoOfTies = new JLabel("  Ties:" + demoRPSGameGUI.getTies());
		
		winsByComputer.setForeground(Color.white);
		winsByUser.setForeground(Color.white);

		NoOfTies.setForeground(Color.white);

		JPanel statusPanel = new JPanel();
		statusPanel.setBackground(Color.BLACK);
		statusPanel.add(winsByComputer);
		statusPanel.add(winsByUser);
		statusPanel.add(NoOfTies);

		if(isBetting == JOptionPane.YES_OPTION) {
			balance.setForeground(Color.white);
			statusPanel.add(balance);
		}

		// the play and status panels are nested in a single panel
		JPanel demoRPSGameGUIPanel = new JPanel();
		demoRPSGameGUIPanel.setPreferredSize(new Dimension(800, 600));
		demoRPSGameGUIPanel.setBackground(Color.black);
		demoRPSGameGUIPanel.add(imageOutcomePanel);
		demoRPSGameGUIPanel.add(statusPanel);
		
		// creates the Btns and displays them in a control panel;
		// one listener is used for all three Btns
		rockBtn = new JBtn("Play Rock");
		rockBtn.addActionListener(new GameListener());
		paperBtn = new JBtn("Play Paper");
		paperBtn.addActionListener(new GameListener());
		scissorsBtn = new JBtn("Play Scissors");
		scissorsBtn.addActionListener(new GameListener());

		JPanel controlPanel = new JPanel();
		controlPanel.add(rockBtn);
		controlPanel.add(paperBtn);
		controlPanel.add(scissorsBtn);
		controlPanel.setBackground(Color.black);

		// the gaming and control panel are added to the window
		contentPane.add(demoRPSGameGUIPanel, BorderLayout.CENTER);
		contentPane.add(controlPanel, BorderLayout.SOUTH);
		
		setVisible(true);
	}


	private class GameListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			if(event.getSource() == rockBtn) {
				play(RPSGame.ROCK);
			}
			else if(event.getSource() == paperBtn) {
				play(RPSGame.PAPER);
            }
            else if(event.getSource() == scissorsBtn){
            	play(RPSGame.SCISSOR);
            }
           
		}
	}
	
	public void play(int move) {
		demoRPSGameGUI.generateComputerPlay();
		int result = demoRPSGameGUI.findWinner(move);
		if ( result == RPSGame.LOSE ){
			winsByComputer.setText("Computer Wins: " + demoRPSGameGUI.getLoses());
			results.setText("You Lost!");
		} else if ( result == RPSGame.TIE ){
			NoOfTies.setText("Ties: " + demoRPSGameGUI.getTies());
			results.setText("Tie Game!");
		} else if ( result == RPSGame.WIN ){
        	winsByUser.setText("User Wins: " + demoRPSGameGUI.getWins());
        	results.setText("You Won!");
		}
		balance.setText("Balance: " + demoRPSGameGUI.getBalance());
		updateCompPlayIcon(demoRPSGameGUI.getCompMove());
		updateUserPlayIcon(move);
	}
	
	public void updateCompPlayIcon(int move) {
		switch (move) {
		case 0 : 
			computerMove.setIcon(rockImg);
			break;
		case 1 :
			computerMove.setIcon(paperImg);
			break;
		case 2 :
			computerMove.setIcon(scissorsImg);
		}
	}
	
	public void updateUserPlayIcon(int move) {
		switch (move) {
		case 0 : 
			userMove.setIcon(rockImg);
			break;
		case 1 :
			userMove.setIcon(paperImg);
			break;
		case 2 :
			userMove.setIcon(scissorsImg);
		}
	}
	
	public static void main(String args[]) {
		// create an object of your class
		int isBetting = JOptionPane.showConfirmDialog(null,"Are you going to bet", "Comfirm",JOptionPane.YES_NO_OPTION);
		if (isBetting == JOptionPane.YES_OPTION) {
			RPSDisplay frame = new RPSDisplay();
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
	}
}