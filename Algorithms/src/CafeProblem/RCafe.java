package CafeProblem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;

public class RCafe {
	public static int MAX_CAPACITY;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * List<Integer> taskQueue = new ArrayList<Integer>(); int MAX_CAPACITY
		 * = 5; Thread tProducer = new Thread(new
		 * Producer(taskQueue,MAX_CAPACITY), "Producer"); Thread tConsumer = new
		 * Thread(new Consumer(taskQueue), "Consumer");
		 */

		System.out.println(runCustomerSimulation(1, "ABCBCA"));

	}

	public static int runCustomerSimulation(int resource, String user) {

		MAX_CAPACITY = resource;
		char[] usera = user.toCharArray();
		int count = 0;
		LinkedList<Character> quesue = new LinkedList<Character>();
		LinkedList<Character> Wquesue = new LinkedList<Character>();

		HashMap<Character, Character> present = new HashMap<Character, Character>();
		LinkedHashMap<Character, Character> waitlingList = new LinkedHashMap<Character, Character>();
		for (int i = 0; i < usera.length; i++) {
			if (waitlingList.get(usera[i]) != null) {
				count++;
				Object ch= waitlingList.remove(usera[i]);
				Wquesue.remove(ch);
			} else {

				if (present.get(usera[i]) != null) {
					present.remove(usera[i]);
					Object o = usera[i];
					quesue.remove(o);
					if (waitlingList.size() != 0) {
						char ch = Wquesue.pop();
						present.put(ch, ch);
						quesue.push(ch);
						waitlingList.remove(ch);
					}

				} else if ((quesue.size() < MAX_CAPACITY)
						&& (present.get(usera[i]) == null)) {
					quesue.push(usera[i]);
					present.put(usera[i], usera[i]);
				}

				else {
					waitlingList.put(usera[i], usera[i]);
					Wquesue.push(usera[i]);

				}
			}

		}

		return count;

	}

}
