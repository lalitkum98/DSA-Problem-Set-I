package ProblemSetI;

public class TreeRemoveHalfNodes {

	static class Tree {
		int value;
		Tree left;
		Tree right;
	}

	public boolean remove(Tree root) {
		return removeNode(root.left, root) && removeNode(root.right, root);
	}

	public boolean removeNode(Tree root, Tree prevNode) {
		if (root.left == null && root.right != null) {
			boolean flag = removeNode(root.right, prevNode);
			if (flag == true) {
				prevNode.left = root.right;
				return true;
			}
		}

		if (root.right == null && root.left != null) {
			boolean flag = removeNode(root.left, root);
			if (flag == true) {

				prevNode.right = root.left;
				return true;
			}
		}
		if (root.right == null && root.left == null) {
			return true;
		}
		return remove(root);

	}

	public void printTree(Tree root) {
		if (root == null) {
			return;
		}
		System.out.println(root.value);
		printTree(root.left);
		printTree(root.right);

	}

	public static void main(String arg[]) {
		Tree tr = new Tree();
		tr.value = 2;
		tr.left = (new Tree());
		tr.right = (new Tree());
		tr.left.value = 7;
		tr.right.value = 5;
		tr.right.left = (new Tree());
		tr.right.left.value = 8;
		tr.left.right = (new Tree());
		tr.left.right.value = 6;
		tr.left.right.left = (new Tree());
		tr.left.right.right = (new Tree());
		tr.left.right.left.value = 1;
		tr.left.right.right.value = 11;

		TreeRemoveHalfNodes rhn = new TreeRemoveHalfNodes();
		System.out.println("Before Remove");
		rhn.printTree(tr);
		System.out.println("After Remove");
		rhn.remove(tr);
		rhn.printTree(tr);

	}
}
