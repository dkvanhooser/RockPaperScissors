package rps;


public abstract class Player {
	private String playerName;
	private Roshambo roshambo;
	public String getPlayerName() {
		return playerName;
	}
	
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}



	public Roshambo getRoshambo() {
		return roshambo;
	}
	



	public void setRoshambo(Roshambo roshambo) {
		this.roshambo = roshambo;
	}


	public Player(){
		
	}
	
	abstract public void winCount();
	abstract public int getWins();
	abstract public Roshambo generateRoshambo(Roshambo choice);

}
