package dolly;

public class StringReverse {

	public static void main(String[] args) {
		String str1="Nand";
		StringReverse stringReverse=new StringReverse();
		int wordMidIdx=str1.length()/2;
		int wordLastIdx=str1.length();
		char[] reverseString=stringReverse.reverse(str1.toCharArray(), 0, wordMidIdx,wordLastIdx);
		String reversString =reverseString.toString();
		String s=new String(reverseString);//one way 
		String s2=reversString.valueOf(reverseString);
		System.out.println(s2);

	}

	
	public char[] reverse(char[] arr, int wordIdx, int wordMidIdx,
	        int wordLastIdx) {
	    for (; wordIdx < wordMidIdx; wordIdx++) {
	        // swap first letter with the last letter in the
	        char tmp = arr[wordIdx];
	        arr[wordIdx] = arr[wordLastIdx - 1];
	        arr[wordLastIdx - 1] = tmp;
	        wordLastIdx--;
	    }
	    return arr;
	}
}
