import java.util.TreeSet;

public class BitwiseOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		   int b[] = {1,2,3,4};
		   int a[] = {1,2,3,4};
		   
		   int n=b.length;
		   int maxLength=0;
		   int[][] x=new int[n+1][n+1];
     
		   for(int i =1;i<(n+1);i++){
			   
			   for(int j=1;j<(n+1);j++){
				   
				   if(i==j)
				   {
					   x[i][j]=i;
					   continue;
				   }
				   
				   if(x[i][j]==0 && x[j][i]==0){
					   
					   System.out.print(a[i-1] +"  "+b[j-1]);
					   
					   x[i][j]=a[i-1]^b[j-1];
					   
				   }
				   
				   
				   else{
					   System.out.print(x[j][i] +"  "+a[i]);
					   
					   x[i][j]=x[j][i]^a[i];
					   
				   }
				   
				   
				   
				   
			   }
			   
		   }
		   
		   
		   
		   
		  
	}
	
	
	
	
	
}
