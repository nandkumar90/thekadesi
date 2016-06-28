import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

import Tree.CreateTree;

public class Splitwise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedHashMap<String, Integer> credit = new LinkedHashMap<String, Integer>();
		LinkedHashMap<String, Integer> debt = new LinkedHashMap<String, Integer>();

		Scanner scan = new Scanner(System.in);
		int noofTestCase = scan.nextInt();
		while (noofTestCase != 0) {
			int People = scan.nextInt();
			int trans = scan.nextInt();

			while (People != 0) {
				String participant = scan.next();
				credit.put(participant, 0);
				debt.put(participant, 0);
				People--;
			}

			while (trans != 0) {
				String payee = scan.next();
				int amount = scan.nextInt();
				int participant = scan.nextInt();

				int reminder = amount % (participant+1);
				int sharedamount = amount / (participant+1);
				int availc = credit.get(payee);
				credit.put(payee, (amount-sharedamount-reminder + availc));
				while (participant != 0) {
					String user = scan.next();
					int availd = debt.get(user);
					debt.put(user, (sharedamount + availd));
					participant--;
				}

				trans--;
			}

			for (Map.Entry<String, Integer> entry : debt.entrySet()) {
				String user = entry.getKey();

				int debtt = entry.getValue();
				int c = credit.get(user);
				if (debtt > c) {

					System.out.println(user + " has to pay " + (debtt - c)
							);

				} else if (debtt < c) {
					System.out.println(user + " will get back " + (c - debtt)
							);
				} else {

					System.out.println(user + " neither owes nor is owed");

				}
			}

			noofTestCase--;

		}

	}

}
