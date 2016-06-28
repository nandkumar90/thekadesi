import java.util.ArrayList;
import java.util.Scanner;


public class alphaprime {

	public static void main(String[] args) {
    
		Scanner scan = new Scanner(System.in);
		int totalNoofTest = scan.nextInt();
		while (totalNoofTest != 0) {
			String n = scan.nextLine();
			String[] str = n.split(" ");

			int first = Integer.parseInt(str[0]);
			int last = Integer.parseInt(str[1]);
			int count = 0;
			for (int x = first; x <= last; x++) {	
        	
        	
        }
        
         }
	}
	
	public static boolean IsPrime(int number)
    {
        if (number < 2) return false;
        if (number % 2 == 0) return (number == 2);
        int root = (int)Math.sqrt((double)number);
        for (int i = 3; i <= root; i += 2)
        {
            if (number % i == 0) return false;
        }
        return true;
    }

	
	public static ArrayList<Integer> getAllSuffix(int n){
		ArrayList<Integer> suffix=new ArrayList<Integer>();
		suffix.add(n);
		int multiple=10;
		
		while(n!=0)
		{
			int suf=n%multiple;
			suffix.add(suf);
			n=n/multiple;
			multiple*=10;
		}
			return suffix;
		
		
		
	}
	
}
