package ProblemSetI;

public class MatrixSpiralPrint {

	public void spiralPrintNew(int endRow, int endCol, int a[][]) {
		int i, startRow = 0, startCol = 0;
		while (startRow < endRow && startCol < endCol) {
			/* Print the first row from the remaining rows */
			for (i = startCol; i < endCol; ++i) {
				System.out.println("1 : " + a[startRow][i]);
			}
			startRow++;

			/* Print the last column from the remaining columns */
			for (i = startRow; i < endRow; ++i) {
				System.out.println("2 : " + a[i][endCol - 1]);
			}
			endCol--;

			/* Print the last row from the remaining rows */
			if (startRow < endRow) {
				for (i = endCol - 1; i >= startCol; --i) {
					System.out.println("3 : " + a[endRow - 1][i]);
				}
				endRow--;
			}

			/* Print the first column from the remaining columns */
			if (startCol < endCol) {
				for (i = endRow - 1; i >= startRow; --i) {
					System.out.println("4 : " + a[i][startCol]);
				}
				startCol++;
			}
		}
	}

	public static void main(String arg[]) {
		int matrix[][] = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 },
				{ 11, 12, 13, 14, 15 }, { 16, 17, 18, 19, 20 } };
		int row = matrix.length;
		int col = matrix[0].length;

		MatrixSpiralPrint ap2 = new MatrixSpiralPrint();
		ap2.spiralPrintNew(row, col, matrix);

	}

}
