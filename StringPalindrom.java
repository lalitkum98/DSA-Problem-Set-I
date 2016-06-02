package ProblemSetI;

public class StringPalindrom {

	boolean Palindrom(String string) {
		char str[] = string.toCharArray();
		int n = str.length;
		for (int i = 0, j = n - 1; i < j; ++i, --j) {
			if (str[i] != str[j])
				return false;
		}
		return true;
	}

	public static void main(String str[]) {
		String a = null;
		System.out.println(0 + a);
		StringPalindrom pr = new StringPalindrom();
		System.out.println(pr.Palindrom("pip"));

	}
}
