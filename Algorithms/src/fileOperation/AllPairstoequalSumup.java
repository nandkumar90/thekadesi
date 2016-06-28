package fileOperation;

import java.util.HashMap;

public class AllPairstoequalSumup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int[] a={6,6,3,9,3,5,1};
   int k=12;
   System.out.println(NumberOfPairs(a, k));
	}

	static int NumberOfPairs(int[] a, long k) {
	HashMap<Integer, Integer> hashMap=new HashMap<Integer, Integer>();
	
	int count=0;
	for (int i = 0; i < a.length; i++) {
	    hashMap.put(a[i], a[i]);
	}
	
	
	for (int i = 0; i < a.length; i++) {
		int rem=(int) (k-a[i]);
		
		if(hashMap.get(rem)!=null){
			System.out.println(a[i]+"  "+rem);
			if(hashMap.containsKey(rem))
				hashMap.remove(rem);
			if(hashMap.containsKey(a[i]))
				hashMap.remove(a[i]);
			count++;
		}
	}
		
		
		return count;


    }



}
