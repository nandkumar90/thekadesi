package Practice;

public class PrintAllPermutedString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String str="ABC";
	}
	/* Function to swap values at two pointers */
	public static void swap(char x, char y)
	{
	    char temp;
	    temp = x;
	    x = y;
	    y = temp;
	}
	 
	/* Function to print permutations of string
	   This function takes three parameters:
	   1. String
	   2. Starting index of the string
	   3. Ending index of the string. */
	public static void permute(char[] a, int l, int r)
	{
	   int i;
	   if (l == r)
	     System.out.println(a);
	   else
	   {
	       for (i = l; i <= r; i++)
	       {
	          swap(a,(a+l), (a+i));
	          permute(a, l+1, r);
	          swap(a,(a+l), (a+i)); //backtrack
	       }
	   }
	}
}
