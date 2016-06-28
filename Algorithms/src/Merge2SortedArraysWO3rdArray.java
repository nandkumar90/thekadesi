
public class Merge2SortedArraysWO3rdArray {
 
    public void mergeArrays(int[] aArr, int aSize, int[] bArr, int bSize) {
        // pointer to end of the first sorted array
        int aIdx=aArr.length-1;
        // pointer to end of the second sorted array (pointer at 100 in below array bArr)
        int bIdx=bArr.length-aArr.length-1;
        // pointer to end of the second sorted array (pointer at last 0)
        int cIdx=bArr.length-1;
 
        /**
         * whichever is higher in two arrays, place that
         * element in last position of the bigger array
         */
        while(cIdx>=0 && aIdx>=0 && bIdx>=0) {
            if(aArr[aIdx] > bArr[bIdx]) {
                bArr[cIdx--] = aArr[aIdx--];
            } else {
                bArr[cIdx--] = bArr[bIdx--];
            }
        }
 
        // run through the left over elements of array aArr
        while(aIdx>=0) {
            bArr[cIdx--] = aArr[aIdx--];
        }
 
        // run through the left over elements of array bArr
        while(bIdx>0) {
            bArr[cIdx--] = bArr[bIdx--];
        }
    }
 
    /**
     * @param args
     */
    public static void main(String[] args) {
        Merge2SortedArraysWO3rdArray mergeArrays = new Merge2SortedArraysWO3rdArray();
        int[] aArr = {3,7,12,16};
        int[] bArr = {1,4,9,100,0,0,0,0};
 
        mergeArrays.mergeArrays(aArr, aArr.length, bArr, bArr.length);
 
        for(int i: bArr) {
            System.out.println(i);
        }
    }
    
    
    
    public void mergSortedeArray(int[] arra, int larr, int [] barr, int lbrr){
    	int aId=larr;
    	int cId=lbrr;
    	int bId=larr-lbrr;
    	
    	while(aId<larr&& cId<lbrr && bId>=0){
    		
    		if(arra[bId]>barr[cId]){
    			arra[aId--]=arra[bId--];
    			
    		}
    		
    		else {
    			arra[aId--]=barr[cId--];

    			
    		}
    		
    		
    		
    		
    	}
    	
    	
    	
    }
    
    
    
    
    
    
    
    
    
    
}
