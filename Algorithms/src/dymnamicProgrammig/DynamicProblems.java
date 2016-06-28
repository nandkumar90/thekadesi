package dymnamicProgrammig;

public class DynamicProblems {
	public static void main(String[] args){
		  int n = 2, k = 10;
		    System.out.println("Minimum number of trials in worst case with %d eggs and"+n+ k+ eggDrop(n, k)); 
		
		
	}
	// A utility function to get maximum of two integers
	public static int max(int a, int b) { return (a > b)? a: b; }
	 
	/* Function to get minimum number of trails needed in worst
	  case with n eggs and k floors */
	public static int eggDrop(int n, int k)
	{
	    // If there are no floors, then no trials needed. OR if there is
	    // one floor, one trial needed.
	    if (k == 1 || k == 0)
	        return k;
	 
	    // We need k trials for one egg and k floors
	    if (n == 1)
	        return k;
	 
	    int min = 0, x, res;
	 
	    // Consider all droppings from 1st floor to kth floor and
	    // return the minimum of these values plus 1.
	    for (x = 1; x <= k; x++)
	    {
	        res = max(eggDrop(n-1, x-1), eggDrop(n, k-x));
	        if (res < min)
	            min = res;
	    }
	 
	    return min + 1;
	}
}
