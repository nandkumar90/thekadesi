package Number;

public class maximumcoininamatrix {
//http://www.geeksforgeeks.org/collect-maximum-coins-before-hitting-a-dead-end/
	
	int  maxCoinsRec(char arr[R][C],  int i, int j, int dir)
	{
	    // If this is a invalid cell or if cell is a blocking cell
	    if (isValid(i,j) == false || arr[i][j] == '#')
	        return 0;
	 
	    // Check if this cell contains the coin 'C' or if its empty 'E'.
	    int result = (arr[i][j] == 'C')? 1: 0;
	 
	    // Get the maximum of two cases when you are facing right in this cell
	    if (dir == 1) // Direction is right
	       return result + max(maxCoinsRec(arr, i+1, j, 0),     // Down
	                             maxCoinsRec(arr, i, j+1, 1));  // Ahead in right
	 
	    // Direction is left
	    // Get the maximum of two cases when you are facing left in this cell
	     return  result + max(maxCoinsRec(arr, i+1, j, 1),    // Down
	                           maxCoinsRec(arr, i, j-1, 0));  // Ahead in left
	}
	
	public static void main(String[] args){
		
		char arr[R][C] = { {'E', 'C', 'C', 'C', 'C'},
                {'C', '#', 'C', '#', 'E'},
                {'#', 'C', 'C', '#', 'C'},
                {'C', 'E', 'E', 'C', 'E'},
                {'C', 'E', '#', 'C', 'E'}
              };

		int n=maxCoinsRec(arr, 0, 0, 1);
		
		
		
		
	}
}
