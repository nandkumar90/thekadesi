package dolly;

import java.util.Scanner;

public class NoSearching {
	public static void main(String[] args) {
		 int[] n=new int[3];
		 n[0]=3;
		 n[1]=2;
		 n[2]=1;
		 int arrLen=n.length;
		 Scanner scan=new Scanner(System.in);
		 int num=scan.nextInt();
		 for(int i=0;i<arrLen;i++){
			 
			 if(num==n[i])
			 {
				 System.out.println("yes no is present ");
			 }
			 
		 }
	}

}
