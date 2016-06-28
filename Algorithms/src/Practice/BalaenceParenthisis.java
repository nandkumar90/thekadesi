package Practice;

import java.util.Stack;

public class BalaenceParenthisis {

	public static void main(String[] args) {

		String str = "{}[]()";
		String[] s = str.split("");
		System.out.println(balencedPArenthisis(s));
	}

	public static boolean balencedPArenthisis(String[] ch) {
		Stack<String> sch = new Stack<String>();
		for (int i = 1; i < ch.length; i++) {
			if (isopen(ch[i])) {
				sch.push(ch[i]);
			}
			else {
				if(sch.isEmpty())
					return false;
				String s = sch.pop();
				if(!isSameParenthesis(s, ch[i])){
					sch.push(s);
					break;
				}
			}
		}

		if (sch.isEmpty())
			return true;
		else
			return false;

	}
	
	static String[] Braces(String[] values) {
		String[] output =new String[values.length];
		for(int i=0;i<values.length;i++){
			String[] s = values[i].split("");
			if(balencedPArenthisis(s))
				output[i] = "YES";
			else
				output[i] = "NO";
		}
		
		return output;

    } 

	public static boolean isopen(String s) {
		switch (s) {
		case "{":
			return true;

		case "(":

			return true;
		case "[":

			return true;

		
		}
		return false;

	}
	
	public static boolean isSameParenthesis(String open, String close){
		if(open.equals("{") && close.equals("}"))
			return true;
		if(open.equals("[") && close.equals("]"))
			return true;
		if(open.equals("(") && close.equals(")"))
			return true;
		return false;
	}

}
