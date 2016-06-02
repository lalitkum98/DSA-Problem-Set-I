package ProblemSetI;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class ConcateStringCost {
	public int sum(int a, int b) {
		int total = a + b;
		return total;
	}

	public int strLengthCon(String a, String b) {
		int totallength = a.length() + a.length();
		return totallength;
	}

	public int concateStringCost(List<String> listString) {

		List<Integer> count = new ArrayList<Integer>();
		for (String str : listString) {
			count.add(str.length());
		}
		int add = 0;
		Collections.sort(count);
		for (int arr : count) {
			add = add + arr;
		}

		return add;
	}

	public static void main(String arg[]) {
		ConcateStringCost csc = new ConcateStringCost();
		List<String> listString = new ArrayList<String>();
		listString.add("abc");
		listString.add("abcd");
		listString.add("a");
		System.out.println(csc.concateStringCost(listString));

	}

}
