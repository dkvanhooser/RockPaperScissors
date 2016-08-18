package rps;


public abstract class Player {
	protected String playerName;
	protected Roshambo roshambo;
	protected int wins;
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
	public void winCount() {
		wins++;	
	}
	public int getWins() {
		return wins;
	}
	abstract public Roshambo generateRoshambo(Roshambo choice);
}
