import java.util.HashMap;
import java.util.Scanner;

public class Sort {

	public static HashMap<Integer, Integer> hashmap = null;
	static {
		hashmap = new HashMap<Integer, Integer>();
		for (int i = 0; i < 26; i++)
			hashmap.put(i, i);
	}

	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		String input = s.next();
		int totalCount = 0;
		char currentChar = input.charAt(0);
		for (int i = 1; i < input.length(); i++) {
			int j = (int) input.charAt(i);
			if (j >= 48 && j <= 57) {
				totalCount = totalCount * 10 + (j - 48);
			} else {
				int key = (int) currentChar - 97;
				int val = hashmap.get(key);
				val += totalCount;
				hashmap.put(key, val);
				currentChar = input.charAt(i);
				totalCount = 0;
			}
		}

		int key = (int) currentChar - 97;
		int val = hashmap.get(key);
		val += totalCount;
		hashmap.put(key, val);

		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < 26; i++) {
			while (hashmap.get(i) > 0) {
				sb.append((char) (97 + i));
				int value = hashmap.get(i);
				hashmap.put(i, (value - 1));

			}
		}
		int testCases = s.nextInt();
		int t[] = new int[testCases];
		for (int i = 0; i < testCases; i++) {
			t[i] = s.nextInt() - 1;
		}
		for (int i = 0; i < testCases; i++) {
			System.out.println(sb.charAt(t[i]));
		}
	}

}