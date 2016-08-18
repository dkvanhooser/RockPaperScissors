package rps;

import java.util.Scanner;

public class RPSapp {	
	
	public static int draws = 0;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//creates new human player that will take input from the user to see what their name is, what opponent they want to face,
		//and what they want to pick from rock,paper and scissors.
		System.out.println("Welcome to Rock, Paper, Scissors!");
		System.out.println("Please enter your name!");
		Player user = new HumanPlayer();
		Player opponent;
		user.setPlayerName(scan.nextLine());
		System.out.println("Hey, " + user.getPlayerName() + " Thanks for Playing!");
		boolean cont = true;

		do {
			
			System.out.println("Would you like to play Tim or Jack?");
			//takes input from the user to see who they want to play and creates a new Player opponent based on input
			opponent = Validator.isValidOpponent(scan);
			
			System.out.println("pick your weapon!Type 'Rock', 'Paper', or 'Scissors'");
			//takes input from user to see if they want rock paper or scissors and runs it through the validator then sets the Roshambo value
			//in the player class and then converts that Roshambo value to a string.
			System.out.println("Lets see if you won.... \nYou chose " + user.generateRoshambo(Validator.isWeaponValid(scan)).toString()
					+ " and " + opponent.getPlayerName() + " chose " + opponent.getRoshambo().toString());
			//checks to see if the user won or the opponent they are facing won.
			didHumanWin(user, opponent);
			
			
			System.out.println("would you like to play again? 'y' or 'n'");
			cont = Validator.isValidContinue(scan);
			
			
		} while (cont);
		//outputs the number of times user won, draws, and the total the opponent one.
		System.out.println("Thanks for playing! \nYou won " + user.getWins() + " Time(s)");
		System.out.println(getOtherOpponentWins(opponent) + " Time(s)");
		System.out.println(opponent.getPlayerName() + " won " + opponent.getWins() + " Time(s)");
		System.out.println("You also had " + draws + " draw(s)");

		scan.close();
	}

	public static void didHumanWin(Player humanUser, Player opponentBot) {
		String lose = "Nope!, You Lose!!";
		String win = "You Win!!!!!!!!!!!!!!";
		//checks for draw, if it is, it returns out of the mathod
		if (humanUser.getRoshambo() == opponentBot.getRoshambo()){
			System.out.println("Looks like a draw to me!!!");
			draws++;
			return;
		}
		//checks who won, increments the win count and outputs
		switch (humanUser.getRoshambo()) {

		case ROCK:
			if (opponentBot.getRoshambo() == Roshambo.SCISSORS) {
				System.out.println(win);
				humanUser.winCount();
				break;
			} else {
				System.out.println(lose);
				opponentBot.winCount();
				break;
			}

		case PAPER:
			if (opponentBot.getRoshambo() == Roshambo.ROCK) {
				System.out.println(win);
				humanUser.winCount();
				break;
			} else {
				System.out.println(lose);
				opponentBot.winCount();
				break;
			}

		case SCISSORS:
			if (opponentBot.getRoshambo() == Roshambo.PAPER) {
				System.out.println(win);
				humanUser.winCount();
				break;
			} else {
				System.out.println(lose);
				opponentBot.winCount();
				break;
			}
		}
		
		
		
	return;
	}


	public static int getOtherOpponentWins(Player opponent){
		//checks to see what Player is active and creates the opposite one to find the wins he has.
		if (opponent.getPlayerName().equals("Tim")){
			Player nextOpponent = new RandomPlayer();
			System.out.printf(nextOpponent.getPlayerName()+" won ");
			return nextOpponent.getWins();
		}else {
			Player nextOpponent = new RockPlayer();
			System.out.println(nextOpponent.getPlayerName()+ " won ");
			return nextOpponent.getWins();
		}
		
	}
	





}