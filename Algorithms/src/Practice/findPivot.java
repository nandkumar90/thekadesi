package Practice;

public class findPivot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 1,4, 4, 5};
		System.out.println(findPivot(arr));
	}

	public static int findPivot(int[] arr) {
		int leftmax = arr[0];
		int l = arr.length - 1;
		int rightmin = arr[l];
		int i = 0;
		while (i <l) {
			if(leftmax<rightmin)
			{
				i++;
				l--;
				
				
			}
			
			if(arr[i]>leftmax && arr[i]<rightmin)
			{
				leftmax=arr[i];
				
			}
			
			if(arr[l]<rightmin && arr[l]<leftmax){
				
				rightmin=arr[l];
			}
			
		}

		return leftmax;

	}

	private static int min(int rightMin, int i) {
		// TODO Auto-generated method stub
		return rightMin > i ? i : rightMin;
	}

	private static int max(int i, int j) {
		// TODO Auto-generated method stub
		return i > j ? i : j;
	}

}
