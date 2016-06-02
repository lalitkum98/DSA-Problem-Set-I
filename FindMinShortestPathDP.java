package ProblemSetI;

public class FindMinShortestPathDP {

	
	public FindMinShortestPathDP(int costMatrix[][], int start, int end) {
		int min = Integer.MAX_VALUE;
		System.out.println(findMinCost(costMatrix, start, end, min));
	}

	// for shortest path
	/*
	 * { 0, 15, 80, 90 }, { -1, 0, 40, 50 }, { -1, -1, 0, 70 }, { -1, -1, -1, 0
	 * } };
	 */
	public int findMinCost( int costMatrix[][], int start, int end, int min) {
		if (start == end) {
			return costMatrix[start][end];
		}

		for (int i = start; i < end; i++) {
			int cost = (costMatrix[start][i + 1] + findMinCost(costMatrix, i + 1, end, min));
			if (cost < min) {
				min = cost;
			}
		}

		return min;

	}

	public static void main(String arg[]) {

		int[][] costMatrix = { { 0, 15, 80, 90 }, { -1, 0, 40, 50 },
				{ -1, -1, 0, 70 }, { -1, -1, -1, 0 } };

		FindMinShortestPathDP fmcp = new FindMinShortestPathDP(costMatrix, 0, 3);
	}

}
