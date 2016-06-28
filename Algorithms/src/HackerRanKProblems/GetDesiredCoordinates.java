package HackerRanKProblems;

import java.util.Scanner;

public class GetDesiredCoordinates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
         int a=scan.nextInt();
         int b=scan.nextInt();
         int c=scan.nextInt();
         int d=scan.nextInt();
         boolean result=isitpossible(a,b,c,d);
         if(result)
        	 System.out.println("YES");
         else 
        	 System.out.println("NO");
         
	}
	
	public static boolean  isitpossible(int a,int b,int c,int d){
		if(c==a && d==b){
			return true;
			}
		
		if(a>c|| b>d){
			return false;
		}
		
		
		return (isitpossible(a+b,b,c,d)||isitpossible(a,a+b,c,d));
	}

}
