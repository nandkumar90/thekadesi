package Practice;

public class GridColoring {
	static final int ROW = 3, COL = 3;
	public static int count = 0;

	public static void main(String[] args) {
		String[] s = { "GR.", "BG.", "..." };
		System.out.println(gridColoring(s));

	}

	public static int gridColoring(String[] str) {

		// Make a bool array to mark visited cells.
		// Initially all cells are unvisited
		boolean visited[][] = new boolean[ROW][COL];
		String[][] M = get2DMatrix(str);

		// Initialize count as 0 and travese through the all cells
		// of given matrix
		for (int i = 0; i < ROW; ++i) {
			for (int j = 0; j < COL; ++j) {
				if ((M[i][j].equalsIgnoreCase("G")) && !visited[i][j]) {
					DFSG(M, i, j, visited);
				} else if ((M[i][j].equalsIgnoreCase("B")) && !visited[i][j]) {
					DFSB(M, i, j, visited);
				} else if ((M[i][j].equalsIgnoreCase("R")) && !visited[i][j]) {
					DFSR(M, i, j, visited);
				} else {
					visited[i][j] = true;

				}

			}

		}

		return count;
	}

	public static void DFSG(String M[][], int row, int col, boolean visited[][]) {
		// These arrays are used to get row and column numbers
		// of 8 neighbors of a given cell
		int rowNbr[] = new int[] { 0, 1 };
		int colNbr[] = new int[] { 1, 0 };

		// Mark this cell as visited
		visited[row][col] = true;

		// Recur for all connected neighbours
		for (int k = 0; k < 2; ++k)
			if (isSafe(M, row + rowNbr[k], col + colNbr[k], visited)) {
				count += 2;
				DFSG(M, row + rowNbr[k], col + colNbr[k], visited);
			}
	}

	public static void DFSR(String M[][], int row, int col, boolean visited[][]) {
		// These arrays are used to get row and column numbers
		// of 8 neighbors of a given cell
		int rowNbr[] = new int[] { 1 };
		int colNbr[] = new int[] { 0 };

		// Mark this cell as visited
		visited[row][col] = true;

		// Recur for all connected neighbours
		for (int k = 0; k < 1; ++k)
			if (isSafe(M, row + rowNbr[k], col + colNbr[k], visited)) {
				count++;
				DFSR(M, row + rowNbr[k], col + colNbr[k], visited);
			}
	}

	public static void DFSB(String M[][], int row, int col, boolean visited[][]) {
		// These arrays are used to get row and column numbers
		// of 8 neighbors of a given cell
		int rowNbr[] = new int[] { 0 };
		int colNbr[] = new int[] { 1 };

		// Mark this cell as visited
		visited[row][col] = true;

		// Recur for all connected neighbours
		for (int k = 0; k < 1; ++k)
			if (isSafe(M, row + rowNbr[k], col + colNbr[k], visited)) {
				count++;
				DFSB(M, row + rowNbr[k], col + colNbr[k], visited);
			}
	}

	public static boolean isSafe(String[][] m, int row, int col,
			boolean visited[][]) {
		// row number is in range, column number is in range
		// and value is 1 and not yet visited
		return (row >= 0) && (row < ROW) && (col >= 0) && (col < COL)
				&& (!visited[row][col]);
	}

	public static String[][] get2DMatrix(String[] str) {
		int row = str.length;
		int column = str[0].toCharArray().length;
		String[][] st = new String[row][column];

		for (int i = 0; i < str.length; i++) {
			String[] s = str[i].split("");
			for (int k = 1, j = 0; k < s.length; k++) {
				st[i][j] = s[k];
				j++;
			}
		}
		return st;
	}

}
