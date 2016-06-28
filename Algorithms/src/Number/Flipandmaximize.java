package Number;

public class Flipandmaximize {

	//http://www.geeksforgeeks.org/find-zeroes-to-be-flipped-so-that-number-of-consecutive-1s-is-maximized/
	
	public static void main(String[] args){
		
		int arr[] = {1, 0, 0, 1, 1, 0, 1, 0, 1, 1};
		   int m = 2;
		   int n =  arr.length;
		   findZeroes(arr, n,  m);
		
		
	}
	
	
	static void findZeroes(int arr[], int n, int m)
	{
	    // Left and right indexes of current window
	    int wL = 0, wR = 0; 
	 
	    // Left index and size of the widest window 
	    int bestL = 0, bestWindow = 0; 
	 
	    // Count of zeroes in current window
	    int zeroCount = 0; 
	 
	    // While right boundary of current window doesn't cross 
	    // right end
	    while (wR < n)
	    {
	        // If zero count of current window is less than m,
	        // widen the window toward right
	        if (zeroCount <= m)
	        {
	            if (arr[wR] == 0)
	              zeroCount++;
	            wR++;
	        }
	 
	        // If zero count of current window is more than m,
	        // reduce the window from left
	        if (zeroCount > m)
	        {
	            if (arr[wL] == 0)
	              zeroCount--;
	            wL++;
	        }
	 
	        // Updqate widest window if this window size is more
	        if (wR-wL > bestWindow)
	        {
	            bestWindow = wR-wL;
	            bestL = wL;
	        }
	    }
	 
	    // Print positions of zeroes in the widest window
	    for (int i=0; i<bestWindow; i++)
	    {
	        if (arr[bestL+i] == 0)
	        System.out.print((bestL+i)+ "     ");
	    }
	}
}
