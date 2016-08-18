package rps;

public class RockPlayer extends Player{
	
	private Roshambo roshambo;
	private String playerName = "Tim";
	private int wins;

	public RockPlayer(){
		generateRoshambo(null);
	}
	
	
	public String getPlayerName() {
		return playerName;
	}
	
	public Roshambo getRoshambo(){
		return roshambo;
	}

	public Roshambo generateRoshambo(Roshambo choice) {
		roshambo = Roshambo.ROCK;
		return roshambo;
	}



	public void winCount() {
		wins++;
		
	}

	@Override
	public int getWins() {
		return wins;
		
	}
	
}
