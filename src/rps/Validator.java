package rps;

import java.util.Scanner;

public class Validator {

	public static Player isValidOpponent(Scanner scan) {
		String check = "";
		do {
			check = scan.nextLine();
			if (check.equalsIgnoreCase("Tim")) {
				Player opponent = new RockPlayer();
				return opponent;
			} else if (check.equalsIgnoreCase("Jack")) {
				Player opponent = new RandomPlayer();
				return opponent;
			}
			System.out.println("Invalid entry, Please enter an opponent, 'Tim' or 'Jack'");

		} while (!check.equalsIgnoreCase("Tim") && !check.equalsIgnoreCase("Jack"));
		return null;

	}

	public static boolean isValidContinue(Scanner scan) {
		String check = "";
		do {
			check = scan.nextLine();
			if (check.equalsIgnoreCase("y")) {
				return true;
			} else if (check.equalsIgnoreCase("n")) {
				return false;
			}
			System.out.println("Invalid entry, if you want to continue enter 'y', if not enter 'n'");

		} while (!check.equals("y") && !check.equals("n"));
		return false;

	}

	public static Roshambo isWeaponValid(Scanner scan) {
		String check = "";
		do {
			check = scan.nextLine();
			if (check.equalsIgnoreCase("rock")) {
				return Roshambo.ROCK;
			} else if (check.equalsIgnoreCase("paper")) {
				return Roshambo.PAPER;
			} else if (check.equalsIgnoreCase("scissors")) {
				return Roshambo.SCISSORS;
			}
			System.out.println("Invalid entry, Please type 'rock', 'paper', or 'scissors'");

		} while (!check.equalsIgnoreCase("paper") && !check.equalsIgnoreCase("rock")
				&& !check.equalsIgnoreCase("scissors"));
		return null;

	}

}
