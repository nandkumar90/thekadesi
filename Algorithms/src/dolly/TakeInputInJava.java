package dolly;

import java.util.Scanner;

public class TakeInputInJava {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("take int as a no ");
		int n=scan.nextInt();
		System.out.println(n);
		
		System.out.println("take string as a input");
        String str =scan.next();
        System.out.println(str);
	}

}
