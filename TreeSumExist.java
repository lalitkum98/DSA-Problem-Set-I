package ProblemSetI;
public class TreeSumExist {

	static class Tree {
		int value;
		Tree left;
		Tree right;
	}

	public boolean sumExist(Tree root, int sum) {
		
		if (root == null && sum == 0) {
			return true;
		}
		if (root == null && sum != 0) {
			return false ;
		}
		return sumExist(root.left, sum-root.value) || sumExist(root.right, sum-root.value);

	}

	public static void main(String arg[]) {
		Tree tr = new Tree();
		tr.value = 22;
		tr.left = (new Tree());
		tr.right = (new Tree());
		tr.left.value = 15;
		tr.right.value = 40;
		tr.right.left = (new Tree());
		tr.right.right = (new Tree());
		tr.right.left.value = 25;
		tr.right.right.value = 41;
		TreeSumExist adp = new TreeSumExist();
		System.out.println(adp.sumExist(tr, 37));

	}
}
