package ProblemSetI;

import java.util.*;

public class WordFrequencyCalculater {

	public void wordFrequencyCalculater(String str) {
		Map<String, Integer> wordKeeper = new HashMap<String, Integer>();
		String[] words = str.split(" ");
		int max = 0;
		String finalword = "";

		for (int i = 0; i < words.length; i++) {
			if (wordKeeper.containsKey(words[i])) {
				wordKeeper.put(words[i], wordKeeper.get(words[i]) + 1);
			} else {
				wordKeeper.put(words[i], 1);
			}
		}

		Iterator iter = wordKeeper.entrySet().iterator();
		while (iter.hasNext()) {
			Map.Entry me = (Map.Entry) iter.next();
			if ((int) me.getValue() < max) {

			} else {
				max = (int) me.getValue();
				finalword = (String) me.getKey();
			}

		}
		System.out.println("max frequency word -> " + finalword + ":" + max);

	}

	public static void main(String arg[]) {
		String str = "hello hello bye bye bye i m the good boy hello how are yo guys bye ";
		WordFrequencyCalculater wfc = new WordFrequencyCalculater();
		wfc.wordFrequencyCalculater(str);
	}
}
