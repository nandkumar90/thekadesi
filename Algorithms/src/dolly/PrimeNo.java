package dolly;

import java.util.Scanner;

public class PrimeNo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("take int as a no ");
		int n = scan.nextInt();

		PrimeNo primeNo = new PrimeNo();
		boolean isprime=primeNo.isPrime(n);
		System.out.println(isprime);

	}

	public boolean isPrime(int n) {
		boolean isprime = true;
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {

				isprime = false;
				break;
			}

		}

		return isprime;

	}
}
