package rps;

public class RockPlayer extends Player{
	
	public RockPlayer(){
		generateRoshambo(null);
		playerName = "Tim";
	}

	public Roshambo generateRoshambo(Roshambo choice) {
		roshambo = Roshambo.ROCK;
		return roshambo;
	}
	
}
