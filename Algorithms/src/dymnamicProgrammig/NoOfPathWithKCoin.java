package dymnamicProgrammig;

public class NoOfPathWithKCoin {
	public static void main(String[] args){
		
		
		 int k = 12;
		    int[][] mat = { {1, 2, 3},
		                      {4, 6, 5},
		                      {3, 2, 1}
		                  };
		    
		    System.out.println(pathCount(mat, 12));
		
		
	}
	
	// Recursive function to count paths with sum k from
		// (0, 0) to (m, n)
		public static int pathCountRec(int mat[][], int m, int n, int k)
		{
		// Base cases
		if (m < 0 || n < 0)
			return 0;
		if (m == 0 && n == 0) {
			if (mat[0][0] == k)
				return 1;
			else
				return 0;
		    }
		    // (m, n) can be reached either through (m-1, n) or
		    // through (m, n-1)
		    return pathCountRec(mat, m-1, n, k-mat[m][n]) + pathCountRec(mat, m, n-1, k-mat[m][n]);
		}
		 
		// A wrapper over pathCountRec()
		public static int pathCount(int mat[][], int k)
		{
		    return pathCountRec(mat, 2, 2, k);
		}
		
		
}
