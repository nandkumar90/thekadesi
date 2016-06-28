package strings;

import java.util.Arrays;

class Comparator {
	
	public boolean compare(int o1, int o2) {
        if(o1==o2)
        	return true;
        	else return false;
	}

	
	
	public boolean compare(String o1, String o2) {
		 if(o1.equals(o2))
	        	return true;
	        	else return false;
	}
	
	
	public boolean compare(int[] o1, int[] o2) {
        Object[] arr1 = {o1};  // arr1 contains only one element
        Object[] arr2 = {o2};
		 if(Arrays.deepEquals(arr1, arr2))
	        	return true;
	        	else return false;	}
}