package dolly;

import java.util.Scanner;

public class AdditionofTwoNo {
	public static void main(String[] args) {
		int a,b,c;
        a=1;
        b=2;
        c=a+b;
        System.out.println(c);
        
        //by taking input
        
        Scanner scan=new Scanner(System.in);
		System.out.println("take int as a no ");
		int n=scan.nextInt();
		int m=scan.nextInt();
		int sum=n+m;
		System.out.println(sum);

	}
}
