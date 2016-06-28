package strings;

import java.util.HashSet;
import java.util.Set;

public class StringPermutation {

	public static void main(String[] args) {
		String s="ABC";
        HashSet<String>s1=(HashSet<String>) permutate(s);
        System.out.println();
	}

	public static  Set<String> permutate(String str){
		HashSet<String> string=new HashSet<String>();
		if (str == null) {
			return null;
		} else if (str.length() == 0) {
			string.add("");
			return string;
		}
		char[] c=str.toCharArray();
		char ch=c[0];
		String subString=str.substring(1);
		HashSet<String> words=(HashSet<String>) permutate(subString);
		for(String s:words){
			for(int i=0;i<=s.length();i++){
				String re=stringinplace(s, i, ch);
				string.add(re);
			}	
		}
		return string;		
	}
	
	
	
	public static String stringinplace(String str,int j,char ch){
		
		String first=str.substring(0, j);
		String last=str.substring(j);
		return first+ch+last;
	}
}
