package Capillary;

public class MagicString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//KRKRKKR
     System.out.println(getMaxLength("KKKKRRRR"));
	}
	
	
	public static int getMaxLength(String str){
		String [] s=str.split("");
		int count=0;
		int start=1;
		int last=s.length-1;
		
		while((start!=last) && ((start+1)!=last)&&((start-1)!=last)&&(start!=(last-1))){
			
			for(int z=start;z<s.length && z<=last;z++){
				
				if(s[z].equals("R"))
				{
					start=z+1;
					break;
				}
			}
			
			
			for(int k=last;k>=start && k>=0;k--){
				if(s[k].equals("K"))
				{
					last=k-1;
					count++;
					break;
				}
				
			}
			
			
			
		}
		
		return count*2;
	}

}
