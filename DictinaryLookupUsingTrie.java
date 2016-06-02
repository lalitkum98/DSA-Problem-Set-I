package ProblemSetI;
import java.util.HashMap;

public class DictinaryLookupUsingTrie {

	static class TrieNode {
		private char ch;
		private HashMap<Character, TrieNode> child;
		private boolean isEnd;

		public TrieNode(char ch) {
			this.ch = ch;
			child = new HashMap<>();
			isEnd = false;
		}

		public HashMap<Character, TrieNode> getChildren() {
			return this.child;

		}

		public char getCh() {
			return this.ch;
		}

		public boolean getIsEnd() {
			return this.isEnd;
		}

		public void setIsEnd(boolean val) {
			this.isEnd = val;
		}
	}

	static class Trie {
		TrieNode root;

		public Trie() {
			root = new TrieNode((char) 0);
		}

		public void insert(String string) {
			int len = string.length();
			TrieNode crawl = root;

			for (int level = 0; level < len; level++) {

				HashMap<Character, TrieNode> child = crawl.getChildren();
				char ch = string.charAt(level);
				if (child.containsKey(ch)) {
					crawl = child.get(ch);
				} else {
					System.out.println(ch);
					TrieNode temp = new TrieNode(ch);
					child.put(ch, temp);
					crawl = temp;
				}

			}
			crawl.setIsEnd(true);
		}

		public void getMatchPrefix(String string) {

			int len = string.length();
			TrieNode crawl = root;

			for (int level = 0; level < len; level++) {
				HashMap<Character, TrieNode> child = crawl.getChildren();
				char ch = string.charAt(level);
				if (child.containsKey(ch)) {
					System.out.println("prefix found " + ch);
					crawl = child.get(ch);
				} else {

					break;
				}

			}

		}

	}

	public static void main(String arg[]) {
		Trie dict = new Trie();
		dict.insert("helo");
		dict.insert("table");
		dict.insert("tre");
		dict.insert("trab");

		dict.getMatchPrefix("hello");
	}
}
