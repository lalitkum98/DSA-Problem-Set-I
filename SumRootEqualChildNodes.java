package ProblemSetI;

public class SumRootEqualChildNodes {

	static class Tree {
		int value;
		Tree left;
		Tree right;
	}

	public boolean rootSumCheckChild(Tree root) {
		boolean childleft, childright;
		if (root.left == null && root.right == null) {
			return true;
		}
		childleft = rootSumCheckChild(root.left);
		childright = rootSumCheckChild(root.right);
		if ((childleft && childright)
				&& (root.value == root.left.value + root.right.value))
			return true;
		return false;
	}

	public static void main(String arg[]) {
		Tree tr = new Tree();
		tr.value = 8;
		tr.left = (new Tree());
		tr.right = (new Tree());
		tr.left.value = 3;
		tr.right.value = 5;
		tr.right.left = (new Tree());
		tr.right.right = (new Tree());
		tr.right.left.value = 2;
		tr.right.right.value = 1;
		SumRootEqualChildNodes sre = new SumRootEqualChildNodes();
		System.out.println(sre.rootSumCheckChild(tr));

	}
}
