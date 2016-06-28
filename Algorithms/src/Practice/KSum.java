package Practice;

public class KSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int[] a={1,2,3,4,1};	
		int k=3;
		
		int n=findksum(a,k);

	}

	private static int findksum(int[] a, int k) {
      int n=a.length;
      int count =0;
      int sum=0;
		for(int i=0;i<n;i++){
			if(a[i]%k==0){
				
				count++;
			}
			sum=a[i];
    	  for(int j=i+1;j<n;j++){
    		  if(a[j]>a[j-1])
    		  {
    			  sum+=a[j];
    			  if(sum%k==0)
    				  count++;
    		  }
    		  else break;
    		  
    	  }
    	  
      }
		
		return count;
	}
	
	

}
