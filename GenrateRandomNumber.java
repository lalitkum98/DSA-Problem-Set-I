package ProblemSetI;

import java.util.*;

public class GenrateRandomNumber {
	/**
	 * Create a random number generator within the given range? what if no range
	 * given? it should not repeat the sequence of random numbers generator
	 * before and after JVM is re-booted?
	 */
	private int GenrateRandom(int range) {
		Random random = new Random();
		return random.nextInt(range);
	}

	public static void main(String arg[]) {
		List numbers = new ArrayList<Integer>();
		GenrateRandomNumber GRN = new GenrateRandomNumber();
		int Rnumber;
		for (int i = 0; i < 5; i++) {
			Rnumber = GRN.GenrateRandom(5);
			while (numbers.contains(Rnumber)) {
				Rnumber = GRN.GenrateRandom(5);
			}
			numbers.add(Rnumber);
			System.out.println("RandomNumber :" + Rnumber);
		}

	}
}
