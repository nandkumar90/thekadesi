package dymnamicProgrammig;

public class SubMatrixofSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int M[][] =  {{0, 1, 1, 0, 1}, 
                {1, 1, 0, 1, 0}, 
                {0, 1, 1, 1, 0},
                {1, 1, 1, 1, 0},
                {1, 1, 1, 1, 1},
                {0, 0, 0, 0, 0}};
	
             
      printMaxSubSquare(M);
	}
	public static void printMaxSubSquare(int M[][])
	{
		int R,C;
		R=6;
		C=5;
	  int i,j;
	  int S[][] =new int[R][C];
	  int max_of_s, max_i, max_j; 
	  
	  /* Set first column of S[][]*/
	  for(i = 0; i < R; i++)
	     S[i][0] = M[i][0];
	  
	  /* Set first row of S[][]*/    
	  for(j = 0; j < C; j++)
	     S[0][j] = M[0][j];
	      
	  /* Construct other entries of S[][]*/
	  for(i = 1; i < R; i++)
	  {
	    for(j = 1; j < C; j++)
	    {
	      if(M[i][j] == 1) 
	        S[i][j] = min(S[i][j-1], S[i-1][j], S[i-1][j-1]) + 1;
	      else
	        S[i][j] = 0;
	    }    
	  } 
	   
	  /* Find the maximum entry, and indexes of maximum entry 
	     in S[][] */
	  max_of_s = S[0][0]; max_i = 0; max_j = 0;
	  for(i = 0; i < R; i++)
	  {
	    for(j = 0; j < C; j++)
	    {
	      if(max_of_s < S[i][j])
	      {
	         max_of_s = S[i][j];
	         max_i = i; 
	         max_j = j;
	      }        
	    }                 
	  }     
	   
	  System.out.println("\n Maximum size sub-matrix is: \n");
	  for(i = max_i; i > max_i - max_of_s; i--)
	  {
	    for(j = max_j; j > max_j - max_of_s; j--)
	    {
	      System.out.println( M[i][j]);
	    }  

	  }  
	}     
	 
	/* UTILITY FUNCTIONS */
	/* Function to get minimum of three values */
	public static int min(int a, int b, int c)
	{
	  int m = a;
	  if (m > b) 
	    m = b;
	  if (m > c) 
	    m = c;
	  return m;
	}
}
/*Original:

1111
1110
1110
0111

Sum:

1110
1220
2230
0121

Explanation:

I am indexing from 0 for the sake of this explanation, with the left as the x-axis zero and the top as the y-axis zero.

Consider Sum[1][1]. We know that this space itself must be a sub-square of at least size one if Original[1][1] has a 1 there.
 Likewise, in Original[0][0], Original[0][1], and Original[1][0], we also know there to exist sub-squares of at least size one. When considering
  Sum[1][1], we are trying to determine the largest sub-square which exists there. We know that its neighbor upward, its neighbor to the left, and
   its up-left neighbor each contain a sub-square of size one. Since there is also a sub-square of size one at Sum[1][1], we know that there is a 
   sub-square of size four across those four spaces.

The same logic applies to [2][2]. We know there is a sub-square of size 2 above it ([1][0], [2][0], [1][1], [2][1]), to the left ([0][1], [0][2],
 [1][1], [1][2]), and to the upper-left ([0][0], [0][1], [1][0], [1][1]), as well as a sub-square of size one at [2][2], meaning that the largest 
 sub-square to the upper-left starting at [2][2] is of size 3.

For the space [3][2], it is clear why we use min. We see that [3][2] is occupied by a 1. The space above it shows us there is a sub-square of size 3.
 However, Sum[3][2] only contains the value 2. This is because the value to the left of Sum[3][2] indicates a sub-square of size 1.
  Given this information, we know that the maximum sub-square located at [3][2] is size 2, since one of its neighbors is only of size 1 
  which would prohibit a square larger than 2.

I do hope this makes sense. We only need to expand the square one row/column at a time, so proving the existence of sub-squares within 
the region already traveled allows us to do the smallest amount of work while obtaining a correct answer.*/