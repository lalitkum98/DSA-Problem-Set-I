package ProblemSetI;

public class TreeLeafPathSum {
/*
 * 6
    /  \
   3    5
  / \     \
 2   5    4
    / \
   7  4

There are 4 leaves, hence 4 root to leaf paths:
Path Sum
6->3->2 632
6->3->5->7 6357
6->3->5->4 6354
6->5>4 654
Answer: 632+6357+6354+654=13997
 */
	static class Node {
		public Node left;
		public Node right;
		public int value;
	}

	public void computeSum(Node node, long parentNodeValue, long[] runnningTotal) {
		if (node == null)
			return;
		long currentNodeValue = parentNodeValue * 10 + node.value;

		if (node.left == null && node.right == null) {
			runnningTotal[0] += currentNodeValue;
			return;
		}

		computeSum(node.left, currentNodeValue, runnningTotal);
		computeSum(node.right, currentNodeValue, runnningTotal);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node();
		root.value = 6;
		Node left = new Node();
		left.value = 3;
		Node right = new Node();
		right.value = 5;
		root.left = left;
		root.right = right;
		left.left = new Node();
		left.left.value = 2;
		left.right = new Node();
		left.right.value = 5;
		left.right.left = new Node();
		left.right.left.value = 7;
		left.right.right = new Node();
		left.right.right.value = 4;
		right.right = new Node();
		right.right.value = 4;
		long[] runningTotal = new long[1];
		TreeLeafPathSum leafPathSum = new TreeLeafPathSum();
		leafPathSum.computeSum(root, 0, runningTotal);

		System.out.println(runningTotal[0]);

	}

}
