package ProblemSetI;

public class SumRootEqualChildNodes {

	static class Tree {
		int value;
		Tree left;
		Tree right;
	}

	public boolean rootSumCheckBoolean(Tree root, int rootValue) {
		if (root.left == null && root.right == null) {
			return true;
		}
		if (rootSumCheckChild(root.left, root.value)
				&& rootSumCheckChild(root.right, root.value)) {
			return true;
		}
		return false;
	}

	public boolean rootSumCheckChild(Tree root, int rootValue) {

		if (root.left == null && root.right == null) {
			return true;
		}
		if (root.value == root.left.value + root.right.value) {
			return true;
		}
		if (rootSumCheckBoolean(root.left, root.value)
				&& rootSumCheckBoolean(root.right, root.value)) {
			return true;
		}
		return false;
	}

	public static void main(String arg[]) {
		Tree tr = new Tree();
		tr.value = 8;
		tr.left = (new Tree());
		tr.right = (new Tree());
		tr.left.value = 4;
		tr.right.value = 4;
		tr.right.left = (new Tree());
		tr.right.right = (new Tree());
		tr.right.left.value = 3;
		tr.right.right.value = 1;
		SumRootEqualChildNodes sre = new SumRootEqualChildNodes();
		System.out.println(sre.rootSumCheckBoolean(tr, tr.value));

	}
}
