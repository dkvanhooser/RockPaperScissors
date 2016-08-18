package rps;

public class RandomPlayer extends Player{
	
	private Roshambo roshambo;
	private String playerName = "Jack";
	private int wins;
	
	public RandomPlayer(){
		generateRoshambo(null);
	}
	
	public Roshambo getRoshambo() {
		return roshambo;
	}

	public String getPlayerName() {
		return playerName;
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

	public void winCount() {
		wins++;
		
	}

	public int getWins() {
		return wins;
		
	}
	
}
