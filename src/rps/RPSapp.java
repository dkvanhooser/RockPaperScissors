package rps;

import java.util.Scanner;

public class RPSapp {	
	
	public static int draws = 0;
	public static int oppWins = 0;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Welcome to Rock, Paper, Scissors!");
		System.out.println("Please enter your name!");
		Player user = new HumanPlayer();
		
		user.setPlayerName(scan.nextLine());
		System.out.println("Hey, " + user.getPlayerName() + " Thanks for Playing!");
		boolean cont = true;

		do {

			System.out.println("Would you like to play Tim or Jack?");
			Player opponent = Validator.isValidOpponent(scan);
			
			System.out.println("pick your weapon!Type 'Rock', 'Paper', or 'Scissors'");
			
			System.out.println("LETS SEE IF YOU WON!!!!!! \nYou chose " + user.generateRoshambo(Validator.isWeaponValid(scan)).toString()
					+ " and " + opponent.getPlayerName() + " chose " + opponent.getRoshambo().toString());
			
			didHumanWin(user, opponent);
			
			System.out.println("would you like to play again? 'y' or 'n'");
			cont = Validator.isValidContinue(scan);
			
			
		} while (cont);
		
		System.out.println("Thanks for playing! \n You won " + user.getWins() + " Times");
		System.out.println("Your opponent(s) won " + oppWins + " Times");
		System.out.println("You also had " + draws + " draws");

		scan.close();
	}

	public static void didHumanWin(Player humanUser, Player opponentBot) {
		if (humanUser.getRoshambo() == opponentBot.getRoshambo()){
			System.out.println("Looks like a draw to me!!!");
			draws++;
			return;
		}
		switch (humanUser.getRoshambo()) {

		case ROCK:
			if (opponentBot.getRoshambo() == Roshambo.SCISSORS) {
				System.out.println("You Win!!!!!!!!!!!!!!");
				humanUser.winCount();
				break;
			} else {
				System.out.println("Nope! You Lose!");
				oppWins++;
				break;
			}

		case PAPER:
			if (opponentBot.getRoshambo() == Roshambo.ROCK) {
				System.out.println("You Win!!!!!!!!!!!!!!");
				humanUser.winCount();
				break;
			} else {
				System.out.println("You Lose!");
				oppWins++;
				break;
			}

		case SCISSORS:
			if (opponentBot.getRoshambo() == Roshambo.PAPER) {
				System.out.println("You Win!!!!!!!!!!!!!!");
				humanUser.winCount();
				break;
			} else {
				System.out.println("You Lose!");
				oppWins++;
				break;
			}
		}
	return;
	}

}
