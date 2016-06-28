import java.util.LinkedHashMap;
import java.util.Scanner;

public class SortWithMapping {

	public static void main(String[] args) {
		LinkedHashMap<Character, Integer> linkedHashMap = new LinkedHashMap<Character, Integer>();
		Scanner scan = new Scanner(System.in);
		String str = "a2bc3d4";
		char[] ch = str.toCharArray();
		StringBuilder sb = new StringBuilder();
		StringBuilder sbn = new StringBuilder();

		int n = ch.length;
		int count = 0;
		int next;
		int multiple=1;
		int number=0;
		for (int i = 0; i < n; ) {
			if (ch[i] >= 97 && ch[i] <= 122) {
             
				for (int j = i + 1; j < n; j++) {
					next = ch[j];
					
					if (next >= 48 && next <= 57) {
						count++;
						sbn.append(ch[i + 1]);

					} else {
						break;

					}
				}
                for(int k=count-1;k>=0;k--){
                int num =Character.getNumericValue(sbn.charAt(k));
                 num*=multiple;
                 number+=num;
                 multiple*=10;	
                }   
				
                for(int z=0;z<number;z++){
                	
                	sb.append(ch[i]);
                }
                
				if(number!=0)
				i+=(sbn.length()+1);
				else 
				{   sb.append(ch[i]);
					i++;
				}
				
				multiple=1;
                count=0;
                number=0;
                sbn.setLength(0);
               

			}
			
			

		}
		String s=sb.toString();
		System.out.println(s);

	}

}
