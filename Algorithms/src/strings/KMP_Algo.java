package strings;

public class KMP_Algo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="bacbababaabcbab";
		String pattern="abababca";
		KMP_Algo algo=new KMP_Algo();
		algo.searchSubString(str.toCharArray(), pattern.toCharArray());
	}
	
	/**
	 * Pre processes the pattern array based on proper prefixes and proper
	 * suffixes at every position of the array
	 *
	 * @param ptrn
	 *            word that is to be searched in the search string
	 * @return partial match table which indicates
	 */
	public int[] preProcessPattern(char[] ptrn) {
	    int i = 0, j = -1;
	    int ptrnLen = ptrn.length;
	    int[] b = new int[ptrnLen + 1];
	 
	    b[i] = j;
	    while (i < ptrnLen) {

	            while (j >= 0 && ptrn[i] != ptrn[j]) {

	            	  System.out.println("value of i   "+ i);
	      	        System.out.println("value of j   "+ j);
	      	    	
	            	System.out.println("value of ptrn[i]   "+ ptrn[i]);
	    	        System.out.println("value of ptrn[j]   "+ ptrn[j]);
	            	// if there is mismatch consider the next widest border
	            // The borders to be examined are obtained in decreasing order from 
	            //  the values b[i], b[b[i]] etc.
	            System.out.println("value of b[j]   "+b[j]);
	            	j = b[j];
	            
	        }
	        i++;
	        j++;
	        b[i] = j;
	        
	        System.out.println("value of i   "+ i);
	        System.out.println("value of j   "+ j);
	    	
	    }
	    return b;
	}
	
	 public void searchSubString(char[] text, char[] ptrn) {
	        int i = 0, j = 0;
	        // pattern and text lengths
	        int ptrnLen = ptrn.length;
	        int txtLen = text.length;
	 
	        // initialize new array and preprocess the pattern
	        int[] b = preProcessPattern(ptrn);
	 
	        while (i < txtLen) {
	           
	            while (j >= 0 && text[i] != ptrn[j]) {
	          	  System.out.println("value of i   "+ i);
		  	        System.out.println("value of j   "+ j);
		  	    	
		        	  System.out.println("value of text[i]   "+ text[i]);
		  	        System.out.println("value of ptrn[j]   "+ ptrn[j]);
		  	     
	            	
	            	j = b[j];
	            }
	            i++;
	            j++;
	 
	            // a match is found
	            if (j == ptrnLen) {
	                System.out.println("found substring at index:" + (i - ptrnLen));
		            System.out.println("value of b[j]   "+b[j]);

	                j = b[j];
	            }
	            

		        System.out.println("value of i   "+ i);
		        System.out.println("value of j   "+ j);
	        }
	    }

}
