package Practice;

import java.util.Stack;

public class StockSpanProblem {
	public static void main(String[] args) {

		int[] p = { 100, 80, 60, 70, 60, 75, 85 };
		int count = 0;
		int[] span = new int[p.length];
		span[0]=1;
		for (int i = 0, j = 0; i < p.length; i++) {
			j = i;
            
			while (j >= 0) {
				if (p[j] <= p[i]) {
					count++;
					j--;
				}

				else {
					span[i] = count;
					break;
				}

			}
			count=0;

		}
		System.out.println();

	}

	

}
