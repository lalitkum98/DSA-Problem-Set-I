package ProblemSetI;

public class StringDuplicateCount {

	/**
	 * Given an input string, write a function that returns the Run Length
	 * Encoded string for the input string. For example, if the input string is
	 * wwwwaaadexxxxxx, then the function should return w4a3dex6.
	 **/
	public void runLengthString(String string) {
		char a[] = string.toCharArray();
		int lengethcount = 1;
		int i;
		for (i = 0; i < a.length - 1; i++) {
			if (a[i] == a[i + 1]) {
				lengethcount++;
			} else {
				System.out.print(a[i] + ":" + lengethcount);
				lengethcount = 1;
			}

		}
		System.out.println(a[i] + ":" + lengethcount);
	}

	public static void main(String arg[]) {
		StringDuplicateCount rls = new StringDuplicateCount();
		rls.runLengthString("wwwwaaadexxxxxx");
	}

}
