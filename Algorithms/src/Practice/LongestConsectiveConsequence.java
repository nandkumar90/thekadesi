package Practice;

import java.util.HashSet;

public abstract class LongestConsectiveConsequence {

	public static void main(String[] args) {
		 int arr[] =  {1, 9, 3, 10, 4, 20, 2};
		    int n = arr.length;
		    System.out.println(findLongestConseqSubseq(arr, n));

	}
	
	
	static int findLongestConseqSubseq(int arr[], int n)
	{
	   HashSet<Integer> S=new HashSet<Integer>();
	    int ans = 0;
	 
	    // Hash all the array elements
	    for (int i = 0; i < n; i++)
	        S.add(arr[i]);
	 
	    // check each possible sequence from the start
	    // then update optimal length
	    for (int i=0; i<n; i++)
	    {
	        // if current element is the starting
	        // element of a sequence
	        if (S.get(arr[i]-1) == S.end())
	        {
	            // Then check for next elements in the
	            // sequence
	            int j = arr[i];
	            while (S.find(j) != S.end())
	                j++;
	 
	            // update  optimal length if this length
	            // is more
	            ans = max(ans, j - arr[i]);
	        }
	    }
	    return ans;
	}

}
