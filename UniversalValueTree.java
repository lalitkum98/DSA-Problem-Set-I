package ProblemSetI;

public class UniversalValueTree {
	static class Node {
		int value;
		Node left;
		Node right;

	}
	public boolean UniversalValueTree(Node root) {

		if (root == null) {
			return true;

		}
		return isUniVal(root.left, root.value)
				&& isUniVal(root.right, root.value);

	}

	public boolean isUniVal(Node root, int value) {

		if (root == null) {
			return true;

		}
		if (root.value != value) {
			return false;
		}

		return isUniVal(root.left, root.value)
				&& isUniVal(root.right, root.value);
	}

	public static void main(String arg[]) {

		Node a = new Node();
		a.value = 2;
		a.left = new Node();
		a.right = new Node();
		a.left.value = 2;
		a.right.value = 2;
		a.left.left = new Node();
		a.left.right = new Node();
		a.right.left = new Node();
		a.right.right = new Node();
		a.left.left.value = 2;
		a.left.right.value = 2;
		a.right.left.value = 2;
		a.right.right.value = 2;

		UniversalValueTree unval = new UniversalValueTree();
		boolean tree = unval.UniversalValueTree(a);
		System.out.println(tree);

	}

}
