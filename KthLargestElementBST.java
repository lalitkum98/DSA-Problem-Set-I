package ProblemSetI;

public class KthLargestElementBST {
	static class Tree {
		int value;
		Tree left;
		Tree right;
	}

	public int kthLargest(Tree root, int value) {

		if (root.left == null && root.right == null)
			return value;

		value = kthLargest(root.right, value);
		value--;
		if (value == 0)
			System.out.println(root.value);
		value = kthLargest(root.left, value);
		value--;
		if (value == 0)
			System.out.println(root.value);
		return value;
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
		KthLargestElementBST Kth = new KthLargestElementBST();
		Kth.kthLargest(tr, 4);

	}
}
