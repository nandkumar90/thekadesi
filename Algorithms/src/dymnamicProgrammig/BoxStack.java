package dymnamicProgrammig;

import java.util.Comparator;

public class BoxStack implements Comparator<BoxStack>{
	int h;
	int w;
	int d;
	
	public static void main(String[] args){
		
		
	}
	
	public static int min(int x,int y){
		
		return x>y?y:x;
		
	}
	
	
	public static int max(int x, int y){
		
		return x>y?x:y;
	}

	
	public int compare(BoxStack a, BoxStack b){
		//based on area 
		return a.d*a.w -b.d*b.w;
	}
	
	/* Returns the height of the tallest stack that can be formed with give type of boxes */
	public static int maxStackHeight( BoxStack arr[], int n )
	{
	   /* Create an array of all rotations of given boxes
	      For example, for a box {1, 2, 3}, we consider three
	      instances{{1, 2, 3}, {2, 1, 3}, {3, 1, 2}} */
	   BoxStack[] rot=new BoxStack[3*n];
	   int index = 0;
	   for (int i = 0; i < n; i++)
	   {
	      // Copy the original box
	      rot[index] = arr[i];
	      index++;
	 
	      // First rotation of box
	      rot[index].h = arr[i].w;
	      rot[index].d = max(arr[i].h, arr[i].d);
	      rot[index].w = min(arr[i].h, arr[i].d);
	      index++;
	 
	      // Second rotation of box
	      rot[index].h = arr[i].d;
	      rot[index].d = max(arr[i].h, arr[i].w);
	      rot[index].w = min(arr[i].h, arr[i].w);
	      index++;
	   }
	 
	   // Now the number of boxes is 3n
	   n = 3*n;
	 
	   /* Sort the array ‘rot[]’ in decreasing order, using library
	      function for quick sort */
	  // qsort (rot, n, sizeof(rot[0]), compare);
	 
	   // Uncomment following two lines to print all rotations
	   // for (int i = 0; i < n; i++ )
	   //    printf("%d x %d x %d\n", rot[i].h, rot[i].w, rot[i].d);
	 
	   /* Initialize msh values for all indexes 
	      msh[i] –> Maximum possible Stack Height with box i on top */
	   int msh[]=new int[n];
	   for (int i = 0; i < n; i++ )
	      msh[i] = rot[i].h;
	 
	   /* Compute optimized msh values in bottom up manner */
	   for (int i = 1; i < n; i++ )
	      for (int j = 0; j < i; j++ )
	         if ( rot[i].w < rot[j].w &&
	              rot[i].d < rot[j].d &&
	              msh[i] < msh[j] + rot[i].h
	            )
	         {
	              msh[i] = msh[j] + rot[i].h;
	         }
	 
	 
	   /* Pick maximum of all msh values */
	   int max = -1;
	   for ( int i = 0; i < n; i++ )
	      if ( max < msh[i] )
	         max = msh[i];
	 
	   return max;
	}
}
