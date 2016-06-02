package ProblemSetI;

public class TestPower {

	static boolean testpower(int n) {
		while (n % 3 == 0) {
			n /= 3;
		}
		return n == 1;
	}

	public static void main(String arg[]) {
		for (int i = 0; i < 17; i++) {
			if (i % 2 == 0 || i % 3 == 0) {

				if (((i & (i - 1)) == 0) || testpower(i)) {
					System.out.println(i);

				}
			}
		}
	}
}
