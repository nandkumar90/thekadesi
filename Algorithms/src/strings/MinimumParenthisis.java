package strings;

import java.util.Stack;

public class MinimumParenthisis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="{{{{}}";
		int len=str.length();
		
		System.out.println(len);
		String[] parenthisis=str.split("");
		for (String string : parenthisis) {
			System.out.println(string);
		}
		
		Stack<String> stack=new Stack<String>();
		
		for (int i = 1; i < parenthisis.length; i++) {
			
			System.out.println(stack.push(item));
			
			
		}
		
		
		
		
	}
	public static boolean isopen(String str){
		
		if(str.equals("{"))
			return true;
		
		else 
			return false;
	}
	
	
	
	

}
