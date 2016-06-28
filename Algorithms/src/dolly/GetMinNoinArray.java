package dolly;

public class GetMinNoinArray {

	public static void main(String[] args) {
		 int[] n=new int[3];
		 n[0]=3;
		 n[1]=2;
		 n[2]=1;
		 int arrLen=n.length;
		 int min=n[0];
		 for(int i=1;i<arrLen;i++){
			 
			 if(min<n[i])
			 {
				 min=n[i];
			 }
			 
		 }
     System.out.println(min);
	}

}
