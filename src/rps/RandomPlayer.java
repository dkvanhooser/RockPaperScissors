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



	@Override
	public void winCount() {
		wins++;
		
	}



	@Override
	public int getWins() {
		return wins;
		
	}
	
}
