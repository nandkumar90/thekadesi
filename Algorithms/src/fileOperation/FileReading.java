package fileOperation;

import java.io.BufferedInputStream;
import java.util.Scanner;
//to calcualte n power p
public class FileReading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//myCalculator calculator=new myCalculator();
		 Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			
			int n =	sc.nextInt();
			int p=sc.nextInt();
           try{System.out.println(calculator.power(n,p));}
           catch(Exception e){
               System.out.println(e.getMessage());
           }
		}  
       
   }
	

	public static int np(int n, int p) {
		if (p == 0) {
			return 1;
		}

		else {
			return n * np(n, p - 1);

		}
	}
	
}
