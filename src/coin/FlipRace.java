package coin;

public class FlipRace {
	// -----------------------------------------------------------------
	// Flips two coins until one of them comes up heads three times in a row.
	// -----------------------------------------------------------------
	public static void main(String[] args) {
	
			// Create two separate coin objects
			Coin coinOne = new Coin();
			Coin coinTwo = new Coin();
			// Print the flip results (uses Coin's toString method)
			
			// Stop the flipping once one of the coins gets to heads, 3 times in a row
			int countOne = 0, countTwo = 0;
			int count = 1;
			while(countOne < 3 && countTwo < 3) {
				System.out.println(count + " - Coin 1: " + coinOne + "\tCoin 2: " + coinTwo);
				if(coinOne.isHeads())
					++countOne;
				if(coinTwo.isHeads())
					++countTwo;
				coinOne.flip();
				coinTwo.flip();
				count++;
			}
	}
}