package Practice;

public class MaxDifferenceinArray {
    public static int maxDiff=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int []a={6,7,9,5,6,3,2};
		int[]a={7,2,3,10,2,4,8,1};
     System.out.println(getMaxDiff(a));
	}
	
	
	public static int getMaxDiff(int[] a){
		int max=a[0];
		int maxindex=0;
		
		
		
		for(int i=1;i<a.length;i++){
		if(a[i]>max && (a[i]-min)>maxDiff){
			
			max=a[i];
			maxindex=i;
		}	
	   		
		else {
			if((max-a[i])>maxDiff && i<maxindex){
				min=a[i];	
			}	
		}
		}
		
		
		System.out.println(max +"  "+min);
		return max-min;}
	

}
