package HackerRanKProblems;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class SortANumberBasedOnOneinBInaryMode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<Integer> integers = new TreeSet<Integer>(
				new Comparator<Integer>() {

					@Override
					public int compare(Integer o1, Integer o2) {
						// TODO Auto-generated method stub
						int i = o1;
						int j = o2;
						Integer ione = getBinaryOne(i);
						Integer jone = getBinaryOne(j);
						return jone.compareTo(ione);
					}
				});
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			integers.add(scan.nextInt());

		}
		/*
		 * integers.add(31); integers.add(14); integers.add(15);
		 * integers.add(7); integers.add(2); System.out.println(integers);
		 */

		Iterator<Integer> itr = integers.iterator();
		while (itr.hasNext()) {
			int i = itr.next();
			System.out.println(i);

		}

	}

	protected static int getBinaryOne(int j) {
		int count = 0;
		while (j != 0) {

			if (j % 2 != 0)
				count++;
			j /= 2;
		}
		return count;
	}

}
