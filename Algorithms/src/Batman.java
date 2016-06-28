import java.util.Scanner;


public class Batman {
	
	public static int a[][];
	
	public static int n;
	
	public static int k;
	
	public static int output;

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		output = 0;
		while(s.hasNext()){
			n = s.nextInt();
			k = s.nextInt();
			a = new int[n][n];
			for(int i=0;i<n;i++){
				for(int j=0;j<n;j++){
					a[i][j] = s.nextInt();
				}
			}
			break;
		}
		int i=0,j=0,sum=0;
		sum = sumOfRange(i, j, i+(k-1), j + (k-1));
		while(true){
			if(isCube(sum))
				output++;
			if((j+k)<n){
				j++;
				if(k>1){
					int sumI = sumOfRange(i, j-1, i+(k-1), j-1);
					int sumJ = sumOfRange(i, j+1, i + (k-1), j+1);
					sum += (sumJ-sumI);
				}else
					sum = a[i][j];
			}else{
				i++;
				j=0;
				sum = sumOfRange(i, j, i+(k-1), j + (k-1));
			}
			if(i==(n-(k-1))||sum==0)
				break;
		}
		System.out.println(output);
	}
	
	static boolean isCube(long input) {
	    int cubeRoot = (int)Math.cbrt(input);
	    boolean result = Math.pow(cubeRoot,3) == input;
	    return result;
	}
	
	static int sumOfRange(int sRow, int SColumn, int eRow, int eColumn){
		int sum = 0;
		try {
			for(int i = sRow;i<=eRow;i++){
				for(int j=SColumn;j<=eColumn;j++)
					sum+=a[i][j];
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			return 0;
		}
		return sum;
	}

}
