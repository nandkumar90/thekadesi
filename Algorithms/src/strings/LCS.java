package strings;

public class LCS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   char a[],b[];
   a="Nand".toCharArray();
   b="na".toCharArray();
   System.out.println(lcs(a,b,a.length,b.length));
	}
	
	/* Returns length of LCS for X[0..m-1], Y[0..n-1] */
	public static int lcs( char[] X, char[] Y, int m, int n )
	{
	   if (m == 0 || n == 0)
	     return 0;
	   if (X[m-1] == Y[n-1])
	     return 1 + lcs(X, Y, m-1, n-1);
	   else
	     return max(lcs(X, Y, m, n-1), lcs(X, Y, m-1, n));
	}

	
	/* Utility function to get max of 2 integers */
  public static	int max(int a, int b)
	{
	    return (a > b)? a : b;
	}
}
