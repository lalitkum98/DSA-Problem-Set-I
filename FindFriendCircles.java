package ProblemSetI;

import java.util.ArrayList;

public class FindFriendCircles {

	public int findCircle(String str[]) {
		ArrayList<Integer> friends = new ArrayList<Integer>();
		int friendCircle = 0;
		for (int m = 0; m < str.length; m++) {
			if (!friends.contains(m)) {
				friendCircle++;
				findFriendCircle(str, m, friends);
			}
		}
		return friendCircle;
	}

	public void findFriendCircle(String str[], int i, ArrayList<Integer> friends) {

		for (int k = 0; k < str[0].length(); k++) {
			if (str[i].charAt(k) == 'Y') {
				if (!friends.contains(i) || !friends.contains(k)) {
					friends.add(i);
					friends.add(k);
					findFriendCircle(str, k, friends);
				}
			}

		}
	}

	public static void main(String arg[]) {

		FindFriendCircles fi = new FindFriendCircles();
		String str[] = { "NYNY", "YNNY", "NNNN", "YYNN" };

		System.out.println(fi.findCircle(str));

	}

}
