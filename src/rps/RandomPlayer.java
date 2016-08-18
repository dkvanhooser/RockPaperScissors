package rps;

public class RandomPlayer extends Player{

	public RandomPlayer(){
		generateRoshambo(null);
		playerName = "Jack";
	}
//creates a random int 1-3 and then picks a Roshambo variable from it.
	public Roshambo generateRoshambo(Roshambo choice) {
		switch((int)(Math.random() * 2) + 1){
		case 1:roshambo = Roshambo.ROCK;
			break;
		case 2:roshambo = Roshambo.PAPER;
			break;
		case 3:roshambo = Roshambo.SCISSORS;
			break;
		}
		return roshambo;
	}
	
}
