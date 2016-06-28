package dolly;

import java.util.Scanner;

public final class isEvenUsingwhile {

	public static void main(String[] args) {
     Scanner scan=new Scanner(System.in);
     int n=scan.nextInt();
     int factorial=1;
     
     while(n!=0){
    	 
    	 factorial*=n;
    	 n--;
    	 
     } 
     
     System.out.println(factorial);

	}

}
