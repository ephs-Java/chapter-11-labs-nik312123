package coin;

public class CountFlips {
	// -----------------------------------------------------------------
	// Flips a coin multiple times and counts the number of heads
	// and tails that result.
	//		Output:
	//			The number of flips: 1000
	//			The number of heads: 493
	//			The number of tails: 507
	// -----------------------------------------------------------------
	public static void main(String[] args) {
		Coin coin = new Coin();
		int flips = 0, heads = 0, tails = 0;
		for(int i = 0; i < 1000; i++) {
			++flips;
			if(coin.isHeads())
				++heads;
			else
				++tails;
			coin.flip();
		}
		System.out.println("The number of flips: " + flips);
		System.out.println("The number of heads: " + heads);
		System.out.println("The number of tails: " + tails);
	}
}
