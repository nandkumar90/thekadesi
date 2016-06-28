package dolly;

public class GetMaxNoInArray {

	public static void main(String[] args) {
		int[] n=new int[3];
		 n[0]=3;
		 n[1]=2;
		 n[2]=1;
		 int arrLen=n.length;
		 int max=n[0];
		 for(int i=1;i<arrLen;i++){
			 
			 if(max>n[i])
			 {
				 max=n[i];
			 }
			 
		 }
		 
		 System.out.println(max);

	}

}
