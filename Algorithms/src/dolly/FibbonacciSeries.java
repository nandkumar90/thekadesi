package dolly;

public class FibbonacciSeries {

	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		int c,count=10;
		System.out.println(a);
		System.out.println(b);

		for (int i = 1; i < 100; i++) {
			c = a + b;
			System.out.println(c);
			a = b;
			b = c;
		}

	}

}
