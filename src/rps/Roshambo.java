package rps;

public enum Roshambo {
	ROCK {
		public String toString() {

			return "the biggest boulder, or a Rock";
		}

	},
	PAPER {
		public String toString() {

			return "a tiny sticky note, or Paper";
		}

	},
	SCISSORS {
		public String toString() {

			return "a pair of saftey Scissors";
		}

	};
}
