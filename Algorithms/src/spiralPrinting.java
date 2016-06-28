public class spiralPrinting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = { { 1, 2, 3, 4, 5, 6 }, { 7, 8, 9, 10, 11, 12 },
				{ 13, 14, 15, 16, 17, 18 } };
		printspiralform(a);

	}

	public static void printspiralform(int [][]a){
		
     int row=3, col=6;
     
     int k=0,l=0;
     int i=0;
     while(k<row && l<col){
    	 
    	 for( i=l;i<col;i++){
    		 
    		 System.out.println(a[k][i]);
    	 }
    	 k++;
    	 for(i=k;i<row;i++){
    		 System.out.println(a[i][col-1]);
    		 
    	 }
    	 col--;
    	 
    	 if(k<row){
    		 
    		 for(i=col-1;i>=l;i--){
    			 System.out.println(a[k][i]);
    			 
    		 }
    		 
    		 row--;
    	 }
    		 
 if(l<col){
    		 
    		 for(i=row-1;i>=k;i--){
    			 
    			 System.out.println(a[i][l]);

    		 }
    		 l++;
    		 
    	 } 
    	 
    	 
     }
		
		
	}
}
