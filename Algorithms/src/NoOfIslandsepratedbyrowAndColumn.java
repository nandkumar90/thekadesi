//http://www.geeksforgeeks.org/count-number-islands-every-island-separated-line/
public class NoOfIslandsepratedbyrowAndColumn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mat[][] = { { 'O', 'O', 'O' }, 
				        { 'X', 'X', 'O' },
				        { 'X', 'X', 'O' }, 
				        { 'O', 'O', 'X' }, 
				        { 'O', 'O', 'X' },
				        { 'X', 'X', 'O' } 
				        };
		int row=6;
		int col=3;

		System.out.println(countIslands(mat,row, col));
	}

	// This function takes a matrix of 'X' and 'O'
	// and returns the number of rectangular islands
	// of 'X' where no two islands are row-wise or
	// column-wise adjacent, the islands may be diagonaly
	// adjacent
	public static int countIslands(int mat[][],int M, int N) {
		int count = 0; // Initialize result
          
		// Traverse the input matrix
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				// If current cell is 'X', then check
				// whether this is top-leftmost of a
				// rectangle. If yes, then increment count
				if (mat[i][j] == 'X') {
					if ((i == 0 || mat[i - 1][j] == 'O') && (j == 0 || mat[i][j - 1] == 'O'))
						count++;
				}
			}
		}

		return count;
	}

}
