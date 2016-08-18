package rps;

public class HumanPlayer extends Player{

	
	private Roshambo roshambo;
	private String playerName;
	private int wins;
	
	public void setPlayerName(String playerName){
		this.playerName = playerName;
	}
	public String getPlayerName(){
		return playerName;
	}
	public Roshambo getRoshambo(){
		return roshambo;
	}


	public Roshambo generateRoshambo(Roshambo choice) {
		roshambo = choice;
		return roshambo;
	}

	public void winCount() {
		wins++;
	}
	
	
	public int getWins() {
		return wins;
		
	}

}
