import java.io.BufferedReader;


public  class cube
{
	public static void main(String[]args){
		int arr[] = {-4, 2, -4, 5, -2, 3, -1};
		printRepeating(arr,arr.length);
	}
	
	
	static void printRepeating(int arr[], int size)
	{
	  int i;
	  System.out.println("The repeating elements are: \n");
	  for (i = 0; i < size; i++)
	  {
	    if (arr[Math.abs(arr[i])] >= 0)
	      arr[Math.abs(arr[i])] = -arr[Math.abs(arr[i])];
	    else
	      System.out.println(Math.abs(arr[i]));
	  }
	}
	
	
	
}