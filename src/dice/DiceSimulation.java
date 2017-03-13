package dice;

//This class simulates rolling a pair of dice 10,000 times and
//counts the number of times doubles of are rolled for each
//different pair of doubles.
public class DiceSimulation {
	public static void main(String[] args) {
		final int NUMBER = 10000; // the number of times to roll the dice
		
		// create 2 Dice objects, die1 and die2
		Dice die1 = new Dice();
		Dice die2 = new Dice();
		int[] doubles = new int[6];
		int count = 0; // number of times the dice were rolled

		// create 2 dice, roll them 10000 times, and keep track of the doubles.
		// what method(s) do you need to write in the Dice class to make this work?
		for(int i = 0; i < NUMBER; i++) {
			die1.roll();
			die2.roll();
			if(die1.equalDie(die2))
				doubles[die1.spots - 1]++;
			++count;
		}
		
		// preformatted output to be used after the 10000 rolls above.
		System.out.println("You rolled snake eyes " + doubles[0] + " out of " + count + " rolls.");
		System.out.println("You rolled double twos " + doubles[1] + " out of " + count + " rolls.");
		System.out.println("You rolled double threes " + doubles[2] + " out of " + count + " rolls.");
		System.out.println("You rolled double fours " + doubles[3] + " out of " + count + " rolls.");
		System.out.println("You rolled double fives " + doubles[4] + " out of " + count + " rolls.");
		System.out.println("You rolled double sixes " + doubles[5] + " out of " + count + " rolls.");
	}
}
