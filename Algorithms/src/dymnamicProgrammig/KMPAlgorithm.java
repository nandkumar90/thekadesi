package dymnamicProgrammig;

public class KMPAlgorithm {

	public static void main(String[] args) {
		char[] txt = "ABABDABACDABABCABAB".toCharArray();
		char[] pat = "ABABCABAB".toCharArray();
        KMPAlgorithm algorithm=new KMPAlgorithm();
        algorithm.searchSubString(txt, pat);
		
		
		
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
				j = b[j];
			}
			i++;
			j++;

			// a match is found	
			if (j == ptrnLen) {
				System.out.println("found substring at index:" + (i - ptrnLen));
				j = b[j];
			}
		}
	}

	public int[] preProcessPattern(char[] ptrn) {
		int i = 0, j = -1;
		int ptrnLen = ptrn.length;
		int[] b = new int[ptrnLen + 1];

		b[i] = j;
		while (i < ptrnLen) {
			System.out.println("j  "+j+"     i ="+i);
			if(j!=-1)
			System.out.println("    ptrn[j]"+ptrn[j]+"     ptrn[i]    "+ptrn[i]);
			while (j >= 0 && ptrn[i] != ptrn[j]) {
				// if there is mismatch consider the next widest border
				// The borders to be examined are obtained in decreasing order
				// from
				// the values b[i], b[b[i]] etc.
				j = b[j];
			}
			i++;
			j++;
			System.out.println("value in array     j  "+j+"     i ="+i);

			b[i] = j;
		}
		return b;
	}
}
